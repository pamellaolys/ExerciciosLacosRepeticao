package exerciciosLacosRepeticao;
/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
*/
public class exercicio01LacosRepeticao {

	public static void main(String[] args) {
		
		for(int numero= 1000; numero<2000 ; numero++) {
			
			if(numero % 11 == 5) {
			System.out.println(numero);
			}
		}
	}
}
