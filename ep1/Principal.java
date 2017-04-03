public class Principal{
   public static void main(String[] args){
      Lista lista = new Lista();
   
      System.out.println("Inserir 1 2 3 4");
    
      lista.Inserir(1);
	   lista.Inserir(2);
	   lista.Inserir(3);
	   lista.Inserir(4);
   
      System.out.println("Tamanho da lista: " + lista.i);
		
		lista.Exibir();
		
		if(lista.Procurar(4) == true){
			System.out.println("Número existente");
		}
		
		System.out.println("Remover o ultimo numero da lista, 4");
		
		lista.Remover();
		
		System.out.println("Tamanho da lista: "+ lista.i);
		
		System.out.println("Insira o número 5");
      
		lista.Inserir(5);
      
		lista.Exibir();
		
		System.out.println("Tamanho da lista: " + lista.i);
		
	}
}
