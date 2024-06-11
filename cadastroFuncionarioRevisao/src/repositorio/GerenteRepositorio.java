package repositorio;

import java.util.List;

import entidade.Gerente;

public interface GerenteRepositorio {
	
	public boolean salvarGerenteRepositorio(Gerente gerente);
	
	public List<Gerente> listarGerenteRepositorio();
	
	public boolean excluirGerenteRepositorio(String cpf);

}
