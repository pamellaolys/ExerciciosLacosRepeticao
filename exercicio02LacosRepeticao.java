package exerciciosLacosRepeticao;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class exercicio02LacosRepeticao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero=0, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
		
			System.out.println("Digite o " + i + " nº ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
			System.out.println("\nQuantidade de numeros pares é de: " + par);
			System.out.println("\nQuantidade de numeros impares é de: " + impar);
		}
	}

