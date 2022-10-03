package modelo;

import java.sql.*;


public class ConexionSingleton {
   static String bd = "db_cliente";
   static String login = "root";
   static String password = "root";
   String host = "localhost";
   static String url = "jdbc:mysql://";
   static Connection conexion; // atributo para  guardar el objeto connexió.
   private static ConexionSingleton instancia = null;

   private ConexionSingleton() {
    }
   
    /**Metodo para retorna una instancia de la conexion. Si no esta creada la crea, y si esta creada la retorna
     * @return retorna una instancia de la conexion a la base de datos
     */
   
    public synchronized static ConexionSingleton getInstancia() {
        if (instancia == null) {
            instancia = new ConexionSingleton();
        }
        return instancia;
    }

   
  /* devuelve true si se ha creado correctamente */
   public boolean crearConexion() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection(url+ host + "/"+ bd,login,password);
        
    }catch(  SQLException  e){
         return false;
      }
    catch(  ClassNotFoundException e1){
         return false;
      }
      return true;
   }
   
   public Connection getConexion() {
    if (conexion == null) {
        crearConexion();
    }
    return conexion;
    }

   public void desconectar(){
       try {
       conexion.close();
       conexion = null;
           System.out.println("La conexion a la  base de datos "+bd+" ha terminado");
       } catch (Exception e) {
	          System.out.println("Error al cerrar la conexión.");
       }
   }
  
}
