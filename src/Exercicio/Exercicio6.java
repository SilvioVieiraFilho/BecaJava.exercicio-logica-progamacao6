package Exercicio;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n1 = s.nextInt();
		int n2 = s.nextInt();

		

		int maior;
		int menor;

		if (n1 > n2) {

			maior = n1;
			menor = n2;
		} else {

			maior = n2;
			menor = n1;

		}
		
		int resto = 0;

		while ((maior % menor) != 0) {

			resto = (maior % menor);
			maior = menor;
		    menor = resto;
			
		

		}
	    System.out.println(menor);
		


	}
}
