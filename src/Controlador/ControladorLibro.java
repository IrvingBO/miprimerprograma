package Controlador;

import Modelo.ModeloLibro;
import include.Libro;

public class ControladorLibro {

    public boolean crearLibro(Libro i) {
        ModeloLibro modeloLibro = new ModeloLibro();
        return modeloLibro.crearLibro(i);
    }

    public String getViewLibroCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloLibro modeloLibro = new ModeloLibro();
        int i =0;

        for (Libro a : modeloLibro.getAllLibro()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNombreLibro() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Autores: " + a.getAutores() +
                    "                   <br>ISBN: " + a.getISBN() +
                    "                   <br>Editorial: " + a.getEditorial() +
                    "                   <br>Año: " + a.getAño() +
                    "                   <br>Edicion: " + a.getEdicion() +

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
