package controlador.gerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Gerente;
import enuns.GerenciaEnum;
import gerenciaArquivo.ManipuladorArquivo;
import persistencia.dao.DaoGerente;
import repositorio.GerenteRepositorio;
import repositorio.GerenteRepositorioImplemetacao;

public class TelaCadastroGerenteControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCpf;
	JComboBox<GerenciaEnum> caixaSelecaoSetor;
	JTextField qtdHora;
	JFrame frameTelaCadastroGerente;
	
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	// DaoGerente daoGerente = new DaoGerente(); NUNCA DEVEMOS CHAMAR A DAO PELO CONTROLLER
	GerenteRepositorioImplemetacao gerenteRepositorioImp = new GerenteRepositorioImplemetacao();
	
	
	
	public TelaCadastroGerenteControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCpf, JComboBox<GerenciaEnum> caixaSelecaoSetor,
			JFrame frameTelaCadastroGerente, JTextField qtdHora) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCpf = caixaTextoSegundoCampoRecebidoCpf;
		this.caixaSelecaoSetor = caixaSelecaoSetor;
		this.frameTelaCadastroGerente = frameTelaCadastroGerente;
		this.qtdHora = qtdHora;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarNoBanco();
		
		System.out.println("o nome: " + caixaTextoPrimeiroCampoRecebidoNome.getText());
		System.out.println("o cpf: " + caixaTextoSegundoCampoRecebidoCpf.getText());
		System.out.println("a gerencia: " + caixaSelecaoSetor.getSelectedItem().toString());
		frameTelaCadastroGerente.setVisible(false);
		
		
	}
	
	public void registrarNoBanco() {
		Gerente gerente = new Gerente();
		gerente.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		gerente.setCpf(caixaTextoSegundoCampoRecebidoCpf.getText());
		gerente.setGerencia(caixaSelecaoSetor.getSelectedItem().toString());
		
	
		if(gerenteRepositorioImp.salvarGerenteRepositorio(gerente, qtdHora.getText())){
			JOptionPane.showMessageDialog(null, "Sarrrvou com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Não Sarrrvou com sucesso");
			
		}
		
	}

}
