package clases;

import java.util.HashMap;
import java.util.List;

public class Clientes {

private String nombre;
private HashMap<Tienda, List<Producto> > listaCompras;


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


}
