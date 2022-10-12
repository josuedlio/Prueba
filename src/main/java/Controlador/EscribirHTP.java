/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.mycompany.machacas.Vista.Ventana_HTP;
import com.mycompany.machacas.Vista.Ventana_SSA;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author josue.ochoa
 */
public class EscribirHTP {

    String rutaArial = "C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Documents\\NetBeansProjects\\PDFJava\\arial.ttf";

    public void escrituraHTP(String buque, String noBuque, String nomContenedor, String pedimento,
            String posicion, String categoria, String medida, String peso, String tipo, String elaborado,
            String importecletra) {

        try {

            BaseFont arial = BaseFont.createFont(rutaArial, BaseFont.CP1252, true);

            PdfReader pdfReader = new PdfReader("C:\\Users\\josue.ochoa\\Downloads\\FacturaHPT.pdf");
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("C:\\Users\\josue.ochoa\\Downloads\\MachacaHTP.pdf"));
            File file = new File(pdfStamper.toString());
            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD,
                    BaseFont.CP1252, BaseFont.EMBEDDED);
            int pages = pdfReader.getNumberOfPages();
            for (int i = 1; i <= pages; i++) {
                PdfContentByte pageCB = pdfStamper.getOverContent(i);
                pageCB.beginText();
                pageCB.setFontAndSize(arial, 7);

                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Serie"), 465, 710, 0);//Serie
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Folio"), 520, 710, 0);//Folio
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Fecha"), 460, 682, 0);//Fecha
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_HTP.jtfObXML.getText(), "UUID"), 420, 655, 0);//Folio fiscal
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_HTP.jtfObXML.getText(), "FechaTimbrado"), 460, 150, 0);//Fecha timbrado

                pageCB.setFontAndSize(arial, (float) 6.5);
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "SubTotal"), 520, 333, 0);//Sub total
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Impuestos", "TotalImpuestosTrasladados"), 520, 300, 0);//IVA
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Total"), 520, 266, 0);//Total

                pageCB.showTextAligned(pages, buque, 78, 523, 0);//Nombre buque
                pageCB.showTextAligned(pages, noBuque, 150, 523, 0);//Numero del buque
                pageCB.showTextAligned(pages, pedimento, 100, 478, 0);//Pedimento
                pageCB.showTextAligned(pages, nomContenedor, 225, 440, 0);//Contenedor

                pageCB.showTextAligned(pages, elaborado, 230, 310, 0); //Elaborado por
                pageCB.showTextAligned(pages, posicion, 50, 315, 0); //posicion
                pageCB.showTextAligned(pages, tipo, 40, 285, 0); //tipo
                pageCB.showTextAligned(pages, medida, 80, 285, 0);//medida
                pageCB.showTextAligned(pages, categoria, 120, 285, 0);//categoria
                pageCB.showTextAligned(pages, peso, 180, 285, 0);//peso
                pageCB.showTextAligned(pages, importecletra, 120, 266, 0);
                pageCB.endText();
            }
            pdfStamper.close();
            pdfReader.close();
            System.out.println("Modificado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
