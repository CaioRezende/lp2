public class Principal{
	public static void main(String[] args){
		System.out.println(“Informe a sua opção:  \n1 – Quadrado/n2 – Triângulo/n3 – Retângulo/n4 – Circunferência/n5 - Trapézio”;
			FiguraGeometrica figura1 = new FiguraGeometrica();
		figura1.setOpcao(4)
			
		if(figura1.getOpcao == 1){
			Quadrado Quadrado1 = new Quadrado();
			Quadrado.setL(5);
			System.out.println(“Perímetro: ” + Quadrado1.Pquadrado());
			System.out.println(“Área: ” + Quadrado1.Aquadrado());
		}
		if(figura.getOpcao == 2){
			Triangulo Triangulo1 = new Triangulo();
			Triangulo1.setL1(2);
			Triangulo1.setL2(2);
			Triangulo1.setBase(2);
			Triangulo1.setAltura(2);
			System.out.println(“Perímetro: ” + Triangulo1.Ptriangulo());
			System.out.println(“Área: ” + Triangulo1.Atriangulo());
		}
		if(figura.getOpcao == 3){
			Retangulo Retangulo1 = new Retangulo();
			Retangulo1.setL1(5);
		    	Retangulo1.setL2(5);
			System.out.println(“Perímetro: ” + Retangulo1.Pretangulo());
			System.out.println(“Área: ” + Retangulo1.Aretangulo());
		}
		if(figura.getOpcao == 4){
			Circunferencia Circunferencia1 = new Circunferencia();
			Circulo1.setRaio(4);
			System.out.println(“Perímetro: ” + Circulo1.Pcirculo());
			System.out.println(“Área: ” + Circulo1.Acirculo());
		}
		if(figura.getOpcao == 5){
			Trapezio.setPerimetro(7, 5, 5);
			Trapezio.setArea(7, 5, 5);
			System.out.println(“Perímetro: ” + getPerimetro());
			System.out.println(“Área: ” + getArea());		
		}
	}
}

