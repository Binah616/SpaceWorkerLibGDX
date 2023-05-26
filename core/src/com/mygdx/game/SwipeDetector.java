package com.mygdx.game;


import com.badlogic.gdx.input.GestureDetector;

public class SwipeDetector extends GestureDetector {
    public interface DirectionListener {
        void onLeft() throws InterruptedException;

        void onRight() throws InterruptedException;

        void onUp() throws InterruptedException;

        void onDown() throws InterruptedException;
    }

    public SwipeDetector(DirectionListener directionListener) {
        super(new DirectionGestureListener(directionListener));
    }

    private static class DirectionGestureListener extends GestureAdapter{
        DirectionListener directionListener;

        public DirectionGestureListener(DirectionListener directionListener){
            this.directionListener = directionListener;
        }

        @Override
        public boolean fling(float velocityX, float velocityY, int button) {
            if(Math.abs(velocityX)>Math.abs(velocityY)){
                if(velocityX>0){
                    try {
                        directionListener.onRight();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    try {
                        directionListener.onLeft();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }else{
                if(velocityY>0){
                    try {
                        directionListener.onDown();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else{
                    try {
                        directionListener.onUp();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return super.fling(velocityX, velocityY, button);
        }

    }

}
