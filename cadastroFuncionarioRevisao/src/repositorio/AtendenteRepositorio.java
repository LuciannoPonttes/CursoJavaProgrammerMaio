package repositorio;

import java.util.List;

import entidade.Atendente;


public interface AtendenteRepositorio {
	
	public boolean salvarAtendenteRepositorio(Atendente atendente);
	public List<Atendente> listarAtendenteRepositorio();
	public boolean deletaAtendenteRepositorio(String cpf);
	public boolean alterarAtendenteRepositorio(Atendente atendente);
	

}
