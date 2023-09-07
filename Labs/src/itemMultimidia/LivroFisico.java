package itemMultimidia;

public class LivroFisico extends ItemMultimidia {
	private String ISBN;
	private String edicao;
	private int copiasDisponiveis;
	private int copiasTotal;
	private String localizacao;
	private EstadoConservacao estadoConservacao;	
	//Enum para representar a conservacao em 3 possiveis estados especificos
    public enum EstadoConservacao { 
        NOVO,
        VELHO_BOM_ESTADO,
        VELHO_MAU_ESTADO
    }
    
    //Metodo construtor
    public LivroFisico(String titulo, String autor,
    		String editora, int ano,
    		String genero, String sinopse, String ISBN, String edicao, int copiasDisponiveis, 
    		int copiasTotal, String localizacao,
    		EstadoConservacao estadoConservacao) {
        super(titulo, autor, editora, ano, genero, sinopse);
    	this.setISBN(ISBN);
    	this.setEdicao(edicao);
    	this.setCopiasTotal(copiasTotal);
    	this.setCopiasDisponiveis(copiasDisponiveis);
    	this.setLocalizacao(localizacao);
    	this.setEstadoConservacao (estadoConservacao);
    }
    
    //Metodos getters setters
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getCopiasTotal() {
		return copiasTotal;
	}
	public void setCopiasTotal(int copiasTotal) {
		this.copiasTotal = copiasTotal;
	}

	public int getCopiasDisponiveis() {
		return copiasDisponiveis;
	}
	public void setCopiasDisponiveis(int copiasDisponiveis) {
		this.copiasDisponiveis = copiasDisponiveis;
	}

	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }
	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
   
	public static void main(String args[]) {
		
		LivroFisico livro1 = new LivroFisico("A bela", "Carlos", "Unicamp", 2023, "Romance",
				"Uma bela moca...", "120", "2", 20, 50, "Prateleira 2", EstadoConservacao.NOVO);
		System.out.println(livro1.sinopse);
	}
}