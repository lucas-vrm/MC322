package operacoesDaBiblioteca;
import java.time.LocalDate;

import biblioteca.Membro;
import biblioteca.Membro.TipoMembro;
import itemMultimidia.ItemMultimidia;

public class Emprestimo {
	private ItemMultimidia item;
	private Membro membro;
	private LocalDate dataDeEmprestimo;
	public LocalDate dataDevolucaoPrevista;
	
	
	/*Metodo construtor*/
	public Emprestimo(ItemMultimidia item, Membro membro, String dataDeEmprestimo) {
		this.setItemMultimidia(item);
		this.setMembro(membro);
		this.dataDeEmprestimo = LocalDate.parse(dataDeEmprestimo);
	}

	/*Metodos getters e setters*/
	public ItemMultimidia getItemMultimidia() {
		return item;
	}
	public void setItemMultimidia(ItemMultimidia item) {
		this.item = item;
	}

	public Membro getMembro() {
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
	public void setDataDevolucaoPrevista(LocalDate dataDeEmprestimo) {
		if(membro.tipoDeMembro == TipoMembro.GRADUACAO) {
			this.dataDevolucaoPrevista = dataDeEmprestimo.plusDays(15);
		}
		else if (membro.tipoDeMembro == TipoMembro.POS_GRADUACAO) {
			this.dataDevolucaoPrevista = dataDeEmprestimo.plusDays(20);
		}
		else if (membro.tipoDeMembro == TipoMembro.PROFESSOR) {
			this.dataDevolucaoPrevista = dataDeEmprestimo.plusDays(30);
		}
		else if (membro.tipoDeMembro == TipoMembro.FUNCIONARIO) {
			this.dataDevolucaoPrevista = dataDeEmprestimo.plusDays(20);
		}
		
	
	}
}