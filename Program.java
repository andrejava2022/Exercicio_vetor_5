package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[]numeros = new double[n];
		int posmaior ;
		
		for(int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();		
			}
		
		double maior = 0;
		posmaior = 0;
		
		 for (int i=0; i < n; i++) {
			  
	            if (numeros[i] > maior)
	                maior = numeros[i];
	            	posmaior = i;
	        }
		
		System.out.printf("MAIOR VALOR: %.1f\n" ,maior );
		System.out.printf("POSIÇÃO DO MAIOR VALOR: %d\n",posmaior );
	}

}
