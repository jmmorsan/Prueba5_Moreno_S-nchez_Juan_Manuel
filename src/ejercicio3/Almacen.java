package ejercicio3;

public class Almacen {
	
	private int stock;
	private String nombre;
	private int cantidadDispo;
	private int precio;
	
	public Almacen(int stock, String nombre, int precio) {
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


	public int getCantidadDispo() {
		return cantidadDispo;
	}

	public int getPrecio() {
		return precio;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCantidadDispo(int cantidadDispo) {
		this.cantidadDispo = cantidadDispo;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public boolean stockSeguridad(int cantidad) {
        if (stock - cantidad < 50) {
            return false; // No hay stock suficiente
        }
        cantidad -= stock;
        return true;
    }

	@Override
	public String toString() {
		return "Almacen [stock=" + stock + ", nombre=" + nombre + ", cantidadDispo=" + cantidadDispo + ", precio="
				+ precio + "]";
	}
}
