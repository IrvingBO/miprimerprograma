package Controlador;


import Modelo.ModeloLista;
import include.Lista;

public class ControladorLista {

    public boolean crearLista(Lista i) {
        ModeloLista modeloLista = new ModeloLista();
        return modeloLista.crearLista(i);
    }

    public String getViewListaCards() {
        String htmlcode = " <div class=\"row\">\n";
        ModeloLista modeloLista = new ModeloLista();
        int i =0;

        for (Lista a : modeloLista.getAllLista()){
            htmlcode += "<div class=\"col s4 m4\">\n" +
                    "       <div class=\"card blue-grey darken-1\">\n" +
                    "           <div class=\"card-content white-text\"> " +
                    "               <span class=\"card-title\">" +
                    a.getNumeroSolicitud() +
                    "               </span> " +
                    "               <p>" +
                    "                   <br>Libro ISBN: " + a.getLibro_ISBN() +
                    "                   <br>Asignatura: " + a.getAsignatura_clave() +

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
