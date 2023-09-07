package itemMultimidia;

public class ItemMultimidia {
	protected String titulo;
	protected String autor;
    protected String editora;
    protected int ano;
    protected String genero;
    protected String sinopse;
    //private boolean disponibilidade;

    public ItemMultimidia(String titulo, String autor, String editora,
    		int ano, String genero, String sinopse) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEditora(editora);
        this.setAno(ano);
        this.setGenero(genero);
        this.setSinopse(sinopse);
       // this.disponibilidade = true;
    }

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
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	/*/
	public boolean getDisponibilidade() {
		return disponibilidade;
	}
	public boolean emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            return true;
        } else {
            return false;
        }
    }

    public void devolver() {
        disponibilidade = true;
    }
/*/
}