import java.util.ArrayList;
import java.util.List;

public class Usuario extends Membro{
	

	/*Metodo construtor*/
	Usuario(String nome, String tipoMembro, int id, String dataDeRegistro){
		super(nome, tipoMembro, id);
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
		Usuario pessoa = new Usuario("Fulano", "Usuario", 1, "01/01/2023");
		System.out.println(pessoa);
	}
}
