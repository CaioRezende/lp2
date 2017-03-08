Class Trapezio(){
	Int perimetro, area;
	setPerimetro(){
		int basetriangulo = ((get.Basemaior – get.Basemenor) / 2);
		int hipotenusa = Math.pow(Math.pow(basetriangulo, 2) + Math.pow(get.Altura, 2), 1/2);
this.perimetro = get.Basemaior + get.Basemenor + (hipotenusa*2);
}
	getPerimetro(){
		return this.perimetro;
}
	setArea(){
		this.area = (((get.Basemaior + get.Basemenor)/2)*get.Altura);
}
	getArea(){
		return this.area;
}