package pacOutros;

import javax.swing.JOptionPane;

public class Modo_01 {

	public static void main(String[] args) {
		
		//---ALUNO---\\
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String end = JOptionPane.showInputDialog("Qual o endereço do aluno?");
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota do aluno?"));
		
		Aluno al = new Aluno(nome, end, nota);
		JOptionPane.showMessageDialog(null, al.toString(), "Aluno", JOptionPane.INFORMATION_MESSAGE);

		
		//---PROFESSOR---\\
		String name = JOptionPane.showInputDialog("Qual o nome do professor?");
		String ende = JOptionPane.showInputDialog("Qual o endereço do professor?");
		String materia = JOptionPane.showInputDialog("Qual a materia?");
		
		Professor prof = new Professor(name, ende, materia);
		JOptionPane.showMessageDialog(null, prof.toString(), "Professor", JOptionPane.INFORMATION_MESSAGE);
	}
}