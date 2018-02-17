package Db_Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Cm_Productos {
    private final String SQL_INSERT = "INSERT INTO productos(id_Code,descripcion,cantidad,precio) values(?,?,?,?)";
    private final String SQL_SELECT = "SELECT id_Code FROM productos";
    private final String SQL_SELECT2 = "SELECT descripcion FROM productos";
    private final String SQL_UPDATE = "UPDATE usuarios SET user= ?, password= ?, font= ?, font_size= ?, background=?, descripcion=?, avatar=? WHERE  id= ?";

    private PreparedStatement PS;
    private DefaultComboBoxModel DT;
    private final Db_Conexion CN;
    private ResultSet RS;
    public Cm_Productos(){
        PS = null;
        CN = new Db_Conexion();
    }

    public int insertDatos(String id_code,String descripcion, int cantidad,Double precio){
        try{
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, id_code);
            PS.setString(2, descripcion);
            PS.setInt(3, cantidad);
            PS.setDouble(4,precio);

            
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
    
    public int actualizarDatos(String user,String password, String letra,int letra_size, String fondo,int id, String descripcion, String avatar){
        try{
            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
            PS.setString(1, user);
            PS.setString(2, password);
            PS.setString(3, letra);
            PS.setInt(4,letra_size);
            PS.setString(5,fondo);
            PS.setString(6,descripcion);
            PS.setString(7,avatar);
            PS.setInt(8,id);
            int res = PS.executeUpdate();
            if (res > 0){
                JOptionPane.showMessageDialog(null,"Resgistro Guardado con Exito","Exito",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
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
    
    
    public String Validadar(String usuario){
        String contra="";
        String sql = "SELECT pass FROM usuarios WHERE user= ?";
        
        try{
            PS = CN.getConnection().prepareStatement(sql);
            PS.setString(1, usuario);
            RS = PS.executeQuery();
            if(RS.next()){
               contra = RS.getString(1);
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }
        return contra;
    }
}
