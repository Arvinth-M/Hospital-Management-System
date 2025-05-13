/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aabhospital;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import aabhospital.AABhospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author arvinth
 */
public class AABhospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con;
        PreparedStatement pst;
        String url="jdbc:mysql://localhost/aabhospital";
        String username="root";
        String password="Ben10";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url,username,password);
            System.out.println(con);
            System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AABhospital.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AABhospital.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
