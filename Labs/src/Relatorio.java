
public class Relatorio {
	private int data;
	private String autor;
	private int numeroPaginas;
	
	/*Metodo construtor*/
	Relatorio(int data, String autor, int numeroPaginas){
		this.data = data;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	/*Metodos getters e setters*/
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public static void main(String args) {
		Relatorio relatorio1 = new Relatorio(21082023, "Roberto", 4);
		System.out.println(relatorio1);
	}
}
