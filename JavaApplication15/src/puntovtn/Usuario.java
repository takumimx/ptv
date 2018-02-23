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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JComboBox<>();

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
        jLabel3.setBounds(200, -10, 610, 80);

        jPanel2.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Usuario");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(130, 20, 60, 14);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Contraseña:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(110, 140, 80, 14);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(200, 20, 190, 28);
        jPanel2.add(jPasswordField3);
        jPasswordField3.setBounds(200, 140, 190, 28);
        jPanel2.add(jPasswordField4);
        jPasswordField4.setBounds(200, 180, 190, 28);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Re - Contraseña:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(70, 180, 120, 14);

        jButton4.setText("Cancelar");
        jPanel2.add(jButton4);
        jButton4.setBounds(320, 230, 100, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Admin");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton3);
        jRadioButton3.setBounds(200, 100, 70, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Cajero");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4);
        jRadioButton4.setBounds(300, 100, 80, 23);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cuenta:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(140, 100, 50, 14);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nombre:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(130, 60, 60, 14);
        jPanel2.add(jTextField4);
        jTextField4.setBounds(200, 60, 190, 28);

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(160, 230, 100, 23);

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
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(200, 140, 190, 20);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(200, 180, 190, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Re - Contraseña:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 180, 100, 14);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Admin");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(200, 100, 70, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cajero");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(300, 100, 80, 23);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Cuenta:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 100, 50, 14);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 60, 60, 14);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 60, 190, 20);

        jTextField1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(200, 20, 190, 20);

        jTabbedPane1.addTab("Modificar Datos", jPanel1);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 50, 560, 310);

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
        CP = new Comunicacion();
        String usuario = jTextField1.getSelectedItem().toString();
        String nombre = jTextField2.getText();
        String pass = new String (jPasswordField1.getPassword());
        int tipo;

        if(jRadioButton1.isSelected()){
            tipo = 1;
        }else{
            tipo = 0;
        }

        if(jTextField1.getSelectedItem().toString().equals("")){
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

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
