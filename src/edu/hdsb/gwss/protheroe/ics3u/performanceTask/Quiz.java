/*
 * HEADER
 */
package edu.hdsb.gwss.protheroe.ics3u.performanceTask;

/**
 *
 * @author muirwa
 */
public class Quiz extends javax.swing.JFrame {

    private int score = 0;

    /**
     * Creates new form Quiz
     */
    public Quiz() {
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

        questionHeader = new javax.swing.JLabel();
        displayResults = new javax.swing.JButton();
        nextQuestion = new javax.swing.JButton();
        questionDisplay = new javax.swing.JLabel();
        a = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        c = new javax.swing.JRadioButton();
        d = new javax.swing.JRadioButton();
        rightOrWrong = new javax.swing.JLabel();
        submitAnswer = new javax.swing.JButton();
        dLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        bLabel = new javax.swing.JLabel();
        cLabel = new javax.swing.JLabel();
        scoreDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        questionHeader.setFont(new java.awt.Font("Haettenschweiler", 0, 48)); // NOI18N
        questionHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionHeader.setText("Question #1");
        getContentPane().add(questionHeader);
        questionHeader.setBounds(129, 11, 229, 47);

        displayResults.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        displayResults.setText("Display Results");
        displayResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayResults(evt);
            }
        });
        getContentPane().add(displayResults);
        displayResults.setBounds(10, 354, 147, 35);

        nextQuestion.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        nextQuestion.setText("Next Question");
        nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestion(evt);
            }
        });
        getContentPane().add(nextQuestion);
        nextQuestion.setBounds(340, 354, 150, 35);

        questionDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        questionDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionDisplay.setText("Question");
        getContentPane().add(questionDisplay);
        questionDisplay.setBounds(40, 64, 422, 37);

        a.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        a.setText("Answer");
        getContentPane().add(a);
        a.setBounds(50, 110, 402, 35);

        b.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        b.setText("Answer");
        getContentPane().add(b);
        b.setBounds(50, 160, 402, 35);

        c.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        c.setText("Answer");
        getContentPane().add(c);
        c.setBounds(50, 210, 402, 35);

        d.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        d.setText("Answer");
        getContentPane().add(d);
        d.setBounds(50, 260, 400, 35);

        rightOrWrong.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        rightOrWrong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rightOrWrong.setText("Right or Wrong");
        getContentPane().add(rightOrWrong);
        rightOrWrong.setBounds(60, 300, 380, 37);

        submitAnswer.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        submitAnswer.setText("Submit Answer");
        submitAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAnswer(evt);
            }
        });
        getContentPane().add(submitAnswer);
        submitAnswer.setBounds(163, 354, 171, 35);

        dLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        dLabel.setText("D");
        getContentPane().add(dLabel);
        dLabel.setBounds(40, 260, 20, 30);

        aLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        aLabel.setText("A");
        getContentPane().add(aLabel);
        aLabel.setBounds(40, 110, 20, 30);

        bLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        bLabel.setText("B");
        getContentPane().add(bLabel);
        bLabel.setBounds(40, 160, 20, 30);

        cLabel.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        cLabel.setText("C");
        getContentPane().add(cLabel);
        cLabel.setBounds(40, 210, 20, 30);

        scoreDisplay.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        scoreDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreDisplay.setText("Score");
        getContentPane().add(scoreDisplay);
        scoreDisplay.setBounds(420, 10, 70, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayResults(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayResults

        new QuizResults(score).setVisible(true);
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_displayResults

    private void nextQuestion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQuestion
        // TODO add your handling code here:
    }//GEN-LAST:event_nextQuestion

    private void submitAnswer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAnswer
        // TODO add your handling code here:
    }//GEN-LAST:event_submitAnswer

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a;
    private javax.swing.JLabel aLabel;
    private javax.swing.JRadioButton b;
    private javax.swing.JLabel bLabel;
    private javax.swing.JRadioButton c;
    private javax.swing.JLabel cLabel;
    private javax.swing.JRadioButton d;
    private javax.swing.JLabel dLabel;
    private javax.swing.JButton displayResults;
    private javax.swing.JButton nextQuestion;
    private javax.swing.JLabel questionDisplay;
    private javax.swing.JLabel questionHeader;
    private javax.swing.JLabel rightOrWrong;
    private javax.swing.JLabel scoreDisplay;
    private javax.swing.JButton submitAnswer;
    // End of variables declaration//GEN-END:variables
}