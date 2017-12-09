package servlet;

import Controlador.ControladorAcademia;
import include.Academia;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AcademiaServlet",urlPatterns = {"/crearAcademia"})
public class AcademiaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Academia</h1>");
        int ClaveAcade = 0;
        int Docente_RFC = 0;
        String Nombre=
                request.getParameter("Nombre");


        try {
            ClaveAcade = Integer.parseInt(request.getParameter("ClaveAcade"));
            Docente_RFC = Integer.parseInt(request.getParameter("Docente_RFC"));

        } catch (NumberFormatException e){

        }
        Academia a = new Academia
                (ClaveAcade,Nombre,Docente_RFC);
        ControladorAcademia ca = new ControladorAcademia();
        if(ca.crearAcademia(a)) {
            response.sendRedirect("Academia.jsp");
            out.println("<p>Academia agregada</p>");
        } else {
            response.sendRedirect("crearacademia.jsp?Academia=error");
            out.println("<p>Academia no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}


