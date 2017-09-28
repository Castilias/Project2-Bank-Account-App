/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.n1.livingcosts;

/**
 *
 * @author Mihail
 */
public class costsapp extends javax.swing.JFrame {

    /**
     * Creates new form costsapp
     */
    public costsapp() {
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

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelRent = new javax.swing.JLabel();
        labelWaterC = new javax.swing.JLabel();
        labelWaterH = new javax.swing.JLabel();
        labelGas = new javax.swing.JLabel();
        labelElectricity = new javax.swing.JLabel();
        txtFieldRent = new javax.swing.JTextField();
        txtFieldWaterC = new javax.swing.JTextField();
        txtFieldWaterH = new javax.swing.JTextField();
        txtFieldGas = new javax.swing.JTextField();
        txtFieldElectricity = new javax.swing.JTextField();
        labelLaundry1 = new javax.swing.JLabel();
        txtFieldLaundry = new javax.swing.JTextField();
        labelLaundry2 = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonCLEI = new javax.swing.JButton();
        buttonCEURO = new javax.swing.JButton();
        buttonCLEIEURO = new javax.swing.JButton();
        buttonCEUROLEI = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        labelTCosts = new javax.swing.JLabel();
        txtFieldTCosts = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Living Costs");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resources"));

        labelRent.setText("Rent");

        labelWaterC.setText("Cold Water");

        labelWaterH.setText("Hot Water");

        labelGas.setText("Gas");

        labelElectricity.setText("Electricity");

        txtFieldRent.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFieldWaterC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFieldWaterH.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFieldGas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFieldElectricity.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelLaundry1.setText("(+ no. of laundry washes / month: ");

        txtFieldLaundry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFieldLaundry.setText("0");

        labelLaundry2.setText(")");

        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(labelWaterC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelRent)
                                .addGap(41, 41, 41)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFieldRent, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(txtFieldWaterC))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWaterH)
                            .addComponent(labelGas)
                            .addComponent(labelElectricity))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldElectricity, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(txtFieldGas)
                            .addComponent(txtFieldWaterH))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelLaundry1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFieldLaundry, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelLaundry2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonClear)
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRent)
                    .addComponent(txtFieldRent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWaterC)
                    .addComponent(txtFieldWaterC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWaterH)
                    .addComponent(txtFieldWaterH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLaundry1)
                    .addComponent(txtFieldLaundry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLaundry2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelGas)
                            .addComponent(txtFieldGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelElectricity)
                            .addComponent(txtFieldElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonClear)
                        .addContainerGap())))
        );

        buttonCLEI.setText("Calculate (LEI)");
        buttonCLEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCLEIActionPerformed(evt);
            }
        });

        buttonCEURO.setText("Calculate(EURO)");
        buttonCEURO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCEUROActionPerformed(evt);
            }
        });

        buttonCLEIEURO.setText("Calculate(LEI -> EURO)");
        buttonCLEIEURO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCLEIEUROActionPerformed(evt);
            }
        });

        buttonCEUROLEI.setText("Calculate(EURO -> LEI)");
        buttonCEUROLEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCEUROLEIActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelTCosts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTCosts.setText("TOTAL COSTS: ");

        txtFieldTCosts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtFieldTCosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonCEURO, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCLEI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCLEIEURO)
                            .addComponent(buttonCEUROLEI)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(labelTCosts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldTCosts, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(buttonCLEI)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCEURO)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCLEIEURO)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCEUROLEI))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldTCosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTCosts))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        txtFieldElectricity.setText("");
        txtFieldGas.setText("");
        txtFieldLaundry.setText("");
        txtFieldRent.setText("");
        txtFieldWaterC.setText("");
        txtFieldWaterH.setText("");
        txtFieldTCosts.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonCLEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCLEIActionPerformed
        float rent, waterc, waterh, electricity, gas, laundry, result;
        
        rent = Float.parseFloat(txtFieldRent.getText());
        waterc = Float.parseFloat(txtFieldWaterC.getText());
        waterh = Float.parseFloat(txtFieldWaterH.getText());
        electricity = Float.parseFloat(txtFieldElectricity.getText());
        gas = Float.parseFloat(txtFieldGas.getText());
        laundry = Float.parseFloat(txtFieldLaundry.getText());
        
        result = (float) (rent + (waterc * 5.68) + (waterh * 10.5) + (electricity * 0.3) 
                        + (gas * 1.47) + (laundry * ((0.040 * 5.68)+(0.65 * 0.3))));
        
        txtFieldTCosts.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonCLEIActionPerformed

    private void buttonCEUROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCEUROActionPerformed
      float rent, waterc, waterh, electricity, gas, laundry, result;
      
        rent = Float.parseFloat(txtFieldRent.getText());
        waterc = Float.parseFloat(txtFieldWaterC.getText());
        waterh = Float.parseFloat(txtFieldWaterH.getText());
        electricity = Float.parseFloat(txtFieldElectricity.getText());
        gas = Float.parseFloat(txtFieldGas.getText());
        laundry = Float.parseFloat(txtFieldLaundry.getText());
        
        result = (float) (rent + (((waterc * 5.68) + (waterh * 10.5) + (electricity * 0.3) 
                        + (gas * 1.47) + (laundry * ((0.040 * 5.68)+(0.65 * 0.3))))/4.6));
        
        txtFieldTCosts.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonCEUROActionPerformed

    private void buttonCLEIEUROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCLEIEUROActionPerformed
        float rent, waterc, waterh, electricity, gas, laundry, result;
        
        rent = Float.parseFloat(txtFieldRent.getText());
        waterc = Float.parseFloat(txtFieldWaterC.getText());
        waterh = Float.parseFloat(txtFieldWaterH.getText());
        electricity = Float.parseFloat(txtFieldElectricity.getText());
        gas = Float.parseFloat(txtFieldGas.getText());
        laundry = Float.parseFloat(txtFieldLaundry.getText());
        
        result = (float) ((rent + (waterc * 5.68) + (waterh * 10.5) + (electricity * 0.3) 
                        + (gas * 1.47) + (laundry * ((0.040 * 5.68)+(0.65 * 0.3))))/4.6);
        
        txtFieldTCosts.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonCLEIEUROActionPerformed

    private void buttonCEUROLEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCEUROLEIActionPerformed
        float rent, waterc, waterh, electricity, gas, laundry, result;
      
        rent = Float.parseFloat(txtFieldRent.getText());
        waterc = Float.parseFloat(txtFieldWaterC.getText());
        waterh = Float.parseFloat(txtFieldWaterH.getText());
        electricity = Float.parseFloat(txtFieldElectricity.getText());
        gas = Float.parseFloat(txtFieldGas.getText());
        laundry = Float.parseFloat(txtFieldLaundry.getText());
        
        result = (float) ((rent + (((waterc * 5.68) + (waterh * 10.5) + (electricity * 0.3) 
                        + (gas * 1.47) + (laundry * ((0.040 * 5.68)+(0.65 * 0.3))))/4.6))*4.6);
        
        txtFieldTCosts.setText(String.valueOf(result));
    }//GEN-LAST:event_buttonCEUROLEIActionPerformed

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
            java.util.logging.Logger.getLogger(costsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(costsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(costsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(costsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new costsapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCEURO;
    private javax.swing.JButton buttonCEUROLEI;
    private javax.swing.JButton buttonCLEI;
    private javax.swing.JButton buttonCLEIEURO;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelElectricity;
    private javax.swing.JLabel labelGas;
    private javax.swing.JLabel labelLaundry1;
    private javax.swing.JLabel labelLaundry2;
    private javax.swing.JLabel labelRent;
    private javax.swing.JLabel labelTCosts;
    private javax.swing.JLabel labelWaterC;
    private javax.swing.JLabel labelWaterH;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField txtFieldElectricity;
    private javax.swing.JTextField txtFieldGas;
    private javax.swing.JTextField txtFieldLaundry;
    private javax.swing.JTextField txtFieldRent;
    private javax.swing.JTextField txtFieldTCosts;
    private javax.swing.JTextField txtFieldWaterC;
    private javax.swing.JTextField txtFieldWaterH;
    // End of variables declaration//GEN-END:variables
}
