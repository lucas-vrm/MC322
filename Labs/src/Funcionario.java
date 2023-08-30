public class Funcionario extends Membro {
	private String cargo;

	/*Metodo construtor*/
	public Funcionario(String nome, String tipoMembro, int id, String cargo) {
		super(nome, tipoMembro,id);
		this.cargo = cargo;
	}

	/*Metodos getters e setters*/
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public static void main(String args) {
		Funcionario func1 = new Funcionario("Cicrano", "funcionario", 1, "caixa");
		
		System.out.println(func1);
	}
}
