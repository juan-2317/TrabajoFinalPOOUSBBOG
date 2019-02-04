package trabajoFinalOpc;

public class CartaRestaurante extends javax.swing.JFrame {

    public CartaRestaurante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEntradas = new javax.swing.JLabel();
        lbRollitosCanela = new javax.swing.JLabel();
        lbAntipasto = new javax.swing.JLabel();
        lbPlatPrincipal = new javax.swing.JLabel();
        lbChurrasco = new javax.swing.JLabel();
        lbPorcionPapas = new javax.swing.JLabel();
        lbSalmon = new javax.swing.JLabel();
        lbLentejas = new javax.swing.JLabel();
        lbFrijoles = new javax.swing.JLabel();
        lbCoctel = new javax.swing.JLabel();
        lbPrecio1 = new javax.swing.JLabel();
        lbPrecio2 = new javax.swing.JLabel();
        lbPrecio3 = new javax.swing.JLabel();
        lbPrecio4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lbPrecio5 = new javax.swing.JLabel();
        lbPrecio6 = new javax.swing.JLabel();
        lbPrecio7 = new javax.swing.JLabel();
        lbPrecio8 = new javax.swing.JLabel();
        lbPostres = new javax.swing.JLabel();
        lbPudin = new javax.swing.JLabel();
        lbGelatina = new javax.swing.JLabel();
        lbArrozLeche = new javax.swing.JLabel();
        lbPasteQueso = new javax.swing.JLabel();
        lbPrecio9 = new javax.swing.JLabel();
        lbPrecio10 = new javax.swing.JLabel();
        lbPrecio11 = new javax.swing.JLabel();
        lbPrecio12 = new javax.swing.JLabel();
        lbBebidas = new javax.swing.JLabel();
        lbGaseosas = new javax.swing.JLabel();
        lbCervezas = new javax.swing.JLabel();
        lbJugos = new javax.swing.JLabel();
        lbCopaVino = new javax.swing.JLabel();
        lbPrecio13 = new javax.swing.JLabel();
        lbPrecio14 = new javax.swing.JLabel();
        lbPrecio15 = new javax.swing.JLabel();
        lbPrecio16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu del Restaurante");
        setResizable(false);

        lbEntradas.setText("Entradas:");

        lbRollitosCanela.setText("Rollitos de Canela:");

        lbAntipasto.setText("Antipasto:");

        lbPlatPrincipal.setText("Plato Principal:");

        lbChurrasco.setText("Churrasco con Yuca Frita:");

        lbPorcionPapas.setText("Porción de Papas Fritas:");

        lbSalmon.setText("Salmón con Hierbas Finas:");

        lbLentejas.setText("Lentejas con Arroz y Papa Sudada:");

        lbFrijoles.setText("Plato Corriente de Frijoles:");

        lbCoctel.setText("Coctel de Frutas:");

        lbPrecio1.setText("5000");

        lbPrecio2.setText("2000");

        lbPrecio3.setText("4000");

        lbPrecio4.setText("4000");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lbPrecio5.setText("30000");

        lbPrecio6.setText("35000");

        lbPrecio7.setText("12000");

        lbPrecio8.setText("13000");

        lbPostres.setText("Postres:");

        lbPudin.setText("Pudin con Barquillos Piaza:");

        lbGelatina.setText("Gelatina con Galletas:");

        lbArrozLeche.setText("Arroz con Leche:");

        lbPasteQueso.setText("Pastel de Queso:");

        lbPrecio9.setText("2500");

        lbPrecio10.setText("3000");

        lbPrecio11.setText("2000");

        lbPrecio12.setText("3500");

        lbBebidas.setText("Bebidas:");

        lbGaseosas.setText("Gaseosas (Cualquier Sabor):");

        lbCervezas.setText("Cervezas (Cualquier Marca):");

        lbJugos.setText("Jugos (Mango, Mora, Manzana):");

        lbCopaVino.setText("Copa de Vino(Cualquier Sabor):");

        lbPrecio13.setText("1000");

        lbPrecio14.setText("2000");

        lbPrecio15.setText("2000");

        lbPrecio16.setText("3000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAntipasto)
                            .addComponent(lbCoctel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbPorcionPapas, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbRollitosCanela)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecio1)
                            .addComponent(lbPrecio4)
                            .addComponent(lbPrecio3)
                            .addComponent(lbPrecio2)))
                    .addComponent(lbPostres)
                    .addComponent(lbEntradas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPudin)
                            .addComponent(lbGelatina)
                            .addComponent(lbArrozLeche)
                            .addComponent(lbPasteQueso))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecio12)
                            .addComponent(lbPrecio11)
                            .addComponent(lbPrecio10)
                            .addComponent(lbPrecio9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlatPrincipal)
                    .addComponent(lbBebidas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLentejas)
                            .addComponent(lbFrijoles)
                            .addComponent(lbSalmon)
                            .addComponent(lbChurrasco)
                            .addComponent(lbGaseosas)
                            .addComponent(lbCervezas)
                            .addComponent(lbJugos)
                            .addComponent(lbCopaVino))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecio16)
                            .addComponent(lbPrecio15)
                            .addComponent(lbPrecio14)
                            .addComponent(lbPrecio13)
                            .addComponent(lbPrecio7)
                            .addComponent(lbPrecio8)
                            .addComponent(lbPrecio6)
                            .addComponent(lbPrecio5))))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntradas)
                    .addComponent(lbPlatPrincipal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPrecio1)
                            .addComponent(lbChurrasco)
                            .addComponent(lbAntipasto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbRollitosCanela, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbPrecio2))
                            .addComponent(lbSalmon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbFrijoles)
                            .addComponent(lbPrecio3)
                            .addComponent(lbPorcionPapas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrecio4)
                            .addComponent(lbCoctel)
                            .addComponent(lbLentejas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPrecio5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrecio6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrecio7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrecio8)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPostres)
                    .addComponent(lbBebidas))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPudin)
                    .addComponent(lbPrecio9)
                    .addComponent(lbGaseosas)
                    .addComponent(lbPrecio13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGelatina)
                    .addComponent(lbPrecio10)
                    .addComponent(lbCervezas)
                    .addComponent(lbPrecio14))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbArrozLeche)
                    .addComponent(lbPrecio11)
                    .addComponent(lbJugos)
                    .addComponent(lbPrecio15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPasteQueso)
                    .addComponent(lbPrecio12)
                    .addComponent(lbCopaVino)
                    .addComponent(lbPrecio16))
                .addGap(69, 69, 69)
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
    private javax.swing.JLabel lbAntipasto;
    private javax.swing.JLabel lbArrozLeche;
    private javax.swing.JLabel lbBebidas;
    private javax.swing.JLabel lbCervezas;
    private javax.swing.JLabel lbChurrasco;
    private javax.swing.JLabel lbCoctel;
    private javax.swing.JLabel lbCopaVino;
    private javax.swing.JLabel lbEntradas;
    private javax.swing.JLabel lbFrijoles;
    private javax.swing.JLabel lbGaseosas;
    private javax.swing.JLabel lbGelatina;
    private javax.swing.JLabel lbJugos;
    private javax.swing.JLabel lbLentejas;
    private javax.swing.JLabel lbPasteQueso;
    private javax.swing.JLabel lbPlatPrincipal;
    private javax.swing.JLabel lbPorcionPapas;
    private javax.swing.JLabel lbPostres;
    private javax.swing.JLabel lbPrecio1;
    private javax.swing.JLabel lbPrecio10;
    private javax.swing.JLabel lbPrecio11;
    private javax.swing.JLabel lbPrecio12;
    private javax.swing.JLabel lbPrecio13;
    private javax.swing.JLabel lbPrecio14;
    private javax.swing.JLabel lbPrecio15;
    private javax.swing.JLabel lbPrecio16;
    private javax.swing.JLabel lbPrecio2;
    private javax.swing.JLabel lbPrecio3;
    private javax.swing.JLabel lbPrecio4;
    private javax.swing.JLabel lbPrecio5;
    private javax.swing.JLabel lbPrecio6;
    private javax.swing.JLabel lbPrecio7;
    private javax.swing.JLabel lbPrecio8;
    private javax.swing.JLabel lbPrecio9;
    private javax.swing.JLabel lbPudin;
    private javax.swing.JLabel lbRollitosCanela;
    private javax.swing.JLabel lbSalmon;
    // End of variables declaration//GEN-END:variables
}
