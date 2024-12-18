package ejercicio3;

public class Almacen {
    private int stock;
    private String nombre;
    private double precio; // Cambiado a double para mayor precisión en precios

    public Almacen(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean verificarStockSeguridad() {
        return stock >= 50;
    }

    @Override
    public String toString() {
        return String.format("Producto: %s | Stock: %d | Precio: %.2f", nombre, stock, precio);
    }
}