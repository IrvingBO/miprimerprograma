package servlet;

import Controlador.ControladorLista;
import include.Lista;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ListaServlet", urlPatterns = {"/crearLista"})
public class ListaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista</h1>");
        int NumeroSolicitud = 0;
        int Libro_ISBN = 0;
        int Asignatura_clave= 0;



        try {
            NumeroSolicitud = Integer.parseInt(request.getParameter("NumeroSolicitud"));
            Libro_ISBN = Integer.parseInt(request.getParameter("Libro_ISBN"));
            Asignatura_clave = Integer.parseInt(request.getParameter("Asignatura_clave"));

        } catch (NumberFormatException e){

        }
        Lista a = new Lista
                (NumeroSolicitud,Libro_ISBN,Asignatura_clave);
        ControladorLista ca = new ControladorLista();
        if(ca.crearLista(a)) {
            response.sendRedirect("Lista.jsp");
            out.println("<p>Lista agregada</p>");
        } else {
            response.sendRedirect("crearlista.jsp?Lista=error");
            out.println("<p>Lista no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
