package servlet;

import Controlador.ControladorInstituto;
import include.Instituto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InstitutoServlet", urlPatterns = {"/crearInstituto"})
public class InstitutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<h1>Instituto</h1>");
        int ClaveInst = 0;
        String NombreInst = request.getParameter("NombreInst");
        String DireccionInst=
                request.getParameter("DireccionInst");


        try {
            ClaveInst = Integer.parseInt(request.getParameter("ClaveInst"));


        } catch (NumberFormatException e){

        }
        Instituto a = new Instituto
                (ClaveInst,NombreInst,DireccionInst);
        ControladorInstituto ca = new ControladorInstituto();
        if(ca.crearInstituto(a)) {
            response.sendRedirect("Instituto.jsp");
            out.println("<p>Instituto agregado</p>");
        } else {
            response.sendRedirect("crearinstituto.jsp?Instituto=error");
            out.println("<p>Instituto no agregado</p>");
        }
        //enctype="multipart/form-data"
        out.flush();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
}
