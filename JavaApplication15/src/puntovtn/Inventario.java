
package puntovtn;
import Db_Conexion.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import static puntovtn.Panel.tabla;

public class Inventario extends javax.swing.JFrame {
    public static DefaultTableModel tabla;
    
    private final Cm_Productos npc;
    public Inventario() {
        initComponents();

        npc = new Cm_Productos();
        tabla = (DefaultTableModel) jTable1.getModel();
        listar();
    }
    private void listar(){

        npc.getDatosTabla();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(891, 569));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(102, 102, 102));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Barra", "Descripcion de Producto", "Existencia", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 823, 290);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 150, 431, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-codigo-simbolo-de-interfaz-de-una-lupa-con-numeros-de-codigo-binario.png"))); // NOI18N
        jButton1.setText("Buscar");
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 145, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/codigo-de-barras (2).png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 130, 70, 70);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/padnote.png"))); // NOI18N
        jLabel2.setText("Control de Inventario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 30, 520, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Panel.inv = null;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
