/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.machacas.Vista;

/**
 *
 * @author josue
 */
public class Ventana_HTP extends javax.swing.JDialog {

    /**
     * Creates new form Ventana_HTP
     */
    public Ventana_HTP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Factura HTP");
        jtfImportecLetra.setColumns(30);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        pPrincipal = new javax.swing.JPanel();
        pSur = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pCentral = new javax.swing.JPanel();
        jtfBuque = new javax.swing.JTextField();
        jtfnoBuque = new javax.swing.JTextField();
        jtfPedimento = new javax.swing.JTextField();
        jtfrfCliente = new javax.swing.JTextField();
        jtfnomContenedor = new javax.swing.JTextField();
        jtfPosicion = new javax.swing.JTextField();
        jtfMedida = new javax.swing.JTextField();
        jtfTipo = new javax.swing.JTextField();
        jtfCategoria = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jtfElaborado = new javax.swing.JTextField();
        jtfImportecLetra = new javax.swing.JTextField();
        pNorte = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pPrincipal.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Escribir y convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pSur.add(jButton1);

        jButton2.setText("Limpiar textos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        pSur.add(jButton2);

        pPrincipal.add(pSur, java.awt.BorderLayout.PAGE_END);

        pCentral.setLayout(new java.awt.GridLayout(2, 1, 3, 3));

        jtfBuque.setText("Buque");
        jtfBuque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuqueMouseClicked(evt);
            }
        });
        pCentral.add(jtfBuque);

        jtfnoBuque.setText("No.Buque");
        jtfnoBuque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfnoBuqueMouseClicked(evt);
            }
        });
        pCentral.add(jtfnoBuque);

        jtfPedimento.setText("Pedimento");
        pCentral.add(jtfPedimento);

        jtfrfCliente.setText("Referencia cliente");
        pCentral.add(jtfrfCliente);

        jtfnomContenedor.setText("Nombre contenedor");
        pCentral.add(jtfnomContenedor);

        jtfPosicion.setText("Posición");
        pCentral.add(jtfPosicion);

        jtfMedida.setText("Medida");
        pCentral.add(jtfMedida);

        jtfTipo.setText("Tipo");
        pCentral.add(jtfTipo);

        jtfCategoria.setText("Categoria");
        pCentral.add(jtfCategoria);

        jtfPeso.setText("Peso");
        pCentral.add(jtfPeso);

        jtfElaborado.setText("Elaborado por");
        pCentral.add(jtfElaborado);

        jtfImportecLetra.setText("Importe con letra");
        jtfImportecLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfImportecLetraActionPerformed(evt);
            }
        });
        pCentral.add(jtfImportecLetra);

        pPrincipal.add(pCentral, java.awt.BorderLayout.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Pictures\\Timsa.PNG")); // NOI18N
        pNorte.add(jLabel2);

        pPrincipal.add(pNorte, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfImportecLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfImportecLetraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfImportecLetraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfBuqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuqueMouseClicked
    }//GEN-LAST:event_jtfBuqueMouseClicked

    private void jtfnoBuqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfnoBuqueMouseClicked
        
    }//GEN-LAST:event_jtfnoBuqueMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jtfBuque.setText("");
        jtfnoBuque.setText("");
        jtfPedimento.setText("");
        jtfrfCliente.setText("");
        jtfnomContenedor.setText("");
        jtfPosicion.setText("");
        jtfTipo.setText("");
        jtfMedida.setText("");
        jtfCategoria.setText("");
        jtfPeso.setText("");
        jtfElaborado.setText("");
        jtfImportecLetra.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtfBuque;
    private javax.swing.JTextField jtfCategoria;
    private javax.swing.JTextField jtfElaborado;
    private javax.swing.JTextField jtfImportecLetra;
    private javax.swing.JTextField jtfMedida;
    private javax.swing.JTextField jtfPedimento;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JTextField jtfPosicion;
    private javax.swing.JTextField jtfTipo;
    private javax.swing.JTextField jtfnoBuque;
    private javax.swing.JTextField jtfnomContenedor;
    private javax.swing.JTextField jtfrfCliente;
    private javax.swing.JPanel pCentral;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pSur;
    // End of variables declaration//GEN-END:variables
}
