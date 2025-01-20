package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ejercicio.Funciones1;

public class Tienda {
	private int codigo;
	private String nombre;
	private Empleado gerente;
	private List<Producto> listaProductos;

	public Tienda() {
		super();
	}

	public Tienda(int codigo, String nombre, Empleado gerente,List<Producto>listaProductos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.gerente = gerente;
		this.listaProductos=listaProductos;
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

			Funciones1.generarProductos2(listaProductos);

		}
	}

	public void reponer(List<Producto> listaProductos, int numProductos) {
		Random r = new Random();
		List<Producto> lista = new ArrayList<Producto>();
		for (int i = 1; i <= numProductos; i++) {
			double precio = Math.ceil(r.nextDouble(10, 101));
			String nombre = "producto" + i;
			Producto producto = new Producto(i, nombre, precio);
			System.out.println(producto);
			lista.add(producto);

		}
		double valor = 0;
		for (Producto producto : lista) {
			valor += (producto.getPrecio());

		}
	}

	@Override
	public String toString() {
		return "Tienda [codigo=" + codigo + ", nombre=" + nombre + ", gerente=" + gerente + ", listaProductos="
				+ listaProductos + "]";
	}

}
