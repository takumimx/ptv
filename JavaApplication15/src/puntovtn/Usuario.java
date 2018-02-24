package puntovtn;
import Db_Conexion.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JFrame {
    Login_Class vpn;
    public Usuario() {
        initComponents();
        vpn = new Login_Class();
        listar();
    }
    private void listar(){
        jComboBox1.setModel(vpn.getAlluser());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Usuario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados.png"))); // NOI18N
        jLabel3.setText("Usuarios");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 0, 610, 80);

        jPanel2.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 20, 60, 14);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Contraseña:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 140, 80, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 20, 190, 26);
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(200, 140, 190, 26);

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField2);
        jPasswordField2.setBounds(200, 180, 190, 26);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Re - Contraseña:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(70, 180, 120, 14);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cuenta:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 100, 50, 14);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 60, 60, 14);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(200, 60, 190, 26);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(200, 230, 190, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton1);
        jRadioButton1.setBounds(200, 100, 70, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Cajero");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton2);
        jRadioButton2.setBounds(300, 100, 80, 23);

        jTabbedPane1.addTab("Crear Cuenta", jPanel2);

        jPanel1.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 20, 60, 14);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nueva Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 140, 120, 14);
        jPanel1.add(jPasswordField5);
        jPasswordField5.setBounds(200, 140, 190, 26);
        jPanel1.add(jPasswordField6);
        jPasswordField6.setBounds(200, 180, 190, 26);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Re - Contraseña:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 180, 100, 14);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cuenta:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 100, 50, 14);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 60, 60, 14);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(200, 60, 190, 26);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(200, 20, 190, 26);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Cajero");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(300, 100, 80, 23);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Admin");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(200, 100, 70, 23);

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 230, 190, 30);

        jTabbedPane1.addTab("Modificar Datos", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 50, 590, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Panel.user=null;
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String user = jTextField1.getText();
        String name = jTextField2.getText();
        String pass = new String(jPasswordField1.getPassword());
        int t_user = 0;
        boolean admin = jRadioButton1.isSelected();
        
        if(admin == true){
            t_user = 1;
        }else{
            t_user = 0;
        }
        
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese Nick De Usuario", "Datos", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus();
        }else{
            if(jTextField2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese Nombre De Usuario", "Datos", JOptionPane.ERROR_MESSAGE);
                jTextField2.requestFocus();
            }else{
                if(new String(jPasswordField1.getPassword()).equals("") || new String(jPasswordField2.getPassword()).equals("")){
                    JOptionPane.showMessageDialog(null, "Ingrese Contraseña", "Datos", JOptionPane.ERROR_MESSAGE);
                    jPasswordField1.setText("");
                    jPasswordField2.setText("");
                    jPasswordField1.requestFocus();
                }else{
                    if(new String(jPasswordField1.getPassword()).equals(new String(jPasswordField2.getPassword()))){
                        vpn.setUser(user, name, pass, t_user);
                        Panel.user=null;
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Las Contraseñas no Coinciden", "Datos", JOptionPane.ERROR_MESSAGE);
                        jPasswordField1.setText("");
                        jPasswordField2.setText("");
                        jPasswordField1.requestFocus();
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String usuario = jComboBox1.getSelectedItem().toString();
        String nombre = jTextField3.getText();
        String pass = new String (jPasswordField5.getPassword());
        int tipo;

        if(jRadioButton1.isSelected()){
            tipo = 1;
        }else{
            tipo = 0;
        }

        if(jComboBox1.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese Nick de Usuario", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
            jComboBox1.requestFocus();
        }else{
            if(jTextField3.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Ingrese Nombre de Usuario", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                jTextField3.requestFocus();
            }else{
                if(new String(jPasswordField5.getPassword()).equals("")){
                    JOptionPane.showMessageDialog(null,"Ingrese Contraseña", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                    jPasswordField5.requestFocus();
                }else{
                    if(new String(jPasswordField6.getPassword()).equals("")){
                        JOptionPane.showMessageDialog(null,"Ingrese Nuevamente Contraseña", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                        jPasswordField6.requestFocus();
                    }else{
                        if(new String(jPasswordField5.getPassword()).equals(new String(jPasswordField6.getPassword()))){
                            vpn.setUser(usuario, nombre, pass, tipo);
                            Panel.user=null;
                            this.dispose();
                        }else{
                            jPasswordField5.requestFocus();
                            jPasswordField5.setText("");
                            jPasswordField6.setText("");
                            JOptionPane.showMessageDialog(null,"Las Contraseñas No Coinciden", "Ingrese Datos",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
