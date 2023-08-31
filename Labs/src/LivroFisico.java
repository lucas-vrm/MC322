
class LivroFisico extends ItemMultimidia {
	private String ISBN;
	private String edicao;
	private int numTotalDeCopias;
	private int numTotalDeCopiasPorEdicao;
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
    		String ISBN, String edicao, int numTotalDeCopias, 
    		int numTotalDeCopiasPorEdicao, String LocalizacaoNaBiblioteca, 
    		EstadoConservacao estadoConservacao) {
        super(titulo, autor, codigo);
    	this.setISBN(ISBN);
    	this.setEdicao(edicao);
    	this.setNumTotalDeCopias(numTotalDeCopias);
    	this.setNumTotalDeCopiasPorEdicao(numTotalDeCopiasPorEdicao);
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

	public int getNumTotalDeCopias() {
		return numTotalDeCopias;
	}

	public void setNumTotalDeCopias(int numTotalDeCopias) {
		this.numTotalDeCopias = numTotalDeCopias;
	}

	public int getNumTotalDeCopiasPorEdicao() {
		return numTotalDeCopiasPorEdicao;
	}

	public void setNumTotalDeCopiasPorEdicao(int numTotalDeCopiasPorEdicao) {
		this.numTotalDeCopiasPorEdicao = numTotalDeCopiasPorEdicao;
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

    // Método para atualizar o estado de conservação
    public void atualizarEstadoConservacao(EstadoConservacao novoEstado) {
        estadoConservacao = novoEstado;
    }
}