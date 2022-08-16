
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Vineet Karki
 */
public class ConnectionProvider {
static Connection con;
    public static Connection getCon() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","Vinit@29797");
            return con;
        }
        catch(Exception e){
        return null;    
        }
    }
    public Connection getcon2(){
        try{
            Class.forName("com.mysqldcd.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:33060/cms","root","Vinit@29797");
            return con;
        }
        catch(Exception e){
        return null;    
        }
    }
    
}
