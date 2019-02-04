package trabajoFinal;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Reporte extends javax.swing.JFrame {

    public Reporte(String fecha, int ganancias, Object[][] datosTabla, int dineroObtenido) {
        initComponents();

        String[] cabecera = {
            "Producto", "Cantidad Vendida", "Cantidad Restante",
            "Ingresos Obtenidos por Cada Artículo", "Ganancia Obtenida"};

        txtFecha.setText(fecha);
        txtGanancias.setText(Integer.toString(ganancias));

        DefaultTableModel dtm = new DefaultTableModel(datosTabla, cabecera) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;
            }
        };
        tbReporte.setModel(dtm);

        txtDineroObtenido.setText(Integer.toString(dineroObtenido));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbReporte = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        lbGanancias = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        txtDineroObtenido = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        tbReporte = new javax.swing.JTable();
        lbDineroObt = new javax.swing.JLabel();
        txtGanancias = new javax.swing.JTextField();
        btnAyuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reporte");
        setResizable(false);

        lbReporte.setText("EL REPORTE ES:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        lbGanancias.setText("Las Ganancias Obtenidas son:");

        lbFecha.setText("Fecha:");

        txtDineroObtenido.setEditable(false);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbTitulo.setText("VENTAS Y GANANCIAS:");

        txtFecha.setEditable(false);

        tbReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad Vendida", "Cantidad Restante", "Ingresos Obtenidos por Cada Artículo", "Ganancia Obtenida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(tbReporte);

        lbDineroObt.setText("Dinero Obtenido:");

        txtGanancias.setEditable(false);

        btnAyuda.setText("Ayuda");
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAyuda)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnVolver))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbReporte)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbFecha)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDineroObt)
                                .addGap(18, 18, 18)
                                .addComponent(txtDineroObtenido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGanancias)
                                .addGap(18, 18, 18)
                                .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbReporte)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDineroObtenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDineroObt)
                    .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGanancias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnAyuda))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        JOptionPane.showMessageDialog(this, "Las ganancias totales se calculan descontando"
                + " las inversiones\ny la ganancia de cada artículo se calcula sobre el 70%",
                "Temas de Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lbDineroObt;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbGanancias;
    private javax.swing.JLabel lbReporte;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tbReporte;
    private javax.swing.JTextField txtDineroObtenido;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtGanancias;
    // End of variables declaration//GEN-END:variables
}
