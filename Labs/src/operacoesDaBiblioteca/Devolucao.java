package operacoesDaBiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import biblioteca.Membro;
import biblioteca.Membro.TipoMembro;
import itemMultimidia.ItemMultimidia;

public class Devolucao {
	private ItemMultimidia item;
	private Membro membro;
	public LocalDate dataDevolucao;
	
	public Devolucao(Membro membro, ItemMultimidia item, String dataDevolucao) {
		this.membro = membro;
		this.item = item;
		this.dataDevolucao = LocalDate.parse(dataDevolucao);
	}
	
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
	
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public double calculaMulta(LocalDate dataDevolucaoPrevista, LocalDate dataDevolucao) {
		long diferencaEmDias = ChronoUnit.DAYS.between(dataDevolucaoPrevista, dataDevolucao);
		double multa = 0;
		if (diferencaEmDias <= 0) {
			multa = 0;
			return  multa;
		}
		else{
			if (membro.tipoDeMembro == TipoMembro.GRADUACAO || membro.tipoDeMembro == TipoMembro.POS_GRADUACAO) {
				multa = diferencaEmDias;
			}
			else if (membro.tipoDeMembro == TipoMembro.PROFESSOR) {
				multa = diferencaEmDias * 0.5;
			}
			else if (membro.tipoDeMembro == TipoMembro.FUNCIONARIO) {
				multa = diferencaEmDias * 0.75;
			}
			return  multa;
		}
	}
	
	
}