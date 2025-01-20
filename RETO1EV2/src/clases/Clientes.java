package clases;

import java.util.HashMap;
import java.util.List;

public class Clientes {

private String nombre;
private HashMap<Tienda, List<Producto> > listaCompras;



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

public void comprarProducto(Tienda tienda, int id ) {
	System.out.println(tienda.getListaProductos());
	/*
	for (Map.Entry<keyType, valType> entry : map.entrySet()) {
		keyType key = entry.getKey();
		valType val = entry.getValue();
		
	}
	for (Producto producto :tienda.getListaProductos() ) {
		if (producto.getId()==id) {
			listaCompras.put(tienda,producto);
			
		}
	}
}

public double gastoTotal(List<Producto> listaCompras) {
	int gastoTotal;
	//listaCompras.get
	for (Producto producto : listaCompras) {
		
		
		//gastoTotal +=precio;
		
	}
}
 */

}
}
