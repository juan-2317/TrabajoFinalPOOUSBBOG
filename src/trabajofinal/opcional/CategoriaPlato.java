package trabajofinal.opcional;

public class CategoriaPlato extends javax.swing.JFrame {

    public CategoriaPlato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taPlatosCorrientes = new javax.swing.JTextArea();
        lbPlato1 = new javax.swing.JLabel();
        lbPlato2 = new javax.swing.JLabel();
        lbEncargado = new javax.swing.JLabel();
        lbNombreEncargado = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbDescripcion2 = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        taPlatosEspeciales = new javax.swing.JTextArea();
        lbPlato3 = new javax.swing.JLabel();
        lbEncargado2 = new javax.swing.JLabel();
        lbPlato4 = new javax.swing.JLabel();
        lbNombreEncargado2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Categoria de Cada Plato");
        setResizable(false);

        lbTitulo.setText("CATEGORÍA A: PLATOS CORRIENTES:");

        lbDescripcion.setText("Descripción:");

        taPlatosCorrientes.setEditable(false);
        taPlatosCorrientes.setColumns(20);
        taPlatosCorrientes.setRows(5);
        taPlatosCorrientes.setText("En esta categoría se encuentran los platos con los \nprecios más accesibles, además de que estos platos son \nlos más representativos de nuestro país.");
        scroll.setViewportView(taPlatosCorrientes);

        lbPlato1.setText("Lentejas con Arroz y Papa Sudada.");

        lbPlato2.setText("Plato Corriente de Frijoles.");

        lbEncargado.setText("Encargado de la Preparación:");

        lbNombreEncargado.setText("Cheft: Luis Sandoval.");

        lbSubtitulo.setText("CATEGORÍA B: PLATOS ESPECIALES:");

        lbDescripcion2.setText("Descripción:");

        taPlatosEspeciales.setEditable(false);
        taPlatosEspeciales.setColumns(20);
        taPlatosEspeciales.setRows(5);
        taPlatosEspeciales.setText("En esta categoría se encuentran platos para ocasiones \nespeciales, los cuáles tienen un mayor control de calidad.");
        scroll2.setViewportView(taPlatosEspeciales);

        lbPlato3.setText("Salmón con Hierbas Finas.");

        lbEncargado2.setText("Encargado de la Preparación: ");

        lbPlato4.setText("Churrasco con Yuca Frita.");

        lbNombreEncargado2.setText("Cheft: Santiago Avendaño");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(lbSubtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPlato3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbDescripcion)
                                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addComponent(lbPlato1)
                                .addComponent(lbPlato2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(lbEncargado)
                                    .addGap(18, 18, 18)
                                    .addComponent(lbNombreEncargado))
                                .addComponent(lbDescripcion2)
                                .addComponent(scroll2))
                            .addComponent(lbPlato4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lbEncargado2)
                        .addGap(18, 18, 18)
                        .addComponent(lbNombreEncargado2)))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbDescripcion)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPlato1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPlato2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEncargado)
                    .addComponent(lbNombreEncargado))
                .addGap(18, 18, 18)
                .addComponent(lbSubtitulo)
                .addGap(18, 18, 18)
                .addComponent(lbDescripcion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPlato3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPlato4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEncargado2)
                    .addComponent(lbNombreEncargado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDescripcion2;
    private javax.swing.JLabel lbEncargado;
    private javax.swing.JLabel lbEncargado2;
    private javax.swing.JLabel lbNombreEncargado;
    private javax.swing.JLabel lbNombreEncargado2;
    private javax.swing.JLabel lbPlato1;
    private javax.swing.JLabel lbPlato2;
    private javax.swing.JLabel lbPlato3;
    private javax.swing.JLabel lbPlato4;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextArea taPlatosCorrientes;
    private javax.swing.JTextArea taPlatosEspeciales;
    // End of variables declaration//GEN-END:variables
}
