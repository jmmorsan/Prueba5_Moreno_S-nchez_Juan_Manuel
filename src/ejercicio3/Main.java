package ejercicio3;
import java.util.Scanner;

public class Main {
		private static Almacen Producto1 = new Almacen(1000, "Papel",10);
		private static Scanner sc= new Scanner(System.in);	
		
		public static void main(String[]args) {
			
		
		
		int opcion;
			
		do {
			System.out.println("Menu de almacen, elija que opcion desea hacer:");
			System.out.println("1. Introducir datos nuevo inventario.");
			System.out.println("2. Nuevo producto.");
			System.out.println("3. Buscar producto y modificar información.");
			System.out.println("4. Eliminar producto.");
			System.out.println("5. Mostrar valor total del inventario.");
			System.out.println("6. Informe rotura de stock.");
			System.out.println("7.Salir");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
			
			case 1:
				
				break;
			case 2:

				break;
			case 3:
				break;
			case 4:

				break;
			case 5:
				break;
			case 6:

				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
                System.out.println("Opción no válida.");
			}
		
		}while(opcion != 7);	
}
}