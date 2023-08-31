class LivroEletronico extends ItemMultimidia {
    private Formato formato;
    private int numTotalDeLicencas;
    private String URLDeAcesso;
    private String dataDeDisponibilidade;
    
    public enum Formato {
        PDF,
        EPUB,
        MOBI,
        OUTRO
    }

    public LivroEletronico(String titulo, String autor, String codigo, 
    		int numTotalDeLicencas, String URLDeAcesso, String dataDeDisponibilidade,
    		Formato formato) {
        super(titulo, autor, codigo);
    	this.numTotalDeLicencas = numTotalDeLicencas;
    	this.URLDeAcesso = URLDeAcesso;
    	this.dataDeDisponibilidade = dataDeDisponibilidade;
        this.formato = formato;
    }

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public int getNumTotalDeLicencas() {
		return numTotalDeLicencas;
	}

	public void setNumTotalDeLicencas(int numTotalDeLicencas) {
		this.numTotalDeLicencas = numTotalDeLicencas;
	}

	public String getURLDeAcesso() {
		return URLDeAcesso;
	}

	public void setURLDeAcesso(String uRLDeAcesso) {
		URLDeAcesso = uRLDeAcesso;
	}

	public String getDataDeDisponibilidade() {
		return dataDeDisponibilidade;
	}

	public void setDataDeDisponibilidade(String dataDeDisponibilidade) {
		this.dataDeDisponibilidade = dataDeDisponibilidade;
	}
	
	
}
