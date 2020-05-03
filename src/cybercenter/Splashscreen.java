/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Splashscreen.java
 *
 * Created on May 30, 2011, 11:30:12 PM
 */
package cybercenter;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Md. Hasibur Rashid
 */
public class Splashscreen extends javax.swing.JFrame {

    /** Creates new form Splashscreen */
    public Splashscreen() {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screen.width - 500) / 2, (screen.height - 350) / 2);
        setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setIconImage(Toolkit.getDefaultToolkit().getImage("Icon\\cybercenter5.png"));
        setName("frame5"); // NOI18N
        setResizable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Entire Network (Custom).png"))); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 130, 110));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Enterprise", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cyber Center");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Come with upcoming cyber world on your new vision");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("All rights are reserved by Mastermind Technology©");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("®");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Gif/loading6.gif"))); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, -1, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Gif/loading6.gif"))); // NOI18N
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, 20));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Gif/loading6.gif"))); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Gif/loading6.gif"))); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 51, 620, 280));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Enterprise", 1, 24));
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Mastermind");
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 9));
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("TM");
        jLabel6.setName("jLabel6"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(443, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 330));

        getAccessibleContext().setAccessibleName("Cyber center");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Splashscreen().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    // End of variables declaration//GEN-END:variables
}