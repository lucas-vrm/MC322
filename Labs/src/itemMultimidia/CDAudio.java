package itemMultimidia;

class CDAudio extends ItemMultimidia {
	private String[] faixas;
    private int duracaoTotal;
    private int numeroTotalCopias;
    private int numeroCopiasDisponiveis;
    private EstadoConservacao estadoConservacao;	
    private enum EstadoConservacao { 
        NOVO,
        VELHO_BOM_ESTADO,
        VELHO_MAU_ESTADO
    }

    public CDAudio(String titulo, String autor, String editora, int ano,
    		String genero, String sinopse, String[] faixas, int duracaoTotal,
    		int numeroTotalCopias, int numeroCopiasDisponiveis,
    		EstadoConservacao estadoConservacao) {
    	super(titulo, autor, editora, ano, genero, sinopse);
        this.faixas = faixas;
        this.duracaoTotal = duracaoTotal;
        this.numeroTotalCopias = numeroTotalCopias;
        this.numeroCopiasDisponiveis = numeroCopiasDisponiveis;
        this.estadoConservacao = estadoConservacao;
    }

    // Getters e Setters

    public String[] getFaixas() {
        return faixas;
    }
    public void setFaixas(String[] faixas) {
    	this.faixas = faixas;
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
    	this.numeroCopiasDisponiveis = numeroTotalCopias;
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
