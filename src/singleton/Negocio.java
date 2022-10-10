package singleton;

import java.util.ArrayList;

class Negocio {
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private static Negocio instance;
	private int cantCodigos = 0;
	
	private Negocio() {
		
	}
	
	public static Negocio getInstance() {
		if(instance == null) {
			instance = new Negocio();
		}
		return instance;
	}
	
	public void agregarProducto(Producto producto) {
			producto.setCodigo(cantCodigos);
			productos.add(producto);
			cantCodigos++;
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(productos.indexOf(producto));
	}
	
	public void modificarProducto(Producto producto, int precio, int stock) {
		if(productos.contains(producto)) {
			producto.setPrecio(precio);
			producto.setStock(stock);
		}
		else {
			System.out.println("No existe ese producto.");
		}
	}
	
	public void getProductos() {
		for(int i=0; i < productos.size();i++) {
			System.out.println(productos.get(i).toString());
		}
	}
	
}
