package mc322.lab03;

public class Animacao {
	 public int comando = 6;
	 public int totalDeComandos;
	 public String entrada;
	 public String AA,LL,PP;
 	 public int tamanhoAquario;
 	 public int tamanhoLombriga;
 	 public int posicaoLombriga;
 	 public String[] vet;
 	 public AquarioLombriga aquario;
	
	
	public Animacao(String entrada) {
		
		this.entrada = entrada;
		
		this.vet= entrada.split("",0);
		this.totalDeComandos = entrada.length();
		this.comando = 6;
	    this.AA= vet[0] + vet[1];
	    this.LL= vet[2] + vet[3];
	    this.PP= vet[4] + vet[5];
	    this.tamanhoAquario= Integer.parseInt(this.AA);
	    this.tamanhoLombriga= Integer.parseInt(this.LL);
	    this.posicaoLombriga= Integer.parseInt(this.PP);
		
		this.aquario = new AquarioLombriga(tamanhoAquario, tamanhoLombriga, posicaoLombriga);
	}
	
	public void apresenta() {
		aquario.apresenta();
	}
	
	public void passo() {
		if(vet[this.comando].equals("C")){
			aquario.crescer();
	     }
		 
	     if(this.vet[this.comando].equals("M") ){
	    	 aquario.mover();
	     }
	     
	     if(this.vet[this.comando].equals("V")){
	    	 aquario.virar();
	     }
	     
	     if(this.comando<this.totalDeComandos){
	         this.comando++;
	     }
	}
}
