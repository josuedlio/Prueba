/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.mycompany.machacas.Vista.Ventana_Manzanillo;
import com.mycompany.machacas.Vista.VisorPDF;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author josue.ochoa
 */
public class EscribirMNZ {

    String rutaArial = "arial.ttf";

    public void escrituraMNZ(String buque, String viaje, String fechaI, String fechaF, String referencia, String numero, String valor, String dolar) {
        VisorPDF v = new VisorPDF();
        try {

            BaseFont arial = BaseFont.createFont(rutaArial, BaseFont.CP1252, true);

            PdfReader pdfReader = new PdfReader("FacturaMNZ_1.pdf");
            PdfStamper pdfStamper = new PdfStamper(pdfReader, new FileOutputStream(("C:\\Users\\josue.ochoa\\Downloads\\" + ReadXML.getFolio(Ventana_Manzanillo.jtfObtXML.getText()) + "_Manzanillo.pdf")));
            File file = new File(pdfStamper.toString());
            BaseFont baseFont = BaseFont.createFont(BaseFont.TIMES_BOLD,
                    BaseFont.CP1252, BaseFont.EMBEDDED);
            int pages = pdfReader.getNumberOfPages();
            for (int i = 1; i <= pages; i++) {
                PdfContentByte pageCB = pdfStamper.getOverContent(i);
                pageCB.beginText();
                pageCB.setFontAndSize(arial, 7);

                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "Serie") + "-", 490, 683, 0);//Serie
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "Folio"), 530, 683, 0);//Serie
                pageCB.showTextAligned(pages, valor, 227, 130, 0);

                pageCB.setFontAndSize(arial, 6);
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_Manzanillo.jtfObtXML.getText(), "UUID"), 500, 643, 0);
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "Fecha"), 100, 585, 0);//Serie
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_Manzanillo.jtfObtXML.getText(), "FechaTimbrado"), 220, 585, 0);
                pageCB.showTextAligned(pages, ReadXML.getFechaTimbrado(Ventana_Manzanillo.jtfObtXML.getText(), "NoCertificadoSAT"), 360, 585, 0);
                pageCB.showTextAligned(pages, ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "NoCertificado"), 500, 585, 0);//Serie

                pageCB.showTextAligned(pages, buque, 85, 550, 0);
                pageCB.showTextAligned(pages, viaje, 140, 550, 0);
                pageCB.showTextAligned(pages, fechaI, 210, 549, 0);
                pageCB.showTextAligned(pages, fechaF, 210, 540, 0);
                pageCB.showTextAligned(pages, referencia, 450, 549, 0);
                pageCB.showTextAligned(pages, numero, 425, 537, 0);

                pageCB.setFontAndSize(arial, 8);
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "SubTotal"), 530, 196, 0);//
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Impuestos", "TotalImpuestosTrasladados"), 530, 170, 0);//IVA
                pageCB.showTextAligned(pages, "$ " + ReadXML.getAo(Ventana_Manzanillo.jtfObtXML.getText(), "Comprobante", "Total"), 530, 157, 0);//Total
                pageCB.showTextAligned(pages, dolar, 517, (float) 142.5, 0);

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
