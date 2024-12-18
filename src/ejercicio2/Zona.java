package ejercicio2;

public class Zona {
	    private String nombre;
	    private int entradasDisponibles;

	    public Zona(String nombre, int entradasDisponibles) {
	        this.nombre = nombre;
	        this.entradasDisponibles = entradasDisponibles;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEntradasDisponibles() {
	        return entradasDisponibles;
	    }

	    public boolean venderEntradas(int cantidad) {
	        if (cantidad > entradasDisponibles) {
	            return false; // No hay suficientes entradas disponibles
	        }
	        entradasDisponibles -= cantidad;
	        return true;
	    }

		@Override
		public String toString() {
			return "Zona [nombre=" + nombre + ", entradasDisponibles=" + entradasDisponibles + "]";
		}

	   
	    }