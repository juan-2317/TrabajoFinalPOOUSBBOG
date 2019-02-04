package trabajoFinal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import utilidades.ManejadorFoco;

public class Menu extends javax.swing.JFrame {

    // Cantidad disponible
    private int cantPant, cantCami, cantMed, cantZap, cantSomb;
    // Precios de los artículos
    private int precioP, precioC, precioM, precioZ, precioS;
    // Total de cada compra
    private int totalP, totalC, totalM, totalZ, totalS;
    // Cantidad a comprar
    private int cantPantC, cantCamiC, cantMedC, cantZapC, cantSombC;
    // Variables para el reporte
    private int cantPantR, cantCamiR, cantMedR, cantZapR, cantSombR, totalPR,
            totalCR, totalMR, totalZR, totalSR, inversion, totalR, gananciaT;

    public Menu() {
        cantPant = 23;
        cantCami = 45;
        cantMed = 30;
        cantZap = 50;
        cantSomb = 60;

        precioP = 50000;
        precioC = 30000;
        precioM = 10000;
        precioZ = 45000;
        precioS = 25000;

        totalP = totalC = totalM = totalZ = totalS = 0;

        cantPantC = cantCamiC = cantMedC = cantZapC = cantSombC = 0;

        cantPantR = cantCamiR = cantMedR = cantZapR = cantSombR = 0;

        totalPR = totalCR = totalMR = totalZR = totalSR = 0;

        inversion = totalR = 0;

        initComponents();

        String[] cabecera = {"Código", "Nombre", "Cantidad", "Precio"};
        Object[][] datos = {
            {1, "Pantalones", cantPant, precioP},
            {2, "Camisas", cantCami, precioC},
            {3, "Medias", cantMed, precioM},
            {4, "Zapatos", cantZap, precioZ},
            {5, "Sombreros", cantSomb, precioS}};
        DefaultTableModel dtm = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tbExistenciasPrecios.setModel(dtm);
        // Sólo se permite seleccionar una fila a la vez
        tbExistenciasPrecios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        cbDia.setSelectedItem(getDiaActual());
        cbMes.setSelectedItem(getMesActual());
        int anio = Integer.parseInt(getAnioActual());

        for (int i = anio; i >= 1996; i--) {
            cbAnio.addItem(Integer.toString(i));
        }
        cbAnio.setSelectedItem(anio);

        // Establecer el orden que tendrán los elementos cuando se cambie el foco
        //  presionando la tecla TAB
        setFocusTraversalPolicy(new ManejadorFoco(txtCodigo, txtNombre, txtCantidad, txtCorreo,
                btnAgregarCarrito, btnEliminarCarrito, btnVerCarrito, txtEfectivo, btnConfirmarCompra,
                txtPrecio, txtCantidadT, btnModificarDatos, tbExistenciasPrecios, cbDia, cbMes,
                cbAnio, txtInversiones, btnGenerarReporte, btnLimpiarTodo, btnSalir));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbVender = new javax.swing.JLabel();
        lbCodProd = new javax.swing.JLabel();
        lbEfectivo = new javax.swing.JLabel();
        lbCambio = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        lbReporte = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        lbDia = new javax.swing.JLabel();
        cbDia = new javax.swing.JComboBox<>();
        lbMes = new javax.swing.JLabel();
        cbMes = new javax.swing.JComboBox<>();
        lbAnio = new javax.swing.JLabel();
        cbAnio = new javax.swing.JComboBox<>();
        lbInversiones = new javax.swing.JLabel();
        txtInversiones = new javax.swing.JTextField();
        btnGenerarReporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnEliminarCarrito = new javax.swing.JButton();
        btnConfirmarCompra = new javax.swing.JButton();
        lbNombreCliente = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lbCorreoCliente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        btnAgregarCarrito = new javax.swing.JButton();
        btnLimpiarTodo = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        lbSubtitulo = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tbExistenciasPrecios = new javax.swing.JTable();
        btnVerCarrito = new javax.swing.JButton();
        lbPrecio = new javax.swing.JLabel();
        lbCantidadDisponible = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCantidadT = new javax.swing.JTextField();
        btnModificarDatos = new javax.swing.JButton();
        separadorVertical = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ADMINISTRADOR");
        setResizable(false);

        lbVender.setText("VENDER:");

        lbCodProd.setText("Código del Producto:");

        lbEfectivo.setText("Efectivo:");

        lbCambio.setText("Cambio:");

        lbReporte.setText("GENERAR REPORTE:");

        lbDia.setText("Día:");

        cbDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbDia.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbDiaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lbMes.setText("Mes:");

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cbMes.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbMesPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lbAnio.setText("Año:");

        cbAnio.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbAnioPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lbInversiones.setText("Ingrese las Inversiones:");

        txtInversiones.setText("0");

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
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

        btnEliminarCarrito.setText("Eliminar del Carrito");
        btnEliminarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCarritoActionPerformed(evt);
            }
        });

        btnConfirmarCompra.setText("Confirmar Compra");
        btnConfirmarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarCompraActionPerformed(evt);
            }
        });

        lbNombreCliente.setText("Nombre del Cliente:");

        lbCorreoCliente.setText("Correo:");

        lbTotal.setText("Total:");

        btnAgregarCarrito.setText("Agregar al Carrito");
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });

        btnLimpiarTodo.setText("Limpiar Todo");
        btnLimpiarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTodoActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setText("0");

        txtCambio.setEditable(false);

        lbSubtitulo.setText("LISTA DE PRECIOS Y CANTIDAD DISPONIBLE:");

        tbExistenciasPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        tbExistenciasPrecios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbExistenciasPreciosMouseClicked(evt);
            }
        });
        scroll.setViewportView(tbExistenciasPrecios);

        btnVerCarrito.setText("Ver Carrito");
        btnVerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarritoActionPerformed(evt);
            }
        });

        lbPrecio.setText("Precio:");

        lbCantidadDisponible.setText("Cantidad:");

        btnModificarDatos.setText("Modificar Cantidad o Precio");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        separadorVertical.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbReporte)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDia)
                                .addGap(18, 18, 18)
                                .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbInversiones)
                                .addGap(18, 18, 18)
                                .addComponent(txtInversiones, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lbMes)
                                .addGap(18, 18, 18)
                                .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerarReporte)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarTodo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAnio)
                                .addGap(18, 18, 18)
                                .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSalir))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lbVender))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregarCarrito)
                                .addGap(10, 10, 10)
                                .addComponent(btnEliminarCarrito))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTotal)
                                    .addComponent(lbEfectivo)
                                    .addComponent(lbCambio))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCodProd)
                                    .addComponent(lbCantidad))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombreCliente)
                                    .addComponent(lbCorreoCliente))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVerCarrito)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(btnConfirmarCompra))
                .addGap(21, 21, 21)
                .addComponent(separadorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSubtitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbPrecio)
                        .addGap(61, 61, 61)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCantidadDisponible)
                        .addGap(47, 47, 47)
                        .addComponent(txtCantidadT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificarDatos)
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lbNombreCliente)
                        .addGap(17, 17, 17)
                        .addComponent(lbCorreoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbSubtitulo)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbPrecio))
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lbCantidadDisponible))
                            .addComponent(txtCantidadT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(btnModificarDatos)
                        .addGap(45, 45, 45)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbVender)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCodProd)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCantidad))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCarrito)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminarCarrito)
                                .addComponent(btnVerCarrito)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTotal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbEfectivo)
                            .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCambio))
                        .addGap(80, 80, 80)
                        .addComponent(btnConfirmarCompra))
                    .addComponent(separadorVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbReporte)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDia)
                    .addComponent(cbDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMes)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnio)
                    .addComponent(cbAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbInversiones)
                    .addComponent(txtInversiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarReporte)
                    .addComponent(btnLimpiarTodo)
                    .addComponent(btnSalir))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarCompraActionPerformed
        try {
            int opcion = JOptionPane.showConfirmDialog(this, "¿Confirma la Compra?",
                    "Confirmar Compra", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                int total, cambio, opcion2, efectivo;

                total = Integer.parseInt(txtTotal.getText());
                if (total == 0) {
                    throw new ArithmeticException("Carrito vacio. Por favor intentelo de nuevo");
                }

                efectivo = Integer.parseInt(txtEfectivo.getText());
                if (efectivo == 0) {
                    throw new ArithmeticException("No ha Ingresado efectivo al sistema");
                }
                if (efectivo < total) {
                    throw new ArithmeticException("Faltan " + (total - efectivo)
                            + " por favor intente de nuevo");
                }

                if (txtCorreo.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty()) {
                    throw new NullPointerException("Debe ingresar un nombre y un correo");
                }

                if (!Pattern.matches("^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@"
                        + "[a-z]+(\\.[a-z]{2,4})*(\\.[a-z]{2,4})$", txtCorreo.getText().trim())) {
                    throw new NullPointerException("Debe ingresar un correo válido");
                }

                cantPant -= cantPantC;
                if (cantPant < 8 && cantPantC > 0) {
                    mensajeFaltan("pantalones");
                }
                tbExistenciasPrecios.setValueAt(cantPant, 0, 2);

                cantCami -= cantCamiC;
                if (cantCami < 8 && cantCamiC > 0) {
                    mensajeFaltan("camisas");
                }
                tbExistenciasPrecios.setValueAt(cantCami, 1, 2);

                cantMed -= cantMedC;
                if (cantMed < 8 && cantMedC > 0) {
                    mensajeFaltan("medias");
                }
                tbExistenciasPrecios.setValueAt(cantMed, 2, 2);

                cantZap -= cantZapC;
                if (cantZap < 8 && cantZapC > 0) {
                    mensajeFaltan("zapatos");
                }
                tbExistenciasPrecios.setValueAt(cantZap, 3, 2);

                cantSomb -= cantSombC;
                if (cantSomb < 8 && cantSombC > 0) {
                    mensajeFaltan("sombreros");
                }
                tbExistenciasPrecios.setValueAt(cantSomb, 4, 2);

                cambio = efectivo - total;
                txtCambio.setText(Integer.toString(cambio));
                updateReporte();

                opcion2 = JOptionPane.showConfirmDialog(this,
                        "¿Desea Imprimir Factura de Compra?", "Imprimir Factura",
                        JOptionPane.YES_OPTION);
                if (opcion2 == 0) {
                    imprimirRecibo(total, efectivo, cambio);
                }
                limpiarTodo();
            }
        } catch (ArithmeticException | NullPointerException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarCompraActionPerformed

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        try {
            int cantidadSeleccionada, codigo, temp;
            cantidadSeleccionada = Integer.parseInt(txtCantidad.getText());

            if (cantidadSeleccionada < 1) {
                throw new ArithmeticException("Cantidad Incorrecta");
            }

            codigo = Integer.parseInt(txtCodigo.getText());

            switch (codigo) {
                case 1: // Código 1: Pantalones
                    temp = cantPantC + cantidadSeleccionada;
                    if (temp > cantPant) {
                        excepcionExcedida();
                    }

                    cantPantC = temp;
                    totalP = precioP * cantPantC;
                    break;
                case 2: // Código 2: Camisas
                    temp = cantCamiC + cantidadSeleccionada;
                    if (temp > cantCami) {
                        excepcionExcedida();
                    }

                    cantCamiC = temp;
                    totalC = precioC * cantCamiC;
                    break;
                case 3: // Código 3: Medias
                    temp = cantMedC + cantidadSeleccionada;
                    if (temp > cantMed) {
                        excepcionExcedida();
                    }

                    cantMedC = temp;
                    totalM = precioM * cantMedC;
                    break;
                case 4: // Código 4: Zapatos
                    temp = cantZapC + cantidadSeleccionada;
                    if (temp > cantZap) {
                        excepcionExcedida();
                    }

                    cantZapC = temp;
                    totalZ = precioZ * cantZapC;
                    break;
                case 5: // Código 5: Sombreros
                    temp = cantSombC + cantidadSeleccionada;
                    if (temp > cantSomb) {
                        excepcionExcedida();
                    }

                    cantSombC = temp;
                    totalS = precioS * cantSombC;
                    break;
                default:
                    txtCodigo.setText("");
                    throw new ArithmeticException("No existe el código del producto seleccionado");
            }
            txtTotal.setText(Integer.toString(totalP + totalC + totalM + totalZ + totalS));
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(this, a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed

    private void btnLimpiarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTodoActionPerformed
        limpiarTodo();
    }//GEN-LAST:event_btnLimpiarTodoActionPerformed

    private void btnEliminarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCarritoActionPerformed
        try {
            int codigo, cantidadSeleccionada, temp;

            codigo = Integer.parseInt(txtCodigo.getText());
            cantidadSeleccionada = Integer.parseInt(txtCantidad.getText());

            switch (codigo) {
                case 1: // Código 1: Pantalones
                    temp = cantPantC - cantidadSeleccionada;
                    if (temp < 0) {
                        cantidadAEliminar();
                    }

                    cantPantC = temp;
                    totalP = precioP * cantPantC;
                    break;
                case 2: // Código 2: Camisas
                    temp = cantCamiC - cantidadSeleccionada;
                    if (temp < 0) {
                        cantidadAEliminar();
                    }

                    cantCamiC = temp;
                    totalC = precioC * cantCamiC;
                    break;
                case 3: // Código 3: Medias
                    temp = cantMedC - cantidadSeleccionada;
                    if (temp < 0) {
                        cantidadAEliminar();
                    }

                    cantMedC = temp;
                    totalM = precioM * cantMedC;
                    break;
                case 4: // Código 4: Zapatos
                    temp = cantZapC - cantidadSeleccionada;
                    if (temp < 0) {
                        cantidadAEliminar();
                    }

                    cantZapC = temp;
                    totalZ = precioZ * cantZapC;
                    break;
                case 5: // Código 5: Sombreros
                    temp = cantSombC - cantidadSeleccionada;
                    if (temp < 0) {
                        cantidadAEliminar();
                    }

                    cantSombC = temp;
                    totalS = precioS * cantSombC;
                    break;
                default:
                    txtCodigo.setText("");
                    throw new ArithmeticException("No existe el código del producto seleccionado");
            }
            txtTotal.setText(Integer.toString(totalP + totalC + totalM + totalZ + totalS));
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(this, a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarCarritoActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        try {
            int filaSeleccionada, precio, cantidad;
            filaSeleccionada = tbExistenciasPrecios.getSelectedRow();

            if (filaSeleccionada == -1) {
                throw new ArrayIndexOutOfBoundsException("No ha seleccionado ninguna fila");
            }
            if (!carritoVacio()) {
                throw new ArithmeticException(
                        "No se puede Modificar el precio porque hay artículos en el carrito");
            }

            precio = Integer.parseInt(txtPrecio.getText());
            cantidad = Integer.parseInt(txtCantidadT.getText());
            if (precio < 0 || cantidad < 0) {
                throw new ArithmeticException("Cantidad no valida");
            }

            switch (filaSeleccionada) {
                case 0: // Fila 0: Pantalones
                    precioP = precio;
                    cantPant = cantidad;
                    tbExistenciasPrecios.setValueAt(cantPant, filaSeleccionada, 2);
                    tbExistenciasPrecios.setValueAt(precioP, filaSeleccionada, 3);
                    break;
                case 1: // Fila 1: Camisas
                    precioC = precio;
                    cantCami = cantidad;
                    tbExistenciasPrecios.setValueAt(cantCami, filaSeleccionada, 2);
                    tbExistenciasPrecios.setValueAt(precioC, filaSeleccionada, 3);
                    break;
                case 2: // Fila 2: Medias
                    precioM = precio;
                    cantMed = cantidad;
                    tbExistenciasPrecios.setValueAt(cantMed, filaSeleccionada, 2);
                    tbExistenciasPrecios.setValueAt(precioM, filaSeleccionada, 3);
                    break;
                case 3: // Fila 3: Zapatos
                    precioZ = precio;
                    cantZap = cantidad;
                    tbExistenciasPrecios.setValueAt(cantZap, filaSeleccionada, 2);
                    tbExistenciasPrecios.setValueAt(precioZ, filaSeleccionada, 3);
                    break;
                case 4: // Fila 4: Sombreros
                    precioS = precio;
                    cantSomb = cantidad;
                    tbExistenciasPrecios.setValueAt(cantSomb, filaSeleccionada, 2);
                    tbExistenciasPrecios.setValueAt(precioS, filaSeleccionada, 3);
                    break;
            }
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(this, "Debe digitar valores enteros unicamente ",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        try {
            String dia, mes, anio, fecha;

            inversion = Integer.parseInt(txtInversiones.getText());
            if (inversion == 0) {
                throw new ArithmeticException("No hay inversiones");
            }

            dia = (String) cbDia.getSelectedItem();
            mes = (String) cbMes.getSelectedItem();
            anio = (String) cbAnio.getSelectedItem();
            if (!fechaCorrecta(Integer.parseInt(dia), Integer.parseInt(mes),
                    Integer.parseInt(anio))) {
                throw new ArithmeticException("¡Fecha incorrecta!");
            }

            fecha = dia + "/" + mes + "/" + anio;

            totalR = totalPR + totalCR + totalMR + totalZR + totalSR;
            gananciaT = totalR - inversion;

            Object[][] datosTabla = {
                new Object[]{"Pantalones", cantPantR, cantPant, totalPR, totalPR * 0.7},
                new Object[]{"Camisas", cantCamiR, cantCami, totalCR, totalCR * 0.7},
                new Object[]{"Medias", cantMedR, cantMed, totalMR, totalMR * 0.7},
                new Object[]{"Zapatos", cantZapR, cantZap, totalZR, totalZR * 0.7},
                new Object[]{"Sombreros", cantSombR, cantSomb, totalSR, totalSR * 0.7}
            };

            Reporte r = new Reporte(fecha, gananciaT, datosTabla, totalR);

            r.setLocationRelativeTo(null);
            r.setVisible(true);
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(this, a.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException i) {
            JOptionPane.showMessageDialog(this, "Revise la información ingresada en los campos de texto",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarritoActionPerformed
        Object[][] datosTabla = {
            new Object[]{"Pantalones", cantPantC, precioP, totalP},
            new Object[]{"Camisas", cantCamiC, precioC, totalC},
            new Object[]{"Medias", cantMedC, precioM, totalM},
            new Object[]{"Zapatos", cantZapC, precioZ, totalZ},
            new Object[]{"Sombreros", cantSombC, precioS, totalS}
        };

        CarritoCompra cc = new CarritoCompra(datosTabla);

        cc.setLocationRelativeTo(null);
        cc.setVisible(true);
    }//GEN-LAST:event_btnVerCarritoActionPerformed

    private void cbDiaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbDiaPopupMenuWillBecomeInvisible
        mensajeFecha();
    }//GEN-LAST:event_cbDiaPopupMenuWillBecomeInvisible

    private void cbMesPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbMesPopupMenuWillBecomeInvisible
        mensajeFecha();
    }//GEN-LAST:event_cbMesPopupMenuWillBecomeInvisible

    private void cbAnioPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAnioPopupMenuWillBecomeInvisible
        mensajeFecha();
    }//GEN-LAST:event_cbAnioPopupMenuWillBecomeInvisible

    private void tbExistenciasPreciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbExistenciasPreciosMouseClicked
        int filaPulsada = tbExistenciasPrecios.getSelectedRow();
        txtCantidadT.setText(Integer.toString((int) tbExistenciasPrecios.getValueAt(filaPulsada, 2)));
        txtPrecio.setText(Integer.toString((int) tbExistenciasPrecios.getValueAt(filaPulsada, 3)));
    }//GEN-LAST:event_tbExistenciasPreciosMouseClicked

    private void mensajeFecha() {
        int dia = Integer.parseInt((String) cbDia.getSelectedItem());
        int mes = Integer.parseInt((String) cbMes.getSelectedItem());
        int anio = Integer.parseInt((String) cbAnio.getSelectedItem());

        if (!fechaCorrecta(dia, mes, anio)) {
            JOptionPane.showMessageDialog(this, "Fecha no válida", "Advertencia",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    private void updateReporte() {
        // Método para actualizar el reporte
        cantPantR += cantPantC;
        cantCamiR += cantCamiC;
        cantMedR += cantMedC;
        cantZapR += cantZapC;
        cantSombR += cantSombC;

        totalPR += totalP;
        totalCR += totalC;
        totalMR += totalM;
        totalZR += totalZ;
        totalSR += totalS;
    }

    public final String getDiaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd");
        return formatofecha.format(fecha);
    }

    public final String getMesActual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("MM");
        return formatofecha.format(fecha);
    }

    public final String getAnioActual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("YYYY");
        return formatofecha.format(fecha);
    }

    public String getHoraActual() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        String ampm;
        int hora, minutos;

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "a.m." : "p.m.";

        hora = calendario.get(Calendar.HOUR);
        if (hora == 0) {
            hora = 12;
        }
        minutos = calendario.get(Calendar.MINUTE);

        return String.format("%02d:%02d %s", hora, minutos, ampm);
    }

    public boolean esAnioBisiesto(int anio) {
        return anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0;
    }

    public boolean fechaCorrecta(int dia, int mes, int anio) {
        boolean x;

        if (anio < 0) {
            x = false;
        } else if (mes < 1 || mes > 12) {
            x = false;
        } else if (dia < 1 || dia > 31) {
            x = false;
        } else if (mes == 2) {
            if (esAnioBisiesto(anio)) {
                x = !(dia == 30 || dia == 31);
            } else {
                x = !(dia == 29 || dia == 30 || dia == 31);
            }
        } else {
            x = !((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31);
        }
        return x;
    }

    private void limpiarTodo() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("0");
        txtCorreo.setText("");
        txtTotal.setText("0");
        txtEfectivo.setText("");
        txtCambio.setText("");
        txtInversiones.setText("0");

        totalP = totalC = totalM = totalZ = totalS = 0;

        cantPantC = cantCamiC = cantMedC = cantZapC = cantSombC = 0;
    }

    private void imprimirRecibo(int total, int efectivo, int cambio) {
        String correo, cliente, fecha, hora;

        correo = txtCorreo.getText();
        cliente = txtNombre.getText();

        LinkedList<Object[]> datosTabla = new LinkedList<>();
        if (cantPantC > 0 && totalP > 0) {
            datosTabla.add(new Object[]{"Pantalones", cantPantC, precioP, totalP});
        }

        if (cantCamiC > 0 && totalC > 0) {
            datosTabla.add(new Object[]{"Camisas", cantCamiC, precioC, totalC});
        }

        if (cantMedC > 0 && totalM > 0) {
            datosTabla.add(new Object[]{"Medias", cantMedC, precioM, totalM});
        }

        if (cantZapC > 0 && totalZ > 0) {
            datosTabla.add(new Object[]{"Zapatos", cantZapC, precioZ, totalZ});
        }

        if (cantSombC > 0 && totalS > 0) {
            datosTabla.add(new Object[]{"Sombreros", cantSombC, precioS, totalS});
        }

        fecha = getDiaActual() + "/" + getMesActual() + "/" + getAnioActual();
        hora = getHoraActual();

        Recibo r = new Recibo(correo, cliente, total, efectivo, cambio, datosTabla, fecha, hora);
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }

    private boolean carritoVacio() {
        boolean x = cantPantC == 0 && totalP == 0 && cantCamiC == 0 && totalC == 0
                && cantMedC == 0 && totalM == 0 && cantZapC == 0 && cantZapC == 0
                && totalZ == 0 && cantSombC == 0 && totalS == 0;
        return x;
    }

    private void mensajeFaltan(String articulo) {
        JOptionPane.showMessageDialog(this, "AVISO: Quedan menos de 8 " + articulo,
                "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    private void excepcionExcedida() throws ArithmeticException {
        throw new ArithmeticException(
                "Es mayor la cantidad añadida al carrito a la existente");
    }

    private void cantidadAEliminar() throws ArithmeticException {
        throw new ArithmeticException(
                "La cantidad a eliminar no puede ser mayor a la existente "
                + "en el carrito");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JButton btnConfirmarCompra;
    private javax.swing.JButton btnEliminarCarrito;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnLimpiarTodo;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerCarrito;
    private javax.swing.JComboBox<String> cbAnio;
    private javax.swing.JComboBox<String> cbDia;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JLabel lbAnio;
    private javax.swing.JLabel lbCambio;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbCantidadDisponible;
    private javax.swing.JLabel lbCodProd;
    private javax.swing.JLabel lbCorreoCliente;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbEfectivo;
    private javax.swing.JLabel lbInversiones;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbReporte;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbVender;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separadorVertical;
    private javax.swing.JTable tbExistenciasPrecios;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadT;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtInversiones;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
