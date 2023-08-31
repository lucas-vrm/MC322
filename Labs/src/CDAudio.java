
class CDAudio extends ItemMultimidia {
	private String[] faixas;
    private int duracaoTotal;
    private int numeroTotalCopias;
    private int numeroCopiasDisponiveis;
    private String estadoConservacao;

    public CDAudio(String titulo, String autor, String codigo, String[] faixas, int duracaoTotal, int numeroTotalCopias, int numeroCopiasDisponiveis, String estadoConservacao) {
    	super(titulo, autor, codigo);
        this.faixas = faixas;
        this.duracaoTotal = duracaoTotal;
        this.numeroTotalCopias = numeroTotalCopias;
        this.numeroCopiasDisponiveis = numeroCopiasDisponiveis;
        this.estadoConservacao = estadoConservacao;
    }

    // Métodos de acesso para os atributos

    public String[] getFaixas() {
        return faixas;
    }

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public int getNumeroTotalCopias() {
        return numeroTotalCopias;
    }

    public int getNumeroCopiasDisponiveis() {
        return numeroCopiasDisponiveis;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

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
}
