package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Almacen> inventario = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\nMenú de Almacén:");
            System.out.println("1. Introducir datos nuevo inventario.");
            System.out.println("2. Nuevo producto.");
            System.out.println("3. Buscar producto y modificar información.");
            System.out.println("4. Eliminar producto.");
            System.out.println("5. Mostrar valor total del inventario.");
            System.out.println("6. Informe rotura de stock.");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    inicializarInventario();
                    break;
                case 2:
                    agregarProducto();
                    break;
                case 3:
                    buscarYModificarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    mostrarValorTotalInventario();
                    break;
                case 6:
                    informeRoturaStock();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);

        sc.close();
    }

    // 1. Inicializar Inventario
    private static void inicializarInventario() {
        inventario.clear();
        inventario.add(new Almacen(100, "Camiseta", 12.00));
        inventario.add(new Almacen(70, "Sudadera", 20.00));
        inventario.add(new Almacen(38, "Pantalones", 35.00));
        inventario.add(new Almacen(40, "Chaqueta", 70.00));
        inventario.add(new Almacen(57, "Camisa", 50.00));
        System.out.println("Inventario inicializado con productos de prueba.");
    }

    // 2. Agregar Producto
    private static void agregarProducto() {
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Stock inicial: ");
        int stock = Integer.parseInt(sc.nextLine());

        System.out.print("Precio del producto: ");
        double precio = Double.parseDouble(sc.nextLine());

        inventario.add(new Almacen(stock, nombre, precio));
        System.out.println("Producto añadido al inventario.");
    }

    // 3. Buscar y Modificar Producto
    private static void buscarYModificarProducto() {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = sc.nextLine();

        for (Almacen producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Nuevo stock: ");
                producto.setStock(Integer.parseInt(sc.nextLine()));

                System.out.print("Nuevo precio: ");
                producto.setPrecio(Double.parseDouble(sc.nextLine()));

                System.out.println("Producto actualizado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // 4. Eliminar Producto
    private static void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();

        for (Almacen producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                inventario.remove(producto);
                System.out.println("Producto eliminado del inventario.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // 5. Mostrar Valor Total del Inventario
    private static void mostrarValorTotalInventario() {
        double valorTotal = 0;

        for (Almacen producto : inventario) {
            valorTotal += producto.getStock() * producto.getPrecio();
        }

        System.out.printf("Valor total del inventario: %.2f%n", valorTotal);
    }

    // 6. Informe Rotura de Stock
    private static void informeRoturaStock() {
        System.out.println("Productos con stock bajo (menos de 50):");
        for (Almacen producto : inventario) {
            if (!producto.verificarStockSeguridad()) {
                System.out.println(producto);
            }
        }
    }
}