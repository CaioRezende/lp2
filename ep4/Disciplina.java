public class Disciplina{
	String nome, professor;

	public Disciplina(String nome, professor){
		this.nome = nome;
		this.professor = professor;
	}

	public String getProfessor(){
		return this.professor;
}
	public String getNome(){
		return this.nome;
	}
}
