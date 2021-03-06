/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on May 6, 2011, 10:55:03 AM
 */
package cybercenter;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Md. Hasibur Rashid
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screen.width - 500) / 2, (screen.height - 350) / 2);
        try {
            if (com_language.getSelectedIndex() == 1) {
                this.bangla_login();
            }
        } catch (Exception ex1) {
            System.out.println("" + ex1);
        }

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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        com_language = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cyber Center Login window");
        setIconImage(Toolkit.getDefaultToolkit().getImage("Icon\\cybercenter5.png"));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("User name");

        jLabel2.setText("Password");

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
        });

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Enterprise", 0, 36));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mastermind  Cyber Center");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/HP-Monitor (Custom).png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12));
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Come with upcoming cyber world on your new vision");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("®");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel7)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel9)))
                .addGap(6, 6, 6)
                .addComponent(jLabel7))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("All rights are reserved by Mastermind Technology©");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cybercenter/Resource/Locker (Custom).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("<html><a href=\"#\">Click here to sign up</a><br />");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        com_language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  English", "  Bangla" }));
        com_language.setFocusable(false);
        com_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_languageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(com_language, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(451, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(com_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel6)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String str1 = null;
    String str2 = null;

    public void hasib() {

        String usname = user.getText();


        Connection con = null;
        ResultSet resultSet = null;
        Statement statement = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "cyber_center";
        String driver = "com.mysql.jdbc.Driver";
        String users = "root";
        String pass = "";



        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url + db, users, pass);
            PreparedStatement st = (PreparedStatement) con.prepareStatement("select * from login where username=?");
            st.setString(1, usname);

            resultSet = st.executeQuery();
            // "SELECT * FROM login where username ='" + usname + "'");
            while (resultSet.next()) {
                str1 = "" + resultSet.getString(1);
                str2 = "" + resultSet.getString(2);
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error");

        }

    }

    public void create_database() {
        Connection con;
        Statement statement;
        ResultSet resultSet;
        ResultSetMetaData metaData;
        String url = "jdbc:mysql://localhost/mysql";
        //  String db = "cyber_center2";
        String driver = "com.mysql.jdbc.Driver";
        String user = "root";
        String pass = "";


        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            statement = (Statement) con.createStatement();


            try {

                statement.executeUpdate("CREATE DATABASE if not exists `cyber_center`");
                //JOptionPane.showMessageDialog(null,"Created");
                //con = (Connection) DriverManager.getConnection(url + db, user, pass);
                url = "jdbc:mysql://localhost/cyber_center";
                con = (Connection) DriverManager.getConnection(url, "root", "");

                statement = (Statement) con.createStatement();
                String table1 = "CREATE TABLE if not exists internet (computer_id VARCHAR(50) NOT NULL, member_id VARCHAR(50),ip_address VARCHAR(15) NOT NULL, `name` VARCHAR(100) NOT NULL, started_time VARCHAR(20) NOT NULL, faculty VARCHAR(50) NOT NULL, occupation VARCHAR(50) NOT NULL, reg_no VARCHAR(50), serial VARCHAR(50) NOT NULL, PRIMARY KEY (computer_id))";
                String table2 = "CREATE TABLE if not exists internet_history (`member_id` VARCHAR(50), `computer_id` VARCHAR(50) NOT NULL, `name` VARCHAR(50) NOT NULL, faculty VARCHAR(50) NOT NULL, occupation VARCHAR(50), regno VARCHAR(50), `date` VARCHAR(25) NOT NULL, started_time VARCHAR(25) NOT NULL, stopped_time VARCHAR(25) NOT NULL, used_time VARCHAR(25) NOT NULL, internet_bill VARCHAR(20) NOT NULL, other_bill VARCHAR(10), discount VARCHAR(10), total_cost VARCHAR(20) NOT NULL, `No` VARCHAR(10) NOT NULL, PRIMARY KEY (`No`))";
                String table3 = "CREATE TABLE if not exists managment_moth (internet_sevices VARCHAR(10) NOT NULL, printing_services VARCHAR(10) NOT NULL, course_income VARCHAR(10) NOT NULL, mobile_services VARCHAR(10) NOT NULL, accessories_income VARCHAR(10) NOT NULL, servicing VARCHAR(10) NOT NULL, others_income VARCHAR(10) NOT NULL, house_rent VARCHAR(10) NOT NULL, employe_salary VARCHAR(10) NOT NULL, electric_bill VARCHAR(10) NOT NULL, telephone_bill VARCHAR(10) NOT NULL, maintanence VARCHAR(10) NOT NULL, mobile_cost VARCHAR(10) NOT NULL, printing_cost VARCHAR(10) NOT NULL, internet_charge VARCHAR(10) NOT NULL, accessories_expance VARCHAR(10) NOT NULL, products VARCHAR(10) NOT NULL, others VARCHAR(10) NOT NULL, total_income VARCHAR(10) NOT NULL, total_expance VARCHAR(10) NOT NULL, net VARCHAR(10) NOT NULL, mounth VARCHAR(10) NOT NULL, `year` VARCHAR(4) NOT NULL, PRIMARY KEY (`year`))";
                String table4 = "CREATE TABLE if not exists mobile_reload (reload_id VARCHAR(50) NOT NULL, `name` VARCHAR(100) NOT NULL, address VARCHAR(1000) NOT NULL, mob1 VARCHAR(11) NOT NULL, mob2 VARCHAR(11) NOT NULL, mob3 VARCHAR(11) NOT NULL, mob4 VARCHAR(11) NOT NULL, mob5 VARCHAR(11) NOT NULL, mob6 VARCHAR(11) NOT NULL, PRIMARY KEY (reload_id))";
                String table5 = "CREATE TABLE if not exists register_member (`name` VARCHAR(50) NOT NULL, occupation VARCHAR(50) NOT NULL, gender VARCHAR(6) NOT NULL, faculty VARCHAR(50) NOT NULL, reg_no VARCHAR(50), contact_no VARCHAR(100) NOT NULL, mail_address VARCHAR(100), address VARCHAR(1000) NOT NULL, `type` VARCHAR(50) NOT NULL, addmission_date VARCHAR(20) NOT NULL, member_id VARCHAR(50) NOT NULL, course_name VARCHAR(100) NOT NULL, course_id VARCHAR(50), course_fee VARCHAR(20) NOT NULL, amount_pay VARCHAR(20) NOT NULL, amount_due VARCHAR(20), image VARCHAR(300) NOT NULL, PRIMARY KEY (member_id))";
                String table6 = "CREATE TABLE if not exists reload_history (serial VARCHAR(50) NOT NULL, reload_id VARCHAR(50), `number` VARCHAR(11), oparator VARCHAR(15) NOT NULL, amount VARCHAR(15) NOT NULL, recharge_time VARCHAR(15) NOT NULL, `date` VARCHAR(20) NOT NULL, transection_id VARCHAR(50) NOT NULL, PRIMARY KEY (serial))";
                String table7 = "CREATE TABLE if not exists `servicing` (`serial_no` INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR(100) NOT NULL, `address` VARCHAR(500) NOT NULL, `contact_no` VARCHAR(50) NOT NULL, `problem_type` VARCHAR(25) NOT NULL, `problem` VARCHAR(300) NOT NULL, `date` VARCHAR(25) NOT NULL, `month` VARCHAR(15) NOT NULL, `year` VARCHAR(4) NOT NULL, `delivery_date` VARCHAR(25) NOT NULL, `cost` VARCHAR(10) NOT NULL, `discount` VARCHAR(10) NOT NULL,`total` VARCHAR(10) NOT NULL, `payment` VARCHAR(10) NOT NULL, `due` VARCHAR(10) NOT NULL)";
                String table8 = "CREATE TABLE if not exists `call_list` (`serial` INT( 10 ) NOT NULL AUTO_INCREMENT PRIMARY KEY ,`mobile_no` VARCHAR( 11 ) NOT NULL ,`call_duration` VARCHAR( 10 ) NOT NULL ,`service_provider` VARCHAR( 15 ) NOT NULL ,`date` VARCHAR( 25 ) NOT NULL ,`cost` VARCHAR( 10 ) NOT NULL)";
                String table9 = "CREATE TABLE if not exists `accessories_entry` (`serial` INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, `iteam_code` VARCHAR(10) NOT NULL, `iteam_name` VARCHAR(50) NOT NULL, `purchase_date` VARCHAR(25) NOT NULL, `suppliers` VARCHAR(50) NULL, `purchase_price` VARCHAR(10) NOT NULL, `selling_price` VARCHAR(10) NOT NULL, `quantity` VARCHAR(10) NOT NULL, `unit` VARCHAR(10) NOT NULL, `cost` VARCHAR(10) NOT NULL, `payment` VARCHAR(10) NULL, `due` VARCHAR(10) NULL, `comment` VARCHAR(300) NULL)";


                statement.executeUpdate(table1);
                statement.executeUpdate(table2);
                statement.executeUpdate(table3);
                statement.executeUpdate(table4);
                statement.executeUpdate(table5);
                statement.executeUpdate(table6);
                statement.executeUpdate(table7);
                statement.executeUpdate(table8);
                statement.executeUpdate(table9);

                con.close();
            } catch (SQLException s) {
                System.out.println("Table is all ready exists!");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error");
            e.printStackTrace();

        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // this.setVisible(false);
        hasib();
        create_database();
        if (user.getText().compareTo("cyber") == 0 && password.getText().compareTo("cyber") == 0) {
            if (com_language.getSelectedIndex() == 1) {
                new Main_window().bangla();
            } else if (com_language.getSelectedIndex() == 0) {
                new Main_window().English();
            }
            new Main_window().setVisible(true);
            new Sinup_window().setVisible(false);
            new Sinup_window().dispose();
            this.dispose();

        } else if (user.getText().compareTo("" + str1) == 0 && password.getText().compareTo("" + str2) == 0) {
            if (com_language.getSelectedIndex() == 1) {
                new Main_window().bangla();
            }
            new Main_window().setVisible(true);
            new Sinup_window().setVisible(false);
            new Sinup_window().dispose();
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "The Username or Password does not match, please try again.", "Error", JOptionPane.ERROR_MESSAGE);     // TODO add your handling code here:
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (com_language.getSelectedIndex() == 1) {
            new Sinup_window().bangla_sinup();
        }
        new Sinup_window().setVisible(true);
        new Sinup_window().login_Database();
        this.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        String kycmd = new String(KeyEvent.getKeyText(evt.getKeyCode()));
        if (kycmd.equals("Enter")) {

            hasib();
            create_database();
            if (user.getText().compareTo("cyber") == 0 && password.getText().compareTo("cyber") == 0) {
                if (com_language.getSelectedIndex() == 0) {
                    new Main_window().bangla();
                }
                new Main_window().setVisible(true);
                new Sinup_window().setVisible(false);
                new Sinup_window().dispose();
                this.dispose();


            } else if (user.getText().compareTo("" + str1) == 0 && password.getText().compareTo("" + str2) == 0) {
                if (com_language.getSelectedIndex() == 0) {
                    new Main_window().bangla();
                }
                new Main_window().setVisible(true);
                new Sinup_window().setVisible(false);
                new Sinup_window().dispose();
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "The User name or Password does not match, please try again.", "Error", JOptionPane.ERROR_MESSAGE);     // TODO add your handling code here:
            }

        }

    }//GEN-LAST:event_passwordKeyPressed

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        String kycmd = new String(KeyEvent.getKeyText(evt.getKeyCode()));
        if (kycmd.equals("Enter")) {
        }
    }//GEN-LAST:event_userKeyPressed

    private void com_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_languageActionPerformed
        if (com_language.getSelectedIndex() == 0) {
        }
        if (com_language.getSelectedIndex() == 1) {
            bangla_login();//new Sinup_window().bangla_sinup();new Main_window().bangla(); new Main_window().setVisible(true);
        }
    }//GEN-LAST:event_com_languageActionPerformed
    public void bangla_login() {
        jLabel1.setText("ব্যাবহার কারির নাম ");
        jLabel1.setFont(new java.awt.Font("SolaimanLipi", 0, 11));
        jLabel2.setText("পাসওয়ার্ড");
        jLabel2.setFont(new java.awt.Font("SolaimanLipi", 0, 11));
        jButton1.setText("লগইন");
        jButton1.setFont(new java.awt.Font("SolaimanLipi", 0, 11));

        jLabel4.setText("মাস্টারমাইন্ড সাইবার সেন্টার ");
        jLabel4.setFont(new java.awt.Font("SolaimanLipi", 0, 32));
        jLabel8.setText("<html><a href=\"#\">সাইন আপের জন্য ক্লিক করুন</a><br />");
        jLabel8.setFont(new java.awt.Font("SolaimanLipi", 0, 11));
    }

    public void english_login() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox com_language;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
