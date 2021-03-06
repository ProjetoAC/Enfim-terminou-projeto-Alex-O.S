package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clientes.*;

public final class listar_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista Cliente</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\" /> \n");
      out.write("        <style>\n");
      out.write("            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" /> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"coluna col4\">\n");
      out.write("                        <h1 class=\"logo\">Elefra O.S</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"coluna col8\">\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"menu inline sem-marcador\">\n");
      out.write("                                <li><a href=\"cadastro_principal.jsp\">Gerenciador</a></li>\n");
      out.write("                                <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section>\n");
      out.write("            <div style=\"margin-left: 150px;\" align=\"center\" class=\"coluna col7 contato\">\n");
      out.write("                <h2 align=\"center;\">Lista de Clientes</h2>\n");
      out.write("                <table  border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>codigo_cliente</td>\n");
      out.write("                            <td>nome_cliente</td>\n");
      out.write("                            <td>email</td>\n");
      out.write("                            <td>telefone</td>\n");
      out.write("                            <td>celular</td>\n");
      out.write("                            <td>senha</td>\n");
      out.write("                            <td>observacao</td>\n");
      out.write("                            <td>cidade</td>\n");
      out.write("                            <td>estado</td>\n");
      out.write("                            <td>editar</td>\n");
      out.write("                            <td>excluir</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    \n");
      out.write("                        ");
 for (Cliente cliente : ClienteDAO.listar_cliente()) {
      out.write("  \n");
      out.write("                        <tr>\n");
      out.write("                            <td> ");
      out.print( cliente.codigo_cliente);
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( cliente.nome_cliente);
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( cliente.email);
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( cliente.telefone);
      out.write(" </td>  \n");
      out.write("                            <td> ");
      out.print( cliente.celular);
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( cliente.senha);
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print( cliente.observacao);
      out.write(" </td> \n");
      out.write("                            <td> ");
      out.print( cliente.nome_cidade);
      out.write(" </td>   <!--cliente.cidade.nome -->\n");
      out.write("                            <td> ");
      out.print( cliente.estado);
      out.write(" </td>   <!--cliente.cidade.estado -->\n");
      out.write("\n");
      out.write("                            <td> <a href=\"atualizar_editar.jsp?codigo_cliente=");
      out.print(cliente.codigo_cliente);
      out.write("\"> Editar </a> </td>\n");
      out.write("                            <td> <a href=\"ExcluirServlet?codigo_cliente=");
      out.print(cliente.codigo_cliente);
      out.write("\"> Excluir </a> </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>  \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <div class=\"coluna col7\">\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Pendências</h2>\n");
      out.write("                        <p>Certifique que todos os trabalhos foram bem feitos</p>\n");
      out.write("                        <p>caso não esteja satisfeito entre em contato com o nosso</p>\n");
      out.write("                        <p>telefone de contato (99)9999-9999</p>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col5\">\n");
      out.write("                    <h3>Histórico</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/pessoas2.jpg\" alt=\"imagem pessoas \" />\n");
      out.write("                            <h4>Acompanhe todo o histórico de serviços</h4>\n");
      out.write("                            <p>Estará sempre atualizado com as ultimas informações\n");
      out.write("                                para sempre cumprirmos</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"linha\">\n");
      out.write("                    <footer>\n");
      out.write("                        <div class=\"coluna col12\">\n");
      out.write("                            <span>&copy; 2016 Elefra O.S gerenciador de tarefas </span>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
