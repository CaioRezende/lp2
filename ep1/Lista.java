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
		if(x.equals(y.getX())){
			//if(x == y), comparação de objetos em java
			return true;
		}else{
		x = x.getProx();		
		}
	}
	return false;	
}

	public String Inserir(String x){
		No novo = new No();
		if(Lista = null){		
		novo.setX(x);
		setComeco(novo);
		setUltimo(novo);
		}else{
		novo.setX(x);		
		fim.setProx(novo);		
		fim = novo;
		}
	}
	
	public String Remover(String x){
		No a = getComeco();
		while(a != null){
			if(x.equals(a.getX())){
				Lista.remove(a);
			}
		}
	}
	
}
