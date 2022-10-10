package singleton;

import java.util.ArrayList;

public class MenuSingleton {

	static ArrayList<String>strings = new ArrayList<String>();
	public static void main(String[] args) {
		Producto producto1 = new Producto("Coca", "CocaCola", 200,3);
		Producto producto2 = new Producto("Coca", "Pepsi", 253,4);
		Producto producto3 = new Producto("Coca", "Manaos", 150,23);
		Producto producto4 = new Producto("Coca", "SuperCola", 100,65);
		Negocio negocio = Negocio.getInstance();
		negocio.agregarProducto(producto1);
		negocio.agregarProducto(producto2);
		negocio.agregarProducto(producto3);
		negocio.agregarProducto(producto4);
		negocio.getProductos();
		negocio.modificarProducto(producto1, 220, 1);
		negocio.modificarProducto(producto2, 270, 2);
		negocio.modificarProducto(producto3, 160, 27);
		negocio.getProductos();
	}

	
	
}
