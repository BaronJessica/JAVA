package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import infra.MySQLConnectionFactory;

public class ContatoDAOMySQL implements IContatoDAO {

	@Override
	public void incluir(Contato contato) {
		Connection conn = MySQLConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO contato (nome, numero) VALUES (?, ?)");

			pstmt.setString(1, contato.getNome());
			pstmt.setString(2, contato.getNumero());

			pstmt.executeUpdate();

			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override

	public void atualizar(Contato contato) {

		Connection conn = MySQLConnectionFactory.getConnection();

		try {
			PreparedStatement pstmt = conn.prepareStatement("UPDATE contato set nome=?, numero=? WHERE id=?");

			pstmt.setString(1, contato.getNome());
			pstmt.setString(2, contato.getNumero());
			pstmt.setInt(3, contato.getId());

			pstmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void remover(int id) {

		Connection conn = MySQLConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt = conn.prepareStatement("DELETE FROM contato WHERE id=?");

			pstmt.setInt(1, id);

			pstmt.executeUpdate();

			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Contato> obterTodos() {

		Connection conn = MySQLConnectionFactory.getConnection();

		try {
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT id, nome, numero FROM contato ");

			List<Contato> listaContatos = new ArrayList<>();

			while (rs.next()) {

				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String numero = rs.getString("numero");

				Contato contato = new Contato(id, nome, numero);

				listaContatos.add(contato);
			}

			conn.close();

			return listaContatos;

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public Contato obterPorId(int id) {
		Connection conn = MySQLConnectionFactory.getConnection();

		try {

			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT id, nome, numero FROM contato WHERE id=" + id);

			if (rs.next()) {
				int identificador = rs.getInt("id");
				String nome = rs.getString("nome");
				String numero = rs.getString("numero");

				conn.close();

				Contato contato = new Contato(identificador, nome, numero);
				return contato;

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

}