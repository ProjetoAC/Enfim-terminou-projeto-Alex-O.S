package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clientes.*;
import clientes.ClienteDAO;
import cidades.*;
import cidades.CidadeDAO;

public final class atualizar_005feditar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>autalizar ou editar </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"normalize.css\" /> \n");
      out.write("        <style>\n");
      out.write("            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilos.css\" /> \n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <header>\n");
      out.write("                    <div class=\"coluna col4\">\n");
      out.write("                        <h1 style=\"color: #fff;\" class=\"logo\">Elefra O.S</h1>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"coluna col8\">\n");
      out.write("                        <nav>\n");
      out.write("                            <ul class=\"menu inline sem-marcador\">\n");
      out.write("                                <!--<li> <a href=\"cadastro_principal.jsp\" target=\"_blank\">Gerenciador &raquo;</a></li> -->\n");
      out.write("                                <li><a href=\"index.jsp\">Home &raquo;</a></li>\n");
      out.write("                                <li> <a href=\"listar_cliente.jsp\">Pessoas &raquo;</a></li>\n");
      out.write("                                <li> <a href=\"login.jsp\">Login &raquo;</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </header>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <section>\n");
      out.write("            <div class=\"coluna col5 sidebar\">\n");
      out.write("\n");
      out.write("                <h2><em>Empresa Elefra</em></h2>\n");
      out.write("                <img src=\"img/TRABALHO 2.png\" alt=\"imagem logo\"/>\n");
      out.write("                <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                    <li><u><strong>Elefra O.S</strong>  </u></li>\n");
      out.write("                    <li><strong>Endereço:</strong></li>\n");
      out.write("                    <li>Rua das Camélias, 123</li>\n");
      out.write("                    <li>Bairro das Flores</li>\n");
      out.write("                    <li>Bela Flor - Pr</li>                                           \n");
      out.write("                </ul>\n");
      out.write("                <h3>Contato Direto</h3>\n");
      out.write("                <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                    <li>Fone: <strong>(46) 9999-9999</strong></li>\n");
      out.write("                    <li>e-mail: <strong>elefra@elefra.com</strong></li>\n");
      out.write("                    <li>Facebook: <strong>elefra.facebook</strong></li>                                           \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div  class=\"coluna col7 contato\">\n");
      out.write("\n");
      out.write("                ");
 int codigo_cliente = Integer.valueOf(request.getParameter("codigo_cliente"));
                    Cliente cliente = ClienteDAO.buscar(codigo_cliente);
                
      out.write("\n");
      out.write("\n");
      out.write("                <form  action=\"EditarServlet\" method=\"post\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <label>Código:</label>\n");
      out.write("                    <input name=\"codigo_cliente\" value=\"");
      out.print( cliente.codigo_cliente);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label> Nome: </label>\n");
      out.write("                    <input name=\"nome_cliente\" value=\"");
      out.print( cliente.nome_cliente);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label> Login/Usuário </label>\n");
      out.write("                    <input name=\"login_usuario\" value=\"");
      out.print( cliente.login_usuario);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Cliente:</label>\n");
      out.write("                    <select style=\"width: 300px; height: 30px;\" name=\"cliente\">\n");
      out.write("                        <option value=\"\" style=\"color: #C0C0C0\">Escolha o Cliente</option>\n");
      out.write("                        <option value=\"Eletricista\" style=\"color: #000000\">Eletricista</option>\n");
      out.write("                        <option value=\"Avicultor\" style=\"color: #000000\">Avicultor</option>\n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <label>E-mail:</label>\n");
      out.write("                    <input name=\"email\" value=\"");
      out.print( cliente.email);
      out.write("\"> \n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Residêncial:</label>\n");
      out.write("                    <input name=\"telefone\" value=\"");
      out.print( cliente.telefone);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Celular:</label>\n");
      out.write("                    <input name=\"celular\" value=\"");
      out.print( cliente.celular);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Senha:</label>\n");
      out.write("                    <input name=\"senha\" type=\"password\" value=\"");
      out.print( cliente.senha);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Cidade:</label>\n");
      out.write("                    <input  name=\"nome_cidade\" value=\"");
      out.print( cliente.cidade);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <label>Estado:</label>\n");
      out.write("                    <select name=\"estado\">\n");
      out.write("                        <option value=\"AC\">AC</option>\n");
      out.write("                        <option value=\"AL\">AL</option>\n");
      out.write("                        <option value=\"AP\">AP</option>\n");
      out.write("                        <option value=\"AM\">AM</option>\n");
      out.write("                        <option value=\"BA\">BA</option>\n");
      out.write("                        <option value=\"CE\">CE</option>\n");
      out.write("                        <option value=\"DF\">DF</option>\n");
      out.write("                        <option value=\"ES\">ES</option>\n");
      out.write("                        <option value=\"GO\">GO</option>\n");
      out.write("                        <option value=\"MA\">MA</option>\n");
      out.write("                        <option value=\"MT\">MT</option>\n");
      out.write("                        <option value=\"MS\">MS</option>\n");
      out.write("                        <option value=\"MG\">MG</option>\n");
      out.write("                        <option value=\"PA\">PA</option>\n");
      out.write("                        <option value=\"PB\">PB</option>\n");
      out.write("                        <option value=\"PR\">PR</option>\n");
      out.write("                        <option value=\"PE\">PE</option>\n");
      out.write("                        <option value=\"PI\">PI</option>\n");
      out.write("                        <option value=\"RJ\">RJ</option>\n");
      out.write("                        <option value=\"RN\">RN</option>\n");
      out.write("                        <option value=\"RS\">RS</option>\n");
      out.write("                        <option value=\"RO\">RO</option>\n");
      out.write("                        <option value=\"RR\">RR</option>\n");
      out.write("                        <option value=\"SC\">SC</option>\n");
      out.write("                        <option value=\"SP\">SP</option>\n");
      out.write("                        <option value=\"SE\">SE</option>\n");
      out.write("                        <option value=\"TO\">TO</option>   \n");
      out.write("                    </select>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <label>Observação:</label>                       \n");
      out.write("                    <textarea  name=\"observacao\"></textarea>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" class=\"botao\"  value=\"Cadastrar\">\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"conteudo-extra\">\n");
      out.write("            <div class=\"linha\">\n");
      out.write("                <div class=\"coluna col7\">\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Atenção:</h2>\n");
      out.write("                        <p>Analise todas as informações para Atualizar o cadastro</p>\n");
      out.write("                    </section>\n");
      out.write("                    <section>\n");
      out.write("                        <h2>Avisos</h2>\n");
      out.write("                        <p>Neste site você pode analisar o quando pode ser útil para o auxílio de todo eletricista</p>\n");
      out.write("                        <h2>O que você irá encontrar no Site ?</h2>\n");
      out.write("                        <p>Tendo o melhor assistente para ajudar no que for preciso na organização das suas tarefas</p>\n");
      out.write("                        <h2>Temas</h2>\n");
      out.write("                        <p>Tendo como o propósito atender a sua necessidade de continuas melhoras no ramo de atuação</p>\n");
      out.write("                    </section>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"coluna col5\">\n");
      out.write("                    <h3>Noticias</h3>\n");
      out.write("                    <ul class=\"sem-marcador sem-padding noticias\">\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/imagem lanterna.jpg\" alt=\"imagem lanterna\" />\n");
      out.write("                            <h4>Acompanhe as ultimas tendências</h4>\n");
      out.write("                            <p>Surgindo no mercado um organizador de tarefas para eletricistas que \n");
      out.write("                                tenham como foco a manutenção de aviários na região sudoeste do Paraná.\n");
      out.write("                                Para ser mais preciso no munícipio de Dois Vizinhos, onde, se concentram as maiores empresas \n");
      out.write("                                do ramo de aves da américa latina.\n");
      out.write("                                <!-- <a href=\"\">leia mais &raquo;</a></p> -->\n");
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
      out.write("</html>");
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
