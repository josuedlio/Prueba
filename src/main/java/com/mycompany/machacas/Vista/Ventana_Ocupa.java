/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.machacas.Vista;

import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author josue.ochoa
 */
public class Ventana_Ocupa extends javax.swing.JDialog {

    /**
     * Creates new form Ventana_Ocupa
     *
     * @param parent
     * @param modal
     */
    public Ventana_Ocupa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Factura Ocupa");
        Border bordeO = new TitledBorder("OV OCUPA");
        jtfNoOcupa.setBorder(bordeO);
        Border bordeS = new TitledBorder("No. Solicitud");
        jtfNoSolicitud.setBorder(bordeS);
        Border bordeB = new TitledBorder("No. Buque");
        jtfNoBuque.setBorder(bordeB);
        Border bordeP = new TitledBorder("Peso");
        jtfPeso.setBorder(bordeP);
        Border bordeC = new TitledBorder("Nombre Contenedor");
        jtfContenedor.setBorder(bordeC);
        Border bordeN = new TitledBorder("Notas");
        jtfNotas.setBorder(bordeN);
        Border bordeV = new TitledBorder("Total con letra");
        jtfImporteLetra.setBorder(bordeV);

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
        pSur = new javax.swing.JPanel();
        jtfImporteLetra = new javax.swing.JTextField();
        jtfObXML = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pNorte = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pCentral = new javax.swing.JPanel();
        jtfNoOcupa = new javax.swing.JTextField();
        jtfNoSolicitud = new javax.swing.JTextField();
        jtfNoBuque = new javax.swing.JTextField();
        jtfPeso = new javax.swing.JTextField();
        jtfContenedor = new javax.swing.JTextField();
        jtfNotas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pPrincipal.setLayout(new java.awt.BorderLayout());

        jtfObXML.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtfObXML.setEnabled(false);

        jButton1.setText("Escribir y generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSurLayout = new javax.swing.GroupLayout(pSur);
        pSur.setLayout(pSurLayout);
        pSurLayout.setHorizontalGroup(
            pSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtfImporteLetra, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pSurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfObXML, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(jButton1)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        pSurLayout.setVerticalGroup(
            pSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfImporteLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfObXML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pPrincipal.add(pSur, java.awt.BorderLayout.PAGE_END);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Documents\\NetBeansProjects\\Prueba\\src\\main\\java\\imagenes\\ocupa.PNG")); // NOI18N
        pNorte.add(jLabel2);

        pPrincipal.add(pNorte, java.awt.BorderLayout.PAGE_START);

        pCentral.setLayout(new java.awt.GridLayout(3, 2, 2, 2));
        pCentral.add(jtfNoOcupa);
        pCentral.add(jtfNoSolicitud);
        pCentral.add(jtfNoBuque);
        pCentral.add(jtfPeso);
        pCentral.add(jtfContenedor);
        pCentral.add(jtfNotas);

        pPrincipal.add(pCentral, java.awt.BorderLayout.CENTER);

        getContentPane().add(pPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jtfNoOcupa.getText().isEmpty() || jtfNoSolicitud.getText().isEmpty() || jtfNoBuque.getText().isEmpty()
                || jtfPeso.getText().isEmpty() || jtfContenedor.getText().isEmpty() || jtfNotas.getText().isEmpty()
                || jtfImporteLetra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tienes campos vacios", "¡Campos vacios!", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Se genero pdf", "¡Nueva factura!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jtfContenedor;
    private javax.swing.JTextField jtfImporteLetra;
    private javax.swing.JTextField jtfNoBuque;
    private javax.swing.JTextField jtfNoOcupa;
    private javax.swing.JTextField jtfNoSolicitud;
    private javax.swing.JTextField jtfNotas;
    public static javax.swing.JTextField jtfObXML;
    private javax.swing.JTextField jtfPeso;
    private javax.swing.JPanel pCentral;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pPrincipal;
    private javax.swing.JPanel pSur;
    // End of variables declaration//GEN-END:variables
}
