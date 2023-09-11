import java.util.Scanner;

public class Main {
	
	private static void inicio() {
		System.out.println("Boas vindas ao sistema da Biblioteca!");
		System.out.println("Que tipo de operacao voce deseja fazer? Digite:");
	}
	
	private static void opcoes() {
		System.out.println("1 - Adicionar um novo mebro na biblioteca");
		System.out.println("2 - Adicionar um novo item no acervo");
		System.out.println("3 - Fazer um emprestimo");
		System.out.println("4 - Fazer uma renovacao");
		System.out.println("0 - Sair");
	}
	

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		
		inicio();
		
		Scanner scanner = new Scanner(System.in);
		int escolha;
		
		do {
			System.out.println("Digite um número de 0 a 4:");
	        escolha = scanner.nextInt();
			switch(escolha) {
				case 0:
					System.out.println("Obrigado, ate mais!");
					break;
				default:
					System.out.println("Entrada inválida, digite uma opcao");
			}
		} while(escolha != 0);
		
		scanner.close();
	}

}
