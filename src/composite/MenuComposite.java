package composite;

public class MenuComposite {

	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		fabrica.setProductos(
				new ProductoCompuesto(
						new Ruleman("Ruleman", 2.0),
						new Tornillo("Tornillo", 3.0)
				),
				new ProductoCompuesto(
						new Varilla("Varilla", 3.0),
						new Tuerca("Tuerca", 2.0)
				)
		);
		System.out.println(fabrica.getPrecio());
	}
	
	

}
