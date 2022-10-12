/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.machacas.Vista;

import Controlador.ControladorVista;
import Controlador.EscribirSSA;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author josue
 */
public class Ventana_SSA extends javax.swing.JDialog {

    public JTextField getJtfObtenXML() {
        return jtfObtenXML;
    }

    public void setJtfObtenXML(JTextField jtfObtenXML) {
        this.jtfObtenXML = jtfObtenXML;
    }

    /**
     * Creates new form Ventana_SSA
     */
    public Ventana_SSA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBounds(50, 50, 1000, 400);
        setTitle("Factura SSA");
        jtfObtenXML.setEnabled(false);
        jtfObtenXML.setColumns(20);
        Border borderB = new TitledBorder("Buque");
        Border borderS = new TitledBorder("Solicitud de Servicio");
        Border borderR = new TitledBorder("Referencia");
        Border borderN = new TitledBorder("Notas");
        Border borderV = new TitledBorder("Valor de la factura con letra");
        jtfBuque.setBorder(borderB);
        jtfBuqueDos.setBorder(borderB);
        jtfSolicitud.setBorder(borderS);
        jtfSolocitudDos.setBorder(borderS);
        jtfReferencia.setBorder(borderR);
        jtfNotas.setBorder(borderN);
        jtfValorLetra.setBorder(borderV);
        jtfValorLetra.setColumns(30);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new javax.swing.JPanel();
        pNorte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pSur = new javax.swing.JPanel();
        jtfObtenXML = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pCentral = new javax.swing.JPanel();
        jtfBuque = new javax.swing.JTextField();
        jtfSolicitud = new javax.swing.JTextField();
        jtfReferencia = new javax.swing.JTextField();
        jtfBuqueDos = new javax.swing.JTextField();
        jtfSolocitudDos = new javax.swing.JTextField();
        jtfNotas = new javax.swing.JTextField();
        jtfValorLetra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pPrincipal.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Pictures\\ssa.PNG")); // NOI18N
        pNorte.add(jLabel1);

        pPrincipal.add(pNorte, java.awt.BorderLayout.PAGE_START);

        jtfObtenXML.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfObtenXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfObtenXMLActionPerformed(evt);
            }
        });
        pSur.add(jtfObtenXML);

        jButton1.setText("Escribir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pSur.add(jButton1);

        pPrincipal.add(pSur, java.awt.BorderLayout.PAGE_END);

        pCentral.setLayout(new java.awt.GridLayout(3, 3));

        jtfBuque.setText("Buque");
        jtfBuque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuqueMouseClicked(evt);
            }
        });
        pCentral.add(jtfBuque);

        jtfSolicitud.setText("Solicitud de servicio");
        jtfSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfSolicitudMouseClicked(evt);
            }
        });
        pCentral.add(jtfSolicitud);

        jtfReferencia.setText("Referencia");
        jtfReferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfReferenciaMouseClicked(evt);
            }
        });
        pCentral.add(jtfReferencia);

        jtfBuqueDos.setText(" Buque");
        jtfBuqueDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfBuqueDosMouseClicked(evt);
            }
        });
        pCentral.add(jtfBuqueDos);

        jtfSolocitudDos.setText(" Solicitud");
        jtfSolocitudDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfSolocitudDosMouseClicked(evt);
            }
        });
        pCentral.add(jtfSolocitudDos);

        jtfNotas.setText("Notas");
        jtfNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfNotasMouseClicked(evt);
            }
        });
        pCentral.add(jtfNotas);

        jtfValorLetra.setText("Valor de la factura con letra");
        jtfValorLetra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfValorLetraMouseClicked(evt);
            }
        });
        pCentral.add(jtfValorLetra);

        pPrincipal.add(pCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(pPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jtfBuque.getText().isEmpty() || jtfBuqueDos.getText().isEmpty()
                || jtfNotas.getText().isEmpty() || jtfSolicitud.getText().isEmpty()
                || jtfSolocitudDos.getText().isEmpty() || jtfValorLetra.getText().isEmpty() || jtfReferencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tienes algún campo vacio",
                    "Campos vacios", JOptionPane.WARNING_MESSAGE);
        } else {
            EscribirSSA es = new EscribirSSA();
            es.escrituraSSA(jtfBuque.getText(), jtfBuqueDos.getText(), jtfSolicitud.getText(),
                    jtfSolocitudDos.getText(), jtfReferencia.getText(), jtfNotas.getText(),
                    jtfValorLetra.getText());
            JOptionPane.showMessageDialog(this, "Se genero un nuevo pdf ", "¡Nueva factura!", JOptionPane.INFORMATION_MESSAGE);

            //ControladorVista.openSegundoPDF("file:///C:/Users/josue.ochoa/Downloads/MachacaSSA.pdf", v);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfBuqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuqueMouseClicked
        jtfBuque.setText("");
    }//GEN-LAST:event_jtfBuqueMouseClicked

    private void jtfSolicitudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfSolicitudMouseClicked
        jtfSolicitud.setText("");
    }//GEN-LAST:event_jtfSolicitudMouseClicked

    private void jtfNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfNotasMouseClicked
        jtfNotas.setText("");
    }//GEN-LAST:event_jtfNotasMouseClicked

    private void jtfValorLetraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfValorLetraMouseClicked
        jtfValorLetra.setText("");
    }//GEN-LAST:event_jtfValorLetraMouseClicked

    private void jtfObtenXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfObtenXMLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfObtenXMLActionPerformed

    private void jtfBuqueDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfBuqueDosMouseClicked
        // TODO add your handling code here:
        jtfBuqueDos.setText("");
    }//GEN-LAST:event_jtfBuqueDosMouseClicked

    private void jtfSolocitudDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfSolocitudDosMouseClicked
        // TODO add your handling code here:
        jtfSolocitudDos.setText("");
    }//GEN-LAST:event_jtfSolocitudDosMouseClicked

    private void jtfReferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfReferenciaMouseClicked
        // TODO add your handling code here:
        jtfReferencia.setText("");
    }//GEN-LAST:event_jtfReferenciaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jtfBuque;
    private javax.swing.JTextField jtfBuqueDos;
    private javax.swing.JTextField jtfNotas;
    public static javax.swing.JTextField jtfObtenXML;
    private javax.swing.JTextField jtfReferencia;
    private javax.swing.JTextField jtfSolicitud;
    private javax.swing.JTextField jtfSolocitudDos;
    private javax.swing.JTextField jtfValorLetra;
    private javax.swing.JPanel pCentral;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pSur;
    // End of variables declaration//GEN-END:variables
}
