package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		/*
		 * Problema "retangulo" Fazer um programa para ler os valores da largura e
		 * altura de um retângulo. Em seguida, mostrar na tela o valor de sua área,
		 * perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Dados retangulo = new Dados();


		System.out.println("Entre com a largura e altura do retângulo: ");
		System.out.print("Largura: ");
		retangulo.width = sc.nextDouble();
		System.out.print("Altura: ");
		retangulo.height = sc.nextDouble();
		System.out.println(retangulo);
		

		
		sc.close();
	}

}
