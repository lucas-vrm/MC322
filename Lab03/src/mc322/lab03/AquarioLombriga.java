package mc322.lab03;

public class AquarioLombriga{
	public int tamanhoAquario;
    public int tamanhoLombriga;
    public int posicaoLombriga; // posicao da cabeca da lombriga;
    public int orientacaoLombriga; // -1: cabeca para a esquerda. 1:cabeca para a direita;
    
    public AquarioLombriga( int tamanhoAquario, int tamanhoLombriga, int posicaoLombriga){
    	
        this.tamanhoAquario = tamanhoAquario;
        this.tamanhoLombriga = tamanhoLombriga;
        this.posicaoLombriga = posicaoLombriga;
        this.orientacaoLombriga = 1;
        
        if( tamanhoLombriga > tamanhoAquario){
            tamanhoAquario = tamanhoLombriga;
        }
        if ( orientacaoLombriga == -1 && posicaoLombriga + (tamanhoLombriga-1) > tamanhoAquario){
        	posicaoLombriga = 1;
        }
        if ( orientacaoLombriga == 1 && posicaoLombriga < tamanhoLombriga){
        	posicaoLombriga = tamanhoAquario;
        }
    }
    public void crescer(){
        if(this.tamanhoLombriga < this.tamanhoAquario){
        	if (this.orientacaoLombriga == 1 && this.posicaoLombriga > 1) {
        		this.tamanhoLombriga++;
        		this.posicaoLombriga--;
    		} else if(this.orientacaoLombriga == -1 && (this.posicaoLombriga + this.tamanhoLombriga) <= this.tamanhoAquario){
    			this.tamanhoLombriga++;
    		}
        }
    }
    public void mover(){
        if(this.tamanhoLombriga < this.tamanhoAquario){
            if(this.orientacaoLombriga == -1 && this.posicaoLombriga > 1){
                    this.posicaoLombriga--;
            }
            else{
                if(posicaoLombriga < this.tamanhoAquario){
                    this.posicaoLombriga++;
                }
            }
        }
    }
    public void virar(){
        if(this.orientacaoLombriga == -1){
            
            this.orientacaoLombriga = 1;
        } else {
            this.orientacaoLombriga = -1;
        }
    }
    public void apresenta(){
    	
        String aquario[] = new String[this.tamanhoAquario];
        
        if(this.orientacaoLombriga == 1){
            for(int i = 1; i <= this.tamanhoAquario; i++){
                if(i == (this.posicaoLombriga + this.tamanhoLombriga - 1)){
                	aquario[i-1] = "O";
                } else if( i >= this.posicaoLombriga && i < (this.tamanhoLombriga + posicaoLombriga - 1) ){
                	aquario[i-1] = "@";   
                } else {
                    aquario[i-1] = "#";
                }
            }
        } else {
            for(int i = 1; i <= this.tamanhoAquario; i++){
                if ( i == this.posicaoLombriga){
                	aquario[i-1]= "O";
                } else if (i > this.posicaoLombriga && i < (this.posicaoLombriga + this.tamanhoLombriga)){
                	aquario[i-1]= "@";
                }
                else{
                	aquario[i-1]= "#";
                }
            }
        }
        for (int i=0; i < this.tamanhoAquario;i++){
            System.out.print(aquario[i]);
        }

        System.out.println("");
        System.out.println(this.posicaoLombriga);
    }
}
