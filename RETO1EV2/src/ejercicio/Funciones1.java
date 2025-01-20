package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import clases.Producto;

public class Funciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void generarProductos(List<Producto> listaProductos) {
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
	}

}
