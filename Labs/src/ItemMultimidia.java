class ItemMultimidia {
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponibilidade;

    public ItemMultimidia(String titulo, String autor, String codigo) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setCodigo(codigo);
        this.disponibilidade = true;
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

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
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
}
