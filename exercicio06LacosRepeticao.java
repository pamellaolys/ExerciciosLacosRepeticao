package exerciciosLacosRepeticao;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
public class exercicio06LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0, soma=0 , contadorMult3 = 0;
		double media=0.0;
		
		do {
			System.out.println("Digite um numero (E digite 0 para finalizar a soma): ");
			numero = leia.nextInt();
		if(numero % 3 == 0) {
			soma= soma+numero;
			contadorMult3++;
		}
		} while (numero != 0);
		leia.close();
		media = soma / contadorMult3;
		System.out.println("A m�dia dos numeros multiplos de 3 � de: "+media);
	}
}

