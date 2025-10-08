package ex01;

public class Dados {
	public double width;
	public double height;
	public double area;
	

	public double Area() {
		return area = width * height;
	}
	
	public double perimetro(){
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA: " +Area() + "\nPERIMETRO: " + perimetro() +"\nDIAGONAL: " +diagonal(); 
	}
}
