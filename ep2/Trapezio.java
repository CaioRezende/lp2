public class Trapezio extends FiguraGeometrica(){
	
	private double Menor, Maior, altura;

	public void setMenor(double Menor){
		this.Menor=Menor;
	}

	public void setMaior(double Maior){
		this.Maior=Maior;
	}
	
	public void setAltura(double altura){
		this.altura=altura;
	}
	
	public double getMenor(){
		return Menor;
		}	
		
	public double getMaior(){
		return Maior;
		}
	
	public double getAltura(){
		return altura;
		}			
	
	public double Atrapezio(){
		return ((getMaior()+getMenor())*getAltura())/2);
		}			
}
