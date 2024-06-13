package repositorio;

import entidade.Atendente;
import persistencia.DaoAtendente;

public class AtendenteRepositorioImplemetacao implements AtendenteRepositorio {

	@Override
	public boolean salvarAtendenteRepositorio(Atendente atendente) {
		DaoAtendente daoAtendente = new DaoAtendente();
		return daoAtendente.salvarAtendente(atendente);
	}

}
