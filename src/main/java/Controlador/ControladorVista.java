/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.mycompany.machacas.Vista.VisorPDF;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;

/**
 *
 * @author josue.ochoa
 */
public class ControladorVista {
//    VisorPDF vista = new VisorPDF();
    
    public static void openSegundoPDF(String file,VisorPDF vista){
        try {
            SwingController control = new SwingController();
            SwingViewBuilder factry = new SwingViewBuilder(control);
            JPanel veiwerCompntpnl = factry.buildViewerPanel();
            ComponentKeyBinding.install(control, veiwerCompntpnl);
            control.getDocumentViewController().setAnnotationCallback(
                    new org.icepdf.ri.common.MyAnnotationCallback(
                            control.getDocumentViewController()));
            control.openDocument(file);
            vista.jScrollPane2.setViewportView(veiwerCompntpnl);
           vista.jScrollPane2.getVerticalScrollBar().setPreferredSize(
                    new Dimension(10, Integer.MAX_VALUE));
            vista.jScrollPane2.getHorizontalScrollBar().setPreferredSize(
                    new Dimension(Integer.MAX_VALUE, 10));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "No se pudo cargar Pdf");
        }
    }
    
    
    
}
