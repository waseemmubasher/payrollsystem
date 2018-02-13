
package JFrames;
import DBManager.DBM;
import java.awt.*;
import java.util.Vector;
import javax.swing.JOptionPane;
/**
 * 
 * 
 *
 * @author Waseem
 */
public class AdminLogin extends javax.swing.JFrame {

    /** Creates new form AdminLogin */
    public AdminLogin() {
        initComponents();
     
        passlabel.setVisible(false);
        userlbl.setVisible(false);
       
         setBounds(0,0,1260,760);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userlbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/qdi-generic-testimonial-person.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 150, 250, 260);

        jPanel1.setBackground(new java.awt.Color(-16777216,true));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/login1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(51, 66, 30, 30);

        userlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/oops.png"))); // NOI18N
        jPanel1.add(userlbl);
        userlbl.setBounds(280, 65, 62, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/login3.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(495, 172, 33, 33);

        passlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/oops.png"))); // NOI18N
        jPanel1.add(passlabel);
        passlabel.setBounds(280, 110, 62, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/login2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 110, 30, 30);

        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(80, 65, 198, 32);

        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(80, 110, 170, 30);

        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/login3.png"))); // NOI18N
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        signin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signinKeyPressed(evt);
            }
        });
        jPanel1.add(signin);
        signin.setBounds(250, 110, 30, 30);

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 36));
        jLabel2.setForeground(new java.awt.Color(-16776961,true));
        jLabel2.setText("Admin Login");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 11, 253, 48);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 390, 356, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JFrames/HD-Website-Backgrounds-for-Desktop  VCC.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
// TODO add your handling code here:
    passlabel.setVisible(false);
}//GEN-LAST:event_passwordKeyPressed

private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
passlabel.setVisible(false);
}//GEN-LAST:event_passwordMouseClicked

private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
// TODO add your handling code here:
      userlbl.setVisible(false);
}//GEN-LAST:event_usernameKeyPressed

private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

}//GEN-LAST:event_usernameActionPerformed

private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked

    userlbl.setVisible(false);
}//GEN-LAST:event_usernameMouseClicked

private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed

                                String usrname = username.getText();
				String passwrd = password.getText();
				if(username.getText().equals("")){userlbl.setVisible(true);}
                                if(password.getText().equals("")){passlabel.setVisible(true);}
                                
				if(username.getText().equals("")){userlbl.setVisible(true);}
				else if(password.getText().equals("")){passlabel.setVisible(true);}
				else{
			  try {
		   
			Vector v = DBM.getAdminLogin(usrname, passwrd);
                        if(v.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Incorrect UserName And Password");
                            username.setText("");
                            password.setText("");
                        }
			if((v.get(0).equals(usrname))&&(v.get(1).equals(passwrd))){
			AdminLogin.this.setVisible(false);
                        new MainMenu().setVisible(true);
			} 
			else{
			JOptionPane.showMessageDialog(null,"Incorrect UserName And Password");
			username.setText("");
			password.setText("");
			}
			}catch (Exception ex) {System.out.println(ex.getMessage());
                                }
		}
    
}//GEN-LAST:event_signinActionPerformed

    private void signinKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signinKeyPressed
    String usrname = username.getText();
				String passwrd = password.getText();
				if(username.getText().equals("")){userlbl.setVisible(true);}
                                if(password.getText().equals("")){passlabel.setVisible(true);}
                                
				if(username.getText().equals("")){userlbl.setVisible(true);}
				else if(password.getText().equals("")){passlabel.setVisible(true);}
				else{
			  try {
		   
			Vector v = DBM.getAdminLogin(usrname, passwrd);
                        if(v.isEmpty()){
                            JOptionPane.showMessageDialog(null,"Incorrect UserName And Password");
                            username.setText("");
                            password.setText("");
                        }
			if((v.get(0).equals(usrname))&&(v.get(1).equals(passwrd))){
			AdminLogin.this.setVisible(false);
                        new MainMenu().setVisible(true);
			} 
			else{
			JOptionPane.showMessageDialog(null,"Incorrect UserName And Password");
			username.setText("");
			password.setText("");
			}
			}catch (Exception ex) {System.out.println(ex.getMessage());
                                }
		}
    }//GEN-LAST:event_signinKeyPressed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passlabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signin;
    private javax.swing.JLabel userlbl;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
