package trabajoFinalOpc;

public class DescripcionSalmon extends javax.swing.JFrame {

    public DescripcionSalmon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPlato = new javax.swing.JLabel();
        lbSalmon = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taDescSalmon = new javax.swing.JTextArea();
        lbDificultad = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descripción de Salmón con Hierbas Finas");
        setResizable(false);

        lbPlato.setText("Nombre del Plato:");

        lbSalmon.setText("Salmón con Hierbas Finas:");

        lbDesc.setText("Descripción:");

        taDescSalmon.setEditable(false);
        taDescSalmon.setColumns(20);
        taDescSalmon.setRows(5);
        taDescSalmon.setText("Este es el plato de la casa, va\nacompañado con lechuga, tomate, \nuna porción de arroz.\n\nSe recomienda comer el salmón \ndebido a su alto contenido de\nvitamina D y calcio.\n\nSe recomienda pedir el coctel \ncomo entrada.");
        scroll.setViewportView(taDescSalmon);

        lbDificultad.setText("Nivel de Dificultad de Elaboración: Dificil");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDificultad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPlato)
                                .addComponent(lbDesc))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbSalmon)
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlato)
                    .addComponent(lbSalmon))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lbDificultad)
                .addGap(28, 28, 28)
                .addComponent(btnAceptar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel lbDesc;
    private javax.swing.JLabel lbDificultad;
    private javax.swing.JLabel lbPlato;
    private javax.swing.JLabel lbSalmon;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea taDescSalmon;
    // End of variables declaration//GEN-END:variables
}
