package pacOutros;

public class Pessoa {
	private String nome;
	private String end;
	
	public Pessoa(String nome, String end) {
		this.nome = nome;
		this.end = end;
	}

	public String getNome() {
		return nome;
	}

	public String getEnd() {
		return end;
	}

	public String toString() {
		return "Nome: " +nome+ ",\nEndereço: " +end;
	}
	
	
}