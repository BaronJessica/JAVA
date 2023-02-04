package br.com.taking.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost/taking", "root","root");
			
			Statement stmt = conn.createStatement();
			//stmt.executeUpdate("INSERT INTO contato (nome, numero) VALUES ('TESTE', '000.000.000')");
			stmt.executeUpdate("UPDATE contato set nome='Vitor', numero='444.55' WHERE id=10");
			//consulta na tabela contato
			ResultSet rs = stmt.executeQuery("SELECT * FROM contato");
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Numero: " + rs.getString("numero"));
				System.out.println("=============");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace(); //e objeto da exceção, metodo printoStackTrace pega a info da exceção e joga no console todo o caminho até chamada
		}
	}

}
