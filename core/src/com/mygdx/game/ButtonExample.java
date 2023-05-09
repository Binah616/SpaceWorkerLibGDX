package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class ButtonExample extends Game {

    Stage stage;
    TextButton button;
    TextButton.TextButtonStyle textButtonStyle;
    BitmapFont font;
    Skin skin;
    TextureAtlas buttonAtlas;

    @Override
    public void create() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        font = new BitmapFont();
        skin = new Skin();
        buttonAtlas = new TextureAtlas(Gdx.files.internal("assets"));
        skin.addRegions(buttonAtlas);
        textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = font;
        textButtonStyle.up = skin.getDrawable("btn_up");
//        textButtonStyle.down = skin.getDrawable("down-button");
//        textButtonStyle.checked = skin.getDrawable("checked-button");
        button = new TextButton("Button1", textButtonStyle);
        stage.addActor(button);
    }

    @Override
    public void render() {
        super.render();
        stage.draw();
    }


}

//
//public class Example {
//    private Stage stage;
//    private Skin skin;
//    private Table table = new Table();
//    stage = new Stage(new StretchViewport(graphics.getWidth(), Gdx.graphics.getHeight()));
//    Gdx.input.setInputProcessor(stage);
//    skin =new Skin(Gdx.files.internal("skin/uiskin.json"));
//    final TextButton playTextButton = new TextButton("Play", skin);
//    final TextButton exitTextButton = new TextButton("Exit", skin);
//    final TextButton optionsTextButton = new TextButton("Options", skin);
//
//    table.setFillParent(true);
//    table.add(playTextButton).size(100,50);
//    table.add(optionsTextButton).size(100,50);
//    table.add(exitTextButton).size(100,50);
//    stage.addActor(table);
//}