package servlet;

import Controlador.ControladorLibro;
import include.Libro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LibroServlet", urlPatterns = {"/crearLibro"})
public class LibroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Libro</h1>");
        int Año = 0;
        int ISBN = 0;



        String NombreLibro = request.getParameter("NombreLibro");
        String Autores = request.getParameter("Autores");
        String Editorial = request.getParameter("Editorial");
        String Edicion = request.getParameter("Edicion");






        try {
            Año = Integer.parseInt(request.getParameter("Año"));
             ISBN = Integer.parseInt(request.getParameter("ISBN"));
        } catch (NumberFormatException e){

        }
        Libro a = new Libro
                (NombreLibro, Autores, Editorial , Año, ISBN, Edicion);
        ControladorLibro ca = new ControladorLibro();
        if(ca.crearLibro(a)) {
            response.sendRedirect("Libro.jsp");
            out.println("<p>Libro agregado</p>");
        } else {
            response.sendRedirect("crearlibro.jsp?libro=error");
            out.println("<p>libro no agregada</p>");
        }
        //enctype="multipart/form-data"
        out.flush();

    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

}
