package trabajoFinalOpc;

public class DescripcionFrijoles extends javax.swing.JFrame {

    public DescripcionFrijoles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPlato = new javax.swing.JLabel();
        lbNomPlato = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taDescFrijoles = new javax.swing.JTextArea();
        lbDificultad = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descripción Plato Corriente de Frijoles");
        setResizable(false);

        lbPlato.setText("Nombre del Plato:");

        lbNomPlato.setText("Plato Corriente de Frijoles");

        lbDesc.setText("Descripción:");

        taDescFrijoles.setEditable(false);
        taDescFrijoles.setColumns(20);
        taDescFrijoles.setRows(5);
        taDescFrijoles.setText("Este plato va acompañado\ncon arepa, chicarrón, \nplatano, arroz. Se puede\nacompañar con cualquier \nbebida, lo más recomendable\nun jugo. No se recomienda\npedir postre con este plato.");
        scroll.setViewportView(taDescFrijoles);

        lbDificultad.setText("Nivel de Dificultad de Elaboración: Fácil");

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
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDificultad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPlato)
                                .addComponent(lbDesc))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNomPlato)
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlato)
                    .addComponent(lbNomPlato))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lbDificultad)
                .addGap(59, 59, 59)
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
    private javax.swing.JLabel lbNomPlato;
    private javax.swing.JLabel lbPlato;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea taDescFrijoles;
    // End of variables declaration//GEN-END:variables
}
