package persistencia;

import java.awt.geom.GeneralPath;
import java.sql.Connection;
import java.sql.PreparedStatement;

import entidade.Gerente;

// Data Acess Objeto -> Essa classe é especialista em transações de banco de dados do objeto GERENTE
public class DaoGerente {

	public boolean salvarGerente(Gerente gerente) {
		
		
		boolean salvamento = false;
		
		FabricaConexao conexaoFabricaConexao = new FabricaConexao();// Instacia a classe Fabrica de conexão
		Connection  connectionBaseExemplo = null; // Cria o objeto de conexão como null
		PreparedStatement preparaOcomandoSQL = null; // Cria o objeto que prepara o comando SQL
		
		String comandoSqlInsert = "insert into tb_gerente (cpf, nome, gerencia) values (?, ?, ?)"; // Base do comando SQL
		
		try {
			 connectionBaseExemplo = conexaoFabricaConexao.criarConexaoComBaseCadastroUsuario(); // Recebe o objeto de conexão da classe Fabrica de conexão
			 
			 preparaOcomandoSQL = connectionBaseExemplo.prepareStatement(comandoSqlInsert);// Armazena a conexão e o comando SQL que vai ser preparado
			 
			 preparaOcomandoSQL.setString(1, gerente.getCpf());// Coloca o valor no campo cpf
			 preparaOcomandoSQL.setString(2, gerente.getNome()); // Colocar o valor no campo nome
			 preparaOcomandoSQL.setString(3, gerente.getGerencia()); // Colocar o valor no campo email
			 
			 preparaOcomandoSQL.execute(); // Executa o comando no banco de dados
			 
			 System.out.println("A pessoa foi registrada");//Log
			 
			 salvamento = true; // Se tudo funcionar certo
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Não foi possivel salvar a pessoa!!!");
			
		}finally { // Esse é obrigatorio
			try {
				if(connectionBaseExemplo != null) {
					connectionBaseExemplo.close();//Se objeto connectionBaseExemplo estiver aberto essa linha vai encerrar
				}
				if(preparaOcomandoSQL != null) {//Se objeto preparaOcomandoSQL estiver aberto essa linha vai encerrar
					preparaOcomandoSQL.close();
				}
				
			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}
			
		}
		
		return salvamento;
		
	}
}
