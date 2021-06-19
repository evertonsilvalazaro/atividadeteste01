package atividadeTeste01;

import java.util.Scanner;

public class Main

{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a, b, c;

		System.out.println("Insira o valor de a: ");
		a = input.nextDouble();

		System.out.println("Insira o valor de b: ");
		b = input.nextDouble();

		System.out.println("Insira o valor de c: ");
		c = input.nextDouble();

		Equacao Equacao = new Equacao();
		System.out.println(Equacao.calculo(a, b, c));
	}
}