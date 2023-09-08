package operacoesDaBiblioteca;

import java.time.LocalDate;
import biblioteca.Membro;
import biblioteca.Membro.TipoMembro;
import itemMultimidia.ItemMultimidia;

public class Renovacao {
	private Membro solicitante;
	private ItemMultimidia reserva; //item a ser reservado
	private LocalDate dataDeEmprestimo;
	private LocalDate novaDataDevolucao;
	// a nova data de devolucao eh calculada a partir do prazo de vencimento e a qntd de dias 
	// eh de acordo com o tipo de membro. Ex.: membro graduacao tem o item q vence dia 10/02 -> nova data de devolucao = +15 dias = dia 25 
  	/*construtor*/
	Renovacao(Membro solicitante, ItemMultimidia reserva, String dataDeEmprestimo){
		this.solicitante = solicitante;
		this.reserva = reserva;
		this.dataDeEmprestimo = LocalDate.parse(dataDeEmprestimo);
	}
	
	/*getters and setters*/
	public Membro getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Membro solicitante) {
		this.solicitante = solicitante;
	}
	
	public ItemMultimidia getReserva() {
		return reserva;
	}
	public void setReserva(ItemMultimidia reserva) {
		this.reserva = reserva;
	}
	
	public LocalDate getdataDeEmprestimo() {
		return dataDeEmprestimo;
	}
	public void setDataDeEmprestimo(LocalDate dataDeEmprestimo) {
		this.dataDeEmprestimo = dataDeEmprestimo;
	}
	
	public LocalDate getNovaDataDevolucao() {
		return novaDataDevolucao;
	}
	public void setNovaDataDevolucao(LocalDate dataDeEmprestimo) {
		if(solicitante.tipoDeMembro == TipoMembro.GRADUACAO) {
			this.novaDataDevolucao = dataDeEmprestimo.plusDays(30);
		}
		else if (solicitante.tipoDeMembro == TipoMembro.POS_GRADUACAO) {
			this.novaDataDevolucao = dataDeEmprestimo.plusDays(40);
		}
		else if (solicitante.tipoDeMembro == TipoMembro.PROFESSOR) {
			this.novaDataDevolucao = dataDeEmprestimo.plusDays(60);
		}
		else if (solicitante.tipoDeMembro == TipoMembro.FUNCIONARIO) {
			this.novaDataDevolucao = dataDeEmprestimo.plusDays(40);
		}
	}	
}