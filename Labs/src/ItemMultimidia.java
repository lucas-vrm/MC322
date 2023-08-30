class ItemMultimidia {
    private String titulo;
    private String codigo;
    private boolean disponibilidade;

    public ItemMultimidia(String titulo, String codigo) {
        this.setTitulo(titulo);
        this.setCodigo(codigo);
        this.disponibilidade = true;
    }

    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

class LivroFisico extends ItemMultimidia {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, String codigo, int numeroPaginas) {
        super(titulo, codigo);
        this.numeroPaginas = numeroPaginas;
    }
}

class LivroEletronico extends ItemMultimidia {
    private String formato;

    public LivroEletronico(String titulo, String autor, String codigo, String formato) {
        super(titulo, codigo);
        this.formato = formato;
    }
}

class CDAudio extends ItemMultimidia {
    private int duracao;

    public CDAudio(String titulo, String autor, String codigo, int duracao) {
        super(titulo, codigo);
        this.duracao = duracao;
    }
}

class DVDVideo extends ItemMultimidia {
    private int duracao;

    public DVDVideo(String titulo, String autor, String codigo, int duracao) {
        super(titulo, codigo);
        this.duracao = duracao;
    }
}
