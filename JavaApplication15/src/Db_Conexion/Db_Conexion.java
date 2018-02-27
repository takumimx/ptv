package Db_Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Db_Conexion {
    /*Se declara Variables con Mayuscula por la homeclatura ya que son variables final*/
    private static Connection CN;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/tienda";

    public Db_Conexion() {
        CN = null;
        try{
            Class.forName(DRIVER);
            CN = DriverManager.getConnection(URL,USER,PASSWORD);

        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Conexión Denegada", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /*metodo para retornar la conexión*/
    public Connection getConnection(){
       return CN; 
    }
    
    /*Metodo para desconectar*/
    public void close(){
        try{
            CN.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.getMessage(), "Conexión Interrumpida", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
}