package servlet;

import Controlador.ControladorCicloEscolar;
import include.CicloEscolar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CicloEscolarServlet", urlPatterns = {"/crearCiclo"})
public class CicloEscolarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Ciclo Escolar</h1>");
        int ClaveCiclo = 0;
        String Nombre=
                request.getParameter("Nombre");
        try {

            ClaveCiclo = Integer.parseInt(request.getParameter("ClaveCiclo"));
        } catch (NumberFormatException e){

        }
        CicloEscolar a = new CicloEscolar
                (ClaveCiclo, Nombre);
        ControladorCicloEscolar ca = new ControladorCicloEscolar();
        if(ca.crearCiclo(a)) {
            response.sendRedirect("CicloEscolar.jsp");
            out.println("<p>Ciclo Escolar agregada</p>");
        } else {
            response.sendRedirect("crearcicloescolar.jsp?CicloEscolar=error");
            out.println("<p>Ciclo Escolar no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
