package br.com.erickfreire.comparandointeiros;

import java.util.Scanner;

public class ComparandoInteiros {

	public static void main(String[] args) {
		int numero1;
		int numero2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que compara dois valores: ");
		System.out.print("Informe o prinmeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Informe o segundo valor: ");
		numero2 = entrada.nextInt();
		
		if(numero1 > numero2)
			System.out.printf("O Numero1: %d � maior", numero1);
		
		if(numero1 < numero2)
			System.out.printf("O Numero2: %d � maior", numero2);
		
		if(numero1 == numero2)
			System.out.printf("O Numero1: %d e o numero2: %d s�o iguais", numero1, numero2);


	}

}
