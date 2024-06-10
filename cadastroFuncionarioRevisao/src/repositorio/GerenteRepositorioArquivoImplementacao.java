package repositorio;

import java.util.List;

import entidade.Gerente;
import gerenciaArquivo.ManipuladorArquivo;

public class GerenteRepositorioArquivoImplementacao implements GerenteRepositorio {

	@Override
	public boolean salvarGerenteRepositorio(Gerente gerente) {
		ManipuladorArquivo arquivo = new ManipuladorArquivo();
		return arquivo.registrarGerente(gerente);
	}

	@Override
	public List<Gerente> listarGerenteRepositorio() {
		
		return null;
	}

}
