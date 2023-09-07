package itemMultimidia;

class LivroEletronico extends ItemMultimidia {
    private Formato formato;
    private int numeroTotalDeLicencas;
    private String URL;
    private String dataDeDisponibilidade;
    private String leituraRequisito;
    private enum Formato {
        PDF,
        EPUB,
        MOBI,
        OUTRO
    }

    public LivroEletronico(String titulo, String autor, String editora,
    		int ano, String genero, String sinopse, Formato formato,
    		int numeroTotalDeLicencas, String URL, String dataDeDisponibilidade,
    		String leituraRequisito) {
        super(titulo, autor, editora, ano, genero, sinopse);
    	this.numeroTotalDeLicencas = numeroTotalDeLicencas;
    	this.URL = URL;
    	this.dataDeDisponibilidade = dataDeDisponibilidade;
        this.formato = formato;
        this.leituraRequisito = leituraRequisito;
    }

	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	public int getNumeroTotalDeLicencas() {
		return numeroTotalDeLicencas;
	}
	public void setNumeroTotalDeLicencas(int numeroTotalDeLicencas) {
		this.numeroTotalDeLicencas = numeroTotalDeLicencas;
	}

	public String getURL() {
		return URL;
	}
	public void setURL(String URL) {
		this.URL = URL;
	}

	public String getDataDeDisponibilidade() {
		return dataDeDisponibilidade;
	}
	public void setDataDeDisponibilidade(String dataDeDisponibilidade) {
		this.dataDeDisponibilidade = dataDeDisponibilidade;
	}
	
	public String getLeituraRequisito() {
		return leituraRequisito;
	}
	public void setLeituraRequisito(String leituraRequisito) {
		this.leituraRequisito = leituraRequisito;
	}
	
	public static void main(String args[]) {
		
		LivroEletronico livro2 = new LivroEletronico("Dom Casmurro", "Machado de Assis", "Unicamp", 1893, "Romance",
				"Um rapaz...", Formato.PDF, 100, "Bae.com/DomCasmurro", "20/03/2023", "Leitor de PDF");
		System.out.println(livro2.URL);
	}
}