class No{
	int x;
	No prox;
	No ant;
	
	public void setX(int x){
	this.x = x;
	}
	
	public String getX(){
		return x;	
	}
	
	public void setAnt(No ant){
		this.ant = ant;	
	}
	
	public String getAnt(){
		return ant;	
	}
	
	public void setProx(No prox){
		this.prox = prox;	
	}	
	
	public String getProx(){
		return prox;	
	}	
}

public class Lista{
	int i = 0;
	private No comeco, fim;
	
	public void setComeco(No comeco){
		this.comeco = comeco;	
	}
	
	public String getComeco(){
		return  comeco;	
	}
	
	public void setFim(No fim){
		this.fim = fim;	
	}
	
	public String getFim(){
		return fim;	
	}
	
	public boolean Pesquisar(String x){
	No y = getComeco();
	while(y != null){ 	
		if(x == y.getX())){
			return true;
		}else{
		x = x.getProx();		
		}
	}
	return false;	
}

	public String Inserir(String x){
		No novo = new No();
		y.setX(x);
		if(x == 0){		
			this.comeco = y;
			this.fim = y;
			setComeco(y);
			setUltimo(y);
		}else{
		fim.setProx(y);
		y.setAnt(fim);
		fim = y;
		fim.setProx(fim)
		}
		i++;
	}
	
	public void Remover(){
		No a = getComeco();
		while(a != null){
			if(Comeco.getX() == a.getX()){
				Lista.remove(a);
			}
	}
	
	public void Exibir(){                   
		No a = getComeco();
		while (a != fim){
			System.out.println(a.getX());
			a = a.getProx();
		}
		System.out.println(fim.getX());
	}	
	
}
