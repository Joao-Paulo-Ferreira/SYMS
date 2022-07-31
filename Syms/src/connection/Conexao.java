package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static String status = "N�o conectou...";

	public Conexao() {
		
	}
	
	public static java.sql.Connection getConexao(){
		Connection connection = null;
		
		try {
			//carregando driver jdbc
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
			
			//config da conexao com BD
			String nomeServer = "localhost";
			String myDatabase = "syms";
			String url = "jdbc:mysql://" + nomeServer + "/" + myDatabase;
			String username = "root";
			String password = "jp2421";
			
			connection = DriverManager.getConnection(url, username, password);
			
			String status = "";
			//teste da conexao
			if(connection != null) {
				status = ("STATUS ------> Conectado a " + myDatabase + " com sucesso!");
			}else {
				status = ("STATUS ------> N�o foi poss�vel conectar a " + myDatabase + " !");
			}
			
			return connection;
		}catch(ClassNotFoundException e) { //caso o driver n�o seja encontrado
			System.out.println("O driver especificado n�o foi encontrado");
			return null;
		}catch(SQLException e) { //caso n�o conseguir acesso ao banco
			System.out.println("N�o foi poss�vel conectar-se ao banco de dados");
			return null;
		}
	}
	
	//Retorna o status da conex�o
	public static String statusDaConexao() {
		return status;
	}
	
	//Fecha a conexao
	public static boolean FecharConexao() {
		try {
			Conexao.getConexao().close();
			return true;
		}catch(SQLException e) {
			return false;
		}
	}
	
	//Reinicia a conex�o
	public static java.sql.Connection ReiniciarConexao(){
		FecharConexao();
		
		return Conexao.getConexao();
	}
}
