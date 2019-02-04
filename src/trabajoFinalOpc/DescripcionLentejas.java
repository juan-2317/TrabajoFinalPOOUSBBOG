package trabajoFinalOpc;

public class DescripcionLentejas extends javax.swing.JFrame {

    public DescripcionLentejas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbPlato = new javax.swing.JLabel();
        lbDificultad = new javax.swing.JLabel();
        lbNomPlato = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taDescLentejas = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descripción Lentejas con Arroz y Papa Sudada");
        setResizable(false);

        lbPlato.setText("Nombre del Plato:");

        lbDificultad.setText("Nivel de Dificultad de Elaboración: Fácil");

        lbNomPlato.setText("Lentejas con Arroz y Papa Sudada");

        lbDesc.setText("Descripción:");

        taDescLentejas.setEditable(false);
        taDescLentejas.setColumns(20);
        taDescLentejas.setRows(5);
        taDescLentejas.setText("Este plato contiene arroz,\npapa sudada, platano, si se\ndesea se puede añadir sal \nal gusto,se puede acompañar\ncon cualquier postre, se \nrecomienda el pudin. \nTambién se puede acompañar\ncon casi cualquier bebida, \nse recomienda para ocasiones\nespeciales una lata de ceveza.\n");
        scroll.setViewportView(taDescLentejas);

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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDificultad)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAceptar)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPlato)
                                .addComponent(lbDesc))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNomPlato)
                                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlato)
                    .addComponent(lbNomPlato))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDesc)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lbDificultad)
                .addGap(46, 46, 46)
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
    private javax.swing.JTextArea taDescLentejas;
    // End of variables declaration//GEN-END:variables
}
