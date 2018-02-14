/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariem
 */
public class DataSource {
	private static DataSource data;
    private Connection con;
    String username="root";
    String password="";
    String url="jdbc:mysql://127.0.0.1/pidev";
     private DataSource(){
        try {
            con=DriverManager.getConnection(url,username,password);
            System.out.println("Connexion effectuée avec succès!");
        } catch (SQLException e) {
           // System.out.println(e);
	Logger.getLogger(DataSource.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public Connection getConnection(){
        return con;
    }
    public static DataSource getInstance() {
        if(data==null){
            data=new DataSource();
        }
        return data;      
    }	
}
