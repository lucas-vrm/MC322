import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> acervoDeLivros;
	private List<Livro> livrosDisponiveis;
	private List<Usuario> usuarios;
	private List<Emprestimo> livrosEmprestados;

	/*Metodo construtor*/
	Biblioteca(){
		this.setAcervoDeLivros(new ArrayList<>());
		this.setLivrosDisponiveis(new ArrayList<>());
		this.setUsuarios(new ArrayList<>());
		this.setLivrosEmprestados(new ArrayList<>());
	}
	
	public List<Livro> getAcervoDeLivros() {
		return acervoDeLivros;
	}

	public void setAcervoDeLivros(List<Livro> acervoDeLivros) {
		this.acervoDeLivros = acervoDeLivros;
	}

	public List<Livro> getLivrosDisponiveis() {
		return livrosDisponiveis;
	}

	public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {
		this.livrosDisponiveis = livrosDisponiveis;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Emprestimo> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(List<Emprestimo> livrosemprestados) {
		this.livrosEmprestados = livrosemprestados;
	}

	public static void main(String args) {
		Biblioteca bae = new Biblioteca();
		
		System.out.println(bae);
	}
}
