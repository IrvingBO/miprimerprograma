package servlet;

import Controlador.ControladorDepartamento;
import include.Departamento;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DepartamentoServlet", urlPatterns = {"/crearDepartamento"})
public class DepartamentoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Departamento</h1>");

        int Edificio = 0;
        int Docente_RFC = 0;
        String nombreDepar=
                request.getParameter("nombreDepar");



        try {
            Edificio = Integer.parseInt(request.getParameter("Edificio"));
            Docente_RFC = Integer.parseInt(request.getParameter("Docente_RFC"));

        } catch (NumberFormatException e){
            out.println(nombreDepar);
            out.println(Edificio);
            out.println(Docente_RFC);
        }


        Departamento a = new Departamento
                (nombreDepar, Edificio ,Docente_RFC);
        ControladorDepartamento ca = new ControladorDepartamento();
        if(ca.crearDepartamento(a)) {
            response.sendRedirect("Departamento.jsp");
            out.println("<p>Departamento agregada</p>");
        } else {
            response.sendRedirect("creardepartamento.jsp?Departamento=error");
            out.println("<p>Departamento no agregada</p>");
        }


    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


    }
}
