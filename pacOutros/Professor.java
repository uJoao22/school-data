package pacOutros;

public class Professor extends Pessoa{
	
	private String materia;
	
	public Professor(String nome, String end, String materia) {
		super(nome, end);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public String toString() {
		return super.toString()+ ",\nMateria: " +materia+ ".";
	}
}