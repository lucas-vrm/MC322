package itemMultimidia;

public class OutroRecursoMultimidia extends ItemMultimidia{
	private String tipoDeRecurso;
	private int numeroTotalDeCopias;
	private int numeroDeCopiasDisponiveis;
	private String LocalizacaoNaBiblioteca;
	private Formato formato;
	private EstadoConservacao estadoConservacao;
	
	private enum Formato {
		FISICO,
		DIGITAL
	}
	
	private enum EstadoConservacao {
        NOVO,
        VELHO_BOM_ESTADO,
        VELHO_MAU_ESTADO,
        DIGITAL
    }
	
	public OutroRecursoMultimidia(String titulo, String autor,
    		String editora, int ano, String genero, String sinopse, 
    		String tipoDeRecurso, int numeroTotalDeCopias, 
    		int numeroDeCopiasDisponiveis, String LocalizacaoNaBiblioteca, 
    		Formato formato, EstadoConservacao estadoConservacao) {
		super(titulo, autor, editora, ano, genero, sinopse);
    	this.setTipoDeRecurso(tipoDeRecurso);
    	this.setNumeroTotalDeCopias(numeroTotalDeCopias);
    	this.setNumeroDeCopiasDisponiveis(numeroDeCopiasDisponiveis);
    	this.setLocalizacaoNaBiblioteca(LocalizacaoNaBiblioteca);
    	this.estadoConservacao = estadoConservacao;
    }

	public String getTipoDeRecurso() {
		return tipoDeRecurso;
	}
	public void setTipoDeRecurso(String tipoDeRecurso) {
		this.tipoDeRecurso = tipoDeRecurso;
	}

	public int getNumeroTotalCopias() {
		return numeroTotalDeCopias;
	}
	public void setNumeroTotalDeCopias(int numeroTotalDeCopias) {
		this.numeroTotalDeCopias = numeroTotalDeCopias;
	}

	public int getNumeroDeCopiasDisponiveis() {
		return numeroDeCopiasDisponiveis;
	}
	public void setNumeroDeCopiasDisponiveis(int numeroDeCopiasDisponiveis) {
		this.numeroDeCopiasDisponiveis = numeroDeCopiasDisponiveis;
	}

	public String getLocalizacaoNaBiblioteca() {
		return LocalizacaoNaBiblioteca;
	}
	public void setLocalizacaoNaBiblioteca(String localizacaoNaBiblioteca) {
		LocalizacaoNaBiblioteca = localizacaoNaBiblioteca;
	}
	
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }
    public void setEstadoConservacao(EstadoConservacao novoEstado) {
        estadoConservacao = novoEstado;
    }
}
