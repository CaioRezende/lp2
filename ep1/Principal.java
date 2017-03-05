public static void main(String[] args){
   Lista lista = new Lista();
   String x = null;

  while(int i != 9){
    System.out.println("O que quer fazer?/n1 - Inserir/n2 - Remover/n3 - Pesquisar/n9 - Finalizar o programa");
    //cin >> resposta;
    if(resposta == "1"){
      System.out.println("Informe o valor que deseja inserir");
      //cin >> x;
      lista.Inserir(x);     
    }else if(resposta == "2"){
      System.out.println("Informe o valor que deseja remover");
      //cin >> x;
      lista.Remover(x);
    }else if(resposta == "3"){
      System.out.println("Informe o valor que deseja pesquisar");
      //cin >> x;
      if(lista.Pesquisar(x) == true){
        System.out.println("Valor existe na lista");
      }else{
        System.out.println("Valor não existe na lista");
      }
    }else{
       System.out.println("Escolha inválida");
    }
  }
}
