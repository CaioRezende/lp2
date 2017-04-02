public class Nota{
	double valor;
	Aluno aluno1;
	Disciplina d;	
	
	public Nota(double valor, Aluno aluno1, Disciplina d){
		this.valor = valor;
		this.aluno1 = aluno1;
		this.d = d; 
	}
	
	public double getValor(){
		return this.valor;	
	}	
	
	public void getAluno1(){
		return this.aluno1;	
	}
	
	public Disciplina getD1(){
		return this.disciplina1;
	}
	public int compareTo(Nota nota1){
		if(this.valor < nota1.getValor())
			return 1;
		else if(this.valor > nota1.getValor())
			return -1;
		else
			return 0;
	}

}
