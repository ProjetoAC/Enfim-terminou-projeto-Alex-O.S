/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADM
 */
public class Salvar_Historico_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Salvar_Historico_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Salvar_Historico_Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
        int codigo_historico = Integer.valueOf(request.getParameter("codigo_historico"));
        String pendente = request.getParameter("pendente");
        String observacao = request.getParameter("observacao");
        String tb_concluido = request.getParameter("tb_concluido");
        
        HistoricoDAO.salvar_historico(codigo_historico, pendente, observacao, tb_concluido);
          
        response.sendRedirect("historico.jsp");
        */
        
        if (request.getParameter("codigo_historico").isEmpty()
                || request.getParameter("pendente").isEmpty()
                || request.getParameter("data_inicio").isEmpty()
                || request.getParameter("data_termino").isEmpty()
                || request.getParameter("tb_concluido").isEmpty()
                || request.getParameter("observacao").isEmpty()) {
   request.setAttribute("erro",
                    "Preencha todos os campos corretamente.");
            request.getRequestDispatcher(
                    "pendencia.jsp")
                    .forward(request, response);
        } else {

            int codigo_historico = Integer.valueOf(request.getParameter("codigo_historico"));
            String pendente = request.getParameter("pendente");
            String data_inicio = request.getParameter("data_inicio");
            String data_termino = request.getParameter("data_termino");
            String tb_concluido = request.getParameter("tb_concluido");
            String observacao = request.getParameter("observacao");

            HistoricoDAO.salvar_historico(codigo_historico, pendente, data_inicio, data_termino, tb_concluido, observacao);

            //serve para deixar mensagem é utilizado para aparecer na mesma pagina
            /*
            request.setAttribute("sucesso",
                    "Cadastro realizado com sucesso!");
            request.getRequestDispatcher(
                 //   "listar_cliente.jsp") 
                    .forward(request, response);
             */
            response.sendRedirect("listar_historico.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
