public class Ponto{
	private double x,y;
		public void setX(double x){
			this.x = x;
}
		public double getX(){
			return x;
}
		public void setY(double y){
			this.y = y;
}
		public double getY(){
			return y;
}



	public static void main(String[] args){
		Ponto p1 = new Ponto();
			p1.setX(10);
			p1.setY(20);
		Ponto p2 = new Ponto();
			p2.setX(60);
			p2.setY(80);
		double xx = p1.x - p2.x;
		double yy = p1.y - p2.y;
		double res = Math.sqrt(Math.pow(xx,2) + (Math.pow(xx,2)));
		
		
		
		
		System.out.println(res);
}

}









