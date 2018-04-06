package proyectobd1;

import java.sql.*;

/**
 *
 * @author Josué Zelaya
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_nombre_cliente = new javax.swing.JTextField();
        tf_fecha_factura = new javax.swing.JTextField();
        tf_RTN = new javax.swing.JTextField();
        tf_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_productos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tf_codigo_producto = new javax.swing.JTextField();
        boton_buscar_producto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tf_numerodefactura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_efectivo_recibido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_devolver = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_isv = new javax.swing.JTextField();
        tf_total_pagar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sp_cantidad_producto = new javax.swing.JSpinner();
        boton_imprimir = new javax.swing.JButton();
        boton_nuevafactura = new javax.swing.JButton();
        rb_credito = new javax.swing.JRadioButton();
        rb_contado = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("TECNOCOP");

        jLabel2.setText("Nombre del Cliente:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("R.T.N:");

        jLabel5.setText("Fecha");

        jLabel6.setText("Forma de Pago:");

        tabla_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_productos);

        jLabel7.setText("Ingrese el Código del Producto");

        boton_buscar_producto.setText("Buscar");
        boton_buscar_producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_buscar_productoMouseClicked(evt);
            }
        });
        boton_buscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscar_productoActionPerformed(evt);
            }
        });

        jLabel8.setText("No. de Factura");

        jLabel9.setText("Efectivo Recibido:");

        jLabel10.setText("Devolver:");

        jLabel11.setText("Total a Pagar:");

        jLabel12.setText("I.S.V:");

        jLabel13.setText("Cantidad:");

        boton_imprimir.setText("Imprimir");

        boton_nuevafactura.setText("Nueva Factura");
        boton_nuevafactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevafacturaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_credito);
        rb_credito.setText("Crédito");

        buttonGroup1.add(rb_contado);
        rb_contado.setText("Contado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf_numerodefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_fecha_factura, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                    .addComponent(tf_direccion)
                                    .addComponent(tf_RTN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(rb_credito)
                                    .addComponent(rb_contado))
                                .addGap(27, 27, 27))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(boton_buscar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(sp_cantidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(boton_nuevafactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(boton_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_efectivo_recibido)
                                    .addComponent(tf_devolver, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_isv, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(tf_total_pagar))))
                .addGap(0, 78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tf_RTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_numerodefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_credito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_contado)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_codigo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscar_producto)
                    .addComponent(jLabel13)
                    .addComponent(sp_cantidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_efectivo_recibido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tf_isv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_nuevafactura)
                    .addComponent(boton_imprimir))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_buscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscar_productoActionPerformed
        try {
            String nombre, fecha, direccion, numero_factura, forma_pago;
            int rtn;
            int codigo_producto;
            nombre = tf_nombre_cliente.getText();
            fecha = tf_fecha_factura.getText();
            rtn = Integer.parseInt(tf_RTN.getText());
            direccion = tf_direccion.getText();
            numero_factura = (tf_numerodefactura.getText());
            codigo_producto = Integer.parseInt(tf_codigo_producto.getText());
            if (rb_contado.isSelected()) {
                forma_pago = "Contado";
                //System.out.println("cont");
            } else if (rb_credito.isSelected()) {
                //System.out.println("cred");
                forma_pago = "Crédito";
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
        }

        buscar(tf_codigo_producto.getText());
        eliminar();
    }//GEN-LAST:event_boton_buscar_productoActionPerformed

    private void boton_nuevafacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevafacturaActionPerformed
        eliminar();
    }//GEN-LAST:event_boton_nuevafacturaActionPerformed

    private void boton_buscar_productoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscar_productoMouseClicked

    }//GEN-LAST:event_boton_buscar_productoMouseClicked
    public void buscar(String palabra) {

        if (palabra.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un dato");
        }
        ResultSet res;
        Statement pstm;
        Connection con = new Conexion().conectar();
        String sentencia = "SELECT id_producto FROM Productos WHERE id_producto = '" + palabra + "'";
        try {
            pstm = con.createStatement();
            res = pstm.executeQuery(sentencia);
            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Expediente encontrado: " + palabra, "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                Statement st = con.createStatement();
                String mysql = "SELECT * FROM Productos WHERE id_producto = '" + palabra + "'";
                ResultSet rs = st.executeQuery(mysql);
                String Titulo[] = {"Codigo", "Descripcion", "Cantidad", "Precio"};
                DefaultTableModel modelo = new DefaultTableModel(null, Titulo);

                int i;
                Object[] fila = new Object[4];
                while (rs.next()) {
                    // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                    for (i = 0; i < 4; i++) {
                        fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                        //aquí lo mando a imprimir por consola y si sale
                        //System.out.println(fila[i]);
                    }
                    // Se añade al modelo la fila completa.
                    fila[2] = sp_cantidad_producto.getValue();
                    modelo.addRow(fila);
                }
                tabla_productos.setModel(modelo);
                /*int fila1 = tabla_productos.getRowCount();
                int i1;
                int valores = 0;
                for (i1 = 0; i1 < fila1; i1++) {
                    int valor = (int) tabla_productos.getValueAt(i1, 3);
                    valores += valor;
                    // Con esta condición solo ponemos comas hasta el penúltimo valor :)
                   /*if (i1 < (fila1 - 1)) {
                     valores += ", ";
                     }
                }
                String valor1 = "";
                valor1 = String.valueOf(valores);

                valor1 = Integer.toString(valores);
                tf_total_pagar.setText(valor1)*/; 
            } else {
                JOptionPane.showMessageDialog(null, "NO existe el expediente: " + palabra, "Error de expediente", JOptionPane.ERROR_MESSAGE);
            }

            res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void eliminar() {
        tf_nombre_cliente.setText("");
        tf_fecha_factura.setText("");
        tf_RTN.setText("");
        tf_direccion.setText("");
        tf_numerodefactura.setText("");
        tf_codigo_producto.setText("");
        tabla_productos = null;
        rb_credito.setSelected(false);
        rb_contado.setSelected(false);
        sp_cantidad_producto.setValue(0);
        tf_efectivo_recibido.setText("");
        tf_devolver.setText("");
        tf_isv.setText("");
        tf_total_pagar.setText("");
        sp_cantidad_producto.setValue(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                Connection cn = new Conexion().conectar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar_producto;
    private javax.swing.JButton boton_imprimir;
    private javax.swing.JButton boton_nuevafactura;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_contado;
    private javax.swing.JRadioButton rb_credito;
    private javax.swing.JSpinner sp_cantidad_producto;
    private javax.swing.JTable tabla_productos;
    private javax.swing.JTextField tf_RTN;
    private javax.swing.JTextField tf_codigo_producto;
    private javax.swing.JTextField tf_devolver;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_efectivo_recibido;
    private javax.swing.JTextField tf_fecha_factura;
    private javax.swing.JTextField tf_isv;
    private javax.swing.JTextField tf_nombre_cliente;
    private javax.swing.JTextField tf_numerodefactura;
    private javax.swing.JTextField tf_total_pagar;
    // End of variables declaration//GEN-END:variables
    ArrayList producto = new ArrayList();
}
