package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	 public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	      
	        System.out.print("Digite o primeiro número: ");
	       
	        int primeiroNumero = scanner.nextInt();

	    
	        System.out.print("Digite o segundo número: ");
	    
	        int segundoNumero = scanner.nextInt();

	
	        int soma = primeiroNumero + segundoNumero;

	        
	        System.out.println("A Soma de " + primeiroNumero + " e " + segundoNumero + " é: " + soma);

	        
	        scanner.close();
	    }
	
}
