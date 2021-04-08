import java.util.Random;
	
public class Binario {
	
	public static void main(String[] args) {
	    Random rand = new Random();
	    int r = rand.nextInt(1000);
	     System.out.println(r);
	    transformaBinario(r);
	}
	
	public static void transformaBinario(int num){
	    if(num>0){
	        transformaBinario(num/2);
	        System.out.print(num%2);
	    }
	}
}

