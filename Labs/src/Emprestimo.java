
public class Emprestimo {
	private ItemMultimidia item;
	private Usuario usuario;
	private String dataDeEmprestimo;
	private String dataDevolucaoPrevista;
	
	/*Metodo construtor*/
	public Emprestimo(ItemMultimidia item, Usuario usuario, String dataDeEmprestimo, String dataDevolucaoPrevista) {
		this.setItemMultimidia(item);
		this.setUsuario(usuario);
		this.setDataDeEmprestimo(dataDeEmprestimo);
		this.setDataDevolucaoPrevista(dataDevolucaoPrevista);
	}

	/*Metodos getters e setters*/
	public ItemMultimidia getItemMultimidia() {
		return item;
	}

	public void setItemMultimidia(ItemMultimidia item) {
		this.item = item;
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
		Emprestimo emprestimo1 = new Emprestimo(new ItemMultimidia("Sherlock Holmes Vol. 1", "Artur Conan Doyle", "001"),
				new Usuario("Fulano", "Usuario", 1, "01/01/2023"),
				"10/08/2023", 
				"10/09/2023");
		
		System.out.println(emprestimo1.getUsuario() + "reservou o item" + emprestimo1.getItemMultimidia() + "na data"
		+ emprestimo1.getDataDeEmprestimo() + "e devera fazer a devolucao ate " + emprestimo1.getDataDevolucaoPrevista());
	}
}
