package Controlador;

import Modelo.ModeloCicloEscolar;
import include.CicloEscolar;

public class ControladorCicloEscolar {

    public boolean crearCiclo(CicloEscolar i){
        ModeloCicloEscolar modeloCicloEscolar = new ModeloCicloEscolar();
        return modeloCicloEscolar.crearCiclo(i);


    }

    public String getViewCiclo() {

        String htmlcode = "<table class=\"Striped\">\n" +
                "\t\t\t\t\t <thead>\n" +
                "\t\t\t\t\t <tr>\n" +
                "\t\t\t\t   \t<th> ClaveCiclo </th>\n" +
                "\t\t\t\t    <th>Nombre</th>\n" +
                "\t\t\t\t\t </tr>\n" +
                "\t\t\t\t\t </thead>" +
                "<tbody";
        ModeloCicloEscolar modeloCicloEscolar = new ModeloCicloEscolar();
        int i = 0;

        for( CicloEscolar a :modeloCicloEscolar.getAllCiclo())

        {
            htmlcode += "<tr>" +
                    "<td>" + a.getClaveCiclo() + "</td>" +
                    "<td>" + a.getNombre() + "</td>" +
                    "</tr>";
        }

        htmlcode +="</tbody>"+
                "</table>";
        return htmlcode;

    }

    public String getViewCicloCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloCicloEscolar modeloCicloEscolar = new ModeloCicloEscolar();
        int i =0;

        for (CicloEscolar a : modeloCicloEscolar.getAllCiclo()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Clave Ciclo Escolar: " + a.getClaveCiclo() +


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
