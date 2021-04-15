package mc322.lab03;

public class AppLab03 {
	
	
	public static void main(String[] args) {
		
		String str = "080403MCMVM";
		
		Animacao Lombriga = new Animacao(str);
		
		Lombriga.apresenta();
		
		for (int i = 6; i < str.length(); i++) {
			Lombriga.passo();
			Lombriga.apresenta();
		}
	}

}
