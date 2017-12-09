package Controlador;

import Modelo.ModeloDepartamento;
import include.Departamento;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ControladorDepartamento {

    public boolean crearDepartamento(Departamento i) {
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        return modeloDepartamento.crearDepartamento(i);
    }

    public String getViewDepartamento() {

        String htmlcode = "<table class=\"Striped\">\n" +
                "\t\t\t\t\t <thead>\n" +
                "\t\t\t\t\t <tr>\n" +
                "\t\t\t\t   \t<th> nombreDepar </th>\n" +
                "\t\t\t\t    <th>Edificio</th>\n" +
                "\t\t\t\t    <th>Docente_RFC</th>\n" +
                "\t\t\t\t\t </tr>\n" +
                "\t\t\t\t\t </thead>" +
                "<tbody";

        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        int i = 0;

        for (Departamento a : modeloDepartamento.getAllDepartamento()) {
            htmlcode += "<tr>" +
                    "<td>" + a.getNombreDepar() + "</td>" +
                    "<td>" + a.getEdificio() + "</td>" +
                    "</tr>" + a.getDocente_RFC() + "</td>" +
                    "</tr>";
        }
        htmlcode += "</tbody>" +
                "</table>";
        return htmlcode;
    }
    public String getViewDepartamentoCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloDepartamento modeloDepartamento = new ModeloDepartamento();
        int i =0;

        for (Departamento a : modeloDepartamento.getAllDepartamento()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombreDepar() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Edificio: " + a.getEdificio() +
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
