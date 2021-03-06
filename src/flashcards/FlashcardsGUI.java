/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcards;

import java.util.Date;
import java.util.TimerTask;
import java.util.Timer;

/**
 *
 * @author Gabriel
 */
public class FlashcardsGUI extends javax.swing.JFrame {

    /**
     * Creates new form FlashcardsGUI
     */
    public FlashcardsGUI() {
        initComponents();
        // Extra design modifications to generated code
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        displayLabel = new javax.swing.JLabel();
        intervalLabel = new javax.swing.JLabel();
        intervalField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        numbersField = new javax.swing.JTextField();
        digitsLabel = new javax.swing.JLabel();
        digitsField = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        notificationLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        answerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newWindowMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitMenuItem = new javax.swing.JMenuItem();
        generateProblemMenuItem = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        showExplanationCheckboxMenuItem = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orion Flashcards");
        setBackground(new java.awt.Color(255, 255, 255));

        displayLabel.setBackground(new java.awt.Color(255, 255, 255));
        displayLabel.setFont(new java.awt.Font("Arial", 0, 120)); // NOI18N
        displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        intervalLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        intervalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intervalLabel.setText("Interval (seconds)");
        intervalLabel.setToolTipText("");

        intervalField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        intervalField.setText("0");
        intervalField.setToolTipText("");
        intervalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalFieldActionPerformed(evt);
            }
        });

        numberLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        numberLabel.setText("Numbers");
        numberLabel.setToolTipText("");

        numbersField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        numbersField.setText("0");
        numbersField.setToolTipText("");

        digitsLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        digitsLabel.setText("Digits");
        digitsLabel.setToolTipText("");

        digitsField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        digitsField.setText("0");
        digitsField.setToolTipText("");

        startButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        startButton.setText("Start");
        startButton.setToolTipText("");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        notificationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notificationLabel.setForeground(new java.awt.Color(153, 153, 153));
        notificationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificationLabel.setText("Please fill in all the options, and then click \"Start\"");

        titleLabel.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Orion Flashcards");

        answerButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        answerButton.setText("Show Answer");
        answerButton.setEnabled(false);
        answerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © 2015 Orion Abacus Association. Software by Gabriel Lee.");

        clearButton.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        newWindowMenuItem.setText("New Window");
        newWindowMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newWindowMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newWindowMenuItem);
        fileMenu.add(jSeparator1);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        generateProblemMenuItem.setText("Settings");
        generateProblemMenuItem.add(jSeparator2);

        showExplanationCheckboxMenuItem.setSelected(true);
        showExplanationCheckboxMenuItem.setText("Show Explanation");
        generateProblemMenuItem.add(showExplanationCheckboxMenuItem);

        jMenuBar1.add(generateProblemMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(intervalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intervalField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digitsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digitsField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(answerButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(notificationLabel)
                .addGap(18, 18, 18)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(intervalLabel)
                        .addComponent(intervalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digitsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startButton)
                        .addComponent(answerButton)
                        .addComponent(digitsLabel)
                        .addComponent(numberLabel))
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void intervalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalFieldActionPerformed
    }//GEN-LAST:event_intervalFieldActionPerformed

    int sum = 0;
    Timer timer;
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        answerButton.setEnabled(false);
        sum = 0;

        long interval;
        int digits;
        int numbers;
        try {
            interval = (long) Double.parseDouble(intervalField.getText()) * 1000;
            digits = Integer.parseInt(digitsField.getText());
            numbers = Integer.parseInt(numbersField.getText());
        } catch (Exception e) {
            notificationLabel.setText("Please check your fields again.");
            notificationLabel.setForeground(new java.awt.Color(255, 0, 0));
            return;
        }

        if ((interval > 0) && (digits > 0) && (numbers > 0)) {
            // nothing
        } else {
            notificationLabel.setText("Please check your fields again.");
            notificationLabel.setForeground(new java.awt.Color(255, 0, 0));
            return;
        }

        notificationLabel.setText("Please fill in all the options, and then click \"Start\"");
        notificationLabel.setForeground(new java.awt.Color(153, 153, 153));
        timer = new Timer();
        // debugging
        
        timer.schedule(new TimerTask() {
            int count = 0;

            @Override
            public void run() {
                if (count == numbers) {
                    displayLabel.setText("Answer?");
                    answerButton.setEnabled(true);
                    timer.cancel();
                    timer.purge();
                    return;
                }
                String numberString = Flashcards.generateNumber(digits);
                int numberInt = Integer.parseInt(numberString);
                sum = sum + numberInt;
                String commifiedNumber = Flashcards.commify(numberString);
                displayLabel.setText(commifiedNumber);
                count++;
            }
        }, new Date(), interval);
    }//GEN-LAST:event_startButtonActionPerformed

    private void answerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerButtonActionPerformed
        // TODO add your handling code here:
        displayLabel.setText(Flashcards.commify(String.valueOf(sum)));
    }//GEN-LAST:event_answerButtonActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void newWindowMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newWindowMenuItemActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlashcardsGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_newWindowMenuItemActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        timer.cancel();
        displayLabel.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FlashcardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlashcardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlashcardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlashcardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlashcardsGUI().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField digitsField;
    private javax.swing.JLabel digitsLabel;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu generateProblemMenuItem;
    private javax.swing.JTextField intervalField;
    private javax.swing.JLabel intervalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem newWindowMenuItem;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numbersField;
    private javax.swing.JCheckBoxMenuItem showExplanationCheckboxMenuItem;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
