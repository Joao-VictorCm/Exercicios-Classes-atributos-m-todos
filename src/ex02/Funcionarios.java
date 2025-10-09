package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		/*
		 * Problema "funcionarios" Fazer um programa para ler os dados de um funcionário
		 * (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário
		 * (nome e salário líquido). Em seguida, aumentar o salário do funcionário com
		 * base em uma porcentagem dada (somente o salário bruto é afetado pela
		 * porcentagem) e mostrar novamente os dados do funcionário. Use a classe
		 * projetada ao lado.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Dados funcionarios =  new Dados();
		
		System.out.print("Nome: ");
		funcionarios.name = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionarios.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionarios.tax = sc.nextDouble();
		System.out.println("Funcionario: " +funcionarios.name+ ", $"+funcionarios.netSalary() );
		System.out.print("Qual porcentagme para aumentar o salario? ");
		double porcent = sc.nextInt();
		funcionarios.increasesalary(porcent);
		System.out.println(funcionarios);
		
		
		sc.close();

	}

}
