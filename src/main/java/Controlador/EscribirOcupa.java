/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.mycompany.machacas.Vista.Ventana_Ocupa;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirOcupa {

    String rutaArial = "C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Documents\\NetBeansProjects\\PDFJava\\arial.ttf";

    public void escrituraOcupa(String noOcu, String noSoli, String noBuque, String peso, String contenedor, String notas, String valorLetra,String dollar) {

        try {

            BaseFont arial = BaseFont.createFont(rutaArial, BaseFont.CP1252, true);

            PdfReader pdfReader = new PdfReader("FacturaOCU.pdf");
//            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("C:\\Users\\josue.ochoa\\Downloads\\MachacaOCU.pdf"));
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream("C:\\Users\\josue.ochoa\\Downloads\\"+ReadXML.getFolio(Ventana_Ocupa.jtfObXML.getText())+"_Ocupa.pdf"));
            File file = new File(pdfStamper.toString());
//            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD,
//                    BaseFont.CP1252, BaseFont.EMBEDDED);
            int pages = pdfReader.getNumberOfPages();
            for (int i = 1; i <= pages; i++) {
                PdfContentByte pageCB = pdfStamper.getOverContent(i);
                pageCB.beginText();
                pageCB.setFontAndSize(arial, 14);
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Comprobante", "Folio"), 490, (float)764.5, 0);//Folio
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Comprobante", "Serie"), 450, (float)764.5, 0);//Folio

                pageCB.setFontAndSize(arial, 10);
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Comprobante", "Fecha"), 430, (float) 703.5, 0);//Fecha Emision
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_Ocupa.jtfObXML.getText(), "UUID"), 430, 730, 0); //Folio Fiscal
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Comprobante", "SubTotal"), 560, (float)288.5, 0);//Sub total
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Impuestos", "TotalImpuestosTrasladados"), 560, (float) 267.5, 0);//IVA
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Ocupa.jtfObXML.getText(), "Comprobante", "Total"), 560, 248, 0);//Total
                
                pageCB.setFontAndSize(arial, 8);
                pageCB.showTextAligned(pages, noOcu, 90, 465, 0); //No ocupa
                pageCB.showTextAligned(pages, noSoli, 90, 455, 0); // No de solicitud
                pageCB.showTextAligned(pages, noBuque, 45, 432, 0); // No de buque
                pageCB.showTextAligned(pages, peso, 65, 416, 0); // Peso
                pageCB.showTextAligned(pages, contenedor, 55, 400, 0); // Contenedor
                pageCB.showTextAligned(pages, notas, 50, 370, 0); // Notas
                pageCB.showTextAligned(pages, "(" + valorLetra + ")", 101, 300, 0); //Valor del importe con letra
                
                pageCB.setFontAndSize(arial, 7);
                pageCB.showTextAligned(pages, dollar, 99, (float) 288.5, 0);
                
                pageCB.endText();
            }
            pdfStamper.close();
            pdfReader.close();
            System.out.println("Modificado");
        } catch (DocumentException | IOException e) {
        }

    }

}
