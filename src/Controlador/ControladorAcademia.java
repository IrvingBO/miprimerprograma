package Controlador;

import Modelo.ModeloAcademia;
import include.Academia;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControladorAcademia {

    public boolean crearAcademia(Academia i){
        ModeloAcademia modeloAcademia =new ModeloAcademia();
        return modeloAcademia.crearAcademia(i);
   }

    public String getViewAcademia(){

      String htmlcode = "<table class=\"Striped\">\n" +
              "\t\t\t\t\t <thead>\n" +
                "\t\t\t\t\t <tr>\n" +
                "\t\t\t\t   \t<th> ClaveAcade </th>\n" +
                "\t\t\t\t    <th>Nombre</th>\n" +
              "\t\t\t\t    <th>Docente_RFC</th>\n" +
               "\t\t\t\t\t </tr>\n" +
               "\t\t\t\t\t </thead>" +
                "<tbody";
    ModeloAcademia modeloAcademia=new ModeloAcademia();

    int i =0;

    for (Academia a : modeloAcademia.getAllAcademia()){
       htmlcode +="<tr>" +
                "<td>" + a.getClaveAcade() + "</td>" +
                "<td>" + a.getNombre() + "</td>" +
                "</tr>" + a.getDocente_RFC() + "</td>" +
       "</tr>";
        }

        htmlcode +="</tbody>" +
                "</table>";
        return htmlcode;
    }

    public String getViewDepartamentoCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloAcademia modeloAcademia = new ModeloAcademia();
        int i =0;

        for (Academia a : modeloAcademia.getAllAcademia()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombre() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Clave Academia: " + a.getClaveAcade() +
                    "                   <br>Docente: " + a.getDocente_RFC() +

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
