package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int idade;
	private String nome;
	private String dataNascimento;
	private String rg;
	private String nomeMae;
	private String nomePai;
	private String cpf;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	private List <Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Aluno() {
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double getMediaNota() {
		return 0;
		
		}
	
	public String getAlunoAprovado() {
	    double media = this.getMediaNota();
	    if (media >= 70) {
	    	return "Aprovado";
	    }else{
	    	return "Reprovado";
	    }
	
		
		
	}

	public void setIdade(Integer valueOf) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", rg=" + rg
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", cpf=" + cpf + ", nota1=" + nota1 + ", nota2="
				+ nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + "]";
	}

	
	
	
	
}
