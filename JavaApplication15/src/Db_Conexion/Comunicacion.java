package Db_Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import puntovtn.Panel;



public class Comunicacion {
    private final String SQL_INSERT = "INSERT INTO usuarios(user,nombre,pass,t_user) values(?,?,?,?)";
    private final String SQL_SELECT = "SELECT user FROM usuarios";
    private final String SQL_UPDATE = "UPDATE usuarios SET user= ?, password= ?, font= ?, font_size= ?, background=?, descripcion=?, avatar=?  WHERE  id= ?";
    private final String SQL_UPDATECONF = "UPDATE config SET cofig= ?";
    
    private PreparedStatement PS;
    private DefaultComboBoxModel DT;
    private final Db_Conexion CN;
    private ResultSet RS;
    public Comunicacion(){
        PS = null;
        CN = new Db_Conexion();
    }

    public int insertDatos(String user,String name, String pass,int cuenta){
        try{
            PS=CN.getConnection().prepareStatement(SQL_INSERT);
            PS.setString(1, user);
            PS.setString(2, name);
            PS.setString(3, pass);
            PS.setInt(4,cuenta);

            
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
    
//    public int actualizarDatos(String user,String password, String letra,int letra_size, String fondo,int id, String descripcion, String avatar){
//        try{
//            PS = CN.getConnection().prepareStatement(SQL_UPDATE);
//            PS.setString(1, user);
//            PS.setString(2, password);
//            PS.setString(3, letra);
//            PS.setInt(4,letra_size);
//            PS.setString(5,fondo);
//            PS.setString(6,descripcion);
//            PS.setString(7,avatar);
//            PS.setInt(8,id);
//            int res = PS.executeUpdate();
//            if (res > 0){
//                JOptionPane.showMessageDialog(null,"Resgistro Guardado con Exito","Exito",JOptionPane.INFORMATION_MESSAGE);
//            }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
//        }
//        return 0;
//    }
    
    public DefaultComboBoxModel getDatos(){
        DT= new DefaultComboBoxModel();
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            
            String user;
                        
            while(RS.next()){
                user = RS.getString(1);
                DT.addElement(user);
            } 
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
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
    
    
    public DefaultTableModel getTablaDatos(String code){
        try{ 
            PS = CN.getConnection().prepareStatement("SELECT * FROM productos WHERE id_Code= ?");
            PS.setString(1, code);
            RS = PS.executeQuery();

            Object [] fila = new Object [4];
            if(RS.next()){
                if(RS.getInt(3)>0){
                    fila[0] = RS.getString(1);
                    fila[1] = RS.getString(2);
                    fila[2] = 1;
                    fila[3] = RS.getDouble(4);
                    Panel.tabla.addRow(fila);
                }else{
                    JOptionPane.showMessageDialog(null,"Producto Agotado","Stock 0",JOptionPane.ERROR_MESSAGE);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            PS = null;
            RS = null;
        } 
        return Panel.tabla;
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