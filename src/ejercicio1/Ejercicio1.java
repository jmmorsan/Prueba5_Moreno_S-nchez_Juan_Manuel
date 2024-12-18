package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[]args) {
		var scanner = new Scanner(System.in);
		System.out.println("Escribe una frase");
		String frase = scanner.nextLine();
		
		int largoFrase = frase.length();
		int contadorEspacios = 0;
		int contadorPalabras = 0;
		int contadorFinal = 0;

		for(int i = 0; largoFrase > i; i++) {
			char a = frase.charAt(i);
			contadorPalabras++;
			
			if(Character.isSpaceChar(a) ) {
				contadorEspacios++;
				for(int u = i; u < 0; u--) {
					
				}
				
			}
			
		}
		
		contadorFinal = contadorPalabras - contadorEspacios;
		
		System.out.println("Hay " + contadorFinal + " palabras en total");
		
		scanner.close();
	}

}
