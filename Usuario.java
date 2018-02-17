package puntovtn;
import Db_Conexion.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JFrame {
    Comunicacion CP;
    public Usuario() {
        initComponents();
        jLabel3.setBackground(new Color(44, 62, 80));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuarios");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 610, 60);

        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 40, 60, 14);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 160, 80, 14);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 40, 190, 20);
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(160, 160, 190, 20);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(160, 200, 190, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Re - Contraseña");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 200, 100, 14);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 250, 100, 23);

        jButton2.setText("Cancelar");
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 250, 100, 23);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(160, 120, 70, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Cajero");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(260, 120, 80, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cuenta:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 120, 50, 14);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 80, 60, 14);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 80, 190, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 80, 440, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Panel.user=null;
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CP = new Comunicacion();
        String usuario = jTextField1.getText();
        String nombre = jTextField2.getText();
        String pass = new String (jPasswordField1.getPassword()); 
        int tipo;
        
        if(jRadioButton1.isSelected()){
            tipo = 1;
        }else{
            tipo = 0;
        }
        
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese Nick de Usuario", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        }else{
            if(jTextField2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Ingrese Nombre de Usuario", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                jTextField2.requestFocus();
            }else{
                if(new String(jPasswordField1.getPassword()).equals("")){
                    JOptionPane.showMessageDialog(null,"Ingrese Contraseña", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.requestFocus();
                }else{
                    if(new String(jPasswordField2.getPassword()).equals("")){
                        JOptionPane.showMessageDialog(null,"Ingrese Nuevamente Contraseña", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                        jPasswordField2.requestFocus();
                    }else{
                        if(new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))){
                            CP.insertDatos(usuario, nombre, pass, tipo);
                            this.dispose();
                        }else{
                            jPasswordField1.requestFocus();
                            jPasswordField1.setText("");
                            jPasswordField2.setText("");
                            JOptionPane.showMessageDialog(null,"Las Contraseñas No Coinciden", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
