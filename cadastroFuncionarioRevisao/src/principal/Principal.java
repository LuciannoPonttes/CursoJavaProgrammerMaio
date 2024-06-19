package principal;

import cliente.EnderecoCliente;
import entidade.Gerente;
import persistencia.dao.DaoAtendente;
import persistencia.dao.DaoGerente;
import tela.TelaMenuInicial;

public class Principal {

	public static void main(String[] args) {
	
		//TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
		//telaMenuInicial.chamarTelaMenuIniciar();
		
		
		EnderecoCliente cliente = new EnderecoCliente();
		Gerente gerente = new Gerente();
		gerente.setCpf("031");
		gerente.setGerencia("TI");
		gerente.setSalario(15.000);
		gerente.setNome("Luciano");
		
		try {
			gerente.setEndereco(cliente.buscarEnderecoPeloCep("68725000"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DaoGerente daogeGerente = new DaoGerente();
		
		daogeGerente.salvarGerente(gerente);
		
	
		
		
		
		
	}

}
