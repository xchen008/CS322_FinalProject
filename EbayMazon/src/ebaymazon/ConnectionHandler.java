/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebaymazon;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author XueruChen
 */
public class ConnectionHandler {
    
    static Connection connect = null;
    static Statement st = null;
    
    
    public static Connection link(){    
    
    try{
    connect = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/jmaxdb?useLegacyDatetimeCode=false&serverTimezone=America/New_York","csc322","comp2020");
    st = (Statement)connect.createStatement();
            
    } catch (SQLException ex) {
           System.out.println("Cannot make a connection.");
    }
    
    return connect;
    
}

   
    
    
}   
