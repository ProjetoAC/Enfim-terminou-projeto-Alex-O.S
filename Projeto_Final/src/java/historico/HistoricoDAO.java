/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historico;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADM
 */
public class HistoricoDAO {

    public static void salvar_historico(int codigo_historico, String pendente, String data_inicio, String data_termino, String tb_concluido, String observacao) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("insert into historicos(codigo_historico, pendente, data_inicio, data_termino, tb_concluido, observacao) values (?, ?, ?, ?, ?, ?);");

            hist.setInt(1, codigo_historico);
            hist.setString(2, pendente);

            hist.setString(3, data_inicio);
            Date data = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data_inicio).getTime()); // para fazer a data e criar o campo incluir add cat clause

            hist.setString(4, data_termino);
            //Date data = new Date(new SimpleDateFormat("yyyy-MM-dd").parse(data).getTime()); // para fazer a data e criar o campo incluir add cat clause

            hist.setString(5, tb_concluido);
            hist.setString(6, observacao);

            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static ArrayList<Historico> listar_historico() {
        ArrayList<Historico> historicos = new ArrayList<Historico>();

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos");

            ResultSet rs = hist.executeQuery();

            while (rs.next()) {
                Historico historico = new Historico();
                historico.codigo_historico = rs.getInt("codigo_historico");
                historico.pendente = rs.getString("pendente");
                historico.data_inicio = rs.getString("data_inicio");
                historico.data_termino = rs.getString("data_termino");
                historico.tb_concluido = rs.getString("tb_concluido");
                historico.observacao = rs.getString("observacao");

                historicos.add(historico);
            }

            rs.close();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historicos;
    }

    public static Historico buscar(int codigo_historico) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("select * from historicos where codigo_historico = ?");

            hist.setInt(1, codigo_historico);
            ResultSet rs = hist.executeQuery();

            rs.next();

            Historico historico = new Historico();

            historico.codigo_historico = rs.getInt("codigo_historico");
            historico.pendente = rs.getString("pendente");
            historico.data_inicio = rs.getString("data_inicio");
            historico.data_termino = rs.getString("data_termino");
            historico.tb_concluido = rs.getString("tb_concluido");
            historico.observacao = rs.getString("observacao");
            rs.close();
            hist.close();
            conexao.close();

            return historico;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void atualizar(int codigo_historico, String pendente, String data_inicio, String data_termino, String tb_concluido, String observacao) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("update historicos set pendente = ?, data_inicio = ?, data_termino = ?, tb_concluido = ?, observacao = ? where codigo_historico = ?");

            hist.setString(1, pendente);
            hist.setString(2, data_inicio);
            hist.setString(3, data_termino);
            hist.setString(4, tb_concluido);
            hist.setString(5, observacao);
            hist.setInt(6, codigo_historico);

            hist.executeUpdate();
            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void excluir(int codigo_historico) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projeto_final", "postgres", "oifio2016");

            PreparedStatement hist = conexao.prepareStatement("delete from historicos where codigo_historico = ?");

            hist.setInt(1, codigo_historico);
            hist.executeUpdate();

            hist.close();
            conexao.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
