package exerciciosLacosRepeticao;

import java.util.Scanner;

/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos 
 * indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado:
 *  idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
 *  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 *   Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
 *    calcule e mostre: (WHILE)
o n�mero de pessoas calmas; 
o n�mero de mulheres nervosas; 
o n�mero de homens agressivos; 
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos; 
o n�mero de pessoas calmas com menos de 18 anos.
*/
public class exercicio04LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade=0, sexo=0, humor=0, habitantes=0;
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervososMais40=0, calmosMenor=0;
		
		while( habitantes <= 150) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite seu sexo: Sendo [1]Masculino, [2]Feminino, [3]Outros");
			sexo = ler.nextInt();
			
			System.out.println("Digite seu humor: Sendo [1]Calmo(a), [2]Nervoso(a), [3]Agressivo(a)");
			humor = ler.nextInt();
			
			if(humor == 1) {
				pessoasCalmas++;
			}
			if(sexo==2 && humor==2) {
				mulheresNervosas++;
			}
			if(sexo==1 && humor==3) {
				homensAgressivos++;
			}
			if(sexo==3 && humor==1) {
				outrosCalmos++;
			}
			if(idade>=40 && humor==2) {
				nervososMais40++;
			}
			if(idade<=18 && humor==1) {
				calmosMenor++;
			}
			habitantes++;
		}
		System.out.println("\nO n�mero de pessoas calmas ser� de: "+pessoasCalmas);
		System.out.println("\nO n�mero de mulheres nervosas ser� de: "+mulheresNervosas);
		System.out.println("\nO n�mero de homens agressivos ser� de: "+homensAgressivos);
		System.out.println("\nO n�mero de outros calmos ser� de: "+outrosCalmos);
		System.out.println("\nO de pessoas nervosas com mais de 40 anos ser� de: "+nervososMais40);
		System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos ser� de: "+calmosMenor);
		}
}