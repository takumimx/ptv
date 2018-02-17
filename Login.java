package puntovtn;
import Db_Conexion.*;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    private final Comunicacion CP;
    
    public Login() {
        initComponents();
        CP = new Comunicacion();
        jLabel3.setBackground(new Color(44, 62, 80));
        listar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 110, 100, 18);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 160, 100, 18);

        jComboBox1.setFont(new java.awt.Font("Cambria Math", 2, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(180, 110, 111, 25);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(180, 160, 110, 25);

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 210, 90, 30);

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/navegador (3).png"))); // NOI18N
        jLabel3.setText("  Inicio de Sesión");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 420, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void listar(){
        jComboBox1.setModel(CP.getDatos());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String contra;
        if(new String(jPasswordField1.getPassword()).equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese una Contraseña","Error de Datos",JOptionPane.ERROR_MESSAGE);
        }else{
            contra=CP.Validadar(jComboBox1.getSelectedItem().toString());
            if(contra.equals(new String(jPasswordField1.getPassword()))){
                Panel form1 = new Panel();
                form1.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Contraseña Incorrecta","Error de Datos",JOptionPane.ERROR_MESSAGE);
                jPasswordField1.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
