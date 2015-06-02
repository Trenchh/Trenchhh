/*
 * Name: OrderChecker.java
 * Date: March 13th, 2015
 * Version: v0.1
 * Author: Ryan Protheroe
 * Description: Makes sure you have the correct amount of 
 * nuts and washers based on number of bolts
 */
package edu.hdsb.gwss.protheroe.ics3u.u7;

import java.io.File;
import java.text.NumberFormat;
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

        // Money format
        NumberFormat money = NumberFormat.getCurrencyInstance();

        File file = new File("culminating.xml");

        Builder builder = new Builder();
        Document menuDocument;
        Element menuRoot;

        try {
            menuDocument = builder.build(file);
            menuRoot = menuDocument.getRootElement();
            Elements food = menuRoot.getChildElements();

            for (int counter = 0; counter < food.size(); counter++) {

                type = food.get(counter).getFirstChildElement("type").getValue();
                name = food.get(counter).getFirstChildElement("name").getValue();
                price = Double.parseDouble(food.get(counter).getFirstChildElement("price").getValue());
                quantity = Integer.parseInt(food.get(counter).getFirstChildElement("quantity").getValue());
                if (type.equals("Hamburger") || type.equals("Salad") || type.equals("Breakfast")) {
                    size = "";
                } else {
                    size = food.get(counter).getFirstChildElement("size").getValue();
                }
                total = total + (price * quantity);
                print = size + " x " + quantity + "/ " + money.format(price) + "\n";
                totalDisplay.setText(money.format(total));

                switch (food.get(counter).getFirstChildElement("type").getValue()) {
                    case "Hamburger":
                        hamburgerPrint = hamburgerPrint + food.get(counter).getFirstChildElement("name").getValue() + print;
                        hamburgerDisplay.setText(hamburgerPrint);
                        break;
                    case "Salad":
                        saladPrint = saladPrint + food.get(counter).getFirstChildElement("name").getValue() + print;
                        saladDisplay.setText(saladPrint);
                        break;
                    case "Breakfast":
                        breakfastPrint = breakfastPrint + food.get(counter).getFirstChildElement("name").getValue() + print;
                        breakfastDisplay.setText(breakfastPrint);
                        break;
                    case "Desert":
                        desertPrint = desertPrint + food.get(counter).getFirstChildElement("name").getValue() + " " + print;
                        desertDisplay.setText(desertPrint);
                        break;
                    case "Drink":
                        drinkPrint = drinkPrint + food.get(counter).getFirstChildElement("name").getValue() + " " + print;
                        drinkDisplay.setText(drinkPrint);
                        break;
                    case "Fries":
                        friesPrint = friesPrint + food.get(counter).getFirstChildElement("name").getValue() + " " + print;
                        friesDisplay.setText(friesPrint);
                        break;
                }
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
        breakfastDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        hamburgerDisplay = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        drinkDisplay = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        saladDisplay = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        friesDisplay = new javax.swing.JTextArea();
        friesLabel = new javax.swing.JLabel();
        breakfastLabel1 = new javax.swing.JLabel();
        saladLabel = new javax.swing.JLabel();
        drinkLabel = new javax.swing.JLabel();
        hamburgerLabel = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        desertDisplay = new javax.swing.JTextArea();
        desertLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        totalDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        totalDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalDisplay.setToolTipText("");
        getContentPane().add(totalDisplay);
        totalDisplay.setBounds(460, 10, 190, 40);

        breakfastDisplay.setColumns(20);
        breakfastDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        breakfastDisplay.setRows(5);
        breakfastDisplay.setAlignmentX(45.0F);
        jScrollPane1.setViewportView(breakfastDisplay);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 170, 380);

        hamburgerDisplay.setColumns(20);
        hamburgerDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        hamburgerDisplay.setRows(5);
        hamburgerDisplay.setAlignmentX(45.0F);
        jScrollPane2.setViewportView(hamburgerDisplay);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(560, 120, 170, 380);

        drinkDisplay.setColumns(20);
        drinkDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        drinkDisplay.setRows(5);
        drinkDisplay.setAlignmentX(45.0F);
        jScrollPane3.setViewportView(drinkDisplay);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(380, 120, 170, 380);

        saladDisplay.setColumns(20);
        saladDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        saladDisplay.setRows(5);
        saladDisplay.setAlignmentX(45.0F);
        jScrollPane4.setViewportView(saladDisplay);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(200, 120, 170, 380);

        friesDisplay.setColumns(20);
        friesDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        friesDisplay.setRows(5);
        friesDisplay.setAlignmentX(45.0F);
        jScrollPane5.setViewportView(friesDisplay);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(740, 120, 170, 380);

        friesLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        friesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friesLabel.setText("Fries");
        friesLabel.setToolTipText("");
        getContentPane().add(friesLabel);
        friesLabel.setBounds(760, 90, 130, 20);

        breakfastLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        breakfastLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        breakfastLabel1.setText("Breakfast");
        breakfastLabel1.setToolTipText("");
        getContentPane().add(breakfastLabel1);
        breakfastLabel1.setBounds(40, 90, 130, 20);

        saladLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        saladLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saladLabel.setText("Salad");
        saladLabel.setToolTipText("");
        getContentPane().add(saladLabel);
        saladLabel.setBounds(220, 90, 130, 20);

        drinkLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        drinkLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinkLabel.setText("Drink");
        drinkLabel.setToolTipText("");
        getContentPane().add(drinkLabel);
        drinkLabel.setBounds(400, 90, 130, 20);

        hamburgerLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        hamburgerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hamburgerLabel.setText("Hamburger");
        hamburgerLabel.setToolTipText("");
        getContentPane().add(hamburgerLabel);
        hamburgerLabel.setBounds(580, 90, 130, 20);

        desertDisplay.setColumns(20);
        desertDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 20)); // NOI18N
        desertDisplay.setRows(5);
        desertDisplay.setAlignmentX(45.0F);
        jScrollPane6.setViewportView(desertDisplay);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(920, 120, 170, 380);

        desertLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        desertLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desertLabel.setText("Desert");
        desertLabel.setToolTipText("");
        getContentPane().add(desertLabel);
        desertLabel.setBounds(940, 90, 130, 20);

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
    private javax.swing.JTextArea breakfastDisplay;
    private javax.swing.JLabel breakfastLabel1;
    private javax.swing.JTextArea desertDisplay;
    private javax.swing.JLabel desertLabel;
    private javax.swing.JTextArea drinkDisplay;
    private javax.swing.JLabel drinkLabel;
    private javax.swing.JTextArea friesDisplay;
    private javax.swing.JLabel friesLabel;
    private javax.swing.JTextArea hamburgerDisplay;
    private javax.swing.JLabel hamburgerLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea saladDisplay;
    private javax.swing.JLabel saladLabel;
    private javax.swing.JLabel totalDisplay;
    // End of variables declaration//GEN-END:variables
    String type = "";
    String size = "";
    String print = "";
    String name = "";

    String hamburgerPrint = "";
    String saladPrint = "";
    String desertPrint = "";
    String friesPrint = "";
    String drinkPrint = "";
    String breakfastPrint = "";

    int quantity = 0;
    double price = 0;
    double total = 0;
}
