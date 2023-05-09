//import android.database.sqlite.SQLiteDatabase;
//
//public static class DataBaseWorker(){
//    SQLiteDatabase db = getBaseContext().openOrCreateDatabase("app.db", MODE_PRIVATE, null);
//        db.execSQL("CREATE TABLE IF NOT EXISTS users (name TEXT, age INTEGER, UNIQUE(name))");
//        db.execSQL("INSERT OR IGNORE INTO users VALUES ('Tom Smith', 23), ('John Dow', 31);");
//
//}
//
///*
//public class DBConnect {
//
//    sqlite.
//    public static Connection conn;
//    public static Statement statmt;
//    public static ResultSet resSet;
//
//    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
//    public static void conn() throws ClassNotFoundException, SQLException
//    {
//        SQLiteConfig config = new SQLiteConfig();
//        config.setOpenMode(SQLiteOpenMode.READONLY);
//        Class.forName("org.sqlite.JDBC");
//        conn = DriverManager.getConnection("jdbc:sqlite:SpaceWorker.db3", config.toProperties());
//        System.out.println("База Подключена!");
//    }
//
//    // --------Создание таблицы--------
////    public static void CreateDB() throws ClassNotFoundException, SQLException
////    {
////        statmt = conn.createStatement();
////        statmt.execute("CREATE TABLE if not exists 'users' ('id' INTEGER PRIMARY KEY AUTOINCREMENT, 'name' text, 'phone' INT);");
////
////        System.out.println("Таблица создана или уже существует.");
////    }
//
//    // --------Заполнение таблицы--------
//    public static void WriteDB() throws SQLException
//    {
////        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
////        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
////        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");
//
////        System.out.println("Таблица заполнена");
//    }
//
//    // -------- Вывод таблицы--------
////    public static void ReadDB() throws ClassNotFoundException, SQLException
////    {
////        resSet = statmt.executeQuery("SELECT * FROM users");
////
////        while(resSet.next())
////        {
////            int id = resSet.getInt("id");
////            String  name = resSet.getString("name");
////            String  phone = resSet.getString("phone");
////            System.out.println( "ID = " + id );
////            System.out.println( "name = " + name );
////            System.out.println( "phone = " + phone );
////            System.out.println();
////        }
//
////        System.out.println("Таблица выведена");
////    }
//
//    // --------Закрытие--------
//    public static void CloseDB() throws ClassNotFoundException, SQLException
//    {
//        conn.close();
//        statmt.close();
//        resSet.close();
////
////        System.out.println("Соединения закрыты");
//    }
//
//}
