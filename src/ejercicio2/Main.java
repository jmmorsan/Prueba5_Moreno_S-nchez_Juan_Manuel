package ejercicio2;
import java.util.Scanner;

public class Main {
	    private static Zona zonaPrincipal = new Zona("Principal", 1000);
	    private static Zona zonaPlatea = new Zona("Platea", 200);
	    private static Zona zonaVip = new Zona("VIP", 25);

	    private static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        int opcion;

	        do {
	            System.out.println("\nConcertSala - Gestión de Entradas");
	            System.out.println("1. Mostrar número de entradas libres");
	            System.out.println("2. Vender entradas");
	            System.out.println("3. Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = Integer.parseInt(sc.nextLine());

	            switch (opcion) {
	                case 1:
	                    mostrarEntradasLibres();
	                    break;
	                case 2:
	                    venderEntradas();
	                    break;
	                case 3:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } while (opcion != 3);
	    }

	    private static void mostrarEntradasLibres() {
	        System.out.println("\nEstado de las zonas:");
	        System.out.println(zonaPrincipal);
	        System.out.println(zonaPlatea);
	        System.out.println(zonaVip);
	    }

	    private static void venderEntradas() {
	        System.out.println("\nZonas disponibles:");
	        System.out.println("1. Principal");
	        System.out.println("2. Platea");
	        System.out.println("3. VIP");
	        System.out.print("Seleccione una zona: ");
	        int zonaElegida = Integer.parseInt(sc.nextLine());

	        Zona zonaSeleccionada;

	        switch (zonaElegida) {
	            case 1:
	                zonaSeleccionada = zonaPrincipal;
	                break;
	            case 2:
	                zonaSeleccionada = zonaPlatea;
	                break;
	            case 3:
	                zonaSeleccionada = zonaVip;
	                break;
	            default:
	                System.out.println("Zona no válida.");
	                return;
	        }

	        System.out.print("¿Cuántas entradas desea? ");
	        int cantidad = Integer.parseInt(sc.nextLine());

	        if (zonaSeleccionada.venderEntradas(cantidad)) {
	            System.out.println("Entradas vendidas correctamente.");
	        } else {
	            System.out.println("No hay suficientes entradas disponibles en la zona seleccionada.");
	        }
	    }
	}