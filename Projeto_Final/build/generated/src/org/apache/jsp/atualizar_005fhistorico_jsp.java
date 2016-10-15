package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import historico.*;
import historico.HistoricoDAO;

public final class atualizar_005fhistorico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Pendencia</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\" /> \n");
      out.write("        <style>\n");
      out.write("            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" /> \n");
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
      out.write("                                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                                <li><a href=\"listar_historico.jsp\">Histórico</a></li>\n");
      out.write("                                <li><a href=\"pendencia.jsp\">Pendência</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"linha\">\n");
      out.write("            <section>\n");
      out.write("                <div class=\"coluna col5 sidebar\">\n");
      out.write("                    <h3>Seleção de Pendência</h3>\n");
      out.write("                    <img src=\"img/clique5.jpg\" alt=\"imagem check\" />\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li><u><strong>Elefra O.S</strong>  </u></li>\n");
      out.write("                        <li><strong>Endereço:</strong></li>\n");
      out.write("                        <li>Rua das Camélias, 123</li>\n");
      out.write("                        <li>Bairro das Flores</li>\n");
      out.write("                        <li>Bela Flor - Pr</li>                                           \n");
      out.write("                    </ul>\n");
      out.write("                    <h3>Contato Direto</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>Fone: <strong>(46) 9999-9999</strong></li>\n");
      out.write("                        <li>e-mail: <strong>elefra@elefra.com</strong></li>\n");
      out.write("                        <li>Facebook: <strong>elefra.facebook</strong></li>                                           \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
 int codigo_historico = Integer.valueOf(request.getParameter("codigo_historico"));
                    Historico historico = HistoricoDAO.buscar(codigo_historico);
                
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"coluna col7 contato\">\n");
      out.write("                    <h2>Escolha a opção de Serviço:</h2>\n");
      out.write("                    <form action=\"Editar_Historico_Servlet\" method=\"post\"> \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <label>Codigo do Serviço:</label>\n");
      out.write("                        <input placeholder=\"verificar codigo\" name=\"codigo_historico\" value=\"");
      out.print( historico.codigo_historico);
      out.write("\">\n");
      out.write("                        <br> \n");
      out.write("                        <label>Descrição do Serviço:</label>\n");
      out.write("                        <select name=\"pendente\">\n");
      out.write("                            <option value=\"troc.lamp\">Troca de Lampada</option>\n");
      out.write("                            <option value=\"rep.com\">Reparo no Comedouro</option>\n");
      out.write("                            <option value=\"rep.vent\">Reparo na Ventilação</option>\n");
      out.write("                            <option value=\"rep.bebedouros\">Reparo no Bebedouros</option>\n");
      out.write("                            <option value=\"cons.aquecedor\">Conserto no Aquecedor</option>\n");
      out.write("                            <option value=\"reg.umidade\">Regulagem da Umidade</option>\n");
      out.write("                        </select> \n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <label>Trabalhos Concluidos:</label>\n");
      out.write("                       <select name=\"tb_concluido\">\n");
      out.write("                            <option value=\"Sim\">Sim</option>\n");
      out.write("                            <option value=\"Não\">Não</option>\n");
      out.write("                       </select>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <label>Observação:</label>\n");
      out.write("                        <textarea  name=\"observacao\">");
      out.print(historico.observacao);
      out.write("</textarea>\n");
      out.write("                        <input type=\"submit\" class=\"botao\" value=\"Salvar &raquo;\" />\n");
      out.write("                    </form> \n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <div class=\"coluna col7\">\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Atenção:</h2>\n");
      out.write("                        <p>Analise todas as informações para não efetuar o cadastro errado</p>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col5\">\n");
      out.write("                    <h3>Seja um novo cliente</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/clique.png\" alt=\"imagem pessoas \">\n");
      out.write("                            <h4>Venha fazer parte de nossos clientes</h4>\n");
      out.write("                            <p>Teremos sempre o privilégio de termos conosco</p>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
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
