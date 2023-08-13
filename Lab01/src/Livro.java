
public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private String ISBN;
	
	/*Metodo construtor*/
	Livro(String titulo, String autor, String editora, String ISBN){
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditora(editora);
		this.setISBN(ISBN);
	}

	/*Metodos getters e setters*/
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public static void main(String args) {
		Livro duna = new Livro("Duna", "Frank Herbert", "Editora Aleph", "857657313X");
		System.out.println(duna);
	}
}