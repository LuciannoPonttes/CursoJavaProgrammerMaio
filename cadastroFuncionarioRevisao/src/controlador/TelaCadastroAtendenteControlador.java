package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidade.Atendente;
import repositorio.AtendenteRepositorioImplemetacao;

public class TelaCadastroAtendenteControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	JTextField caixaTextoSegundoCampoRecebidoCpf;
	JTextField caixaTextoTerceiroCampoRecebidoSetor;
	JFrame frameTelaCadastroAtendente;
	
	AtendenteRepositorioImplemetacao atendenteRepositorioImplemetacao = new AtendenteRepositorioImplemetacao();
	

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
		
	}
	
	public void registraNoBanco(){
		Atendente atendente = new Atendente();
		atendente.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		atendente.setCpf(caixaTextoSegundoCampoRecebidoCpf.getText());
		atendente.setSetor(caixaTextoTerceiroCampoRecebidoSetor.getText());
		atendenteRepositorioImplemetacao.salvarAtendenteRepositorio(atendente);
		
		
	}
	
	

}
