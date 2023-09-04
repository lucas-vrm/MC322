import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Membro {
	private String nome;
	private String contato;
	private int id;
	private LocalDate dataDeRegistro;
	private TipoMembro tipoDeMembro;
	
	public enum TipoMembro {
        GRADUACAO,
        POS_GRADUACAO,
        PROFESSOR,
        FUNCIONARIO
    }
	
	/*Metodo construtor*/
	public Membro(String nome, String contato, int id, TipoMembro tipoDeMembro) {
		this.nome = nome;
		this.contato = contato;
		this.id = id;
		LocalDate dataDeRegistro = LocalDate.now();
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

	public static void main(String[] args) {
		Membro membro1 = new Membro("Mauricio", "(19) 940028922", 239090, TipoMembro.GRADUACAO);
		System.out.println(membro1);
	}
}
