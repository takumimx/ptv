package Db_Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import puntovtn.Inventario;
import puntovtn.Panel;
import puntovtn.Productos;

public class Cm_Productos {
    private final String SQL_INSERT = "INSERT INTO productos(id_Code,descripcion,cantidad,precio) values(?,?,?,?)";
    private final String SQL_SELECT = "SELECT id_Code FROM productos";
    private final String SQL_SELECT2 = "SELECT descripcion FROM productos";
    
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

    public void setCobro(String code, int cant,int opcion) {
        int existencia=0;
        if(opcion==1){
            try{
                PS = CN.getConnection().prepareStatement("SELECT cantidad FROM productos WHERE id_Code= ?");
                PS.setString(1, code);
                RS = PS.executeQuery();
                if (RS.next()){
                    existencia = RS.getInt(1);
                } 
            }catch(SQLException e){
                System.out.println("Error: "+ e.getMessage());
            }finally{
                PS = null;
                RS = null;
            }
            existencia=existencia-cant;

            try{
                PS = CN.getConnection().prepareStatement("UPDATE productos SET cantidad= ? WHERE id_Code= ?");
                PS.setInt(1,existencia);
                PS.setString(2, code);
                int y = PS.executeUpdate();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }finally{
                PS=null;
                RS=null;
            }
        }
    }
    
    public int validar(String code){
        int t = 0;
        int cantidad=0;
        String SQL_SELECT = "SELECT cantidad FROM productos WHERE id_code= ?";
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            PS.setString(1, code);
            RS = PS.executeQuery();
            if (RS.next()){
                    cantidad = RS.getInt(1);
                    t=1;
            }
        }catch(SQLException e){
            
        }
        if(!Productos.jTextField3.getText().equals("")){
            Productos.jLabel8.setText(String.valueOf(cantidad));
        }
        return t;
    }
    
    public int cargar(int cantidad,int existencia,String code){
        int t=0;
        existencia = existencia + cantidad;
        try{
                PS = CN.getConnection().prepareStatement("UPDATE productos SET cantidad= ? WHERE id_Code= ?");
                PS.setInt(1,existencia);
                PS.setString(2, code);
                t = PS.executeUpdate();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }finally{
                PS=null;
                RS=null;
            }
        return t;
    }
     
}
