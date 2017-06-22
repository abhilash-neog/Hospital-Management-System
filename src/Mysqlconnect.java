
import java.sql.*;
import javax.swing.*;


public class Mysqlconnect {
    Connection conn=null;
    public static Connection ConnectDB(boolean displayMessage)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String db_url="jdbc:mysql://localhost:3306/test1";
            Connection conn=DriverManager.getConnection(db_url,"root","");
            if(displayMessage==true)
                JOptionPane.showMessageDialog(null,"Connection established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;

        }
    }
}
