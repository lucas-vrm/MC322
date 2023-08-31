import java.util.ArrayList;
import java.util.List;

public class EstudanteGrad extends Membro{
	
	private String endereco;
	private String contato;
	private List<ItemMultimidia> itensEmprestados;
	
	public EstudanteGrad(String nome, String tipoMembro, int id, String endereco, String contato) {
		super(nome, tipoMembro, id);
		this.setEndereco(endereco);
		this.setContato(contato);
		this.setItensEmprestados(new ArrayList<>());
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public List<ItemMultimidia> getItensEmprestados() {
		return itensEmprestados;
	}

	public void setItensEmprestados(List<ItemMultimidia> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}
}
