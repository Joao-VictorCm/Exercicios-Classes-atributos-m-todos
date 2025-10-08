package ex01;

public class retangulo {

	public static void main(String[] args) {
		/*
		 * Problema "retangulo" 
		 * Fazer um programa para
		 * ler os valores da largura e altura de um retângulo. Em seguida, mostrar na
		 * tela o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado
		 * no projeto ao lado.
		 */
		
		Dados retangulo = new Dados();
		
		retangulo.width = 3.00;
		retangulo.height = 4.00;
		
		
		System.out.println(retangulo.Area());
		System.out.println(retangulo.perimetro());
		System.out.println(retangulo.diagonal());

	}

}
