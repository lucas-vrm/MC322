
public class Funcionario {
	private String nome;
	private int id;
	private String cargo;

	/*Metodo construtor*/
	public Funcionario(String nome, int id, String cargo) {
		this.nome = nome;
		this.id = id;
		this.cargo = cargo;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public static void main(String args) {
		Funcionario func1 = new Funcionario("Cicrano", 1, "caixa");
		
		System.out.println(func1);
	}
}
