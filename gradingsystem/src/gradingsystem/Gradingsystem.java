/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kristian
 */
public class Gradingsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gradingsystem pro = new Gradingsystem();
        pro.createConnection();
        // TODO code application logic here
    }
    void createConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","kpaul57285.");
            
          
              
              System.out.println("database success");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Gradingsystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Gradingsystem.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
