package singleton;

import java.util.ArrayList;

class Producto {
	int codigo;
	String nombre;
	String marca;
	int precio;
	int stock;
	ArrayList<String> proveedores;
	
	public Producto(String nombre,String marca, int precio, int stock) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
	}
	
	public String toString() {
		return this.codigo+","+this.nombre + "," + this.marca + "," +this.precio + "," + this.stock;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setStock(int cantidad) {
		this.stock = cantidad;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void agregarProveedor(String proveedor) {
		proveedores.add(proveedor);
	}
	
	public String getMarca() {
		return marca;
	}

}
