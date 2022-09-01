/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.mail.MessagingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(urlPatterns = {"/ParametrosCorreo"})
public class ParametrosCorreo extends HttpServlet {

    private String servidor, puerto, usuario, clave;

    public void init() {
        ServletContext contex = getServletContext();
        servidor = contex.getInitParameter("servidor");
        puerto = contex.getInitParameter("puerto");
        usuario = contex.getInitParameter("usuario");
        clave = contex.getInitParameter("clave");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destinatario = request.getParameter("destinatario");
        String asunto = request.getParameter("asunto");
        String contenido = request.getParameter("contenido");

        //se deja vacio para despues llenarlo en la excepcion o en el try
        String resultado = "";

        try {
            EnvioCorreo.enviarCorreo(servidor, puerto, usuario, clave, destinatario, asunto, contenido);
            resultado = "El mensaje se envio correctamente";
        } catch (MessagingException e) {
            resultado = "Error de envio " + e.getMessage();
            e.printStackTrace();
        } finally {
            request.setAttribute("resultado", resultado);
            getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
        }

    }

}
