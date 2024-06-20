package servico;

import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

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
	
	public static void gerarPdfDetalharGerente(Gerente gerente) {
		String caminhoArquivo = "C:\\CursoJavaProgrammerMaio\\CursoJavaProgrammerMaio\\relatorios\\gerente.pdf";
		
		Document document = new Document();
		
		try {
			PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			if(gerente != null) {	
				document.open();;
				document.add(new Paragraph("Cpf: " + gerente.getCpf()));
				document.add(new Paragraph("Nome: " + gerente.getNome()));
			}
			document.close();
		} catch (Exception e) {
			e.getMessage();
		}
	
	}
	
}
