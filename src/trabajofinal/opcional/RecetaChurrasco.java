package trabajofinal.opcional;

public class RecetaChurrasco extends javax.swing.JFrame {

    public RecetaChurrasco() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbIngredientes = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taIngredientesChurrasco = new javax.swing.JTextArea();
        lbPreparacion = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        taPreparacionChurrasco = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receta de Churrasco con Yuca Frita");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("CHURRASCO CON YUCA FRITA");

        lbIngredientes.setText("Ingredientes:");

        taIngredientesChurrasco.setEditable(false);
        taIngredientesChurrasco.setColumns(20);
        taIngredientesChurrasco.setRows(5);
        taIngredientesChurrasco.setText("4 churrascos de 350 gramos cada uno\n2 porciones de yuca \nSal, pimienta y tomillo\n1/4 de tomate\n1/4 de cebolla\nDos rodajas de lechuga\n\nPara la salsa:\n\n1/2 litro de caldo de res concentrado\n1 copa de vino tinto\n2 onzas de salsa de soja \n1 tableta de caldo de carne\n4 cucharadas de mantequilla\n1 taza de hierbas frescas (perejil, cilantro, hierbabuena)");
        scroll.setViewportView(taIngredientesChurrasco);

        lbPreparacion.setText("Preparación:");

        taPreparacionChurrasco.setEditable(false);
        taPreparacionChurrasco.setColumns(20);
        taPreparacionChurrasco.setRows(5);
        taPreparacionChurrasco.setText("Sazonar el churrasco con sal, pimienta y, si lo desea, con  ajo \nrecién molido. Colocarlo en la plancha, sartén o parrilla. \nLa mejor forma de presentarlo es a término medio, así resultará \njugoso y tierno. Para la salsa es necesario juntar todos los \ningredientes y llevarlos a ebullición. Cuando haya reducido en \nuna tercera parte, agregue la mantequilla y las hierbas y deje \ncocinar un instante para evitar que el sabor de las hierbas se \nevapore. Fritar las yucas en una sartén con suficiente aceite, \nvolteandolas cada minuto hasta que queden completamente doradas.\nSirva cubriendo la carne con la salsa. Puede acompañar \ncon papas sanchochadas, y salteadas con ajo, aceite \nde oliva y perejil. Se lava la lechuga, se pica el tomate y la\ncebolla. Se procede a preparar la ensalada reuniendo el tomate,\nla cebolla y la lechuga.");
        scroll2.setViewportView(taPreparacionChurrasco);

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
                        .addGap(234, 234, 234)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbIngredientes)
                            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                            .addComponent(lbPreparacion)
                            .addComponent(scroll2))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(lbIngredientes)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPreparacion)
                .addGap(18, 18, 18)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JTextArea taIngredientesChurrasco;
    private javax.swing.JTextArea taPreparacionChurrasco;
    // End of variables declaration//GEN-END:variables
}
