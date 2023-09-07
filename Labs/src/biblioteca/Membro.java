package biblioteca;
import java.time.LocalDate;


public class Membro {
	private String nome;
	private String contato;
	private int id;
	private LocalDate dataDeRegistro;
	private String endereco;
	public TipoMembro tipoDeMembro;
	
	public enum TipoMembro {
        GRADUACAO,
        POS_GRADUACAO,
        PROFESSOR,
        FUNCIONARIO
    }
	
	/*Metodo construtor*/
	public Membro(String nome, String contato, int id, String dataDeRegistro,
			String endereco, TipoMembro tipoDeMembro) {
		this.nome = nome;
		this.contato = contato;
		this.id = id;
		this.dataDeRegistro = LocalDate.parse(dataDeRegistro);
		this.tipoDeMembro = tipoDeMembro;
	}
	
	/*Metodos getters e setters*/
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getDataDeRegistro() {
		return dataDeRegistro;
	}
	public void setDataDeRegistro(LocalDate dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}

	public TipoMembro getTipoDeMembro() {
		return tipoDeMembro;
	}
	public void setTipoDeMembro(TipoMembro tipoDeMembro) {
		this.tipoDeMembro = tipoDeMembro;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static void main(String[] args) {
		
		Membro membro1 = new Membro("Gabryel", "998579003", 238405, "2007-12-03", "Rua Jose Maravilha, 93", TipoMembro.GRADUACAO);
		System.out.println(membro1.dataDeRegistro);
	}
}