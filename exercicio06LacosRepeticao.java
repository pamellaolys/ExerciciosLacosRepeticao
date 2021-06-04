package exerciciosLacosRepeticao;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)*/
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
		System.out.println("A média dos numeros multiplos de 3 é de: "+media);
	}
}

