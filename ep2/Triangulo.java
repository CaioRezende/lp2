public class Triangulo extends FiguraGeometrica(){
	
	private double l1, l2, l3, altura;

	public void setL1(double l1){
		this.l1 = l1;
	}
	
	public void setL2(double l2){
		this.l2 = l2;
	}
	
	public void setL3(double l3){
		this.l3 = l3;
	}
		
	public void setAltura(double altura){
		this.altura = altura;
	}
		
	public double getL1(){
		return l1;
	}
	
	public double getL2(){
		return l2;
	}
	
	public double getL3(){
		return l3;
	}
		
	public double getAltura(){
		return altura;
	}
		
	public double Ptriangulo(){
		return (getL1()+getL2()+getL3());
	}
	
	public double Atriangulo(){
		return (getBase()*getAltura())/2);
	}	
			
}
