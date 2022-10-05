
import com.mycompany.machacas.Vista.Ejele;
import com.mycompany.machacas.Vista.VisorPDF;
import com.mycompany.machacas.Vista.Vista;

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

//        Ejele e = new Ejele();
//        e.setVisible(true);
        VisorPDF vd = new VisorPDF();
        vd.setExtendedState(vd.MAXIMIZED_BOTH);
        vd.setVisible(true);
    }
}
