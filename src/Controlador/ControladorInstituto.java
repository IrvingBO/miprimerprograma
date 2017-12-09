package Controlador;

import Modelo.ModeloInstituto;
import include.Instituto;

public class ControladorInstituto {

    public boolean crearInstituto(Instituto i){
        ModeloInstituto modeloInstituto =new ModeloInstituto();
        return modeloInstituto.crearInstituto(i);

    }

    public String getViewInstitutoCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloInstituto modeloInstituto = new ModeloInstituto();
        int i =0;

        for (Instituto a : modeloInstituto.getAllInstituto()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombreInst() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Direccion Instituto: " + a.getDireccionInst() +
                    "                   <br>Clave Instituto: " + a.getClaveInst() +

                    "               </p>"+
                    "           </div>\n" +
                    "       <div class=\"card-action\">\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "           <a href=\"#\">This is a link</a>\n" +
                    "       </div>\n" +
                    "       </div>\n" +
                    "   </div>\n";
        }
        htmlcode += "</div>";
        return htmlcode;
    }

}
