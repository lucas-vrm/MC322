public class RenovacaoReserva {
	private String solicitante;
	private String reserva; //item a ser reservado
	private int renovacao; //quantidade de dias para a pessoa ter o objeto
	
	/*construtor*/
	RenovacaoReserva(String solicitante, String reserva, int renovacao){
		this.solicitante = solicitante;
		this.reserva = reserva;
		this.renovacao = renovacao;
	}
	
	/*getters and setters*/
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public String getReserva() {
		return reserva;
	}
	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
	public int getRenovacao() {
		return renovacao;
	}
	public void setRenovacao(int renovacao) {
		this.renovacao = renovacao;
	}
	
	public static void main(String args) {
		RenovacaoReserva renovacao1 = new RenovacaoReserva("Regina", "Sherlock Holmes Vol.1", 10);
		System.out.println(renovacao1.getSolicitante() + "teve o item" + renovacao1.getReserva() + "reservado por mais" + renovacao1.getRenovacao() + "dia(s).");
	}
}
