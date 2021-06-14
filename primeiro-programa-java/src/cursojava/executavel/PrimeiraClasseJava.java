package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import sun.security.action.GetBooleanAction;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual o número de RG?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da Mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do Pai?");
		String cpf = JOptionPane.showInputDialog("Qual o número do CPF?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNome(nome);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRg(rg);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setCpf(cpf);
	
		Disciplina disciplina1 = new Disciplina();
		
		System.out.println(aluno1.toString());
		System.out.println("Média = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
	}
}
