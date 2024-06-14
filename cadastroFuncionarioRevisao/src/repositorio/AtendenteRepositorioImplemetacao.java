package repositorio;

import java.util.List;

import entidade.Atendente;
import persistencia.dao.DaoAtendente;

public class AtendenteRepositorioImplemetacao implements AtendenteRepositorio {

	@Override
	public boolean salvarAtendenteRepositorio(Atendente atendente) {
		DaoAtendente daoAtendente = new DaoAtendente();
		return daoAtendente.salvarAtendente(atendente);
	}

	@Override
	public List<Atendente> listarAtendenteRepositorio() {
		DaoAtendente daoAtendente = new DaoAtendente();
		return daoAtendente.retornaListaDeAtendentes();
	}

	@Override
	public boolean deletaAtendenteRepositorio(String cpf) {
		DaoAtendente telaAtendente = new DaoAtendente();
		if(buscaAtendentePorCpf(cpf) != null){
			return telaAtendente.deletarAtendente(cpf);
		}else {
			return false;
		}
		
	}
	
	@Override
	public boolean alterarAtendenteRepositorio(Atendente atendente) {
		DaoAtendente daoAtendente = new DaoAtendente();
		if(buscaAtendentePorCpf(atendente.getCpf()) != null){
			return daoAtendente.alterarAtendente(atendente);
		}else {
			return false;
		}
	}

	public Atendente buscaAtendentePorCpf (String cpf) {
		for(Atendente atendenteEncontrado: listarAtendenteRepositorio()) {
			if(atendenteEncontrado.getCpf().equals(cpf)) {
				return atendenteEncontrado;
			}
		}
		return null;
	}
}
