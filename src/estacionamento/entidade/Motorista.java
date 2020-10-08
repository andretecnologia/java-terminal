package estacionamento.entidade;

public class Motorista {
	private String nome;
	private String telefone;
	public Motorista(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	public Motorista() {
		
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
