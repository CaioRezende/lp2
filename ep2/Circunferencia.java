Class Circunferencia extends FiguraGeometrica(){
	
	private double raio;
		
	public void setRaio(double raio){
		this.raio = raio;
	}
	
	public double getRaio(){
		return raio;
	}
	
	public double PCirculo(){
		return (3,14*2*getRaio());
	}
	
	public double ACirculo(){
		return (3,14*getRaio()*getRaio());
	}
}
