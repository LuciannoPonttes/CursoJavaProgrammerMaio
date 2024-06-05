package bancoDeDados;

public class Principal {
	
	public static void main (String args[]) {
		
		FabricaConexao conexao = new FabricaConexao();
		
		conexao.criarConexaoComBaseExemplo();
		
	}

}
