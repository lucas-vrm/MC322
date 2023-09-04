import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class EstudanteGrad extends Membro{
	
	private String endereco;
	private List<ItemMultimidia> itensEmprestados;
	
	public EstudanteGrad(String nome, String contato, int id, String endereco) {
		super(nome, contato, id, TipoMembro.GRADUACAO);
		this.setEndereco(endereco);
		this.setItensEmprestados(new ArrayList<>());
	}


	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<ItemMultimidia> getItensEmprestados() {
		return itensEmprestados;
	}

	public void setItensEmprestados(List<ItemMultimidia> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}
}
