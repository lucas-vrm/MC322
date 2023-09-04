
class LivroFisico extends ItemMultimidia {
	private String ISBN;
	private String edicao;
	private int numeroTotalDeCopias;
	private int numeroTotalDeCopiasPorEdicao;
	private String LocalizacaoNaBiblioteca;
	private EstadoConservacao estadoConservacao;
	
	//Enum para representar a conservacao em 3 possiveis estados especificos
    public enum EstadoConservacao {
        NOVO,
        VELHO_BOM_ESTADO,
        VELHO_MAU_ESTADO
    }
    
    //Metodo construtor
    public LivroFisico(String titulo, String autor, String codigo, 
    		String ISBN, String edicao, int numeroTotalDeCopias, 
    		int numeroTotalDeCopiasPorEdicao, String LocalizacaoNaBiblioteca, 
    		EstadoConservacao estadoConservacao) {
        super(titulo, autor, codigo);
    	this.setISBN(ISBN);
    	this.setEdicao(edicao);
    	this.setNumeroTotalDeCopias(numeroTotalDeCopias);
    	this.setNumeroTotalDeCopiasPorEdicao(numeroTotalDeCopiasPorEdicao);
    	this.setLocalizacaoNaBiblioteca(LocalizacaoNaBiblioteca);
    	this.estadoConservacao = estadoConservacao;
    }
    
    //Metodos getters setters
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getNumeroTotalDeCopias() {
		return numeroTotalDeCopias;
	}

	public void setNumeroTotalDeCopias(int numeroTotalDeCopias) {
		this.numeroTotalDeCopias = numeroTotalDeCopias;
	}

	public int getNumTotalDeCopiasPorEdicao() {
		return numeroTotalDeCopiasPorEdicao;
	}

	public void setNumeroTotalDeCopiasPorEdicao(int numeroTotalDeCopiasPorEdicao) {
		this.numeroTotalDeCopiasPorEdicao = numeroTotalDeCopiasPorEdicao;
	}

	public String getLocalizacaoNaBiblioteca() {
		return LocalizacaoNaBiblioteca;
	}

	public void setLocalizacaoNaBiblioteca(String localizacaoNaBiblioteca) {
		LocalizacaoNaBiblioteca = localizacaoNaBiblioteca;
	}
	
	public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }

    // Metodo para atualizar o estado de conservacao
    public void atualizarEstadoConservacao(EstadoConservacao novoEstado) {
        estadoConservacao = novoEstado;
    }
}