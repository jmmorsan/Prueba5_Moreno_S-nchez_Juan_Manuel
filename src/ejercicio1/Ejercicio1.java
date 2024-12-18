package ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = sc.nextLine().trim();
        
        if (frase.isEmpty()) {
            System.out.println("La frase está vacía.");
            sc.close();
            return;
        }
        
        String[] palabras = frase.split("\\s+");
        
        int totalPalabras = palabras.length;
        String palabraMayor = "", palabraMenor = palabras[0];
        
        for (String palabra : palabras) {
            if (palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
            if (palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
            
        }
        
        System.out.println("Número total de palabras: " + totalPalabras);
        System.out.println("Palabra de mayor longitud: '" + palabraMayor + "' (" + palabraMayor.length() + " caracteres)");
        System.out.println("Palabra de menor longitud: '" + palabraMenor + "' (" + palabraMenor.length() + " caracteres)");
        
        sc.close();
    }
}