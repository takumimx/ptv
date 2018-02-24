package Db_Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import puntovtn.Inventario;
import puntovtn.Panel;

public class Cm_Productos {
    private final String SQL_INSERT = "INSERT INTO productos(id_Code,descripcion,cantidad,precio) values(?,?,?,?)";
    private final String SQL_SELECT = "SELECT id_Code FROM productos";
    private final String SQL_SELECT2 = "SELECT descripcion FROM productos";
    private final String SQL_UPDATE = "UPDATE usuarios SET user= ?, password= ?, font= ?, font_size= ?, background=?, descripcion=?, avatar=? WHERE  id= ?";
    private final String SQL_UPDATECONF = "UPDATE config SET cofig= ?";
    
    private DefaultTableModel tabla;
    private PreparedStatement PS;
    private DefaultComboBoxModel DT;
    private final Db_Conexion CN;
    private ResultSet RS;
    public Cm_Productos(){
        PS = null;
        CN = new Db_Conexion();
    }

    public int insertDatos(String id_code,String descripcion, int cantidad,float precio){
        try{
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, id_code);
            PS.setString(2, descripcion);
            PS.setInt(3, cantidad);
            PS.setFloat(4,precio);

            
            int res = PS.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null,"Resgistro Guardado con Exito","Exito",JOptionPane.INFORMATION_MESSAGE);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }finally{
            PS = null;
        }
        return 0;
    }
    

    public DefaultComboBoxModel getDatos(){
        DT= new DefaultComboBoxModel();
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            
            String productos;
                        
            while(RS.next()){
                productos = RS.getString(1);
                DT.addElement(productos);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }finally{
            PS = null;
            RS = null;
        } 
        return DT;
    }
    
    
    public DefaultComboBoxModel getDatos2(){
        DT= new DefaultComboBoxModel();
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT2);
            RS = PS.executeQuery();
            
            String productos;
                        
            while(RS.next()){
                productos = RS.getString(1);
                DT.addElement(productos);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }finally{
            PS = null;
            RS = null;
        } 
        return DT;
    }
    
     public DefaultTableModel getDatosTabla(){
        try{

            PS = CN.getConnection().prepareStatement("SELECT * FROM productos");
            RS = PS.executeQuery();

            Object [] fila = new Object [4];
            while (RS.next()){
                fila[0] = RS.getString(1);
                fila[1] = RS.getString(2);
                fila[2] = RS.getInt(3);
                fila[3] = RS.getDouble(4);
                Inventario.tabla.addRow(fila);
            } 
        }catch(Exception e){
            System.out.println("Error Macho: "+ e.getMessage());
        }finally{
            PS = null;
            RS = null;
        } 
        return Inventario.tabla;
    }
     
    //METODO UPDATE BOTON CONFIGURACION
    public void updateCongif(String nomTienda){
       try {            
            PS = CN.getConnection().prepareStatement(SQL_UPDATECONF);            
            PS.setString(1, nomTienda);                   

            PS.execute();
            PS.close();            
         }catch(Exception e){
         System.out.println(e.getMessage());
      }
        finally{
            PS = null;
            RS = null;
        } 
   }
     
}
