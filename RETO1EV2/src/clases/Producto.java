package clases;

import util.Funciones;

import java.util.List;


public class Producto {
private int id;
private String nombre;
private double precio;


public Producto() {
	super();
}
public Producto(int id, String nombre, double precio) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.precio = precio;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public void addProducto ( Producto id,List<Producto>lista) {
	lista.add(id);
	
}
@Override
public String toString() {
	return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
}

//
}


