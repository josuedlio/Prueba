/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfFormField;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.mycompany.machacas.Vista.Ventana_SSA;
import com.mycompany.machacas.Vista.VisorPDF;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author josue.ochoa
 */
public class EscribirSSA {

    String rutaArial = "C:\\Users\\josue.ochoa\\OneDrive - AUTOMOTIVE LOGISTICS S.C\\Documents\\NetBeansProjects\\PDFJava\\arial.ttf";

    public void escrituraSSA(String buque, String segundo_buque, String solicitud,
            String segundo_solicitud, String referencia, String notas, String valorImporte, String dolar) {
        VisorPDF v = new VisorPDF();
        try {

            BaseFont arial = BaseFont.createFont(rutaArial, BaseFont.CP1252, true);

            PdfReader pdfReader = new PdfReader("FacturaSSA.pdf");
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(("C:\\Users\\josue.ochoa\\Downloads\\"+ReadXML.getFolio(Ventana_SSA.jtfObtenXML.getText())+"_SSA.pdf")));
            File file = new File(pdfStamper.toString());
            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD,
                    BaseFont.CP1252, BaseFont.EMBEDDED);
            int pages = pdfReader.getNumberOfPages();
            for (int i = 1; i <= pages; i++) {
                PdfContentByte pageCB = pdfStamper.getOverContent(i);
                pageCB.beginText();
                pageCB.setFontAndSize(arial, 7);

                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "Folio"), 415, 690, 0);//Folio
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "NoCertificado"), 468, 680, 0); //noCertificado
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "Fecha"), 460, 670, 0);//Fecha Emision
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_SSA.jtfObtenXML.getText(), "NoCertificadoSAT"), 480, 652, 0);//Certificado SAT
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_SSA.jtfObtenXML.getText(), "UUID"), 500, 660, 0); //Folio Fiscal
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_SSA.jtfObtenXML.getText(), "FechaTimbrado"), 460, 643, 0); //FechaTimbrado
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "LugarExpedicion"), 170, 583, 0);//Lugar Expedicion
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "Fecha"), 270, 583, 0);//Fecha Emision
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Receptor", "UsoCFDI"), 530, 583, 0);//USO CFDI
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "SubTotal"), 560, 240, 0);//Sub total
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Impuestos", "TotalImpuestosTrasladados"), 560, 228, 0);//IVA
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_SSA.jtfObtenXML.getText(), "Comprobante", "Total"), 560, 215, 0);//Total
                pageCB.showTextAligned(pages, buque, 90, 553, 0); //Buque
                pageCB.showTextAligned(pages, segundo_buque, 95, 545, 0); // Segundo Buque
                pageCB.showTextAligned(pages, solicitud, 240, 553, 0); // Solicitud de servicio
                pageCB.showTextAligned(pages, segundo_solicitud, 240, 545, 0); // Solicitud dos
                pageCB.showTextAligned(pages, referencia, 450, 553, 0); // Referencia
                pageCB.showTextAligned(pages, notas, 85, 265, 0); // Notas
                pageCB.showTextAligned(pages, valorImporte, 160, 180, 0); //Valor del importe con letra
                pageCB.showTextAligned(pages, dolar, 565, (float) 192.5, 0); //Valor del importe con letra
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
