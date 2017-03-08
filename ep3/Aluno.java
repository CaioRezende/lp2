import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Comparable;

public class Aluno{
	private String nome;
	private int idade;
	
	public void setNome(){
		this.nome = nome;	
	}
	
	public String getNome(){
		return this.nome;	
	}
	
	public void setIdade(){
		this.idade = idade;	
	}
	
	public int getIdade(){
		return this.idade;	
	}
	
	public Aluno{
		private int idade;
		public int compareTo(Aluno aluno2) {
        if (this.idade < aluno2.idade) {
            return -1;
        }
        if (this.idade > aluno2.idade) {
            return 1;
        }
        return 0;
    }
    public int compareTo2(Aluno aluno3) {
        if (this.idade < aluno3.idade) {
            return -1;
        }
        if (this.idade > aluno3.idade) {
            return 1;
        }
        return 0;
    }
	public int compareTo3(Aluno aluno4) {
        if (this.idade < aluno4.idade) {
            return -1;
        }
        if (this.idade > aluno4.idade) {
            return 1;
        }
        return 0;
    }
	public int compareTo(Aluno aluno5) {
        if (this.idade < aluno5.idade) {
            return -1;
        }
        if (this.idade > aluno5.idade) {
            return 1;
        }
        return 0;
    }
 }
    
    Collections.sort(lista);

}