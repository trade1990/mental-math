/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashcards;

import java.awt.event.ActionListener;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orion Flashcards");
        setBackground(new java.awt.Color(255, 255, 255));

        displayLabel.setBackground(new java.awt.Color(255, 255, 255));
        displayLabel.setFont(new java.awt.Font("Arial", 0, 120)); // NOI18N
        displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        intervalLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        intervalLabel.setText("Interval (seconds)");

        intervalField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        intervalField.setText("0");
        intervalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervalFieldActionPerformed(evt);
            }
        });

        numberLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numberLabel.setText("Numbers");

        numbersField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        numbersField.setText("0");

        digitsLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        digitsLabel.setText("Digits");

        digitsField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        digitsField.setText("0");

        startButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        notificationLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notificationLabel.setForeground(new java.awt.Color(153, 153, 153));
        notificationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notificationLabel.setText("Please fill in the options, and then click \"Start\"");

        titleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleLabel.setText("Orion Abacus Association");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(intervalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intervalField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digitsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(digitsField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startButton))
                    .addComponent(notificationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(intervalLabel)
                        .addComponent(intervalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberLabel)
                        .addComponent(numbersField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digitsLabel)
                        .addComponent(digitsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(startButton))
                    .addComponent(titleLabel))
                .addGap(30, 30, 30)
                .addComponent(notificationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void intervalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intervalFieldActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        String number;
        System.out.print("");
        if (intervalField.getText() == "" || numbersField.getText() == "" || digitsField.getText() == ""){
            notificationLabel.setText("One or more fields are missing.");
            return;
        } 
        notificationLabel.setText("Please fill in all the options, and then click \"Start\"");
        number = Flashcards.commify(Flashcards.generateNumber(Integer.parseInt(digitsField.getText())));
        System.out.println(number);
        displayLabel.setText(number);
    }//GEN-LAST:event_startButtonActionPerformed

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
    private javax.swing.JTextField digitsField;
    private javax.swing.JLabel digitsLabel;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JTextField intervalField;
    private javax.swing.JLabel intervalLabel;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField numbersField;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
