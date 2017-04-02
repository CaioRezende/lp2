import java.util.ArrayList;
import java.util.Collections;

public class Principal{
	public static void main(String[] args){
  
    ArrayList<Nota> notas = new ArrayList<Nota>();
    
    Aluno aluno1 = new Aluno("Caio", 14);
	  Aluno aluno2 = new Aluno("Caio2", 15);
	  Aluno aluno3 = new Aluno("Caio3", 16);
	  Aluno aluno4 = new Aluno("Caio4", 17);
	  Aluno aluno5 = new Aluno("Caio5", 18);
    
    Disciplina mat = new Disciplina("Matemática", "José");
	  Disciplina port = new Disciplina("Português", "João");
    
    notas.add(new Nota(10, aluno1, mat));
	  notas.add(new Nota(9, aluno1, port));
	  notas.add(new Nota(9, aluno2, mat));
	  notas.add(new Nota(8, aluno2, port));
	  notas.add(new Nota(8, aluno3, mat));
	  notas.add(new Nota(7, aluno3, port));
	  notas.add(new Nota(7, aluno4, mat));
	  notas.add(new Nota(6, aluno4, port));
    notas.add(new Nota(6, aluno5, mat));
    notas.add(new Nota(10, aluno5, port));
    
    Collections.sort(notas);
    
    int i = 0;
            System.out.println("Maior nota total: " + notas.get(i).getValor());
            while(i < 5){
                System.out.println("Matéria: " + notas.get(i).getDisciplina().getNome() + "\nProfessor: " + notas.get(i).getDisciplina().getProfessor() + "\nAluno: " + notas.get(i).getAluno().getNome());
                i++;
                if(notas.get(i-1).getValor() != notas.get(i).getValor()){
                    i = 6;
                }
            }
            
    int x = 0;
            System.out.println("\nMaior nota de Matemática: ");
            while(x < 4){
                if(notas.get(x).getDisciplina().getNome() != mat.getNome()){
                    x++;
                }
                else{
                    System.out.println("Nota: " + notas.get(x).getValor() + "\nAluno: " + notas.get(x).getAluno().getNome());
                }
                    
                    if(notas.get(x).getValor() == notas.get(x+1).getValor()){
                        x++;
                    }
                    else{
                        x = 5;
                    }
            }
            
     int y = 0;
            System.out.println("\nMaior nota de Português: ");
            while(y < 4){
                if(notas.get(y).getDisciplina().getNome() != port.getNome()){
                    y++;
                }    
                else{
                    System.out.println("Nota: " + notas.get(y).getValor() + "\nAluno: " + notas.get(y).getAluno().getNome());
                }    
                    if(notas.get(y).getValor() == notas.get(y+1).getValor()){
                        y++;
                    }    
                    else{
                        y = 5;
                    }
            }
    }
}    
