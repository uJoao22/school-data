package pacOutros;

public class Aluno extends Pessoa{

	private int nota;
	
	public Aluno(String nome, String end, int nota) {
		super(nome, end);
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}

	public String toString() {
		return super.toString()+ ",\nNota: " +nota+ ".";
	}
}