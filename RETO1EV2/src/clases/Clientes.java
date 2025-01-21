package clases;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Clientes {

	private String nombre;
	private HashMap<Tienda, List<Producto>> listaCompras;

	public Clientes(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashMap<Tienda, List<Producto>> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(HashMap<Tienda, List<Producto>> listaCompras) {
		this.listaCompras = listaCompras;
	}

//METODOS

	public void comprarProducto(Tienda t1, List<Producto> listaProducto1, int id) {
		if (listaCompras.containsKey(t1)) {

			for (Entry<Tienda, List<Producto>> entry : listaCompras.entrySet()) {
				Tienda key = entry.getKey();
				List<Producto> val = entry.getValue();
				if (key.equals(t1)) {
					// t1.venderProducto(listaProducto1, IDE);

				}
			}
		}else
		listaCompras.put(t1, listaProducto1);
	}

	public double gastoTotal(List<Producto> listaCompras) {
		double gastoTotal = 0;
		// listaCompras.get
		for (Producto producto : listaCompras) {

			gastoTotal += producto.getPrecio();

		}
		return gastoTotal;
	}

}
