package puntovtn;
import Db_Conexion.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private final Login_Class vpn;
    
    public Login() {
        initComponents();
        vpn = new Login_Class();
        listar();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 190, 100, 15);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 240, 100, 15);

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(140, 190, 150, 25);

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(140, 240, 150, 25);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 310, 90, 30);

        jLabel3.setBackground(new java.awt.Color(204, 204, 0));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados (1).png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 50, 400, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/stereoscopic-diagonal-squares-background-vector0.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-150, -50, 660, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void listar(){
        jComboBox1.setModel(vpn.getAlluser());
        jPasswordField1.requestFocus();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
            iniciar();
        } 
    }//GEN-LAST:event_jPasswordField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
    
    private void iniciar(){
        String contra;
        String usuario = jComboBox1.getSelectedItem().toString();
        
        if(new String(jPasswordField1.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese una Contraseña","Dato Incorrecto",JOptionPane.ERROR_MESSAGE);
        }else{          
            contra=vpn.getPassword(usuario);        
            if(contra.equals(new String(jPasswordField1.getPassword()))){
                Panel form1 = new Panel();
                int t = vpn.getTypeuser(usuario);
                if(t==0){
                    Panel.jButton4.setEnabled(false);
                    Panel.jButton6.setEnabled(false);
                    Panel.jButton8.setEnabled(false);
                }else{
                    Panel.jButton4.setEnabled(true);
                    Panel.jButton6.setEnabled(true);
                    Panel.jButton8.setEnabled(true);
                }
                
                Panel.produc=null;
                Panel.user=null;
                form1.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta","Dato Incorrect",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
                jPasswordField1.requestFocus();
            }
        }
    }
}
