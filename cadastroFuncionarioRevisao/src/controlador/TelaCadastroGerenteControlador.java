package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Gerente;
import gerenciaArquivo.ManipuladorArquivo;
import persistencia.DaoGerente;
import repositorio.GerenteRepositorio;
import repositorio.GerenteRepositorioImplemetacao;

public class TelaCadastroGerenteControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCpf;
	JTextField caixaTextoTerceiroCampoRecebidoGerencia;
	JFrame frameTelaCadastroGerente;
	
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	// DaoGerente daoGerente = new DaoGerente(); NUNCA DEVEMOS CHAMAR A DAO PELO CONTROLLER
	GerenteRepositorioImplemetacao gerenteRepositorioImp = new GerenteRepositorioImplemetacao();
	
	
	
	public TelaCadastroGerenteControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCpf, JTextField caixaTextoTerceiroCampoRecebidoGerencia,
			JFrame frameTelaCadastroGerente) {
		
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCpf = caixaTextoSegundoCampoRecebidoCpf;
		this.caixaTextoTerceiroCampoRecebidoGerencia = caixaTextoTerceiroCampoRecebidoGerencia;
		this.frameTelaCadastroGerente = frameTelaCadastroGerente;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarNoBanco();
		
		System.out.println("o nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("o cpf: " + caixaTextoSegundoCampoRecebidoCpf.getText());
		System.out.println("a gerencia: " + caixaTextoTerceiroCampoRecebidoGerencia.getText());
		frameTelaCadastroGerente.setVisible(false);
		
		
	}
	
	public void registrarNoBanco() {
		Gerente gerente = new Gerente();
		gerente.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		gerente.setCpf(caixaTextoSegundoCampoRecebidoCpf.getText());
		gerente.setGerencia(caixaTextoTerceiroCampoRecebidoGerencia.getText());
		
		manipuladorArquivo.registrarGerente(gerente);
		
		
		if(gerenteRepositorioImp.salvarGerenteRepositorio(gerente)){
			JOptionPane.showMessageDialog(null, "Sarrrvou com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Não Sarrrvou com sucesso");
			
		}
		
	}

}
