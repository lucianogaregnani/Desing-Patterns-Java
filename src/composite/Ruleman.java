package composite;

public class Ruleman extends Producto {
	public Ruleman(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecio() {
		return this.precio;
	}
}
