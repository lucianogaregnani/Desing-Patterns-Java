package composite;

public class Tuerca extends Producto {
	public Tuerca(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecio() {
		return this.precio;
	}
}