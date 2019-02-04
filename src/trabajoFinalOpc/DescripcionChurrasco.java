package trabajoFinalOpc;

public class DescripcionChurrasco extends javax.swing.JFrame {

    public DescripcionChurrasco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombrePlato = new javax.swing.JLabel();
        lbDificultad = new javax.swing.JLabel();
        lbDesc = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taDescChurrasco = new javax.swing.JTextArea();
        lbNomPlato = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Descripción Churrasco con Yuca Frita");
        setResizable(false);

        lbNombrePlato.setText("Nombre del Plato:");

        lbDificultad.setText("Nivel de Dificultad de Elaboración:  Dificil.");

        lbDesc.setText("Descripción:");

        taDescChurrasco.setEditable(false);
        taDescChurrasco.setColumns(20);
        taDescChurrasco.setRows(5);
        taDescChurrasco.setText("Este es un plato especial de la casa\nque contiene ajo, arroz, ensalada.\nSe recomienda escojer como entrada\nuna porción de papas fritas o un \ncoctel, se puede acompañar con un\nvaso de vino");
        scroll.setViewportView(taDescChurrasco);

        lbNomPlato.setText("Churrasco con Yuca Frita.");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lbDificultad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbDesc)
                                    .addGap(30, 30, 30)
                                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbNombrePlato)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbNomPlato))))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombrePlato)
                    .addComponent(lbNomPlato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDesc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbDificultad)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addContainerGap())))
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
    private javax.swing.JLabel lbNombrePlato;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea taDescChurrasco;
    // End of variables declaration//GEN-END:variables
}
