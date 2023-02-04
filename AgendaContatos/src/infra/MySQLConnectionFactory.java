package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionFactory {
 //metodo estatico nao depende do objeto da classe, nao depende atributos ou parametros
	
	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/taking", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
