package trabajoFinalOpc;

public class RecetaSalmon extends javax.swing.JFrame {

    public RecetaSalmon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbIngredientes = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        taIngredientesSalmon = new javax.swing.JTextArea();
        lbPreparacion = new javax.swing.JLabel();
        scroll2 = new javax.swing.JScrollPane();
        taPreparacionSalmon = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Receta de Salmón con Hierbas Finas");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("SALMÓN CON HIERBAS FINAS:");

        lbIngredientes.setText("Ingredientes:");

        taIngredientesSalmon.setEditable(false);
        taIngredientesSalmon.setColumns(20);
        taIngredientesSalmon.setRows(5);
        taIngredientesSalmon.setText("500 gramos salmón.\n1 manojo de romero fresco.\n1 manojo de tomillo fresco.\nAceite de oliva\n2 limones.\n2 hojas\tpapel aluminio.");
        scroll.setViewportView(taIngredientesSalmon);

        lbPreparacion.setText("Preparación:");

        taPreparacionSalmon.setEditable(false);
        taPreparacionSalmon.setColumns(20);
        taPreparacionSalmon.setRows(5);
        taPreparacionSalmon.setText("1)Sobre una hoja de papel aluminio esparcir un chorrito de aceite de \n  oliva hacer una camita con las ramas de romero.\n2)Colocar el filete de salmón sobre el romero.\n3)Esparcir nuevamente un chorrito de aceite de oliva sobre el salmón.\n4)Cubrir con ramitas de tomillo.\n5)Envolver con los lados del papel aluminio.\n7)Cocinar en el horno por 30 minutos a 350° F\n8)Remover las hojas y servir el salmón con un chorrito de limón.\n9)Acompañar con tomate cherry y unas hojas de lechuga.");
        scroll2.setViewportView(taPreparacionSalmon);

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
                        .addGap(255, 255, 255)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbIngredientes)
                            .addComponent(lbPreparacion)
                            .addComponent(scroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                            .addComponent(scroll))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitulo)
                .addGap(30, 30, 30)
                .addComponent(lbIngredientes)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPreparacion)
                .addGap(18, 18, 18)
                .addComponent(scroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
    private javax.swing.JTextArea taIngredientesSalmon;
    private javax.swing.JTextArea taPreparacionSalmon;
    // End of variables declaration//GEN-END:variables
}
