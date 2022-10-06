
import Controlador.ReadXML;
import com.mycompany.machacas.Vista.VisorPDF;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue
 */
public class Ejecutar {

    public static void main(String[] args) {
//        Vista v = new Vista();
//        v.setVisible(true);

        VisorPDF vd = new VisorPDF();
        vd.setExtendedState(vd.MAXIMIZED_BOTH);
        vd.setVisible(true);

        
//        System.out.println(ReadXML.getRFC("C:\\Users\\josue.ochoa\\Downloads\\2748280.xml").equals("SMH030404NT7"));
    }
}
