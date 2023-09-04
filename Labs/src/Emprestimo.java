import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import Membro.TipoMembro;

public class Emprestimo {
	private ItemMultimidia item;
	private Membro membro;
	private LocalDate dataDeEmprestimo;
	private LocalDate dataDevolucaoPrevista;
	
	/*Metodo construtor*/
	public Emprestimo(ItemMultimidia item, Membro membro) {
		this.setItemMultimidia(item);
		this.setMembro(membro);
		LocalDate dataDeEmprestimo = LocalDate.now();
		this.setDataDevolucaoPrevista(dataDevolucaoPrevista);
	}

	/*Metodos getters e setters*/
	public ItemMultimidia getItemMultimidia() {
		return item;
	}

	public void setItemMultimidia(ItemMultimidia item) {
		this.item = item;
	}

	public Membro getUsuario() {
		return membro;
	}

	public void setMembro(Membro membro) {
		this.membro = membro;
	}

	public LocalDate getDataDeEmprestimo() {
		return dataDeEmprestimo;
	}

	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}

	public LocalDate getDataDevolucaoPrevista() {
		return dataDevolucaoPrevista;
	}

	public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public static void main(String args) {
		Emprestimo emprestimo1 = new Emprestimo(new ItemMultimidia("","",""),
				new Membro("","",3, TipoMembro.GRADUACAO));
		
		System.out.println(emprestimo1.getUsuario() + "reservou o item" + emprestimo1.getItemMultimidia() + "na data"
		+ emprestimo1.getDataDeEmprestimo() + "e devera fazer a devolucao ate " + emprestimo1.getDataDevolucaoPrevista());
	}
}
