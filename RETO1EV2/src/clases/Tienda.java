package clases;

import java.util.List;

import ejercicio.Funciones1;

public class Tienda {
	private int codigo;
	private String nombre;
	private Empleado gerente;
	private List<Producto> listaProductos;

	public Tienda() {
		super();
	}

	public Tienda(int codigo, String nombre, Empleado gerente, List<Producto> listaProductos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.gerente = gerente;
		this.listaProductos = listaProductos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empleado getGerente() {
		return gerente;
	}

	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public void venderProducto(List<Producto> listaProductos, int id) {
		for (Producto producto : listaProductos) {
			if (producto.getId() == id) {
				listaProductos.remove(id);

			}

		}
		if (listaProductos.size() < 5) {

			Funciones1.generarProductos(listaProductos);

		}
	}

	public void reponer(List<Producto> listaProductos) {

	}

}
