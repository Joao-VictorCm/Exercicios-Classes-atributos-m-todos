package ex03;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		/*
		 * Problema "alunos" Correção: (final do documento) Fazer um programa para ler o
		 * nome de um aluno e as três notas que ele obteve nos três trimestres do ano
		 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final,
		 * mostrar qual a nota final do aluno no ano. Dizer também se o aluno está
		 * aprovado (APROVADO) ou não (REPROVADO) e, em caso negativo, quantos pontos
		 * faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota).
		 * Você deve criar uma classe Student para resolver este problema.
		 */
		Scanner sc = new Scanner(System.in);

		Notas notas = new Notas();

		notas.nota1 = sc.nextDouble();
		notas.nota2 = sc.nextDouble();
		notas.nota3 = sc.nextDouble();

		System.out.printf("NOTA FINAL: %.2f%n", notas.notaFinal());

		if (notas.notaFinal() < 60) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS%n", notas.missingPoints());
		} else {
			System.out.println("APROVADO");
		}
	}

}
