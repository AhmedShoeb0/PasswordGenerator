/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Password_Generator;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed Shoeb
 */
public class PassWordGeneratorGUI extends javax.swing.JFrame {

    /**
     * Creates new form PassWordGeneratorGUI
     */
    public PassWordGeneratorGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        F1 = new javax.swing.JTextField();
        RB1 = new javax.swing.JRadioButton();
        RB2 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        RB4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        A1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setName("Password Generator"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Enter Password length:");

        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });
        F1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                F1KeyPressed(evt);
            }
        });

        RB1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        RB1.setText("UpperCase");
        RB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB1ActionPerformed(evt);
            }
        });

        RB2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        RB2.setText("LowerCase");
        RB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB2ActionPerformed(evt);
            }
        });

        RB3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        RB3.setText("Digits");
        RB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB3ActionPerformed(evt);
            }
        });

        RB4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        RB4.setText("Punctuation");
        RB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("The password should contain:");

        L1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        L1.setForeground(new java.awt.Color(255, 0, 0));

        B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        B1.setText("Generate");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        A1.setColumns(20);
        A1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        A1.setRows(5);
        jScrollPane1.setViewportView(A1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(RB1)
                        .addGap(18, 18, 18)
                        .addComponent(RB2)
                        .addGap(18, 18, 18)
                        .addComponent(RB3)
                        .addGap(18, 18, 18)
                        .addComponent(RB4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(B1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RB1)
                    .addComponent(RB2)
                    .addComponent(RB3)
                    .addComponent(RB4))
                .addGap(42, 42, 42)
                .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB1ActionPerformed

    private void RB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB2ActionPerformed

    private void RB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB4ActionPerformed

    private void F1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_F1KeyPressed
         char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)){
        F1.setEditable(true);
        L1.setText("");
        }
        else{
          F1.setEditable(false);
          L1.setText("Please enter numbers only");}
    }//GEN-LAST:event_F1KeyPressed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
       
       PassGeneratorBuilder b = new PassGeneratorBuilder();
       if(RB1.isSelected()||RB2.isSelected()||RB3.isSelected()||RB4.isSelected()){
       if (RB1.isSelected()){
       b.useUpper(true);
       }
       else{
       b.useUpper(false);
       }
      
       if (RB2.isSelected()){
       b.useLower(true);
       }
       else{
       b.useLower(false);
       }
       
       if (RB3.isSelected()){
       b.useDigits(true);
       }
       else{
       b.useDigits(false);
       }
       
       if (RB4.isSelected()){
       b.usePunctuation(true);
       }
       else{
       b.usePunctuation(false);
       }}
       else
       {
       JOptionPane.showMessageDialog(this,"Please choose 1 type at least that your password should contain","Alert",JOptionPane.ERROR_MESSAGE);
       }
       
       PassGenerator g= new PassGenerator(b);
       b.build();
       String password = g.generate(Integer.parseInt(F1.getText()));
       A1.setText(password);
        
    }//GEN-LAST:event_B1ActionPerformed

    private void RB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RB3ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1ActionPerformed

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
            java.util.logging.Logger.getLogger(PassWordGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassWordGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassWordGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassWordGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassWordGeneratorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea A1;
    private javax.swing.JButton B1;
    private javax.swing.JTextField F1;
    private javax.swing.JLabel L1;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
