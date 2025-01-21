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

public void comprarProducto(List<Producto> listaCompras, int IDE ) {
	
}

public double gastoTotal(List<Producto> listaCompras) {
double gastoTotal=0;
	//listaCompras.get
	for (Producto producto : listaCompras) {
		
		
		gastoTotal +=producto.getPrecio();
		
	}
	return gastoTotal;
}
 

}
