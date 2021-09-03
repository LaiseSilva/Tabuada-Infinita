package tabuada;

import java.util.Scanner;

public class TabuadaInfinita {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int multiplicando, multiplicador, produto;
		int contagem = 0;

		System.out.print("Digite o multiplicando: ");
		multiplicando = leitor.nextInt();

		System.out.print("Digite o multiplicador máximo: ");
		multiplicador = leitor.nextInt();
		leitor.close();
		
		System.out.println();
		
		System.out.println("Tabuada do: " + multiplicando);

		while (contagem < multiplicador) {

			produto = multiplicando * (contagem + 1);

			System.out.println(multiplicando + " x " + (contagem + 1) + " = " + produto);
			contagem = contagem + 1;

		}

	}

}
