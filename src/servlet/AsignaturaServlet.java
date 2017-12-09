package servlet;

import Controlador.ControladorAsignatura;
import include.Asignatura;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AsignaturaServlet", urlPatterns = {"/crear_asignatura"})
public class AsignaturaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Materia</h1>");
        int Clave = 0;
        int Creditos = 0;
        int ClaveCarrera = 0;
        String Nombre=
                request.getParameter("Nombre");
        String Asignaturacol = request.getParameter("Nombre");

        try {
            Clave = Integer.parseInt(request.getParameter("Clave"));
            Creditos = Integer.parseInt(request.getParameter("Creditos"));
            ClaveCarrera = Integer.parseInt(request.getParameter("ClaveCarrera"));
        } catch (NumberFormatException e){

        }
        Asignatura a = new Asignatura
                (Clave,Nombre,Creditos,
                        ClaveCarrera);
        ControladorAsignatura ca = new ControladorAsignatura();
        if(ca.crear_asignatura(a)) {
            response.sendRedirect("Asignatura.jsp");
            out.println("<p>Asignatura agregado</p>");
                   } else {
            response.sendRedirect("crearasignatura.jsp?asignatura=error");
            out.println("<p>Asignatura no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

}
