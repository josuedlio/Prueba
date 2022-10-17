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
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author josue.ochoa
 */
public class EscribirHTP {

    String rutaArial = "arial.ttf";

    public void escrituraHTP(String buque, String noBuque, String nomContenedor, String pedimento,
            String posicion, String categoria, String medida, String peso, String tipo, String elaborado,
            String importecletra,String dolar,String dolarLetra) {

        try {

            BaseFont arial = BaseFont.createFont(rutaArial, BaseFont.CP1252, true);

            PdfReader pdfReader = new PdfReader("FacturaHPT_1.pdf");
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(("C:\\Users\\josue.ochoa\\Downloads\\"+ReadXML.getFolio(Ventana_HTP.jtfObXML.getText())+"_HTP.pdf")));
            File file = new File(pdfStamper.toString());
            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD,
                    BaseFont.CP1252, BaseFont.EMBEDDED);
            int pages = pdfReader.getNumberOfPages();
            for (int i = 1; i <= pages; i++) {
                PdfContentByte pageCB = pdfStamper.getOverContent(i);
                pageCB.beginText();
                pageCB.setFontAndSize(arial, 7);

                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Serie"), 450, 725, 0);//Serie
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Folio"), 520, 725, 0);//Folio
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Fecha"), 470, 700, 0);//Fecha
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_HTP.jtfObXML.getText(), "UUID"), 470, 675, 0);//Folio fiscal
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_HTP.jtfObXML.getText(), "FechaTimbrado"), 460, 175, 0);//Fecha timbrado

                pageCB.setFontAndSize(arial, (float) 6.5);
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "SubTotal"), 520, 369, 0);//Sub total
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Impuestos", "TotalImpuestosTrasladados"), 520, 340, 0);//IVA
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_HTP.jtfObXML.getText(), "Comprobante", "Total"), 520, 305, 0);//Total
                pageCB.showTextAligned(pages, dolar, 520, 295, 0);//Total
                pageCB.showTextAligned(pages, dolarLetra, 200, 295, 0);

                pageCB.showTextAligned(pages, buque, 78, 547, 0);//Nombre buque
                pageCB.showTextAligned(pages, noBuque, 150, 547, 0);//Numero del buque
                pageCB.showTextAligned(pages, pedimento, 100, 503, 0);//Pedimento
                pageCB.showTextAligned(pages, nomContenedor, 225, 460, 0);//Contenedor

                pageCB.showTextAligned(pages, elaborado, 250, 350, 0); //Elaborado por
                pageCB.showTextAligned(pages, posicion, 50, 355, 0); //posicion
                pageCB.showTextAligned(pages, tipo, 40, 315, 0); //tipo
                pageCB.showTextAligned(pages, medida, 80, 315, 0);//medida
                pageCB.showTextAligned(pages, categoria, 120, 315, 0);//categoria
                pageCB.showTextAligned(pages, peso, 180, 315, 0);//peso
                pageCB.showTextAligned(pages, importecletra, 200, 305, 0);
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
