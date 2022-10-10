package composite;

public class Tornillo extends Producto {
	public Tornillo(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public double calcularPrecio() {
		return this.precio;
	}
}
