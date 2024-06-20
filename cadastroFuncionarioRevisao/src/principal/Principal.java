package principal;

import cliente.EnderecoCliente;
import entidade.Gerente;
import servico.EntidadeService;



public class Principal {

	public static void main(String[] args) {
	
		//TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
		//telaMenuInicial.chamarTelaMenuIniciar();
		//client/servidor
		
		EntidadeService entidadeService = new EntidadeService();
		EnderecoCliente cliente = new EnderecoCliente();
		
		Gerente gerente = new Gerente();
		gerente.setCpf("031");
		gerente.setGerencia("TI");
		gerente.setSalario(15.000);
		gerente.setNome("Luciano");
		
		entidadeService.gerarPdfDetalharGerente(gerente);
		
		
	}
	
	

}


