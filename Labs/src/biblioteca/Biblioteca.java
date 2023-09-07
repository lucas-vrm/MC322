package biblioteca;
import java.util.ArrayList;
import java.util.List;

import operacoesDaBiblioteca.Emprestimo;
import itemMultimidia.ItemMultimidia;

//import java.time.LocalDate;
//import java.time.temporal.ChronoUnit;

public class Biblioteca {
	private List<ItemMultimidia> acervoDeItens;
	private List<ItemMultimidia> itensDisponiveis;
	private List<Membro> membros;
	private List<Emprestimo> livrosEmprestados;

	/*Metodo construtor*/
	Biblioteca(){
		this.setAcervoDeItens(new ArrayList<>());
		this.setItensDisponiveis(new ArrayList<>());
		this.setMembros(new ArrayList<>());
		this.setLivrosEmprestados(new ArrayList<>());
	}
	
	public List<ItemMultimidia> getAcervoDeItens() {
		return acervoDeItens;
	}

	public void setAcervoDeItens(List<ItemMultimidia> acervoDeItens) {
		this.acervoDeItens = acervoDeItens;
	}

	public List<ItemMultimidia> getLivrosDisponiveis() {
		return itensDisponiveis;
	}

	public void setItensDisponiveis(List<ItemMultimidia> itensDisponiveis) {
		this.itensDisponiveis = itensDisponiveis;
	}

	public List<Membro> getUsuarios() {
		return membros;
	}

	public void setMembros(List<Membro> membros) {
		this.membros = membros;
	}

	public List<Emprestimo> getLivrosEmprestados() {
		return livrosEmprestados;
	}

	private void setLivrosEmprestados(ArrayList<Emprestimo> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
		
	}

	public static void main(String args[]) {
		Biblioteca bae = new Biblioteca();
		
		System.out.println(bae);
	}
}
