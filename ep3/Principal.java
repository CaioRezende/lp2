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
		
		aluno1.setNome("Caio");
		aluno1.setIdade(14);
		aluno2.setNome("Caio2");
		aluno2.setIdade(15);
		aluno3.setNome("Caio3");
		aluno3.setIdade(16);
		aluno4.setNome("Caio4");
		aluno4.setIdade(17);
		aluno5.setNome("Caio5");
		aluno5.setIdade(18);
		
		lista.add(aluno1);
		lista.add(aluno2);
		lista.add(aluno3);
		lista.add(aluno4);
		lista.add(aluno5);

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

