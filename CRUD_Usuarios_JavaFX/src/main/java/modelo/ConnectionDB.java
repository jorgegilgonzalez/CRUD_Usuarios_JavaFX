/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author
 */
public class ConnectionDB {
    

    public Connection openConnection() {
        
        Connection con =null;
        //HAy que añadir la zona sino da ERROR en la conexion
         
        String user="root";
        String pass="root";
        String nombreBD = "db_cliente";// nombre de base de datos
        String url="jdbc:mysql://localhost:3306/"+ nombreBD +"?serverTimezone=UTC";
        
        try {
        // Cargar el driver de mysql
            Class.forName("com.mysql.cj.jdbc.Driver");// la otra que se ultilizaba en el ejemplo anterior esta OBSOLETA
        
            // Obtener la conexión
            con= DriverManager.getConnection(url,user,pass);
            
            if (con!=null)
                System.out.println("Conexión conseguida");//comprobar conexion en consola
            
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.toString());
        } catch (ClassNotFoundException cE) {
            System.out.println("Excepción: " + cE.toString());
        }
        return con;
    }
    
    public static void closeConnection(Connection con) throws SQLException{
        
        try{
            //Cierra la conexión
            con.close();
            System.out.println("Conexion cerrada");
        }catch(SQLException e){
            System.out.println("SQL Exception: "+e.toString());
        }//Cierra try-catch

    }//Cierra closeConnection
}

    
