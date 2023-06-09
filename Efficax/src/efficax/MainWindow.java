
package efficax;

import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/*
    Designed by Moises David Maldonado de León
 */
public class MainWindow extends javax.swing.JFrame {

    private void close(){
        String buttons[] = {"Salir","Cancelar"};
        int choose = JOptionPane.showOptionDialog(
                        this, "¿Desea salir de la aplicación?", "Salir", 
                                0, 0, null, buttons, this);
        
        if(choose==JOptionPane.YES_OPTION){
            System.exit(0);
        }else if(choose==JOptionPane.NO_OPTION){
            System.out.println("Operación cancelada");
        }
    }
    
    
    //Constructor
    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        SetImageLogo();
        //this.buttonAceptarMain.setBorder(new RoundedBorder(10));
        this.setVisible(true);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        opMin = new javax.swing.JRadioButton();
        opAsig = new javax.swing.JRadioButton();
        myButton1 = new efficax.MyButton();
        myButton2 = new efficax.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Efficax - Menú Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(67, 202, 206));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 220, 210));

        jPanel2.setBackground(new java.awt.Color(229, 243, 166));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("¡Bienvenido!");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Para iniciar elije una opción:");

        Grupo1.add(opMin);
        opMin.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        opMin.setText("Minimizar horas de estudio");
        opMin.setOpaque(false);
        opMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opMinActionPerformed(evt);
            }
        });

        Grupo1.add(opAsig);
        opAsig.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        opAsig.setText("Asignación de tareas diarias");
        opAsig.setOpaque(false);

        myButton1.setBackground(new java.awt.Color(51, 153, 0));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Aceptar");
        myButton1.setColorOver(new java.awt.Color(255, 255, 204));
        myButton1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        myButton1.setRadius(50);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opAsig)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(opMin, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opMin)
                .addGap(9, 9, 9)
                .addComponent(opAsig)
                .addGap(8, 8, 8)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 530, 220));

        myButton2.setBackground(new java.awt.Color(153, 0, 0));
        myButton2.setForeground(new java.awt.Color(255, 255, 255));
        myButton2.setText("Salir");
        myButton2.setColorOver(new java.awt.Color(0, 255, 255));
        myButton2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        myButton2.setRadius(50);
        myButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(myButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        close();
    }//GEN-LAST:event_formWindowClosing

    private void opMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opMinActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        //Capturar el texto, llamada de ventanas de cada uno
        if(opMin.isSelected()){
            System.out.println("Minimizar, opción 1");
            
            //Mostrar ventana
            menuOptions1 newWindow = new menuOptions1();
            
            //limpiar datos
            newWindow.clearAll();
            
            newWindow.setVisible(true);
            this.setVisible(false);
            
        }
        else if(opAsig.isSelected()){
            System.out.println("Asignacion, opción 2");
            //Mostrar ventana
            menuOptions2 newWindow2 = new menuOptions2();
            
            //limpiar datos
            newWindow2.limpiar();
            
            newWindow2.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_myButton1ActionPerformed

    private void myButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2ActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_myButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void SetImageLogo(){
        ImageIcon image = new ImageIcon(
                            getClass().getResource("/images/IO_logo.png"));
        Icon icon = new ImageIcon(
                        image.getImage().getScaledInstance(
                                this.labelLogo.getWidth(), 
                                this.labelLogo.getHeight(), 
                                Image.SCALE_DEFAULT));
        this.labelLogo.setIcon(icon);
        this.repaint();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogo;
    private efficax.MyButton myButton1;
    private efficax.MyButton myButton2;
    private javax.swing.JRadioButton opAsig;
    private javax.swing.JRadioButton opMin;
    // End of variables declaration//GEN-END:variables
}
