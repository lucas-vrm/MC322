package itemMultimidia;

class DVDVideo extends ItemMultimidia {
	private String[] elenco;
    private int duracaoTotal;
    private int numeroTotalCopias;
    private int numeroCopiasDisponiveis;
    private EstadoConservacao estadoConservacao;	
	//Enum para representar a conservacao em 3 possiveis estados especificos
    private enum EstadoConservacao { 
        NOVO,
        VELHO_BOM_ESTADO,
        VELHO_MAU_ESTADO
    }

    public DVDVideo(String titulo, String autor, String editora, int ano,
    		String genero, String sinopse, String[] elenco, int duracaoTotal,
    		int numeroTotalCopias, int numeroCopiasDisponiveis,
    		EstadoConservacao estadoConservacao) {
    	super(titulo, autor, editora, ano, genero, sinopse);
        this.duracaoTotal = duracaoTotal;
        this.numeroTotalCopias = numeroTotalCopias;
        this.numeroCopiasDisponiveis = numeroCopiasDisponiveis;
        this.estadoConservacao = estadoConservacao;
    }

    // Métodos de acesso para os atributos

    public String[] getElenco() {
        return elenco;
    }
    public void setElenco(String[] elenco) {
    	this.elenco = elenco;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }
    public void setDuracaoTotal(int duracaoTotal) {
    	this.duracaoTotal = duracaoTotal;
    }
    
    public int getNumeroTotalCopias() {
        return numeroTotalCopias;
    }
    public void setNumeroTotalCopias(int numeroTotalCopias) {
    	this.numeroTotalCopias = numeroTotalCopias; 
    }

    public int getNumeroCopiasDisponiveis() {
        return numeroCopiasDisponiveis;
    }
    public void setNumeroCopiasDisponiveis(int numeroCopiasDisponiveis) {
    	this.numeroCopiasDisponiveis = numeroCopiasDisponiveis;
    }
    
    public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }
    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
    	this.estadoConservacao = estadoConservacao;
    }
/*/
    // Métodos para atualizar atributos

    public boolean emprestar() {
        if (numeroCopiasDisponiveis > 1) {
            numeroCopiasDisponiveis--;
            return true;
        } else if(numeroCopiasDisponiveis == 1) {
        	numeroCopiasDisponiveis--;
        } else {
        	System.out.println("Item nao disponivel");
        }

    	return false;
    }

    public void devolver() {
        if (numeroCopiasDisponiveis < numeroTotalCopias) {
            numeroCopiasDisponiveis++;
        }
    }
    /*/
}