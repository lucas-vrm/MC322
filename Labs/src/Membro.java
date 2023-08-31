
public class Membro {
	private String nome;
	private String tipoMembro;
	private int id;
	private String dataDeRegistro;
	
	public Membro(String nome, String tipoMembro, int id) {
		this.nome = nome;
		this.tipoMembro = tipoMembro;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoMembro() {
		return tipoMembro;
	}
	public void setTipoMembro(String tipoMembro) {
		this.tipoMembro = tipoMembro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataDeRegistro() {
		return dataDeRegistro;
	}

	public void setDataDeRegistro(String dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

	public static void main(String[] args) {
		Membro membro1 = new Membro("Mauricio", "Graduacao", 239090);
		System.out.println(membro1);
	}
}
