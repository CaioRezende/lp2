public class Quadrado extends FiguraGeometrica(){
	
	private double lado;

	public void setL(double lado){
		this.lado=lado;
	}
	
	public double getL(){
		return lado;
	}	
	
	
	public double Pquadrado(){
		return getL()*4;
	}
	
	public double Aquadrado(){
		return getL()*getL();
	}
		
			
}
