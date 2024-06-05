package bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class FabricaConexao {
	
	private static String USUARIO = "root";
	private static String SENHA = "root";
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/exemplo?useTimezone=true&serverTimezone=UTC";
	
	
	public Connection criarConexaoComBaseExemplo() {
		
		Connection conexaoBandoDadosExemplo = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conexaoBandoDadosExemplo = DriverManager.getConnection(BANCO_URL,USUARIO,SENHA);
			
			System.out.println("Deu certo a conexão!!!!");
			
			
		} catch (Exception e) {

			System.out.println("Deu errado a conexão!!!!");
		}
		
		
		return conexaoBandoDadosExemplo;
	}
	
	
	
	
	
	

}
