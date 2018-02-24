/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Db_Conexion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Net Master
 */
public class Login_Class {
    private final Db_Conexion CN;
    private PreparedStatement PS;
    private ResultSet RS;
    
    public Login_Class(){
        PS = null;
        CN = new Db_Conexion();
    }
    
    public DefaultComboBoxModel getAlluser(){
        String SQL_SELECT = "SELECT user FROM usuarios";
        DefaultComboBoxModel DT;
        DT= new DefaultComboBoxModel();
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            
            String user;
                        
            while(RS.next()){
                user = RS.getString(1);
                DT.addElement(user);
            } 
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }finally{
            PS = null;
            RS = null;
        } 
        return DT;
    }
    
    public String getPassword(String usuario){
        String SQL_SELECT = "SELECT pass FROM usuarios WHERE user= ?";
        String contra="";
        
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            PS.setString(1, usuario);
            RS = PS.executeQuery();
            if(RS.next()){
               contra = RS.getString(1);
            }
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }
        return contra;
    }
    
    public int getTypeuser(String usuario){
        String SQL_SELECT = "SELECT t_user FROM usuarios WHERE user= ?";
        int user_t = 0;
        try{
            PS = CN.getConnection().prepareStatement(SQL_SELECT);
            PS.setString(1, usuario);
            RS = PS.executeQuery();
            if(RS.next()){
               user_t = RS.getInt(1);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage(),"MySql",JOptionPane.ERROR_MESSAGE);
        }
        return user_t;
    }
    
        public int setUser(String user,String name, String pass,int cuenta){
        try{
            String SQL_INSERT = "INSERT INTO usuarios(user,nombre,pass,t_user) values(?,?,?,?)";
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
}
