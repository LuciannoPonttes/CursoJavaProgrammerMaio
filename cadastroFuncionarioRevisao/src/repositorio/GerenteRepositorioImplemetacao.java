package repositorio;

import java.util.List;

import entidade.Gerente;
import persistencia.DaoGerente;

public class GerenteRepositorioImplemetacao implements GerenteRepositorio {

	@Override // Aponte que esse metodo é uma SobEscrita de um metodo da interface
	public boolean salvarGerenteRepositorio(Gerente gerente) {
		DaoGerente daoGerente = new DaoGerente();
		return daoGerente.salvarGerente(gerente);
	}

	@Override
	public List<Gerente> listarGerenteRepositorio() {
		DaoGerente daoGerente = new DaoGerente();
		return daoGerente.retornaListaDeGerentes();
	}

}
