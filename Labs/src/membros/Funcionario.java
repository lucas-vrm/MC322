public class Funcionario extends Membro {
	Cargo cargo;
	
	public enum Cargo {
		ADMINISTRADOR,
		ATENDENTE,
		GERENTE
	}

	/*Metodo construtor*/
	public Funcionario(String nome, String contato,  int id, 
			String dataDeRegistro, Cargo cargo) {
		super(nome, contato, id, dataDeRegistro);
		this.cargo = cargo;
	}

	/*Metodos getters e setters*/
	

	public static void main(String args) {
		Funcionario func1 = new Funcionario("Cicrano", "(19) 912345678", 4, "02/01/2023", Cargo.ATENDENTE);
		
		System.out.println(func1);
	}
}
