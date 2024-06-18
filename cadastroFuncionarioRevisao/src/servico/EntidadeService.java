package servico;

import javax.swing.JOptionPane;

import entidade.Atendente;
import entidade.Gerente;
import validacao.EntidadeValidacao;

public class EntidadeService {
	
	public Double buscarSalarioAtendente(String qtdHoras) {
		Atendente atendente = new Atendente();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validaqtdHora(qtdHoras)== null) {
			JOptionPane.showMessageDialog(null, "O valor "+ qtdHoras + " Não é valido" );
		}else {
			return atendente.calcularSalario(entidadeValidacao.validaqtdHora(qtdHoras));
		}
		
		return null;
	}
	
	public Double buscarSalarioGerente(String qtdHoras) {
		Gerente gerente = new Gerente();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validaqtdHora(qtdHoras)== null) {
			JOptionPane.showMessageDialog(null, "O valor "+ qtdHoras + " Não é valido" );
		}else {
			return gerente.calcularSalario(entidadeValidacao.validaqtdHora(qtdHoras));
		}
		
		return null;
	}
	
}
