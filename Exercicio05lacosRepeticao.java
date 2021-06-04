package exerciciosLacosRepeticao;

import java.util.Scanner;

/*Crie um programa que leia um número do teclado até que encontre um número igual a zero.
 *  No final, mostre a soma dos números digitados.(DO...WHILE)
*/
public class Exercicio05lacosRepeticao {

	public static void main(String[] args) {
	
		int numero=0, soma=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os numeros (E digite 0 para finalizar a soma): ");
		
		do {
			numero = leia.nextInt();
			soma = soma + numero;
		}
	
		while(numero !=0);
		
		System.out.println("A soma dos valores digitados é de: "+soma);
	
	}

}
