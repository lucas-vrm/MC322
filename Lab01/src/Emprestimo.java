
public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private String dataDeEmprestimo;
	private String dataDevolucaoPrevista;
	
	/*Metodo construtor*/
	public Emprestimo(Livro livro, Usuario usuario, String dataDeEmprestimo, String dataDevolucaoPrevista) {
		this.setLivro(livro);
		this.setUsuario(usuario);
		this.setDataDeEmprestimo(dataDeEmprestimo);
		this.setDataDevolucaoPrevista(dataDevolucaoPrevista);
	}

	/*Metodos getters e setters*/
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(String dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public String getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(String dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public static void main(String args) {
		Emprestimo emprestimo1 = new Emprestimo(null, null, null, null);
		System.out.println(emprestimo1);
	}
}
