package trabajofinal.opcional;

public class RecetaFrijoles extends javax.swing.JFrame {

    public RecetaFrijoles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbIngredientes = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taIngredientesFrijoles = new javax.swing.JTextArea();
        lbPreparacion = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        taPreparacionFrijoles = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receta de Plato Corriente de Frijoles");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("Plato Corriente de Frijoles:");

        lbIngredientes.setText("Ingredientes:");

        taIngredientesFrijoles.setEditable(false);
        taIngredientesFrijoles.setColumns(20);
        taIngredientesFrijoles.setRows(5);
        taIngredientesFrijoles.setText("3 tazas de fríjoles.\n15 tazas de agua.\n1 libra de pezuña de cerdo.\n2 plátanos verdes.\n1 zanahoria rallada-\n1 taza de hogao\n2 cucharadas de aceite\nsal, pimienta y comino al gusto.\n\n2 libras de tomate\n6 tallos de cebolla \n4 cucharadas de aceite\nsal, pimienta y azafrán al gusto.\n2 papas bien lavadas\n2 arepas pequeñas\n1 porción pequeña de arroz \n2 chicharrones pequeños");
        scroll.setViewportView(taIngredientesFrijoles);

        lbPreparacion.setText("Preparación:");

        taPreparacionFrijoles.setEditable(false);
        taPreparacionFrijoles.setColumns(20);
        taPreparacionFrijoles.setRows(5);
        taPreparacionFrijoles.setText("Se lavan los frijoles y se ponen a remojar en agua fría desde la \nvíspera. En la misma agua se ponen a cocinar por 3 horas con la \npezuña (si se desea), la zanahoria, los plátanos y el hogao.\n\nCuando estén blandos se le agrega el aceite, la sal y el comino y se \ndejan conservar hasta lograr el espeso deseado. Se sirven con arepas,\npatacones, chicharrones, arroz blanco y una cazuelita de hogao para \ncada comensal.\n\nPreparación Hogao:\n\nSe sofríen los tomates y las cebollas en el aceite, revolviendo hasta\nlograr una salsa suave. Se le agrega la sal, la pimienta y el color.\n\nPuede conservarse en frasco de vidrio en el refrigerador.");
        scroll2.setViewportView(taPreparacionFrijoles);

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
                        .addGap(247, 247, 247)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbIngredientes)
                            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .addComponent(lbPreparacion)
                            .addComponent(scroll2))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbIngredientes)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPreparacion)
                .addGap(18, 18, 18)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
    private javax.swing.JLabel lbIngredientes;
    private javax.swing.JLabel lbPreparacion;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll2;
    private javax.swing.JTextArea taIngredientesFrijoles;
    private javax.swing.JTextArea taPreparacionFrijoles;
    // End of variables declaration//GEN-END:variables
}
