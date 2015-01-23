package reloj;

public class VentanaReloj extends javax.swing.JFrame {

    Reloj reloj1 = new Reloj();

    public VentanaReloj() {
        initComponents();
        mostrarReloj();
    }

    void mostrarReloj() {
        jTextFieldReloj.setText(reloj1.getHora(jCheckBox1.isSelected()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButtonPonerHoraHMS = new javax.swing.JButton();
        jTextFieldReloj = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonActualizarHMS = new javax.swing.JButton();
        jCheckBoxPM = new javax.swing.JCheckBox();
        jButtonActualizarHM = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonPonerHoraHMS.setText("Nuevo reloj (24h)");
        jButtonPonerHoraHMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPonerHoraHMSActionPerformed(evt);
            }
        });

        jTextFieldReloj.setEditable(false);
        jTextFieldReloj.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jCheckBox1.setText("Formato 12h");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("h");

        jLabel2.setText("m");

        jLabel3.setText("s");

        jButtonActualizarHMS.setText("Actualizar H:M:S");
        jButtonActualizarHMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarHMSActionPerformed(evt);
            }
        });

        jCheckBoxPM.setText("PM");

        jButtonActualizarHM.setText("Actualizar H:M (24h)");
        jButtonActualizarHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarHMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxPM))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonPonerHoraHMS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonActualizarHMS))
                    .addComponent(jButtonActualizarHM))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxPM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPonerHoraHMS)
                    .addComponent(jButtonActualizarHMS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonActualizarHM)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPonerHoraHMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPonerHoraHMSActionPerformed
        int horas = Integer.valueOf(jTextField1.getText());
        int minutos = Integer.valueOf(jTextField2.getText());
        int segundos = Integer.valueOf(jTextField3.getText());
        reloj1 = new Reloj(horas, minutos, segundos);
        mostrarReloj();
    }//GEN-LAST:event_jButtonPonerHoraHMSActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        mostrarReloj();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButtonActualizarHMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarHMSActionPerformed
        int horas = Integer.valueOf(jTextField1.getText());
        int minutos = Integer.valueOf(jTextField2.getText());
        int segundos = Integer.valueOf(jTextField3.getText());
        if(!jCheckBoxPM.isSelected()) {
            reloj1.setHora(horas, minutos, segundos);
        } else {
            reloj1.setHora(horas, minutos, segundos, true);
        }
        mostrarReloj();
    }//GEN-LAST:event_jButtonActualizarHMSActionPerformed

    private void jButtonActualizarHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarHMActionPerformed
        int horas = Integer.valueOf(jTextField1.getText());
        int minutos = Integer.valueOf(jTextField2.getText());
        reloj1.setHora(horas, minutos);
        mostrarReloj();
    }//GEN-LAST:event_jButtonActualizarHMActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReloj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizarHM;
    private javax.swing.JButton jButtonActualizarHMS;
    private javax.swing.JButton jButtonPonerHoraHMS;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBoxPM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldReloj;
    // End of variables declaration//GEN-END:variables

}
