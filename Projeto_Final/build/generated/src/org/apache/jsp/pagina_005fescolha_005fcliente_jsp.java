package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clientes.*;
import historico.*;
import historico.HistoricoDAO;

public final class pagina_005fescolha_005fcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\" /> \n");
      out.write("        <style>\n");
      out.write("            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" /> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
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
      out.write("                                <!--<li><a href=\"index.jsp\" target=\"_blank\">Home</a></li>-->\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"linha\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"coluna col5 sidebar\">\n");
      out.write("                    <h3>Eletricista</h3>\n");
      out.write("                    <img src=\"img/Eletricista.jpg\" alt=\"imagem eletricista\" style=\"width:335px;\"/>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li> <a href=\"login.jsp\" class=\"botao\">Faça seu Login Eletricista</a></li>\n");
      out.write("                        <li><u><strong></strong>  </u></li>\n");
      out.write("                        <li><p></p></li>                                         \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div style=\"margin-left: auto; width: 400px; height: 440px;\" class=\"coluna col5 sidebar\">\n");
      out.write("                    <h3>Avicultor</h3>\n");
      out.write("                    <img src=\"img/avicultor2.jpg\" alt=\"imagem avicultor\"/>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li> <a href=\"login.jsp\" class=\"botao\">Faça seu Login Avicultor</a></li>\n");
      out.write("                        <li><u><strong></strong>  </u></li>\n");
      out.write("                        <li><p></p></li>                                         \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("        </div>            \n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <div class=\"coluna col7\">\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Sejam Bem-vindos</h2>\n");
      out.write("                        <p>Organize seu dia com nossas ferramentas online</p>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col5\">\n");
      out.write("                    <h3>Esteja sempre conectado conosco</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/tomada.png\" alt=\"imagem tomada\">\n");
      out.write("                            <h4>Esteja sempre atualizado</h4>\n");
      out.write("                            <p>Mantenha seus dados sempre em dia</p>\n");
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
      out.write("    </body>\n");
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
