/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.machacas.Vista;

import Controlador.ControladorVista;
import Controlador.EscribirSSA;
import Controlador.ReadXML;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author josue.ochoa
 */
public class VisorPDF extends javax.swing.JFrame {

    ControladorVista cv = new ControladorVista();
    String rutaPDF, rutaXML;

    public VisorPDF() {
        initComponents();
        EscribirSSA es = new EscribirSSA();
        this.cbFacturas.addItem("SSA");
        this.cbFacturas.addItem("Manzanillo");
        this.cbFacturas.addItem("Timsa");
        this.cbFacturas.addItem("Ocupa");
        this.cbCliente.addItem("Cliente Uno");
        this.cbCliente.addItem("Cliente Dos");
        this.cbCliente.addItem("Cliente Tres");
        btnConvertir.setEnabled(false);
        tfRutaXML.setEnabled(false);
        tfRutaXML.setColumns(30);
        Border borderP = new TitledBorder("Original PDF");
        Border borderV = new TitledBorder("Plantilla PDF");
        jScrollPane1.setBorder(borderP);
        jScrollPane2.setBorder(borderV);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelSur = new javax.swing.JPanel();
        tfRutaXML = new javax.swing.JTextField();
        btnConvertir = new javax.swing.JButton();
        panelNorte = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox<>();
        cbFacturas = new javax.swing.JComboBox<>();
        btnAgregarXML = new javax.swing.JButton();
        panelCentro = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelDerecha = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setLayout(new java.awt.BorderLayout());

        tfRutaXML.setText("Ruta XML ");
        tfRutaXML.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tfRutaXML.setDragEnabled(true);
        tfRutaXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRutaXMLActionPerformed(evt);
            }
        });
        panelSur.add(tfRutaXML);

        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });
        panelSur.add(btnConvertir);

        panelMain.add(panelSur, java.awt.BorderLayout.PAGE_END);

        panelNorte.add(cbCliente);

        cbFacturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFacturasActionPerformed(evt);
            }
        });
        panelNorte.add(cbFacturas);

        btnAgregarXML.setText("Agregar XML");
        btnAgregarXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarXMLActionPerformed(evt);
            }
        });
        panelNorte.add(btnAgregarXML);

        panelMain.add(panelNorte, java.awt.BorderLayout.PAGE_START);

        panelCentro.setLayout(new java.awt.GridLayout(1, 2));

        panelIzquierda.setLayout(new java.awt.BorderLayout());
        panelIzquierda.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panelCentro.add(panelIzquierda);

        panelDerecha.setLayout(new java.awt.BorderLayout());
        panelDerecha.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        panelCentro.add(panelDerecha);

        panelMain.add(panelCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarXMLActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Selecciona un archivo xml", "xml");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            tfRutaXML.setText(chooser.getSelectedFile().getAbsolutePath());
            if (ReadXML.getRFC(tfRutaXML.getText()).equals("SMH030404NT7")) {
                 //SSA
                rutaPDF = chooser.getSelectedFile().getAbsolutePath().replace(".xml", ".pdf");
                openpdf(rutaPDF);
                ControladorVista.openSegundoPDF("C:\\Users\\josue.ochoa\\Downloads\\FacturaSSA.pdf", this);
                System.out.println("SSA");
            } else if (ReadXML.getRFC(tfRutaXML.getText()).equals("CMA100106AH8")) {
                ControladorVista.openSegundoPDF("C:\\Users\\josue.ochoa\\Downloads\\FacturaMNZ.pdf", this);
                //Manzanillo
                rutaPDF = chooser.getSelectedFile().getAbsolutePath().replace(".xml", ".pdf");
                openpdf(rutaPDF);
                System.out.println("Manzanillo");
            } else if (ReadXML.getRFC(tfRutaXML.getText()).equals("TIM980730NK3")) {
                ControladorVista.openSegundoPDF("C:\\Users\\josue.ochoa\\Downloads\\FacturaHPT.pdf", this);
                //HTP
                rutaPDF = chooser.getSelectedFile().getAbsolutePath().replace(".xml", ".pdf");
                openpdf(rutaPDF);
                System.out.println("Timsa");
            }else if(ReadXML.getRFC(tfRutaXML.getText()).equals("OCP9209235J9")){
                System.out.println("Ocupa");
                rutaPDF = chooser.getSelectedFile().getAbsolutePath().replace(".xml", ".pdf");
                openpdf(rutaPDF);
                ControladorVista.openSegundoPDF("C:\\Users\\josue.ochoa\\Downloads\\FacturaOCU.pdf", this);
            } else {
               
            }
            btnConvertir.setEnabled(true);

        }
    }//GEN-LAST:event_btnAgregarXMLActionPerformed

    private void cbFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFacturasActionPerformed
    }//GEN-LAST:event_cbFacturasActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        // TODO add your handling code here:
        String facturaSelec = (String) cbFacturas.getSelectedItem();
        switch (facturaSelec) {
            case "Manzanillo":
                Ventana_Manzanillo vm = new Ventana_Manzanillo(this, true);
                Ventana_Manzanillo.jtfObtXML.setText(tfRutaXML.getText());
                vm.setVisible(true);
                break;
            case "SSA":
                Ventana_SSA sa = new Ventana_SSA(this, true);
                Ventana_SSA.jtfObtenXML.setText(tfRutaXML.getText());
                sa.setVisible(true);
                break;
            case "Timsa":
                Ventana_HTP vh = new Ventana_HTP(this, true);
                Ventana_HTP.jtfObXML.setText(tfRutaXML.getText());
                vh.setVisible(true);
                break;
                case "Ocupa":
                Ventana_Ocupa vo = new Ventana_Ocupa(this, true);
                Ventana_Ocupa.jtfObXML.setText(tfRutaXML.getText());
                vo.setVisible(true);
                break;
            default:
                //System.exit(0);
                tfRutaXML.setText(" ");
                this.btnConvertir.setEnabled(false);
                JOptionPane.showMessageDialog(null, "No has seleccionado una factura",
                        "Selecciona alguna factura", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void tfRutaXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRutaXMLActionPerformed
    }//GEN-LAST:event_tfRutaXMLActionPerformed

    void openpdf(String file) {
        try {
            SwingController control = new SwingController();
            SwingViewBuilder factry = new SwingViewBuilder(control);
            JPanel veiwerCompntpnl = factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                    new org.icepdf.ri.common.MyAnnotationCallback(
                            control.getDocumentViewController()));
            control.openDocument(file);
            jScrollPane1.setViewportView(veiwerCompntpnl);
            jScrollPane1.getVerticalScrollBar().setPreferredSize(
                    new Dimension(10, Integer.MAX_VALUE));
            jScrollPane1.getHorizontalScrollBar().setPreferredSize(
                    new Dimension(Integer.MAX_VALUE, 10));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar Pdf");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarXML;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JComboBox<String> cbCliente;
    public javax.swing.JComboBox<String> cbFacturas;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel panelSur;
    public javax.swing.JTextField tfRutaXML;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAgregarXML() {
        return btnAgregarXML;
    }

    public void setBtnAgregarXML(JButton btnAgregarXML) {
        this.btnAgregarXML = btnAgregarXML;
    }

    public JButton getBtnConvertir() {
        return btnConvertir;
    }

    public void setBtnConvertir(JButton btnConvertir) {
        this.btnConvertir = btnConvertir;
    }

    public JComboBox<String> getCbFacturas() {
        return cbFacturas;
    }

    public void setCbFacturas(JComboBox<String> cbFacturas) {
        this.cbFacturas = cbFacturas;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JPanel getPanelCentro() {
        return panelCentro;
    }

    public void setPanelCentro(JPanel panelCentro) {
        this.panelCentro = panelCentro;
    }

    public JPanel getPanelDerecha() {
        return panelDerecha;
    }

    public void setPanelDerecha(JPanel panelDerecha) {
        this.panelDerecha = panelDerecha;
    }

    public JPanel getPanelIzquierda() {
        return panelIzquierda;
    }

    public void setPanelIzquierda(JPanel panelIzquierda) {
        this.panelIzquierda = panelIzquierda;
    }

    public JPanel getPanelMain() {
        return panelMain;
    }

    public void setPanelMain(JPanel panelMain) {
        this.panelMain = panelMain;
    }

    public JPanel getPanelNorte() {
        return panelNorte;
    }

    public void setPanelNorte(JPanel panelNorte) {
        this.panelNorte = panelNorte;
    }

    public JPanel getPanelSur() {
        return panelSur;
    }

    public void setPanelSur(JPanel panelSur) {
        this.panelSur = panelSur;
    }

    public JTextField getTfRutaXML() {
        return tfRutaXML;
    }

    public void setTfRutaXML(JTextField tfRutaXML) {
        tfRutaXML = tfRutaXML;
    }
}
