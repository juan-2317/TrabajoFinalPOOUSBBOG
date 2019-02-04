package trabajoFinalOpc;

public class RecetaLentejas extends javax.swing.JFrame {

    public RecetaLentejas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbIngredientes = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taIngredientesLentejas = new javax.swing.JTextArea();
        lbPreparacion = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        taPreparacion = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receta de Lentejas con Arroz y Papa Sudada");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("LENTEJAS CON ARROZ Y PAPA SUDADA:");

        lbIngredientes.setText("Ingredientes:");

        taIngredientesLentejas.setEditable(false);
        taIngredientesLentejas.setColumns(20);
        taIngredientesLentejas.setRows(5);
        taIngredientesLentejas.setText("Papas Sudadas:\n(para 4 personas)\nTiempo de preparación: 10 minutos.\nTiempo de cocción: 30 minutos.\n\n- 3 patatas medianas.\n- 1 cucharada de mantequilla.\n- 1 cebolla mediana.\n- 1 cucharada de sal.\n- 1 cucharadita de pimienta negra en polvo.\n- 1 cucharada de agua.\n\nLentejas con Arroz:\n(para 2 personas)\n\n-100 gramos de lentejas pardinas.\n-Un puñado grande de arroz.\n-Una cebolla.\n-Una cucharadita de comino molido.\n-25 gramos de mantequilla.\n-Una papa (opcional)\n-Sal a gusto.");
        scroll.setViewportView(taIngredientesLentejas);

        lbPreparacion.setText("Preparación:");

        taPreparacion.setEditable(false);
        taPreparacion.setColumns(20);
        taPreparacion.setRows(5);
        taPreparacion.setText("Papas Sudadas:\n1- Pela las patatas, lava y pica en ruedas de 1 cm de ancho \n   aproximadamente.\n2- Pica la cebolla en lascas finas.\n3- Engrasa el fondo de una olla de presión con la mantequilla. \n4- Coloca en la olla una capa de patatas, espolvorea la sal y la\npimienta, pon una parte de la cebolla. \n5- Coloca encima el resto de las patatas y procede de la misma \nforma. Añade la cucharada de agua.\n6- Tapa la olla de presión.\n7- Pon a fuego lento durante 20 o 30 minutos.\n\nLentejas con Arroz:\n\nPara cocinar este plato es  más que recomendable que dejemos en \nremojo las lentejas durante la noche anterior. Ponemos a hervir \nlas lentejas. Picamos la cebolla y la sofreímos en un sartén con \nla manteca derretida. Cuando la cebolla esté doradad la agregamos\na la olla y agregamos el comino molido, el arroz y la sal.\n\nCortamos la papa en trozos, la agregamos a la olla y cocinamos \ndurante unos 8 minutos.");
        scroll2.setViewportView(taPreparacion);

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
                        .addGap(267, 267, 267)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbIngredientes)
                            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                            .addComponent(lbPreparacion)
                            .addComponent(scroll2))))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbTitulo)
                .addGap(34, 34, 34)
                .addComponent(lbIngredientes)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPreparacion)
                .addGap(18, 18, 18)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
    private javax.swing.JTextArea taIngredientesLentejas;
    private javax.swing.JTextArea taPreparacion;
    // End of variables declaration//GEN-END:variables
}
