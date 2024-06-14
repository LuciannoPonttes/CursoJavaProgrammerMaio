package controlador.atendente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidade.Atendente;
import repositorio.AtendenteRepositorioImplemetacao;
import tela.atendente.TelaMenuAtendente;

public class TelaCadastroAtendenteControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCpf;
	JTextField caixaTextoTerceiroCampoRecebidoSetor;
	JFrame frameTelaCadastroAtendente;
	
	AtendenteRepositorioImplemetacao atendenteRepositorioImplemetacao = new AtendenteRepositorioImplemetacao();
	TelaMenuAtendente telaAtendente = new TelaMenuAtendente();

	public TelaCadastroAtendenteControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			JTextField caixaTextoSegundoCampoRecebidoCpf, JTextField caixaTextoTerceiroCampoRecebidoGerencia,
			JFrame frameTelaCadastroAtendente) {
		super();
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCpf = caixaTextoSegundoCampoRecebidoCpf;
		this.caixaTextoTerceiroCampoRecebidoSetor = caixaTextoTerceiroCampoRecebidoGerencia;
		this.frameTelaCadastroAtendente = frameTelaCadastroAtendente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		registraNoBanco();
		frameTelaCadastroAtendente.setVisible(false);
		telaAtendente.chamarTelaMenuAtendente();
		
	}
	
	public void registraNoBanco(){
		Atendente atendente = new Atendente();
		atendente.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		atendente.setCpf(caixaTextoSegundoCampoRecebidoCpf.getText());
		atendente.setSetor(caixaTextoTerceiroCampoRecebidoSetor.getText());
		if(atendenteRepositorioImplemetacao.salvarAtendenteRepositorio(atendente)) {
			JOptionPane.showMessageDialog(null, "Atendente Registrado com Sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao registrar o atendente");
		}
		
		
	}
	
	

}
