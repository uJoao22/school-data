package pacOutros;

import javax.swing.JOptionPane;

public class Modo_02 {

	public static void main(String[] args) {
		
		//---ALUNO---\\
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String end = JOptionPane.showInputDialog("Qual o endereço do aluno?");
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota do aluno?"));
		
		Aluno al = new Aluno(nome, end, nota);
		//USANDO TO STRING - Mostrando no meio
		//JOptionPane.showMessageDialog(null, al.toString(), "Aluno", JOptionPane.INFORMATION_MESSAGE);

				
		//---PROFESSOR---\\
		String name = JOptionPane.showInputDialog("Qual o nome do professor?");
		String ende = JOptionPane.showInputDialog("Qual o endereço do professor?");
		String materia = JOptionPane.showInputDialog("Qual a materia?");
				
		Professor prof = new Professor(name, ende, materia);
		//USANDO TO STRING - Mostrando no meio
		//JOptionPane.showMessageDialog(null, prof.toString(), "Professor", JOptionPane.INFORMATION_MESSAGE);
				
				
		//MOSTRANDO TUDO NO FIM
		JOptionPane.showMessageDialog(null, al.toString(), "Aluno", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, prof.toString(), "Professor", JOptionPane.INFORMATION_MESSAGE);
				
		//---------------------------------------------------------------------------------------------------------\\
				
		//USANDO GET 
		//JOptionPane.showMessageDialog(null,"Nome do aluno: " +al.getNome()+ ",\nEndereço do aluno: " +al.getEnd()+ ",\nNota: " +al.getNota()+ ".\n\nNome do professor: " +prof.getNome()+ ",\nEndereço do Profesor: " +prof.getEnd()+ ",\nMateria: " +prof.getMateria()+ ".");
	}
}