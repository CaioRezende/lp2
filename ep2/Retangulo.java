public class Retangulo extends FiguraGeometrica(){
	
	private double l1, l2;

	public void setL1(double l1){
		this.l1=l1;
	}

	public void setL2(double l2){
		this.l2=l2;
		}
	
	public double getL1(){
		return l1;
		}	
		
	public double getL2(){
		return l2;
		}	
	
	
	public double Pretangulo(){
		return ((getL1()*2)+(getL2()*2));
		}
	
	public double Aretangulo(){
		return getL1()*getL2();
		}
		
			
}
