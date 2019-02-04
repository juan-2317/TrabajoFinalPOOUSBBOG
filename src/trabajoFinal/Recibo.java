package trabajoFinal;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Recibo extends javax.swing.JFrame {

    public Recibo(String correo, String cliente, int total, int efectivo, int cambio,
            List<Object[]> datosTabla, String fecha, String hora) {
        initComponents();

        Object[][] datos = new Object[datosTabla.size()][4];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = datosTabla.get(i);
        }
        
        String[] cabecera = {"Producto", "Cantidad", "Precio Invidual", "Subtotal"};

        DefaultTableModel dtm = new DefaultTableModel(datos, cabecera) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tbRecibo.setModel(dtm);

        txtCorreo.setText(correo);
        txtCliente.setText(cliente);
        txtTotal.setText(Integer.toString(total));
        txtEfectivo.setText(Integer.toString(efectivo));
        txtCambio.setText(Integer.toString(cambio));

        txtFecha.setText(fecha);
        txtHora.setText(hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNombreCliente = new javax.swing.JLabel();
        lbCorreoCliente = new javax.swing.JLabel();
        lbEfectivo = new javax.swing.JLabel();
        lbCambio = new javax.swing.JLabel();
        lbGracias = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        lbRango1 = new javax.swing.JLabel();
        lbHoras2 = new javax.swing.JLabel();
        lbRango2 = new javax.swing.JLabel();
        lbHoras1 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        tbRecibo = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        txtEfectivo = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Factura de Compra");
        setResizable(false);

        lbNombreCliente.setText("Nombre del Cliente:");

        lbCorreoCliente.setText("Correo:");

        lbEfectivo.setText("Efectivo:");

        lbCambio.setText("Su Cambio:");

        lbGracias.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbGracias.setText("¡GRACIAS POR SU COMPRA!");

        lbTotal.setText("Total:");

        lbHorario.setText("HORARIO DE ATENCIÓN");

        lbRango1.setText("Lunes a Sabados:");

        lbHoras2.setText("9:00 am - 10:00 pm ");

        lbRango2.setText("Domingos y Festivos:");

        lbHoras1.setText("10:00 am - 8:00 pm");

        tbRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto:", "Cantidad", "Precio Individual", "SubTotal:"
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
        scroll.setViewportView(tbRecibo);

        txtTotal.setEditable(false);

        txtEfectivo.setEditable(false);

        txtCambio.setEditable(false);

        txtCorreo.setEditable(false);

        txtCliente.setEditable(false);

        lbFecha.setText("Fecha:");

        txtFecha.setEditable(false);

        txtHora.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRango1)
                            .addComponent(lbRango2))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHoras2)
                            .addComponent(lbHoras1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFecha)
                                .addGap(18, 18, 18)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(txtHora))
                            .addComponent(lbGracias)
                            .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTotal)
                                    .addComponent(lbEfectivo)
                                    .addComponent(lbCambio))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbHorario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(txtEfectivo)
                                            .addComponent(txtTotal))
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNombreCliente)
                                            .addComponent(lbCorreoCliente))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 119, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEfectivo)
                        .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCorreoCliente)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCambio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNombreCliente)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lbHorario)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRango1)
                    .addComponent(lbHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRango2)
                    .addComponent(lbHoras2))
                .addGap(42, 42, 42)
                .addComponent(lbGracias)
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleParent(scroll);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbCambio;
    private javax.swing.JLabel lbCorreoCliente;
    private javax.swing.JLabel lbEfectivo;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbGracias;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbHoras1;
    private javax.swing.JLabel lbHoras2;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbRango1;
    private javax.swing.JLabel lbRango2;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tbRecibo;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEfectivo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
