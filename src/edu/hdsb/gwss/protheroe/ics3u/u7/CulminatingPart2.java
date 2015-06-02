/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.File;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author 1protheroery
 */
public class CulminatingPart2 extends javax.swing.JFrame {

    /**
     * Creates new form CulminatingPart2
     */
    public CulminatingPart2() {
        initComponents();

        File file = new File("culminating.xml");

        Builder builder = new Builder();
        Document menuDocument;
        Element menuRoot;

        try {
            menuDocument = builder.build(file);
            menuRoot = menuDocument.getRootElement();

            Elements food = menuRoot.getChildElements();

            for (int counter = 0; counter < food.size(); counter++) {

                name = food.get(counter).getFirstChildElement("name").getValue();
                price = Double.parseDouble(food.get(counter).getFirstChildElement("price").getValue());
                quantity = Integer.parseInt(food.get(counter).getFirstChildElement("quantity").getValue());
                total = total + (price * quantity);
                totalDisplay.setText(Double.toString(total));
                print = print + name + " x " + quantity + "     " + price+ "\n";
                menuDisplay.setText(print);
                totalDisplay.setText("" + total);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalDisplay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuDisplay = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        totalDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        totalDisplay.setForeground(new java.awt.Color(255, 255, 255));
        totalDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalDisplay.setToolTipText("");
        getContentPane().add(totalDisplay);
        totalDisplay.setBounds(170, 370, 160, 30);

        menuDisplay.setEditable(false);
        menuDisplay.setColumns(20);
        menuDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        menuDisplay.setRows(5);
        jScrollPane1.setViewportView(menuDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 410, 280);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/hdsb/gwss/protheroe/ics3u/u7/McDonaldsOrder.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CulminatingPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CulminatingPart2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CulminatingPart2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea menuDisplay;
    private javax.swing.JLabel totalDisplay;
    // End of variables declaration//GEN-END:variables
    String print = "";
    String name = "";
    int quantity = 0;
    double price = 0;
    double total = 0;

}
