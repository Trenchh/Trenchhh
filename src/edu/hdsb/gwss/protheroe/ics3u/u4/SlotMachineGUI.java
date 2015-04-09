/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u4;

/**
 *
 * @author 1protheroery
 */
public class SlotMachineGUI extends javax.swing.JFrame {

    /**
     * Creates new form SlotMachineGUI
     */
    public SlotMachineGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rollButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        slot1Label = new javax.swing.JLabel();
        slot3Label = new javax.swing.JLabel();
        thanks = new javax.swing.JLabel();
        coinAmountLabel = new javax.swing.JLabel();
        slot2Label = new javax.swing.JLabel();
        winOrLose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        rollButton.setBackground(new java.awt.Color(255, 255, 255));
        rollButton.setFont(new java.awt.Font("Pricedown Bl", 0, 48)); // NOI18N
        rollButton.setText("SPIN TO WIN");
        rollButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rollButton);
        rollButton.setBounds(260, 430, 269, 109);

        jButton1.setFont(new java.awt.Font("Pricedown Bl", 0, 24)); // NOI18N
        jButton1.setText("Cash Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 460, 123, 39);

        slot1Label.setFont(new java.awt.Font("Pricedown Bl", 0, 150)); // NOI18N
        slot1Label.setForeground(new java.awt.Color(255, 51, 51));
        slot1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot1Label.setText("1");
        slot1Label.setToolTipText("");
        getContentPane().add(slot1Label);
        slot1Label.setBounds(70, 160, 180, 170);

        slot3Label.setFont(new java.awt.Font("Pricedown Bl", 0, 150)); // NOI18N
        slot3Label.setForeground(new java.awt.Color(255, 51, 51));
        slot3Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot3Label.setText("1");
        getContentPane().add(slot3Label);
        slot3Label.setBounds(540, 160, 190, 170);

        thanks.setFont(new java.awt.Font("Pricedown Bl", 0, 30)); // NOI18N
        thanks.setForeground(new java.awt.Color(227, 227, 227));
        thanks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thanks.setText(" ");
        thanks.setToolTipText("");
        getContentPane().add(thanks);
        thanks.setBounds(10, 540, 780, 50);

        coinAmountLabel.setFont(new java.awt.Font("Pricedown Bl", 0, 48)); // NOI18N
        coinAmountLabel.setForeground(new java.awt.Color(255, 51, 51));
        coinAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coinAmountLabel.setText("50");
        coinAmountLabel.setToolTipText("");
        getContentPane().add(coinAmountLabel);
        coinAmountLabel.setBounds(640, 450, 80, 80);

        slot2Label.setFont(new java.awt.Font("Pricedown Bl", 0, 150)); // NOI18N
        slot2Label.setForeground(new java.awt.Color(255, 51, 51));
        slot2Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slot2Label.setText("1");
        getContentPane().add(slot2Label);
        slot2Label.setBounds(300, 160, 200, 170);

        winOrLose.setFont(new java.awt.Font("Pricedown Bl", 0, 30)); // NOI18N
        winOrLose.setForeground(new java.awt.Color(227, 227, 227));
        winOrLose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        winOrLose.setText("Match 3 To WIN");
        getContentPane().add(winOrLose);
        winOrLose.setBounds(10, 390, 780, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ryan.Susan-HP\\Desktop\\Templates\\Slots.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollButtonActionPerformed

        coinAmount--;

        //NUMBER GENERATION & NUMBER DISPLAY
        slot1 = (int) (Math.random() * 4) + 1;
        slot2 = (int) (Math.random() * 4) + 1;
        slot3 = (int) (Math.random() * 4) + 1;

        slot1Label.setText("" + slot1);
        slot2Label.setText("" + slot2);
        slot3Label.setText("" + slot3);

        //CHECKS IF YOU HAVE WON ANYTHING
        if (slot1 != slot2 || slot2 != slot3) {
            winOrLose.setText("You Lost");
            coinAmountLabel.setText("" + coinAmount);
        } else if (slot1 == 1) {
            coinAmount = coinAmount + 4;
            winOrLose.setText("YOU WON 4 COINS");
            coinAmountLabel.setText("" + coinAmount);
        } else if (slot1 == 2) {
            coinAmount = coinAmount + 6;
            winOrLose.setText("YOU WON 6 COINS");
            coinAmountLabel.setText("" + coinAmount);
        } else if (slot1 == 3) {
            coinAmount = coinAmount + 8;
            winOrLose.setText("YOU WON 8 COINS");
            coinAmountLabel.setText("" + coinAmount);
        } else if (slot1 == 4) {
            coinAmount = coinAmount + 10;
            winOrLose.setText("YOU WON 10 COINS");
            coinAmountLabel.setText("" + coinAmount);
        }
        //PROGRAM ENDS IF USER RUNS OUT OF COINS
        if (coinAmount == 0) {
            System.out.println("You have run out of coins \nThanks for playing and come back soon!");
        }

    }//GEN-LAST:event_rollButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        thanks.setText("Thanks for Playing");
        winOrLose.setText("You cashed out with " + coinAmount + " coins");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotMachineGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotMachineGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel coinAmountLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton rollButton;
    private javax.swing.JLabel slot1Label;
    private javax.swing.JLabel slot2Label;
    private javax.swing.JLabel slot3Label;
    private javax.swing.JLabel thanks;
    private javax.swing.JLabel winOrLose;
    // End of variables declaration//GEN-END:variables

    private static int coinAmount = 50;
    private static int slot1 = 4;
    private static int slot2 = 4;
    private static int slot3 = 4;
}
