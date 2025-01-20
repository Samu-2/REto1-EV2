package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Empleado;
import clases.Producto;
import clases.Tienda;

public class Funciones1 {

	public static void main(String[] args) {

		List<Producto> listaProductos = generarProductos();

		Random r = new Random();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		for (int i = 1; i <= 20; i++) {
			Empleado E = new Empleado("nombre " + i, r.nextInt(1, 21));

			listaEmpleados.add(E);

		}
		String nombre = "Nombre";
		for (int i = 1; i <= 5; i++) {
			Empleado empleado = listaEmpleados.get(i);
			Tienda tienda = new Tienda(i, nombre + i, empleado, listaProductos);
			System.out.println(tienda);
		}

	}

	public static List<Producto> generarProductos() {
		Random r = new Random();
		List<Producto> lista = new ArrayList<Producto>();
		for (int i = 1; i <= 5; i++) {
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
		return lista;
	}

	public static void generarProductos2(List<Producto> lista) {
		Random r = new Random();

		for (int i = 1; i <= 5; i++) {
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



}
