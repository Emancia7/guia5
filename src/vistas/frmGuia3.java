/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.guia4.puntos;

/**
 *
 * @author Emancia7
 */
public class frmGuia3 extends javax.swing.JFrame {

    /**
     * Creates new form frmGuia3
     */
    public puntos puntuacion = new puntos();
    int puntosFinal = 0;
    String mensaje = "";

    public frmGuia3() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtPrincipal.setEditable(false);
        txtSecundaria.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNucleos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPantalla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtGarantia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkPrincipal = new javax.swing.JCheckBox();
        chkSecundaria = new javax.swing.JCheckBox();
        txtPrincipal = new javax.swing.JTextField();
        txtSecundaria = new javax.swing.JTextField();
        chkFlash = new javax.swing.JCheckBox();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDetalle = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cpu numero de nucleos");

        txtNucleos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNucleosKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNucleosKeyReleased(evt);
            }
        });

        jLabel2.setText("Tamaño de pantalla");

        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPantallaKeyReleased(evt);
            }
        });

        jLabel3.setText("Cantidad de RAM");

        txtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRamKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRamKeyReleased(evt);
            }
        });

        jLabel4.setText("Tiempo de garantia");

        txtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGarantiaKeyReleased(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
        });

        jLabel5.setText("Precio");

        cbxMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEXUS", "PIXIE", "LENOVO", "HUAWEI", "SONY", "APPLE", "SAMSUNG", "ALCATEL", "LG", "OTRA" }));

        jLabel6.setText("Marca");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Camaras"));

        chkPrincipal.setText("Principal");
        chkPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPrincipalActionPerformed(evt);
            }
        });

        chkSecundaria.setText("Secundaria");
        chkSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSecundariaActionPerformed(evt);
            }
        });

        chkFlash.setText("Flash");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPrincipal)
                    .addComponent(chkSecundaria))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrincipal)
                    .addComponent(txtSecundaria, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(chkFlash)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPrincipal)
                    .addComponent(txtPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkFlash))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkSecundaria)
                    .addComponent(txtSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        txtAreaDetalle.setColumns(20);
        txtAreaDetalle.setRows(5);
        jScrollPane1.setViewportView(txtAreaDetalle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtRam, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNucleos, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEjecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNucleosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNucleosKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume­();
        }
        String entrada;
        entrada = txtNucleos.getText();
        if (entrada.length() >= 2) {
            txtNucleos.setText("");
        }
    }//GEN-LAST:event_txtNucleosKeyTyped

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            if ((c != '.')) {
                evt.consume­();
            }
        }
        String entrada;
        entrada = txtPantalla.getText();
        if (entrada.length() >= 3) {
            txtPantalla.setText("");
        }
    }//GEN-LAST:event_txtPantallaKeyTyped

    private void txtNucleosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNucleosKeyReleased
        int num;
        if (!txtNucleos.getText().equals("")) {
            num = Integer.parseInt(txtNucleos.getText());
            if (num < 1 || num > 12) {
                txtNucleos.setText("");
            }
        }
    }//GEN-LAST:event_txtNucleosKeyReleased

    private void txtPantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyReleased
        double num;
        if (txtPantalla.getText().length() == 2 && !("" + txtPantalla.getText().charAt(1)).equals(".")) {
            txtPantalla.setText("");
        } else {
            if (!txtPantalla.getText().equals("") && txtPantalla.getText().length() != 2) {
                if (txtPantalla.getText().length() == 1 && ("" + txtPantalla.getText().charAt(0)).equals(".") || txtPantalla.getText().length() == 3 && ("" + txtPantalla.getText().charAt(2)).equals(".")) {
                    txtPantalla.setText("");
                } else {
                    num = Double.parseDouble(txtPantalla.getText());
                    if (num < 3.0 || num > 6.7) {
                        txtPantalla.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_txtPantallaKeyReleased

    private void txtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            if ((c != '.')) {
                evt.consume­();
            }
        }
        String entrada;
        entrada = txtRam.getText();
        if (entrada.length() >= 3) {
            txtRam.setText("");
        }
    }//GEN-LAST:event_txtRamKeyTyped

    private void txtRamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRamKeyReleased
        double num;
        if (txtRam.getText().length() == 2 && !("" + txtRam.getText().charAt(1)).equals(".")) {
            txtRam.setText("");
        } else {
            if (!txtRam.getText().equals("") && txtRam.getText().length() != 2) {
                if ((txtRam.getText().length() == 1 && ("" + txtRam.getText().charAt(0)).equals(".")) || (txtRam.getText().length() == 3 && ("" + txtRam.getText().charAt(2)).equals("."))) {
                    txtRam.setText("");
                } else {
                    num = Double.parseDouble(txtRam.getText());
                    if (num == 0) {
                        txtRam.setText("0");
                    } else {
                        if (num < 0.5 || num > 6.0) {
                            txtRam.setText("");
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_txtRamKeyReleased

    private void txtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume­();
        }
        String entrada;
        entrada = txtGarantia.getText();
        if (entrada.length() >= 2) {
            txtGarantia.setText("");
        }
    }//GEN-LAST:event_txtGarantiaKeyTyped

    private void txtGarantiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGarantiaKeyReleased
        int num;
        if (!txtGarantia.getText().equals("")) {
            num = Integer.parseInt(txtGarantia.getText());
            if (num < 1 || num > 24) {
                txtGarantia.setText("");
            }
        }
    }//GEN-LAST:event_txtGarantiaKeyReleased

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            if ((c != '.')) {
                evt.consume­();
            }
        }
        String entrada;
        entrada = txtPrecio.getText();
        if (entrada.length() >= 6) {
            txtPrecio.setText("");
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        //        double num;
//        if (txtPrecio.getText().length() == 4 && !("" + txtPrecio.getText().charAt(3)).equals(".")) {
//            txtPrecio.setText("");
//        } else {
//            if (!txtPrecio.getText().equals("") && txtPrecio.getText().length() != 2) {
//                if ((txtPrecio.getText().length() == 1 && ("" + txtPrecio.getText().charAt(0)).equals(".")) || (txtPrecio.getText().length() == 3 && ("" + txtPrecio.getText().charAt(2)).equals("."))) {
//                    txtPrecio.setText("");
//                } else {
//                    num = Double.parseDouble(txtPrecio.getText());
//                    if (num == 0) {
//                        txtPrecio.setText("0");
//                    } else {
//                        if (num < 0.01 || num > 999.999) {
//                            txtPrecio.setText("");
//                        }
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void chkPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPrincipalActionPerformed
        txtPrincipal.setEditable(chkPrincipal.isSelected());
    }//GEN-LAST:event_chkPrincipalActionPerformed

    private void chkSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSecundariaActionPerformed
        txtSecundaria.setEditable(chkSecundaria.isSelected());
    }//GEN-LAST:event_chkSecundariaActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        puntuacion.setNucleos(Integer.parseInt(txtNucleos.getText()));
        puntuacion.setTamanioPantalla(Double.parseDouble(txtPantalla.getText()));
        puntuacion.setRam(Double.parseDouble(txtRam.getText()));
        puntuacion.setGarantia(Integer.parseInt(txtGarantia.getText()));
        puntuacion.setPrecio(Double.parseDouble(txtPrecio.getText()));
        puntuacion.setMarca(""+cbxMarca.getSelectedItem());
        if (chkPrincipal.isSelected()) {
            puntuacion.setPixelesFrontal(Double.parseDouble(txtPrincipal.getText()));
        }
        if (chkSecundaria.isSelected()) {
            puntuacion.setPixelesFrontal(Double.parseDouble(txtSecundaria.getText()));
        }
        puntosFinal = puntuacion.mostrar();
        mensaje = mensaje +"El numero de cpu es: "+txtNucleos.getText()+"\t";
        mensaje = mensaje +"El tamaño de pantalla es: "+txtPantalla.getText()+"\n";
        mensaje = mensaje +"La memoria ram es de: "+txtRam.getText()+"\t";
        mensaje = mensaje +"La garantia es de: "+txtGarantia.getText()+"\n";
        mensaje = mensaje +"Su precio es de: "+txtPrecio.getText()+"\t";
        
        txtAreaDetalle.setText(mensaje);
        puntosFinal=0;
        mensaje="";
    }//GEN-LAST:event_btnEjecutarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGuia3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGuia3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JComboBox<String> cbxMarca;
    private javax.swing.JCheckBox chkFlash;
    private javax.swing.JCheckBox chkPrincipal;
    private javax.swing.JCheckBox chkSecundaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaDetalle;
    private javax.swing.JTextField txtGarantia;
    private javax.swing.JTextField txtNucleos;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrincipal;
    private javax.swing.JTextField txtRam;
    private javax.swing.JTextField txtSecundaria;
    // End of variables declaration//GEN-END:variables
}
