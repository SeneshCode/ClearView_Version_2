package lk.clearview.main.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class MYSQL {

    private static Connection connection;

    public static void createConnection() throws Exception {
        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://sql.freedb.tech:3306/freedb_clearview", "freedb_clearview_user", "nb@b5BCK%jCsM%f");
        }
    }

    //This method use for search datas
    public static ResultSet search(String query) throws Exception {
        createConnection();
        return connection.createStatement().executeQuery(query);
    }
    
    //This method use for create, update, delete datas
    public static Integer update(String query) throws Exception {
        createConnection();
        return connection.createStatement().executeUpdate(query);
    }

}
