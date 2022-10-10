/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.io.File;
import org.w3c.dom.Document;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

/**
 *
 * @author josue.ochoa
 */
public class ReadXML {
    private static DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
    
    private static String rfc;
    private static String folio;
    private static String algo;
    private static String timbrado;
    
    public static String getRFC (String rutaXML){
        try {
            ReadXML.dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = ReadXML.dbf.newDocumentBuilder();
            Document doc = db.parse(new File(rutaXML));
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("cfdi:Emisor");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    ReadXML.rfc = element.getAttribute("Rfc");
                }
            }
        } catch (Exception e) {
        }
        return ReadXML.rfc;
    }
    
    public static String getFolio(String rutaXML){
        try {
            ReadXML.dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = ReadXML.dbf.newDocumentBuilder();
            Document doc = db.parse(new File(rutaXML));
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("cfdi:Comprobante");
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    ReadXML.folio = element.getAttribute("Folio");
                }
            }
        } catch (Exception e) {
        }
        return ReadXML.folio;
    }
    
     public static String getAo(String rutaXML,String nodo,String atributo){
        try {
            ReadXML.dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = ReadXML.dbf.newDocumentBuilder();
            Document doc = db.parse(new File(rutaXML));
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("cfdi:".concat(nodo));
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    ReadXML.algo = element.getAttribute(atributo);
                }
            }
        } catch (Exception e) {
        }
        return ReadXML.algo;
    }
     
   
     public static String getFechaTimbrado(String rutaXML,String atributo){
        try {
            ReadXML.dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = ReadXML.dbf.newDocumentBuilder();
            Document doc = db.parse(new File(rutaXML));
            doc.getDocumentElement().normalize();
            
            NodeList list =  doc.getElementsByTagName("tfd:TimbreFiscalDigital");
            
            for (int i = 0; i < list.getLength(); i++) {
                Node node = list.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    ReadXML.timbrado = element.getAttribute(atributo);
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return timbrado;
    }
    
}