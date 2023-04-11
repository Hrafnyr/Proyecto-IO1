/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efficax;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static efficax.menuOptions2.tiempoInvertido;
import static efficax.menuOptions2.valores1;
import static efficax.menuOptions2.valores2;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moises
 */
public class resultado2 extends javax.swing.JFrame {

    /**
     * Creates new form resultado2
     */
    JFileChooser ver = new JFileChooser("./");
    
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    String nombre;
    int contV = 0;
    
    public resultado2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelZ = new javax.swing.JLabel();
        myButton1 = new efficax.MyButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optionSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Resultados");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(106, 130, 179));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(207, 207, 207))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Día", "Actividad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        labelZ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelZ.setForeground(new java.awt.Color(255, 255, 255));
        labelZ.setText("Se invertiran 100000000 horas de estudio");

        myButton1.setBackground(new java.awt.Color(161, 235, 69));
        myButton1.setText("Aceptar");
        myButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        myButton1.setRadius(65);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelZ, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelZ, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jMenu1.setText("Guardar como...");

        optionSave.setText("Archivo PDF");
        optionSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSaveActionPerformed(evt);
            }
        });
        jMenu1.add(optionSave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSaveActionPerformed
        // TODO add your handling code here:
        //Metodo para guardar
        if(ver.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
            archivo = ver.getSelectedFile().getAbsoluteFile() ;
            if (archivo != null) {
                String nombre = ver.getSelectedFile().getName();

                Document archivo1 = new Document();

                try {

                    PdfWriter.getInstance(archivo1, new FileOutputStream(archivo + ".pdf"));

                    Paragraph Titulo1 = new Paragraph();
                    Titulo1.setAlignment(Paragraph.ALIGN_CENTER);
                    Titulo1.add("Resultados \n ");
                    Titulo1.setFont(com.itextpdf.text.FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.BLACK));

                    PdfPTable tablaS = new PdfPTable (2);
                    tablaS.addCell("Día");
                    tablaS.addCell("Actividad");

                    archivo1.open();

                    archivo1.add(Titulo1);

                    try {

                        for (int i = 0; i < valores1.size(); i++) {
                            tablaS.addCell(valores1.get(i));
                            tablaS.addCell(valores2.get(i));
                        }
                        archivo1.add(tablaS);

                        Paragraph Titulo2 = new Paragraph();
                        Titulo2.setAlignment(Paragraph.ALIGN_CENTER);
                        Titulo2.add("\n Mínimo de tiempo empleado: "+tiempoInvertido+"\n");
                        Titulo2.setFont(com.itextpdf.text.FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.BLACK));
                        archivo1.add(Titulo2);

                    } catch (Exception e) {

                        e.printStackTrace();
                    }
                    archivo1.close();

                } catch (Exception e) {
                }
                archivo1.close();

            }
        }else{
            return;
        }
    }//GEN-LAST:event_optionSaveActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        // TODO add your handling code here:
        MainWindow principal = new MainWindow();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_myButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(resultado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultado2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultado2().setVisible(true);
            }
        });
    }

   public void addNewRow(){
        
        for (int i = 0; i < valores1.size(); i++) {
            //obtener el objeto
            String vector[]={valores1.get(i),valores2.get(i)};
            DefaultTableModel tb = (DefaultTableModel)this.jTable1.getModel();
            tb.addRow(vector);
            this.jTable1.setRowHeight(25);     
        }
          
    }
    
    public void Clear_T(){
        for (int i = 0; i < this.jTable1.getRowCount(); i++) {
            DefaultTableModel tb = (DefaultTableModel)this.jTable1.getModel();
            tb.removeRow(i);
            i-=1;
        }
    }
    
    public void showLabel(){
        this.labelZ.setText("Mínimo de tiempo empleado: "+tiempoInvertido);
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelZ;
    private efficax.MyButton myButton1;
    private javax.swing.JMenuItem optionSave;
    // End of variables declaration//GEN-END:variables
}
