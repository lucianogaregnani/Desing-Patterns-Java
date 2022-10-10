package composite;

class Fabrica {
	Caja productos;
	
	public Fabrica() {
		
	}
	
	public void setProductos(Caja... cajas) {
		this.productos = new ProductoCompuesto(cajas);
	}
	
	public double getPrecio() {
		return productos.calcularPrecio();
	}
}
