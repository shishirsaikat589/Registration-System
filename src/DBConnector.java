/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Shishir
 */
public class DBConnector {
    public Connection con;
    public  void dbConnectNow() {
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/registration", "root", "");
                 System.out.println("DB Connected ):");


            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
  public Connection getConnector(){
        return con;
  }
}
