import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private int id;
	private String dataDeRegistro;
	private List<String> livrosEmprestados;

	/*Metodo construtor*/
	Usuario(String nome, int id, String dataDeRegistro){
		this.setNome(nome);
		this.setId(id);
		this.setDataDeRegistro(dataDeRegistro);
		this.setLivrosEmprestados(new ArrayList<>());
	}

	/*Metodos getters e setters*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataDeRegistro() {
		return dataDeRegistro;
	}

	public void setDataDeRegistro(String dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

	public List<String> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	public void setLivrosEmprestados(List<String> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}

	public static void main(String args) {
		Usuario pessoa = new Usuario("Fulano", 1, "01/01/2023");
		System.out.println(pessoa);
	}
}
