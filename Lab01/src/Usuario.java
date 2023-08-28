import java.util.ArrayList;
import java.util.List;

public class Usuario extends Membro{
	private String dataDeRegistro;
	private List<ItemMultimidia> itensEmprestados;

	/*Metodo construtor*/
	Usuario(String nome, int id, String dataDeRegistro){
		super(nome, id)
		this.setDataDeRegistro(dataDeRegistro);
		this.setLivrosEmprestados(new ArrayList<>());
	}

	/*Metodos getters e setters*/
	public String getDataDeRegistro() {
		return dataDeRegistro;
	}

	public void setDataDeRegistro(String dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

	public List<ItemMultimidia> getLivrosEmprestados() {
		return itensEmprestados;
	}

	public void setLivrosEmprestados(List<ItemMultimidia> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}

	public static void main(String args) {
		Usuario pessoa = new Usuario("Fulano", 1, "01/01/2023");
		System.out.println(pessoa);
	}
}
