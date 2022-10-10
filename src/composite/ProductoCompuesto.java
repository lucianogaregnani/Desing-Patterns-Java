package composite;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductoCompuesto implements Caja {
	private ArrayList<Caja> hijos = new ArrayList<Caja>();
	public ProductoCompuesto(Caja... cajas) {
		hijos.addAll(Arrays.asList(cajas));
	}
	
	public double calcularPrecio() {
		double suma=0;
		for(int i=0; i < hijos.size();i++) {
			suma += hijos.get(i).calcularPrecio();
		}
		return suma;
	}
}
