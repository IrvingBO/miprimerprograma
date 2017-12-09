package servlet;

import Controlador.ControladorCarrera;
import include.Carrera;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CarreraServlet",urlPatterns = {"/crearCarrera"})
public class CarreraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Carrera</h1>");
        int ClaveCarrera = 0;
        String Nombre=
                request.getParameter("Nombre");
        try {

            ClaveCarrera = Integer.parseInt(request.getParameter("Clavecarrera"));
        } catch (NumberFormatException e){

        }
        Carrera a = new Carrera
                (ClaveCarrera, Nombre);
        ControladorCarrera ca = new ControladorCarrera();
        if(ca.crearCarrera(a)) {
            response.sendRedirect("Carrera.jsp");
            out.println("<p>Carrera agregada</p>");
        } else {
            response.sendRedirect("crearcarrera.jsp?Carrera=error");
            out.println("<p>Carrera no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}