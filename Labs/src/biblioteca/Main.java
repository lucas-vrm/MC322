package biblioteca;

import biblioteca.Membro.TipoMembro;
import itemMultimidia.LivroFisico;
import itemMultimidia.LivroFisico.EstadoConservacao;
import operacoesDaBiblioteca.Devolucao;
import operacoesDaBiblioteca.Emprestimo;

public class Main {

	public static void main(String[] args) {
		
		Membro member = new Membro("Gabryel", "998579003", 238405, "2007-12-03", "Rua Jose Maravilha, 93", TipoMembro.GRADUACAO);
		LivroFisico book = new LivroFisico("A bela", "Carlos", "Unicamp", 2023, "Romance",
				"Uma bela moca...", "120", "2", 20, 50, "Prateleira 2, corredor 4", EstadoConservacao.NOVO);
		
		Emprestimo emprestimo1 = new Emprestimo(book, member, "2023-09-07");
		emprestimo1.setDataDevolucaoPrevista(emprestimo1.getDataDeEmprestimo());
		System.out.println(emprestimo1.dataDevolucaoPrevista);
		
		Devolucao devolucaoMembro1 = new Devolucao(member, book, "2023-09-23");
		System.out.println(devolucaoMembro1.getDataDevolucao());
		
		System.out.println(devolucaoMembro1.calculaMulta(emprestimo1.dataDevolucaoPrevista, devolucaoMembro1.dataDevolucao));
		
	}
}
