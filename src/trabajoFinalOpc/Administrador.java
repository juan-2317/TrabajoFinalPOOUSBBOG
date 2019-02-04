package trabajoFinalOpc;

import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame {

    // Cantidad existente de cada artículo
    private int antipasto, rollitosCanela, papasFritas, coctelFrutas, churrasco,
            salmon, frijoles, lentejas, pudin, gelatina, arrozLeche, pastelQueso,
            pepsi, tropiManzana, canadaDry, sevenUp, poker, clubColombia, aguila,
            jManzana, jMango, jMora, vUva, vBlanco;
    // Variables temporales
    private int cAntipasto, cRollitosCanela, cPapasFritas, cCoctelFrutas, cChurrasco,
            cSalmon, cFrijoles, cLentejas, cPudin, cGelatina, cArrozLeche, cPastelQueso,
            cPepsi, cTropiManzana, cCanadaDry, cSevenUp, cPoker, cClubColombia, cAguila,
            cJManzana, cJMango, cJMora, cVUva, cVBlanco;
    // Variables temporales de subtotal
    private int sAntipasto, sRollitosCanela, sPapasFritas, sCoctelFrutas, sChurrasco,
            sSalmon, sFrijoles, sLentejas, sPudin, sGelatina, sArrozLeche, sPastelQueso,
            sPepsi, sTropiManzana, sCanadaDry, sSevenUp, sPoker, sClubColombia,
            sAguila, sJManzana, sJMango, sJMora, sVUva, sVBlanco;
    // Unión de la cabecera y la tabla
    private DefaultTableModel tabla1;

    public Administrador() {
        antipasto = 20;
        rollitosCanela = 15;
        papasFritas = 45;
        coctelFrutas = 24;
        churrasco = 10;
        salmon = 5;
        frijoles = 20;
        lentejas = 20;
        pudin = 30;
        gelatina = 39;
        arrozLeche = 40;
        pastelQueso = 50;
        pepsi = 25;
        tropiManzana = 15;
        canadaDry = 10;
        sevenUp = 21;
        poker = 5;
        clubColombia = 8;
        aguila = 9;
        jManzana = 18;
        jMango = 15;
        jMora = 16;
        vUva = 4;
        vBlanco = 3;

        cAntipasto = cRollitosCanela = cPapasFritas = cCoctelFrutas = cChurrasco = 0;
        cSalmon = cFrijoles = cLentejas = cPudin = cGelatina = cArrozLeche = 0;
        cPastelQueso = cPepsi = cTropiManzana = cCanadaDry = cSevenUp = 0;
        cPoker = cAguila = cClubColombia = cAguila = cJManzana = cJMango = 0;
        cJMora = cVUva = cVBlanco = 0;

        sAntipasto = sRollitosCanela = sPapasFritas = sCoctelFrutas = 0;
        sChurrasco = sSalmon = sFrijoles = sLentejas = sPudin = sGelatina = 0;
        sArrozLeche = sPastelQueso = sPepsi = sTropiManzana = sCanadaDry = 0;
        sSevenUp = sPoker = sClubColombia = sAguila = sJManzana = sJMango = 0;
        sJMora = sVUva = sVBlanco = 0;

        initComponents();

        String[] datos = {"Producto", "Cantidad", "Precio Individual", "Subtotal"};
        tabla1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tabla1.setColumnIdentifiers(datos);
        tbPedidosActuales.setModel(tabla1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbProducto = new javax.swing.JLabel();
        cbItem = new javax.swing.JComboBox<>();
        btnIngresarPedido = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tbPedidosActuales = new javax.swing.JTable();
        btnLimpiarTodo = new javax.swing.JButton();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lbEfectivo = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        btnConfirmarCompra = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        btn2Salir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        btn2Limpiar = new javax.swing.JMenuItem();
        menuCarta = new javax.swing.JMenu();
        btnCarta = new javax.swing.JMenuItem();
        btnCategoria = new javax.swing.JMenuItem();
        btnArticulosRestantes = new javax.swing.JMenuItem();
        menuRecetas = new javax.swing.JMenu();
        subMenuChurrasco = new javax.swing.JMenu();
        btnDescripcionChurrasco = new javax.swing.JMenuItem();
        btnRecetaChurrasco = new javax.swing.JMenuItem();
        subMenuFrijoles = new javax.swing.JMenu();
        btnDescripcionFrijoles = new javax.swing.JMenuItem();
        btnRecetaFrijoles = new javax.swing.JMenuItem();
        subMenuLentejas = new javax.swing.JMenu();
        btnDescripcionLentejas = new javax.swing.JMenuItem();
        btnRecetaLentejas = new javax.swing.JMenuItem();
        subMenuSalmon = new javax.swing.JMenu();
        btnDescripcionSalmon = new javax.swing.JMenuItem();
        btnRecetaSalmon = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        btnTemasdeAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú");
        setResizable(false);

        lbProducto.setText("Producto:");

        cbItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antipasto", "Rollitos de Canela", "Porción de Papas Fritas", "Coctel de Frutas", "Churrasco con Yuca Frita", "Salmón con Hierbas Finas", "Plato Corriente de Frijoles", "Lentejas con Arroz y Papa Sudada", "Pudin con Barquillos Piaza", "Gelatina con Galletas", "Arroz con Leche", "Pastel de Queso", "Seven Up", "Pepsi", "TropiCola Manzana", "Canada Dry", "Poker", "Club Colombia", "Aguila", "Jugo de Mango", "Jugo de Mora", "Jugo de Manzana", "Vino de Uva", "Vino Blanco" }));

        btnIngresarPedido.setText("Ingresar Pedido");
        btnIngresarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPedidoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbCantidad.setText("Cantidad:");

        txtCantidad.setText("0");

        tbPedidosActuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Precio Individual", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(tbPedidosActuales);

        btnLimpiarTodo.setText("Limpiar Todo");
        btnLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTodoActionPerformed(evt);
            }
        });

        lbTotal.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setText("0");

        lbEfectivo.setText("Efectivo:");

        btnConfirmarCompra.setText("Confirmar Compra e Imprimir Recibo");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });

        menuArchivo.setText("Archivo");

        btn2Salir.setText("Salir");
        btn2Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2SalirActionPerformed(evt);
            }
        });
        menuArchivo.add(btn2Salir);

        barraMenu.add(menuArchivo);

        menuEditar.setText("Editar");

        btn2Limpiar.setText("Limpiar");
        btn2Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2LimpiarActionPerformed(evt);
            }
        });
        menuEditar.add(btn2Limpiar);

        barraMenu.add(menuEditar);

        menuCarta.setText("Carta");

        btnCarta.setText("Ver Carta");
        btnCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaActionPerformed(evt);
            }
        });
        menuCarta.add(btnCarta);

        btnCategoria.setText("Ver Categoria de Cada Plato");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        menuCarta.add(btnCategoria);

        btnArticulosRestantes.setText("Ver Articulos Restantes");
        btnArticulosRestantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosRestantesActionPerformed(evt);
            }
        });
        menuCarta.add(btnArticulosRestantes);

        barraMenu.add(menuCarta);

        menuRecetas.setText("Recetas");

        subMenuChurrasco.setText("Churrasco");

        btnDescripcionChurrasco.setText("Ver Descripción");
        btnDescripcionChurrasco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripcionChurrascoActionPerformed(evt);
            }
        });
        subMenuChurrasco.add(btnDescripcionChurrasco);

        btnRecetaChurrasco.setText("Ver Receta");
        btnRecetaChurrasco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaChurrascoActionPerformed(evt);
            }
        });
        subMenuChurrasco.add(btnRecetaChurrasco);

        menuRecetas.add(subMenuChurrasco);

        subMenuFrijoles.setText("Frijoles");

        btnDescripcionFrijoles.setText("Ver Descripción");
        btnDescripcionFrijoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripcionFrijolesActionPerformed(evt);
            }
        });
        subMenuFrijoles.add(btnDescripcionFrijoles);

        btnRecetaFrijoles.setText("Ver Receta");
        btnRecetaFrijoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaFrijolesActionPerformed(evt);
            }
        });
        subMenuFrijoles.add(btnRecetaFrijoles);

        menuRecetas.add(subMenuFrijoles);

        subMenuLentejas.setText("Lentejas");

        btnDescripcionLentejas.setText("Ver Descripción");
        btnDescripcionLentejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripcionLentejasActionPerformed(evt);
            }
        });
        subMenuLentejas.add(btnDescripcionLentejas);

        btnRecetaLentejas.setText("Ver Receta");
        btnRecetaLentejas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaLentejasActionPerformed(evt);
            }
        });
        subMenuLentejas.add(btnRecetaLentejas);

        menuRecetas.add(subMenuLentejas);

        subMenuSalmon.setText("Salmón");

        btnDescripcionSalmon.setText("Ver Descripción");
        btnDescripcionSalmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripcionSalmonActionPerformed(evt);
            }
        });
        subMenuSalmon.add(btnDescripcionSalmon);

        btnRecetaSalmon.setText("Ver Receta");
        btnRecetaSalmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetaSalmonActionPerformed(evt);
            }
        });
        subMenuSalmon.add(btnRecetaSalmon);

        menuRecetas.add(subMenuSalmon);

        barraMenu.add(menuRecetas);

        menuAyuda.setText("Ayuda");

        btnTemasdeAyuda.setText("Temas de Ayuda");
        btnTemasdeAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemasdeAyudaActionPerformed(evt);
            }
        });
        menuAyuda.add(btnTemasdeAyuda);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbEfectivo)
                            .addGap(18, 18, 18)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTotal)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(scroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbProducto)
                            .addGap(77, 77, 77)
                            .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCantidad)
                            .addGap(18, 18, 18)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresarPedido)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarCompra)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalir)))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProducto)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEfectivo)
                    .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarPedido)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiarTodo)
                    .addComponent(btnConfirmarCompra))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        CartaRestaurante c = new CartaRestaurante();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_btnCartaActionPerformed

    private void btnArticulosRestantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosRestantesActionPerformed
        HashMap<String, Integer> exRestaurante = new HashMap<>();

        exRestaurante.put("antipasto", antipasto);
        exRestaurante.put("rollitosCanela", rollitosCanela);
        exRestaurante.put("papasFritas", papasFritas);
        exRestaurante.put("coctelFrutas", coctelFrutas);
        exRestaurante.put("churrasco", churrasco);
        exRestaurante.put("salmon", salmon);
        exRestaurante.put("frijoles", frijoles);
        exRestaurante.put("lentejas", lentejas);
        exRestaurante.put("pudin", pudin);
        exRestaurante.put("gelatina", gelatina);
        exRestaurante.put("arrozLeche", arrozLeche);
        exRestaurante.put("pastelQueso", pastelQueso);
        exRestaurante.put("sevenUp", sevenUp);
        exRestaurante.put("pepsi", pepsi);
        exRestaurante.put("tropiManzana", tropiManzana);
        exRestaurante.put("canadaDry", canadaDry);
        exRestaurante.put("poker", poker);
        exRestaurante.put("clubColombia", clubColombia);
        exRestaurante.put("aguila", aguila);
        exRestaurante.put("jManzana", jManzana);
        exRestaurante.put("jMango", jMango);
        exRestaurante.put("jMora", jMora);
        exRestaurante.put("vUva", vUva);
        exRestaurante.put("vBlanco", vBlanco);

        Existencias e = new Existencias(exRestaurante);
        e.setLocationRelativeTo(null);
        e.setVisible(true);
    }//GEN-LAST:event_btnArticulosRestantesActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        CategoriaPlato cp = new CategoriaPlato();
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnDescripcionChurrascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripcionChurrascoActionPerformed
        DescripcionChurrasco dc = new DescripcionChurrasco();
        dc.setLocationRelativeTo(null);
        dc.setVisible(true);
    }//GEN-LAST:event_btnDescripcionChurrascoActionPerformed

    private void btnRecetaFrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaFrijolesActionPerformed
        RecetaFrijoles rf = new RecetaFrijoles();
        rf.setLocationRelativeTo(null);
        rf.setVisible(true);
    }//GEN-LAST:event_btnRecetaFrijolesActionPerformed

    private void btnRecetaChurrascoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaChurrascoActionPerformed
        RecetaChurrasco rc = new RecetaChurrasco();
        rc.setLocationRelativeTo(null);
        rc.setVisible(true);
    }//GEN-LAST:event_btnRecetaChurrascoActionPerformed

    private void btnDescripcionFrijolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripcionFrijolesActionPerformed
        DescripcionFrijoles df = new DescripcionFrijoles();
        df.setLocationRelativeTo(null);
        df.setVisible(true);
    }//GEN-LAST:event_btnDescripcionFrijolesActionPerformed

    private void btnDescripcionLentejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripcionLentejasActionPerformed
        DescripcionLentejas dl = new DescripcionLentejas();
        dl.setLocationRelativeTo(null);
        dl.setVisible(true);
    }//GEN-LAST:event_btnDescripcionLentejasActionPerformed

    private void btnRecetaLentejasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaLentejasActionPerformed
        RecetaLentejas rl = new RecetaLentejas();
        rl.setLocationRelativeTo(null);
        rl.setVisible(true);
    }//GEN-LAST:event_btnRecetaLentejasActionPerformed

    private void btnDescripcionSalmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripcionSalmonActionPerformed
        DescripcionSalmon ds = new DescripcionSalmon();
        ds.setLocationRelativeTo(null);
        ds.setVisible(true);
    }//GEN-LAST:event_btnDescripcionSalmonActionPerformed

    private void btnRecetaSalmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetaSalmonActionPerformed
        RecetaSalmon rs = new RecetaSalmon();
        rs.setLocationRelativeTo(null);
        rs.setVisible(true);
    }//GEN-LAST:event_btnRecetaSalmonActionPerformed

    private void btn2SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2SalirActionPerformed
        dispose();
    }//GEN-LAST:event_btn2SalirActionPerformed

    private void btnTemasdeAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemasdeAyudaActionPerformed
        JOptionPane.showMessageDialog(this,
                "En el presente programa usted puede consultar la descripción de cada "
                + "plato, quien lo preparó, su respectiva receta.\n"
                + "Además de poder realizar una venta", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTemasdeAyudaActionPerformed

    private void btnIngresarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPedidoActionPerformed
        try {
            int cantidadPedida, indexSeleccionado, temp, busqueda, totalP;
            cantidadPedida = Integer.parseInt(txtCantidad.getText());

            if (cantidadPedida < 1) {
                throw new ArithmeticException("Pedido no valido");
            }

            busqueda = getIndexDatoRepetido();
            totalP = 0;
            indexSeleccionado = cbItem.getSelectedIndex();

            switch (indexSeleccionado) {
                case 0: // Antipasto
                    temp = cAntipasto + cantidadPedida;
                    if (temp > antipasto) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cAntipasto = temp;
                    sAntipasto = 5000 * cAntipasto;

                    if (busqueda == -1) {
                        agregarFila(5000, cAntipasto, sAntipasto);
                    } else {
                        modificarFila(cAntipasto, sAntipasto, busqueda);
                    }
                    break;
                case 1: // Rollitos de Canela
                    temp = cRollitosCanela + cantidadPedida;
                    if (temp > rollitosCanela) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cRollitosCanela = temp;
                    sRollitosCanela = 2000 * cRollitosCanela;

                    if (busqueda == -1) {
                        agregarFila(2000, cRollitosCanela, sRollitosCanela);
                    } else {
                        modificarFila(cRollitosCanela, sRollitosCanela, busqueda);
                    }
                    break;
                case 2: // Porción de Papas Fritas
                    temp = cPapasFritas + cantidadPedida;
                    if (temp > papasFritas) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cPapasFritas = temp;
                    sPapasFritas = 4000 * cPapasFritas;

                    if (busqueda == -1) {
                        agregarFila(4000, cPapasFritas, sPapasFritas);
                    } else {
                        modificarFila(cPapasFritas, sPapasFritas, busqueda);
                    }
                    break;
                case 3: // Coctel de Frutas  
                    temp = cCoctelFrutas + cantidadPedida;
                    if (temp > coctelFrutas) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cCoctelFrutas = temp;
                    sCoctelFrutas = 4000 * cCoctelFrutas;

                    if (busqueda == -1) {
                        agregarFila(4000, cCoctelFrutas, sCoctelFrutas);
                    } else {
                        modificarFila(cCoctelFrutas, sCoctelFrutas, busqueda);
                    }
                    break;
                case 4: // Churrasco con Yuca Frita
                    temp = cChurrasco + cantidadPedida;
                    if (temp > churrasco) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cChurrasco = temp;
                    sChurrasco += 30000 * cChurrasco;

                    if (busqueda == -1) {
                        agregarFila(30000, cChurrasco, sChurrasco);
                    } else {
                        modificarFila(cChurrasco, sChurrasco, busqueda);
                    }
                    break;
                case 5: // Salmón con Hierbas Finas
                    temp = cSalmon + cantidadPedida;
                    if (temp > salmon) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cSalmon = temp;
                    sSalmon = 35000 * cSalmon;

                    if (busqueda == -1) {
                        agregarFila(35000, cSalmon, sSalmon);
                    } else {
                        modificarFila(cSalmon, sSalmon, busqueda);
                    }
                    break;
                case 6: // Plato Corriente de Frijoles
                    temp = cFrijoles + cantidadPedida;
                    if (temp > frijoles) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cFrijoles = temp;
                    sFrijoles = 12000 * cFrijoles;

                    if (busqueda == -1) {
                        agregarFila(12000, cFrijoles, sFrijoles);
                    } else {
                        modificarFila(cFrijoles, sFrijoles, busqueda);
                    }
                    break;
                case 7: // Lentejas con Arroz y Papa Sudada
                    temp = cLentejas + cantidadPedida;
                    if (temp > lentejas) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cLentejas = temp;
                    sLentejas = 13000 * cLentejas;

                    if (busqueda == -1) {
                        agregarFila(13000, cLentejas, sLentejas);
                    } else {
                        modificarFila(cLentejas, sLentejas, busqueda);
                    }
                    break;
                case 8:  // Pudin con Barquillos Piaza 
                    temp = cPudin + cantidadPedida;
                    if (temp > pudin) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cPudin = temp;
                    sPudin = 2500 * cPudin;

                    if (busqueda == -1) {
                        agregarFila(2500, cPudin, sPudin);
                    } else {
                        modificarFila(cPudin, sPudin, busqueda);
                    }
                    break;
                case 9: // Gelatina con Galletas
                    temp = cGelatina + cantidadPedida;
                    if (temp > gelatina) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cGelatina = temp;
                    sGelatina = 3000 * cGelatina;

                    if (busqueda == -1) {
                        agregarFila(3000, cGelatina, sGelatina);
                    } else {
                        modificarFila(cGelatina, sGelatina, busqueda);
                    }
                    break;
                case 10: // Arroz con Leche
                    temp = cArrozLeche + cantidadPedida;
                    if (temp > arrozLeche) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cArrozLeche = temp;
                    sArrozLeche = 2000 * cArrozLeche;

                    if (busqueda == -1) {
                        agregarFila(2000, cArrozLeche, sArrozLeche);
                    } else {
                        modificarFila(cArrozLeche, sArrozLeche, busqueda);
                    }
                    break;
                case 11: // Pastel de Queso
                    temp = cPastelQueso + cantidadPedida;
                    if (temp > pastelQueso) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cPastelQueso = temp;
                    sPastelQueso = 3500 * cPastelQueso;

                    if (busqueda == -1) {
                        agregarFila(3500, cPastelQueso, sPastelQueso);
                    } else {
                        modificarFila(cPastelQueso, sPastelQueso, busqueda);
                    }
                    break;
                case 12: // Seven Up
                    temp = cSevenUp + cantidadPedida;
                    if (temp > sevenUp) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cSevenUp = temp;
                    sSevenUp = 1000 * cSevenUp;

                    if (busqueda == -1) {
                        agregarFila(1000, cSevenUp, sSevenUp);
                    } else {
                        modificarFila(cSevenUp, sSevenUp, busqueda);
                    }
                    break;
                case 13: // Pepsi
                    temp = cPepsi + cantidadPedida;
                    if (temp > pepsi) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cPepsi = temp;
                    sPepsi = 1000 * cPepsi;

                    if (busqueda == -1) {
                        agregarFila(1000, cPepsi, sPepsi);
                    } else {
                        modificarFila(cPepsi, sPepsi, busqueda);
                    }
                    break;
                case 14: // TropiCola Manzana
                    temp = cTropiManzana + cantidadPedida;
                    if (temp > tropiManzana) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cTropiManzana = temp;
                    sTropiManzana = 1000 * cTropiManzana;

                    if (busqueda == -1) {
                        agregarFila(1000, cTropiManzana, sTropiManzana);
                    } else {
                        modificarFila(cTropiManzana, sTropiManzana, busqueda);
                    }
                    break;
                case 15: // Canada Dry
                    temp = cCanadaDry + cantidadPedida;
                    if (temp > canadaDry) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cCanadaDry = temp;
                    sCanadaDry = 1000 * cCanadaDry;

                    if (busqueda == -1) {
                        agregarFila(1000, cCanadaDry, sCanadaDry);
                    } else {
                        modificarFila(cCanadaDry, sCanadaDry, busqueda);
                    }
                    break;
                case 16: // Poker 
                    temp = cPoker + cantidadPedida;
                    if (temp > poker) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");

                    }

                    cPoker = temp;
                    sPoker = 2000 * cPoker;

                    if (busqueda == -1) {
                        agregarFila(2000, cPoker, sPoker);
                    } else {
                        modificarFila(cPoker, sPoker, busqueda);
                    }
                    break;
                case 17: // Club Colombia
                    temp = cClubColombia + cantidadPedida;
                    if (temp > clubColombia) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cClubColombia = temp;
                    sClubColombia = 2000 * cClubColombia;

                    if (busqueda == -1) {
                        agregarFila(2000, cClubColombia, sClubColombia);
                    } else {
                        modificarFila(cClubColombia, sClubColombia, busqueda);
                    }
                    break;
                case 18: // Aguila
                    temp = cAguila + cantidadPedida;
                    if (temp > aguila) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cAguila = temp;
                    sAguila = 2000 * cAguila;

                    if (busqueda == -1) {
                        agregarFila(2000, cAguila, sAguila);
                    } else {
                        modificarFila(cAguila, sAguila, busqueda);
                    }
                    break;
                case 19: // Jugo de Mango
                    temp = cJMango + cantidadPedida;
                    if (temp > jMango) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cJMango = temp;
                    sJMango = 2000 * cJMango;

                    if (busqueda == -1) {
                        agregarFila(2000, cJMango, sJMango);
                    } else {
                        modificarFila(cJMango, sJMango, busqueda);
                    }
                    break;
                case 20: // Jugo de Mora
                    temp = cJMora + cantidadPedida;
                    if (temp > jMora) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cJMora = temp;
                    sJMora = 2000 * cJMora;

                    if (busqueda == -1) {
                        agregarFila(2000, cJMora, sJMora);
                    } else {
                        modificarFila(cJMora, sJMora, busqueda);
                    }
                    break;
                case 21: // Jugo de Manzana
                    temp = cJManzana + cantidadPedida;
                    if (temp > jManzana) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cJManzana = temp;
                    sJManzana = 2000 * cJManzana;

                    if (busqueda == -1) {
                        agregarFila(2000, cJManzana, sJManzana);
                    } else {
                        modificarFila(cJManzana, sJManzana, busqueda);
                    }
                    break;
                case 22: // Vino de Uva
                    temp = cVUva + cantidadPedida;
                    if (temp > vUva) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cVUva = temp;
                    sVUva = 3000 * cVUva;

                    if (busqueda == -1) {
                        agregarFila(3000, cVUva, sVUva);
                    } else {
                        modificarFila(cVUva, sVUva, busqueda);
                    }
                    break;
                case 23: // Vino Blanco
                    temp = cVBlanco + cantidadPedida;
                    if (temp > vBlanco) {
                        txtCantidad.setText("");
                        throw new ArithmeticException("La cantidad pedida es menor a la existente");
                    }

                    cVBlanco = temp;
                    sVBlanco = 3000 * cVBlanco;

                    if (busqueda == -1) {
                        agregarFila(3000, cVBlanco, sVBlanco);
                    } else {
                        modificarFila(cVBlanco, sVBlanco, busqueda);
                    }
                    break;
            }

            for (int i = 0; i < tabla1.getRowCount(); i++) {
                totalP += (int) tabla1.getValueAt(i, 3);
            }
            txtTotal.setText(Integer.toString(totalP));
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(this, a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarPedidoActionPerformed

    private void btnLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTodoActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarTodoActionPerformed

    private void btn2LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn2LimpiarActionPerformed

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        try {
            int opc = JOptionPane.showConfirmDialog(this, "¿Confirma la Compra?",
                    "Confirmar Compra", JOptionPane.YES_NO_OPTION);
            if (opc == 0) {
                int efectivo, total, cambio;

                efectivo = Integer.parseInt(txtEfectivo.getText());
                total = Integer.parseInt(txtTotal.getText());
                if (efectivo < total) {
                    txtEfectivo.setText("");
                    throw new ArithmeticException("Aviso: Faltan " + (total - efectivo));
                }
                cambio = efectivo - total;

                antipasto -= cAntipasto;
                rollitosCanela -= cRollitosCanela;
                papasFritas -= cPapasFritas;
                coctelFrutas -= cCoctelFrutas;
                churrasco -= cChurrasco;
                salmon -= cSalmon;
                frijoles -= cFrijoles;
                lentejas -= cLentejas;
                pudin -= cPudin;
                gelatina -= cGelatina;
                arrozLeche -= cArrozLeche;
                pastelQueso -= cPastelQueso;
                sevenUp -= cSevenUp;
                pepsi -= cPepsi;
                tropiManzana -= cTropiManzana;
                canadaDry -= cCanadaDry;
                poker -= cPoker;
                clubColombia -= cClubColombia;
                aguila -= cAguila;
                jMango -= cJMango;
                jMora -= cJMora;
                jManzana -= cJManzana;
                vUva -= cVUva;
                vBlanco -= cVBlanco;
                imprimirRecibo(total, efectivo, cambio);
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void limpiar() {
        int cantidadfilas = tabla1.getRowCount();

        for (int i = cantidadfilas - 1; i >= 0; i--) {
            tabla1.removeRow(i);
        }

        txtCantidad.setText("");
        txtEfectivo.setText("");
        txtTotal.setText("");

        cAntipasto = cRollitosCanela = cPapasFritas = cCoctelFrutas = 0;
        cChurrasco = cSalmon = cFrijoles = cLentejas = cPudin = cGelatina = 0;
        cArrozLeche = cPastelQueso = cSevenUp = cPepsi = cTropiManzana = 0;
        cCanadaDry = cPoker = cClubColombia = cAguila = cJMango = cJMora = 0;
        cJManzana = cVUva = cVBlanco = 0;

        sAntipasto = sRollitosCanela = sPapasFritas = sCoctelFrutas = 0;
        sChurrasco = sSalmon = sFrijoles = sLentejas = sPudin = sGelatina = 0;
        sArrozLeche = sPastelQueso = sSevenUp = sPepsi = sTropiManzana = 0;
        sCanadaDry = sPoker = sVBlanco = sClubColombia = sAguila = sJMango = 0;
        sJMora = sJManzana = sVUva = 0;

        txtCantidad.setText("0");
        txtTotal.setText("0");
    }

    private void imprimirRecibo(int total, int efectivo, int cambio) {
        Object[][] datosTabla = new Object[tabla1.getRowCount()][tabla1.getColumnCount()];

        for (int i = 0; i < tabla1.getRowCount(); i++) {
            for (int j = 0; j < tabla1.getColumnCount(); j++) {
                datosTabla[i][j] = tabla1.getValueAt(i, j);
            }
        }

        Factura f = new Factura(total, efectivo, cambio, datosTabla);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        limpiar();
    }

    private int getIndexDatoRepetido() {
        String itemSeleccionado = (String) cbItem.getSelectedItem();
        for (int i = 0; i < tabla1.getRowCount(); i++) {
            String datoIngresado = (String) tabla1.getValueAt(i, 0);
            if (itemSeleccionado.equals(datoIngresado)) {
                return i;
            }
        }
        return -1;
    }

    private void agregarFila(int precio, int cantidad, int subTotal) {
        Object[] datos = {cbItem.getSelectedItem(), cantidad, precio, subTotal};
        tabla1.addRow(datos);
    }

    private void modificarFila(int cantidad, int subTotal, int busqueda) {
        tabla1.setValueAt(cantidad, busqueda, 1);
        tabla1.setValueAt(subTotal, busqueda, 3);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem btn2Limpiar;
    private javax.swing.JMenuItem btn2Salir;
    private javax.swing.JMenuItem btnArticulosRestantes;
    private javax.swing.JMenuItem btnCarta;
    private javax.swing.JMenuItem btnCategoria;
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JMenuItem btnDescripcionChurrasco;
    private javax.swing.JMenuItem btnDescripcionFrijoles;
    private javax.swing.JMenuItem btnDescripcionLentejas;
    private javax.swing.JMenuItem btnDescripcionSalmon;
    private javax.swing.JButton btnIngresarPedido;
    private javax.swing.JButton btnLimpiarTodo;
    private javax.swing.JMenuItem btnRecetaChurrasco;
    private javax.swing.JMenuItem btnRecetaFrijoles;
    private javax.swing.JMenuItem btnRecetaLentejas;
    private javax.swing.JMenuItem btnRecetaSalmon;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem btnTemasdeAyuda;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbEfectivo;
    private javax.swing.JLabel lbProducto;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuCarta;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuRecetas;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JMenu subMenuChurrasco;
    private javax.swing.JMenu subMenuFrijoles;
    private javax.swing.JMenu subMenuLentejas;
    private javax.swing.JMenu subMenuSalmon;
    private javax.swing.JTable tbPedidosActuales;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
