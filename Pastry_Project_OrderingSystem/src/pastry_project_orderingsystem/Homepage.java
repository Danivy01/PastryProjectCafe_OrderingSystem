/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pastry_project_orderingsystem;

import AppPackage.AnimationClass;

/**
 *
 * @author Yvette Rimas
 */
public final class Homepage extends javax.swing.JFrame {
    
    AnimationClass ac = new AnimationClass();

    /**
     * Creates new form Homepage
     */
    public Homepage() {
        initComponents();
        Slideshow();
    }
    
        public void Slideshow(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                int nb = 0;
                try{
                    while(true){
                        switch(nb){
                            case 0:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(0, -500, 12, 10, img1);
                                ac.jLabelXLeft(500, 0, 12, 10, img2);
                                ac.jLabelXLeft(1000, 500, 12, 10, img3);
                                ac.jLabelXLeft(1500, 1000, 12, 10, img4);
                                ac.jLabelXLeft(2000, 1500, 12, 10, img5);
                                nb++;
                                
                            case 1:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img1);
                                ac.jLabelXLeft(0, -500, 12, 10, img2);
                                ac.jLabelXLeft(500, 0, 12, 10, img3);
                                ac.jLabelXLeft(1000, 500, 12, 10, img4);
                                ac.jLabelXLeft(1500, 1000, 12, 10, img5);
                                nb++;
                                
                            case 2:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-1000, -1500, 12, 10, img1);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img2);
                                ac.jLabelXLeft(0, -500, 12, 10, img3);
                                ac.jLabelXLeft(500, 0, 12, 10, img4);
                                ac.jLabelXLeft(1000, 500, 12, 10, img5);
                                nb++;
                                
                            case 3:
                                Thread.sleep(2500);
                                ac.jLabelXLeft(-1500, -2000, 12, 10, img1);
                                ac.jLabelXLeft(-1000, -1500, 12, 10, img2);
                                ac.jLabelXLeft(-500, -1000, 12, 10, img3);
                                ac.jLabelXLeft(0, -500, 12, 10, img4);
                                ac.jLabelXLeft(500, 0, 12, 10, img5);
                                nb++;
                                
                            case 4:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-2000, -1500, 12, 10, img1);
                                ac.jLabelXRight(-1500, -1000, 12, 10, img2);
                                ac.jLabelXRight(-1000, -500, 12, 10, img3);
                                ac.jLabelXRight(-500, 0, 12, 10, img4);
                                ac.jLabelXRight(0, 500, 12, 10, img5);
                                nb++;
                                
                            case 5:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-1500, -1000, 12, 10, img1);
                                ac.jLabelXRight(-1000, -500, 12, 10, img2);
                                ac.jLabelXRight(-500, 0, 12, 10, img3);
                                ac.jLabelXRight(0, 500, 12, 10, img4);
                                ac.jLabelXRight(500, 1000, 12, 10, img5);
                                nb++;
                                
                            case 6:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-1000, -500, 12, 10, img1);
                                ac.jLabelXRight(-500, 0, 12, 10, img2);
                                ac.jLabelXRight(0, 500, 12, 10, img3);
                                ac.jLabelXRight(500, 1000, 12, 10, img4);
                                ac.jLabelXRight(1000, 1500, 12, 10, img5);
                                nb++;
                                
                            case 7:
                                Thread.sleep(2500);
                                ac.jLabelXRight(-500, 0, 12, 10, img1);
                                ac.jLabelXRight(0, 500, 12, 10, img2);
                                ac.jLabelXRight(500, 1000, 12, 10, img3);
                                ac.jLabelXRight(1000, 1500, 12, 10, img4);
                                ac.jLabelXRight(500, 2000, 12, 10, img5);
                                nb = 0;
                        }
                    }
                }catch (InterruptedException ex){
                    
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        right = new javax.swing.JPanel();
        left = new javax.swing.JPanel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1540, 865));
        setPreferredSize(new java.awt.Dimension(1540, 865));
        setSize(new java.awt.Dimension(1300, 750));
        getContentPane().setLayout(new java.awt.CardLayout());

        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        right.setBackground(new java.awt.Color(255, 255, 255));
        right.setMinimumSize(new java.awt.Dimension(1540, 865));
        right.setPreferredSize(new java.awt.Dimension(1540, 865));
        right.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        left.setBackground(new java.awt.Color(255, 204, 153));
        left.setMinimumSize(new java.awt.Dimension(2500, 600));
        left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Slideshow 1.png"))); // NOI18N
        left.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 542));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Slideshow 2.png"))); // NOI18N
        left.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 430, 542));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Slideshow 3.png"))); // NOI18N
        left.add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 430, 542));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Slideshow 4.png"))); // NOI18N
        left.add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 430, 542));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Slideshow 5.png"))); // NOI18N
        left.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2000, 0, 430, 542));

        right.add(left, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 430, 542));
        left.getAccessibleContext().setAccessibleParent(container);

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Proceed to Menu >>");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        right.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 600, 260, 80));

        jLabel3.setBackground(new java.awt.Color(255, 204, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Home BG.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1540, 865));
        jLabel3.setMinimumSize(new java.awt.Dimension(1540, 865));
        jLabel3.setPreferredSize(new java.awt.Dimension(1540, 865));
        right.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 750));

        container.add(right, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1540, 865));

        getContentPane().add(container, "card2");

        setSize(new java.awt.Dimension(1314, 757));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel left;
    private javax.swing.JPanel right;
    // End of variables declaration//GEN-END:variables
}
