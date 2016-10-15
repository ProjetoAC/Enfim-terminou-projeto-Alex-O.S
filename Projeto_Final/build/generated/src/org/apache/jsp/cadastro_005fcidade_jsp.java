package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cidades.Cidade;
import cidades.*;

public final class cadastro_005fcidade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cadastro Cidade</title>\n");
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
      out.write("                                <li><a href=\"index.jsp\">Home &raquo;</a></li>\n");
      out.write("                                <li><a href=\"listar_cidade.jsp\" target=\"_blank\">Lista de Cidade &raquo</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"linha\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"coluna col5 sidebar\">\n");
      out.write("                    <h3>Cadastre sua Cidade &raquo;</h3>\n");
      out.write("                    <img src=\"img/mapa.jpg\" alt=\"imagem pessoas\" />\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li><u><strong>Elefra O.S</strong>  </u></li>\n");
      out.write("                        <li><p>Cuidando sempre de você</p></li>                                         \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col7 contato login\">\n");
      out.write("                    <h1>Cadastro Cidade</h1>\n");
      out.write("\n");
      out.write("                    <form action=\"Salvar_Cidade_Servlet\" method=\"post\">\n");
      out.write("                        <label>Codigo Cidade:</label>\n");
      out.write("                        <input name=\"codigo_cidade\">\n");
      out.write("                        <br>\n");
      out.write("                        <label>Nome Cidade:</label>\n");
      out.write("                        <input name=\"nome_cidade\">\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <label>Estado:</label>\n");
      out.write("                        <select name=\"estado\">\n");
      out.write("                            <option value=\"AC\">AC</option>\n");
      out.write("                            <option value=\"AL\">AL</option>\n");
      out.write("                            <option value=\"AP\">AP</option>\n");
      out.write("                            <option value=\"AM\">AM</option>\n");
      out.write("                            <option value=\"BA\">BA</option>\n");
      out.write("                            <option value=\"CE\">CE</option>\n");
      out.write("                            <option value=\"DF\">DF</option>\n");
      out.write("                            <option value=\"ES\">ES</option>\n");
      out.write("                            <option value=\"GO\">GO</option>\n");
      out.write("                            <option value=\"MA\">MA</option>\n");
      out.write("                            <option value=\"MT\">MT</option>\n");
      out.write("                            <option value=\"MS\">MS</option>\n");
      out.write("                            <option value=\"MG\">MG</option>\n");
      out.write("                            <option value=\"PA\">PA</option>\n");
      out.write("                            <option value=\"PB\">PB</option>\n");
      out.write("                            <option value=\"PR\">PR</option>\n");
      out.write("                            <option value=\"PE\">PE</option>\n");
      out.write("                            <option value=\"PI\">PI</option>\n");
      out.write("                            <option value=\"RJ\">RJ</option>\n");
      out.write("                            <option value=\"RN\">RN</option>\n");
      out.write("                            <option value=\"RS\">RS</option>\n");
      out.write("                            <option value=\"RO\">RO</option>\n");
      out.write("                            <option value=\"RR\">RR</option>\n");
      out.write("                            <option value=\"SC\">SC</option>\n");
      out.write("                            <option value=\"SP\">SP</option>\n");
      out.write("                            <option value=\"SE\">SE</option>\n");
      out.write("                            <option value=\"TO\">TO</option>   \n");
      out.write("                        </select>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\"  value=\"Cadastrar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <div class=\"coluna col7\">\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Atenção:</h2>\n");
      out.write("                        <p>Analise todas as informações para não efetuar o cadastro errado</p>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col5\">\n");
      out.write("                    <h3>Escolha sempre o melhor lugar</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/mapa icone.jpg\" alt=\"img/imagem icone mapa\">\n");
      out.write("                            <h4></h4>\n");
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
