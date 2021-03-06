/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos;

/**
 *
 * @author FranLL1DAW
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class articulos extends javax.swing.JFrame {

    /**
     * Creates new form articulos
     */
    static public ResultSet r;
    
    public articulos()throws SQLException {
        initComponents();
        String url = "jdbc:mysql://localhost:3306/base";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user,pass);
        
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String query = "select * from articulos";
        r = s.executeQuery(query);
        r.first();
        campnombre.setText(r.getString("ARTICULO"));
        campcodart.setText(r.getString("COD_ARTICULO"));
        campfab.setText(r.getString("FABRICANTE"));
        campeso.setText(r.getString("PESO"));
        campcat.setText(r.getString("CATEGORIA"));
        campreciovent.setText(r.getString("PRECIO_VENTA"));
        campreciocos.setText(r.getString("PRECIO_COSTE"));
        campexis.setText(r.getString("EXISTENCIAS"));
        aceptar.setVisible(false);
        cancelar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campnombre = new javax.swing.JTextField();
        campcodart = new javax.swing.JTextField();
        campfab = new javax.swing.JTextField();
        campeso = new javax.swing.JTextField();
        campcat = new javax.swing.JTextField();
        campreciovent = new javax.swing.JTextField();
        campreciocos = new javax.swing.JTextField();
        campexis = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        primero = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        ultimo = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        campnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campnombreActionPerformed(evt);
            }
        });

        campcodart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campcodartActionPerformed(evt);
            }
        });

        campexis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campexisActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARTÍCULOS");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("CÓDIGO ARTÍCULO");

        jLabel4.setText("FABRICANTE");

        jLabel5.setText("PESO");

        jLabel6.setText("CATEGORÍA");

        jLabel7.setText("PRECIO DE VENTA");

        jLabel8.setText("PRECIO DE COSTE");

        jLabel9.setText("EXISTENCIAS");

        primero.setText("PRIMERO");
        primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroActionPerformed(evt);
            }
        });

        siguiente.setText("SIGUIENTE");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setText("ANTERIOR");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        ultimo.setText("ÚLTIMO");
        ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoActionPerformed(evt);
            }
        });

        nuevo.setText("NUEVO");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        editar.setText("EDITAR");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        aceptar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(primero, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43)
                                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(campnombre)
                                    .addComponent(campfab)
                                    .addComponent(campeso)
                                    .addComponent(campcat)
                                    .addComponent(campreciovent)
                                    .addComponent(campreciocos)
                                    .addComponent(campexis, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
                                .addComponent(campcodart, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campcodart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campfab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campreciovent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campreciocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campexis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(primero, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campcodartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campcodartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campcodartActionPerformed

    private void campnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campnombreActionPerformed

    private void campexisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campexisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campexisActionPerformed

    private void primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroActionPerformed
        try {
            r.first();
            campnombre.setText(r.getString("ARTICULO"));
            campcodart.setText(r.getString("COD_ARTICULO"));
            campfab.setText(r.getString("FABRICANTE"));
            campeso.setText(r.getString("PESO"));
            campcat.setText(r.getString("CATEGORIA"));
            campreciovent.setText(r.getString("PRECIO_VENTA"));
            campreciocos.setText(r.getString("PRECIO_COSTE"));
            campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_primeroActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        try {
            if(r.next());
            campnombre.setText(r.getString("ARTICULO"));
            campcodart.setText(r.getString("COD_ARTICULO"));
            campfab.setText(r.getString("FABRICANTE"));
            campeso.setText(r.getString("PESO"));
            campcat.setText(r.getString("CATEGORIA"));
            campreciovent.setText(r.getString("PRECIO_VENTA"));
            campreciocos.setText(r.getString("PRECIO_COSTE"));
            campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        try {
            if(r.previous());
            campnombre.setText(r.getString("ARTICULO"));
            campcodart.setText(r.getString("COD_ARTICULO"));
            campfab.setText(r.getString("FABRICANTE"));
            campeso.setText(r.getString("PESO"));
            campcat.setText(r.getString("CATEGORIA"));
            campreciovent.setText(r.getString("PRECIO_VENTA"));
            campreciocos.setText(r.getString("PRECIO_COSTE"));
            campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anteriorActionPerformed

    private void ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoActionPerformed
        try {
            r.last();
            campnombre.setText(r.getString("ARTICULO"));
            campcodart.setText(r.getString("COD_ARTICULO"));
            campfab.setText(r.getString("FABRICANTE"));
            campeso.setText(r.getString("PESO"));
            campcat.setText(r.getString("CATEGORIA"));
            campreciovent.setText(r.getString("PRECIO_VENTA"));
            campreciocos.setText(r.getString("PRECIO_COSTE"));
            campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ultimoActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
    try {
        String vCod, vNom, vFab, vPeso, vCat, vPv, vPc, vEx;
        vCod = campcodart.getText();
        vNom = campnombre.getText();
        vFab = campfab.getText();
        vPeso = campeso.getText();
        vCat = campcat.getText();
        vPv = campreciovent.getText();
        vPc = campreciocos.getText();
        vEx = campexis.getText();
        String url = "jdbc:mysql://localhost:3306/base";
        
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user,pass);
        Statement s = connection.createStatement();
        String query = "update articulos set COD_ARTICULO='" + vCod + "', ARTICULO='" + vNom + "', FABRICANTE='" + vFab + "', PESO='" + vPeso + "', CATEGORIA='" + vCat + "', PRECIO_VENTA='" + vPv + "', PRECIO_COSTE='" + vPc + "', EXISTENCIAS='" + vEx + "' WHERE COD_ARTICULO='" + vCod +"'";
        int resultado = s.executeUpdate(query);
        r.refreshRow();
    } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_editarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
    try{
        String vCod, vNom, vFab, vPeso, vCat, vPv, vPc, vEx;
        vCod = campcodart.getText();
        vNom = campnombre.getText();
        vFab = campfab.getText();
        vPeso = campeso.getText();
        vCat = campcat.getText();
        vPv = campreciovent.getText();
        vPc = campreciocos.getText();
        vEx = campexis.getText();
        String url = "jdbc:mysql://localhost:3306/base";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement s = connection.createStatement();
        String query = "insert into articulos values ('" + vCod + "','" + vNom + "','" + vFab + "','" + vPeso + "','" + vCat + "','" + vPv + "','" + vPc + "','" + vEx + "')";
        int resultado = s.executeUpdate (query);
        r.refreshRow();
        nuevo.setEnabled( true );
        primero.setEnabled( true );
        anterior.setEnabled( true ) ;
        siguiente.setEnabled( true );
        ultimo.setEnabled( true );
        editar.setEnabled( true );
        borrar.setEnabled( true );
        aceptar.setVisible( false );
        cancelar.setVisible( false );
    }catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        try {
        campcodart.setText(r.getString("COD_ARTICULO"));
        campnombre.setText(r.getString("ARTICULO"));
        campfab.setText(r.getString("FABRICANTE"));
        campeso.setText(r.getString("PESO"));
        campcat.setText(r.getString("CATEGORIA"));
        campreciovent.setText(r.getString("PRECIO_VENTA"));
        campreciocos.setText(r.getString("PRECIO_COSTE"));
        campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
        primero.setEnabled( true );
        anterior.setEnabled( true ) ;
        siguiente.setEnabled( true );
        ultimo.setEnabled( true );
        editar.setEnabled( true );
        nuevo.setEnabled( true );
        borrar.setEnabled( true );
        aceptar.setVisible(false);
        cancelar.setVisible(false);
        
    }//GEN-LAST:event_cancelarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        campnombre.setText("");
        campcodart.setText("");
        campfab.setText("");
        campeso.setText("");
        campcat.setText("");
        campreciovent.setText("");
        campreciocos.setText("");
        campexis.setText("");
        primero.setEnabled( false );
        anterior.setEnabled( false ) ;
        siguiente.setEnabled( false );
        ultimo.setEnabled( false );
        editar.setEnabled( false );
        nuevo.setEnabled( false );
        borrar.setEnabled( false );
        aceptar.setVisible( true );
        cancelar.setVisible( true ); 
    }//GEN-LAST:event_nuevoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try {
        String vCod;
        vCod = campcodart.getText();
        String url = "jdbc:mysql://localhost:3306/base";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement s = connection.createStatement();
        String query = "Delete FROM articulos Where COD_ARTICULO='" + vCod + "'";
        int resultado = s.executeUpdate (query);
        String query2 = "select * from articulos";
        r = s.executeQuery(query2);
        r.first();
        campcodart.setText(r.getString("COD_ARTICULO"));
        campnombre.setText(r.getString("ARTICULO"));
        campfab.setText(r.getString("FABRICANTE"));
        campeso.setText(r.getString("PESO"));
        campcat.setText(r.getString("CATEGORIA"));
        campreciovent.setText(r.getString("PRECIO_VENTA"));
        campreciocos.setText(r.getString("PRECIO_COSTE"));
        campexis.setText(r.getString("EXISTENCIAS"));
        } catch (SQLException ex) {
            Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new articulos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(articulos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton anterior;
    private javax.swing.JButton borrar;
    private javax.swing.JTextField campcat;
    private javax.swing.JTextField campcodart;
    private javax.swing.JTextField campeso;
    private javax.swing.JTextField campexis;
    private javax.swing.JTextField campfab;
    private javax.swing.JTextField campnombre;
    private javax.swing.JTextField campreciocos;
    private javax.swing.JTextField campreciovent;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton editar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton primero;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton ultimo;
    // End of variables declaration//GEN-END:variables
}
