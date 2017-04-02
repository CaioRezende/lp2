import java.util.ArrayList;
import java.util.Collections;	

public class Principal{
	public static void main(String Arg[]){
		ArrayList<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();	
		
		for(int i = 0; i < 12; i++)
		{
			lista.add(new Aluno("Caio", i*10));
		}

		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() + "--" + lista.get(i).getNome());
                }

		Collections.sort(lista);
		
		for(int i = 0; i < 5; i++)
                {
                        System.out.println(lista.get(i).getIdade() + "--" + lista.get(i).getNome());
                }

	}
}

