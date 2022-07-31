package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static String status = "Não conectou...";

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
				status = ("STATUS ------> Não foi possível conectar a " + myDatabase + " !");
			}
			
			return connection;
		}catch(ClassNotFoundException e) { //caso o driver não seja encontrado
			System.out.println("O driver especificado não foi encontrado");
			return null;
		}catch(SQLException e) { //caso não conseguir acesso ao banco
			System.out.println("Não foi possível conectar-se ao banco de dados");
			return null;
		}
	}
	
	//Retorna o status da conexão
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
	
	//Reinicia a conexão
	public static java.sql.Connection ReiniciarConexao(){
		FecharConexao();
		
		return Conexao.getConexao();
	}
}
