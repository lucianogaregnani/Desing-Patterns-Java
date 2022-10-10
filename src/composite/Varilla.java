package composite;

public class Varilla extends Producto {
	public Varilla(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecio() {
		return this.precio;
	}
}
