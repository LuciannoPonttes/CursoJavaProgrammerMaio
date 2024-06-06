package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidade.Gerente;
import gerenciaArquivo.ManipuladorArquivo;
import persistencia.DaoGerente;

public class TelaCadastroGerenteControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCpf;
	JTextField caixaTextoTerceiroCampoRecebidoGerencia;
	
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	DaoGerente daoGerente = new DaoGerente();
	
	
	
	public TelaCadastroGerenteControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCpf, JTextField caixaTextoTerceiroCampoRecebidoGerencia) {
		
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCpf = caixaTextoSegundoCampoRecebidoCpf;
		this.caixaTextoTerceiroCampoRecebidoGerencia = caixaTextoTerceiroCampoRecebidoGerencia;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarArquivo();
		
		System.out.println("o nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("o cpf: " + caixaTextoSegundoCampoRecebidoCpf.getText());
		System.out.println("a gerencia: " + caixaTextoTerceiroCampoRecebidoGerencia.getText());
		
		
	}
	
	public void registrarArquivo() {
		Gerente gerente = new Gerente();
		gerente.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		gerente.setCpf(caixaTextoSegundoCampoRecebidoCpf.getText());
		gerente.setGerencia(caixaTextoTerceiroCampoRecebidoGerencia.getText());
		
		manipuladorArquivo.registrarGerente(gerente);
		daoGerente.salvarGerente(gerente);
		
	}

}
