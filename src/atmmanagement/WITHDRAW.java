/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atmmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author BLESSEDSON
 */
public class WITHDRAW extends javax.swing.JFrame {

    /**
     * Creates new form WITHDRAW
     */
    public WITHDRAW() {
        initComponents();
    }
     

        Connection Con = null;
        PreparedStatement pst =null,pst1=null;
        ResultSet Rs = null, Rs1=null;
        Statement St = null,St1=null;
        int Oldbalance;
        private void Clear()
        {
            AmountwTb.setText("");
        }
        int MyAccNum;
            public WITHDRAW(int AccNum) {
                initComponents(); 
                MyAccNum=   AccNum;
                GetBalance();
            }
     private void GetBalance()
     {
           String Query = "select  *  from Accounttbl  where AccNum =' "+MyAccNum+ " ' " ;
        try {
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
               St1 = Con.createStatement();
               Rs1 = St1.executeQuery(Query);
               /** if correct information Main menu becomes visible else message with wrong information**/
               if(Rs1.next()){
                   /** Takes the value present in index 9 of the database table**/
                   Oldbalance = Rs1.getInt(9) ;
                   balanlbl.setText(""+Oldbalance);
      
               }else{
                   //JOptionPane.showMessageDialog(this, "Wrong  Account Number or Pin");
               }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e);
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AmountwTb = new javax.swing.JTextField();
        WITHDRAWbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Balan = new javax.swing.JLabel();
        balanlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel1.setText("CODESPACE ATM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel2.setText("WITHDRAW  FORM");

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("BALANCE: ");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel4.setText("AMOUNT:");

        AmountwTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountwTbActionPerformed(evt);
            }
        });

        WITHDRAWbtn.setBackground(new java.awt.Color(51, 51, 51));
        WITHDRAWbtn.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        WITHDRAWbtn.setForeground(new java.awt.Color(0, 0, 51));
        WITHDRAWbtn.setText("WITHDRAW");
        WITHDRAWbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WITHDRAWbtnMouseClicked(evt);
            }
        });
        WITHDRAWbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("    BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        Balan.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        Balan.setForeground(new java.awt.Color(0, 0, 204));

        balanlbl.setFont(new java.awt.Font("Georgia", 0, 20)); // NOI18N
        balanlbl.setForeground(new java.awt.Color(0, 0, 204));
        balanlbl.setText("bal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(AmountwTb, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(WITHDRAWbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(balanlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Balan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Balan)
                    .addComponent(balanlbl))
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmountwTb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(WITHDRAWbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmountwTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountwTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountwTbActionPerformed

    private void WITHDRAWbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WITHDRAWbtnActionPerformed
    int Trid=0;
    private void Countdep()
 {
     try{
         St1=Con.createStatement();
         Rs1=St1.executeQuery("Select Max(Tid) from TransactionTbl");
         Rs1.next();
        Trid =Rs1.getInt(1)+1;
     }
     catch(Exception E)
     {
         JOptionPane.showMessageDialog(this, "Not Working correctly");}
 }
    String Mydate;
    //Date java module integrated to the Transaction table
public  void GetDate()
{
    Date d= new Date();
    SimpleDateFormat S=new SimpleDateFormat("DD-MM-YYYY ");
    Mydate=S.format(d);
}
       private void WithdrawMoney()
      {
          try {
              GetDate();
              Countdep();
                  /** where to check connection to the database port 3306 and database named atm**/
                           Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
                           /**enter the values in the following inputs and put into the database respective spaces**/
                            PreparedStatement Add = Con.prepareStatement ("insert into TransactionTbl   values(?,?,?,?,?)");
                            Add.setInt(1,Trid);
                            Add.setInt(2,MyAccNum);
                            Add.setString(3,"Withdraw");
                            Add.setString(4,AmountwTb.getText());
                           Add.setString(5, Mydate);
                            int row = Add.executeUpdate();
                            //JOptionPane.showMessageDialog(this, "Account Saved");
                            Con.close();
                          //  Clear();
                 
            } catch (Exception e)  {
                     JOptionPane.showMessageDialog(this, e);
                
               
            }
        
    }
    
    private void WITHDRAWbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WITHDRAWbtnMouseClicked
             if (AmountwTb.getText().isEmpty()  ||  AmountwTb.getText().equals(0)){
            JOptionPane.showMessageDialog(this,"Enter valid Amount");
        }else if(Oldbalance<Integer.valueOf(AmountwTb.getText()))
        {JOptionPane.showMessageDialog(this,"Balance not enough");
        }
              else  {
            try {
            String Query = "update AccountTbl  set  Balance= ? where  AccNum= ?";
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atmdb","root","");
            PreparedStatement ps  = Con.prepareStatement(Query);
            ps.setInt(1,Oldbalance - Integer.valueOf(AmountwTb.getText()));
            ps.setInt(2, MyAccNum);
            if( ps.executeUpdate() ==1){
                JOptionPane.showMessageDialog(this, "Transaction Succesfull");
                WithdrawMoney();
                Clear();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");  
              Clear();
            }
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
           
        }
    }//GEN-LAST:event_WITHDRAWbtnMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WITHDRAW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WITHDRAW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountwTb;
    private javax.swing.JLabel Balan;
    private javax.swing.JButton WITHDRAWbtn;
    private javax.swing.JLabel balanlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
