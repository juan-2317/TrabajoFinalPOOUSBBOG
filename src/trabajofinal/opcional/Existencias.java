package trabajofinal.opcional;

import java.util.Map;

public class Existencias extends javax.swing.JFrame {

    public Existencias(Map<String, Integer> exRestaurante) {
        initComponents();

        int valor = exRestaurante.get("antipasto");
        if (valor == 1) {
            lbAntipasto.setText("Plato de Antipasto");
        }
        txtAntipasto.setText(Integer.toString(valor));

        valor = exRestaurante.get("rollitosCanela");
        if (valor == 1) {
            lbRollitosCanela.setText("Rollito de Canela");
        }
        txtRollitosCanela.setText(Integer.toString(valor));

        valor = exRestaurante.get("papasFritas");
        if (valor == 1) {
            lbPapasFritas.setText("Porción de Papas Fritas");
        }
        txtPapasFritas.setText(Integer.toString(valor));

        valor = exRestaurante.get("coctelFrutas");
        if (valor == 1) {
            lbCoctelesFrutas.setText("Coctel de Frutas");
        }
        txtCoctelesFrutas.setText(Integer.toString(valor));

        valor = exRestaurante.get("churrasco");
        if (valor == 1) {
            lbChurrasco.setText("Plato de Churrasco con Yuca Frita");
        }
        txtChurrasco.setText(Integer.toString(valor));

        valor = exRestaurante.get("salmon");
        if (valor == 1) {
            lbSalmon.setText("Plato de Salmón con Hierbas Finas");
        }
        txtSalmon.setText(Integer.toString(valor));

        valor = exRestaurante.get("frijoles");
        if (valor == 1) {
            lbFrijoles.setText("Plato Corriente con Frijoles");
        }
        txtFrijoles.setText(Integer.toString(valor));

        valor = exRestaurante.get("lentejas");
        if (valor == 1) {
            lbLentejas.setText("Plato de Lentejas con Arroz y Papa Sudada");
        }
        txtLentejas.setText(Integer.toString(valor));

        valor = exRestaurante.get("pudin");
        if (valor == 1) {
            lbPudin.setText("Porción de Pudin con Barquillos Piaza");
        }
        txtPudin.setText(Integer.toString(valor));

        valor = exRestaurante.get("gelatina");
        if (valor == 1) {
            lbGelatina.setText("Porción de Gelatina con Galletas");
        }
        txtGelatina.setText(Integer.toString(valor));

        valor = exRestaurante.get("arrozLeche");
        if (valor == 1) {
            lbArrozLeche.setText("Porción de Arroz con Leche");
        }
        txtArrozLeche.setText(Integer.toString(valor));

        valor = exRestaurante.get("pastelQueso");
        if (valor == 1) {
            lbPastelesQueso.setText("Porción de Pastel de Queso");
        }
        txtPastelesQueso.setText(Integer.toString(valor));

        valor = exRestaurante.get("sevenUp");
        if (valor == 1) {
            lbSevenUp.setText("Lata de SevenUp");
        }
        txtSevenUp.setText(Integer.toString(valor));

        valor = exRestaurante.get("pepsi");
        if (valor == 1) {
            lbPepsi.setText("Lata de Pepsi");
        }
        txtPepsi.setText(Integer.toString(valor));

        valor = exRestaurante.get("tropiManzana");
        if (valor == 1) {
            lbTropiCola.setText("Lata de TropiCola Manzana");
        }
        txtTropiCola.setText(Integer.toString(valor));

        valor = exRestaurante.get("canadaDry");
        if (valor == 1) {
            lbCanadaDry.setText("Lata de Canada Dry");
        }
        txtCanadaDry.setText(Integer.toString(valor));

        valor = exRestaurante.get("poker");
        if (valor == 1) {
            lbPoker.setText("Lata de Cerveza Poker");
        }
        txtPoker.setText(Integer.toString(valor));

        valor = exRestaurante.get("clubColombia");
        if (valor == 1) {
            lbClubColombia.setText("Lata de Cerveza Club Colombia");
        }
        txtClubColombia.setText(Integer.toString(valor));

        valor = exRestaurante.get("aguila");
        if (valor == 1) {
            lbAguila.setText("Lata de Cerveza Aguila");
        }
        txtAguila.setText(Integer.toString(valor));

        valor = exRestaurante.get("jManzana");
        if (valor == 1) {
            lbJManzana.setText("Jugo de Manzana");
        }
        txtJManzana.setText(Integer.toString(valor));

        valor = exRestaurante.get("jMango");
        if (valor == 1) {
            lbJMango.setText("Vaso de Jugo de Mango");
        }
        txtJMango.setText(Integer.toString(valor));

        valor = exRestaurante.get("jMora");
        if (valor == 1) {
            lbJMora.setText("Vaso de Jugo de Mora");
        }
        txtJMora.setText(Integer.toString(valor));

        valor = exRestaurante.get("vUva");
        if (valor == 1) {
            lbVUva.setText("Copa de Vino de Uva");
        }
        txtVUva.setText(Integer.toString(valor));

        valor = exRestaurante.get("vBlanco");
        if (valor == 1) {
            lbVBlanco.setText("Copa de Vino Blanco");
        }
        txtVBlanco.setText(Integer.toString(valor));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        txtAntipasto = new javax.swing.JTextField();
        lbAntipasto = new javax.swing.JLabel();
        lbEntradas = new javax.swing.JLabel();
        lbRollitosCanela = new javax.swing.JLabel();
        txtRollitosCanela = new javax.swing.JTextField();
        txtPapasFritas = new javax.swing.JTextField();
        txtCoctelesFrutas = new javax.swing.JTextField();
        lbPapasFritas = new javax.swing.JLabel();
        lbCoctelesFrutas = new javax.swing.JLabel();
        txtChurrasco = new javax.swing.JTextField();
        lbPrincipales = new javax.swing.JLabel();
        txtSalmon = new javax.swing.JTextField();
        txtFrijoles = new javax.swing.JTextField();
        txtLentejas = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lbChurrasco = new javax.swing.JLabel();
        lbSalmon = new javax.swing.JLabel();
        lbFrijoles = new javax.swing.JLabel();
        lbLentejas = new javax.swing.JLabel();
        lbPostres = new javax.swing.JLabel();
        txtPudin = new javax.swing.JTextField();
        txtGelatina = new javax.swing.JTextField();
        txtArrozLeche = new javax.swing.JTextField();
        txtPastelesQueso = new javax.swing.JTextField();
        lbPudin = new javax.swing.JLabel();
        lbGelatina = new javax.swing.JLabel();
        lbArrozLeche = new javax.swing.JLabel();
        lbPastelesQueso = new javax.swing.JLabel();
        txtPepsi = new javax.swing.JTextField();
        lbSevenUp = new javax.swing.JLabel();
        lbPepsi = new javax.swing.JLabel();
        lbTropiCola = new javax.swing.JLabel();
        lbCanadaDry = new javax.swing.JLabel();
        lbPoker = new javax.swing.JLabel();
        lbClubColombia = new javax.swing.JLabel();
        lbAguila = new javax.swing.JLabel();
        lbJMango = new javax.swing.JLabel();
        lbJManzana = new javax.swing.JLabel();
        lbJMora = new javax.swing.JLabel();
        lbVUva = new javax.swing.JLabel();
        lbVBlanco = new javax.swing.JLabel();
        lbBebidas = new javax.swing.JLabel();
        txtTropiCola = new javax.swing.JTextField();
        txtCanadaDry = new javax.swing.JTextField();
        txtSevenUp = new javax.swing.JTextField();
        txtPoker = new javax.swing.JTextField();
        txtClubColombia = new javax.swing.JTextField();
        txtAguila = new javax.swing.JTextField();
        txtJManzana = new javax.swing.JTextField();
        txtJMango = new javax.swing.JTextField();
        txtJMora = new javax.swing.JTextField();
        txtVUva = new javax.swing.JTextField();
        txtVBlanco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Articulos Restantes");
        setResizable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTitulo.setText("Quedan:");

        txtAntipasto.setEditable(false);

        lbAntipasto.setText("Platos de Antipasto");

        lbEntradas.setText("Entradas:");

        lbRollitosCanela.setText("Rollitos de Canela");

        txtRollitosCanela.setEditable(false);

        txtPapasFritas.setEditable(false);

        txtCoctelesFrutas.setEditable(false);

        lbPapasFritas.setText("Porciones de papas fritas");

        lbCoctelesFrutas.setText("Cocteles de frutas");

        txtChurrasco.setEditable(false);

        lbPrincipales.setText("Platos Principales");

        txtSalmon.setEditable(false);

        txtFrijoles.setEditable(false);

        txtLentejas.setEditable(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lbChurrasco.setText("Platos de Churrasco con Yuca Frita");

        lbSalmon.setText("Platos de Salmón con Hierbas Finas");

        lbFrijoles.setText("Platos Corrientes con Frijoles");

        lbLentejas.setText("Platos de Lentejas con Arroz y Papa Sudada");

        lbPostres.setText("Postres:");

        txtPudin.setEditable(false);

        txtGelatina.setEditable(false);

        txtArrozLeche.setEditable(false);

        txtPastelesQueso.setEditable(false);

        lbPudin.setText("Porciones de Pudin con Barquillos Piaza");

        lbGelatina.setText("Porciones de Gelatina con Galletas");

        lbArrozLeche.setText("Porciones de Arroz con Leche");

        lbPastelesQueso.setText("Porciones de Pasteles de Queso");

        txtPepsi.setEditable(false);

        lbSevenUp.setText("Latas de Seven Up");

        lbPepsi.setText("Latas de Pepsi");

        lbTropiCola.setText("Latas de TropiCola Manzana");

        lbCanadaDry.setText("Latas de Canada Dry");

        lbPoker.setText("Latas de Cerveza Poker");

        lbClubColombia.setText("Latas de Cerveza Club Colombia");

        lbAguila.setText("Latas de Cerveza Aguila");

        lbJMango.setText("Vasos de Jugo de Mango");

        lbJManzana.setText("Jugo de Manzana");

        lbJMora.setText("Vasos de Jugo de Mora");

        lbVUva.setText("Copas de Vino de Uva");

        lbVBlanco.setText("Copas de Vino Blanco");

        lbBebidas.setText("Bebidas:");

        txtTropiCola.setEditable(false);

        txtCanadaDry.setEditable(false);

        txtSevenUp.setEditable(false);

        txtPoker.setEditable(false);

        txtClubColombia.setEditable(false);

        txtAguila.setEditable(false);

        txtJManzana.setEditable(false);

        txtJMango.setEditable(false);

        txtJMora.setEditable(false);

        txtVUva.setEditable(false);

        txtVBlanco.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPostres)
                    .addComponent(lbEntradas)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPastelesQueso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtArrozLeche, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGelatina, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPudin, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPudin)
                            .addComponent(lbGelatina)
                            .addComponent(lbArrozLeche)
                            .addComponent(lbPastelesQueso)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCoctelesFrutas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txtPapasFritas, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAntipasto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRollitosCanela, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAntipasto)
                            .addComponent(lbRollitosCanela)
                            .addComponent(lbPapasFritas)
                            .addComponent(lbCoctelesFrutas))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTropiCola, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPepsi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbTropiCola)
                                            .addComponent(lbPepsi)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSevenUp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCanadaDry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbCanadaDry)
                                            .addComponent(lbSevenUp))))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPoker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClubColombia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtJManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAguila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPoker)
                                    .addComponent(lbAguila)
                                    .addComponent(lbJManzana)
                                    .addComponent(lbClubColombia))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJMango)
                                    .addComponent(txtJMora)
                                    .addComponent(txtVUva)
                                    .addComponent(txtVBlanco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbJMora)
                                    .addComponent(lbJMango)
                                    .addComponent(lbVUva)
                                    .addComponent(lbVBlanco)))
                            .addComponent(lbBebidas)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFrijoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFrijoles))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSalmon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbSalmon))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtChurrasco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbChurrasco))
                            .addComponent(lbPrincipales)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLentejas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbLentejas))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lbTitulo)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPrincipales)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtChurrasco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbChurrasco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSalmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSalmon))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbFrijoles)
                                    .addComponent(txtFrijoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLentejas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbLentejas))))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPoker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtClubColombia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbClubColombia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAguila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJManzana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBebidas)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPepsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPepsi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTropiCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTropiCola))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCanadaDry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCanadaDry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSevenUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSevenUp)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPoker)
                                    .addComponent(txtJMango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbJMango))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbJMora)
                                    .addComponent(txtJMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbAguila)
                                    .addComponent(lbVUva)
                                    .addComponent(txtVUva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbVBlanco)
                                    .addComponent(lbJManzana)
                                    .addComponent(txtVBlanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbEntradas)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAntipasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbAntipasto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRollitosCanela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRollitosCanela))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPapasFritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPapasFritas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCoctelesFrutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCoctelesFrutas))
                        .addGap(79, 79, 79)
                        .addComponent(lbPostres)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPudin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPudin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGelatina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGelatina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArrozLeche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbArrozLeche))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPastelesQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPastelesQueso))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
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
    protected javax.swing.JLabel lbAguila;
    protected javax.swing.JLabel lbAntipasto;
    protected javax.swing.JLabel lbArrozLeche;
    private javax.swing.JLabel lbBebidas;
    protected javax.swing.JLabel lbCanadaDry;
    protected javax.swing.JLabel lbChurrasco;
    protected javax.swing.JLabel lbClubColombia;
    protected javax.swing.JLabel lbCoctelesFrutas;
    private javax.swing.JLabel lbEntradas;
    protected javax.swing.JLabel lbFrijoles;
    protected javax.swing.JLabel lbGelatina;
    protected javax.swing.JLabel lbJMango;
    protected javax.swing.JLabel lbJManzana;
    protected javax.swing.JLabel lbJMora;
    protected javax.swing.JLabel lbLentejas;
    protected javax.swing.JLabel lbPapasFritas;
    protected javax.swing.JLabel lbPastelesQueso;
    protected javax.swing.JLabel lbPepsi;
    protected javax.swing.JLabel lbPoker;
    private javax.swing.JLabel lbPostres;
    private javax.swing.JLabel lbPrincipales;
    protected javax.swing.JLabel lbPudin;
    protected javax.swing.JLabel lbRollitosCanela;
    protected javax.swing.JLabel lbSalmon;
    protected javax.swing.JLabel lbSevenUp;
    private javax.swing.JLabel lbTitulo;
    protected javax.swing.JLabel lbTropiCola;
    protected javax.swing.JLabel lbVBlanco;
    protected javax.swing.JLabel lbVUva;
    private javax.swing.JTextField txtAguila;
    private javax.swing.JTextField txtAntipasto;
    private javax.swing.JTextField txtArrozLeche;
    private javax.swing.JTextField txtCanadaDry;
    private javax.swing.JTextField txtChurrasco;
    private javax.swing.JTextField txtClubColombia;
    private javax.swing.JTextField txtCoctelesFrutas;
    private javax.swing.JTextField txtFrijoles;
    private javax.swing.JTextField txtGelatina;
    private javax.swing.JTextField txtJMango;
    private javax.swing.JTextField txtJManzana;
    private javax.swing.JTextField txtJMora;
    private javax.swing.JTextField txtLentejas;
    private javax.swing.JTextField txtPapasFritas;
    private javax.swing.JTextField txtPastelesQueso;
    private javax.swing.JTextField txtPepsi;
    private javax.swing.JTextField txtPoker;
    private javax.swing.JTextField txtPudin;
    private javax.swing.JTextField txtRollitosCanela;
    private javax.swing.JTextField txtSalmon;
    private javax.swing.JTextField txtSevenUp;
    private javax.swing.JTextField txtTropiCola;
    private javax.swing.JTextField txtVBlanco;
    private javax.swing.JTextField txtVUva;
    // End of variables declaration//GEN-END:variables
}
