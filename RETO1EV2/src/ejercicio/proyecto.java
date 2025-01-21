package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import clases.Empleado;
import clases.Producto;
import clases.Tienda;

public class proyecto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Producto> listaProductos = generarProductos();

		Random r = new Random();
		List<Empleado> listaEmpleados = new ArrayList<Empleado>();
		for (int i = 1; i <= 20; i++) {
			Empleado E = new Empleado("nombre " + i, r.nextInt(1, 21));

			listaEmpleados.add(E);

		}
		String nombre = "Nombre";
		int opcion = 0;
		do {
			System.out.println("1.Ver tienda\n2.Comprar\n3.Mostrar compras\n4.Realizar una queja\n5.Salir");

			opcion = util.Funciones.dimeEntero("Introduce una opcion ", sc);
			switch (opcion) {
			case 1:
		
				mostrarlistaTiendas(listaProductos, listaEmpleados, nombre);

				break;
			case 2:
				int codigo;
				mostrarlistaTiendas(listaProductos, listaEmpleados, nombre);
				List<Tienda> listaDeTiendas = listaTiendas(listaProductos, listaEmpleados, nombre);
			
				listaTiendas(listaProductos, listaEmpleados, nombre);
				
				do {
					codigo = util.Funciones.dimeEntero("Introduce un codigo para elegir la tienda", sc);
				} while (verficarCodigo(codigo, listaDeTiendas)==false);
		
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			default:
				break;
			}

		} while (opcion != 0);

	}

	private static void mostrarlistaTiendas(List<Producto> listaProductos, List<Empleado> listaEmpleados, String nombre) {
		for (int i = 1; i <= 5; i++) {
			Empleado empleado = listaEmpleados.get(i);
			Tienda tienda = new Tienda(i, nombre + i, empleado, listaProductos);
			System.out.println(tienda);
		}
	}
	private static List<Tienda>listaTiendas(List<Producto> listaProductos, List<Empleado> listaEmpleados, String nombre) {
		List<Tienda>listaTiendas = new ArrayList<Tienda>();
		for (int i = 1; i <= 5; i++) {
			Empleado empleado = listaEmpleados.get(i);
			Tienda tienda = new Tienda(i, nombre + i, empleado, listaProductos);
			
			listaTiendas.add(tienda);
		}return listaTiendas;
	}
	public static void muestraListaTienda(List<Empleado> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i == 0 ? list.get(i) : ", " + list.get(i));
		}
		System.out.println();
	}

	public static List<Producto> generarProductos() {
		Random r = new Random();
		List<Producto> lista = new ArrayList<Producto>();
		for (int i = 1; i <= 5; i++) {
			double precio = Math.ceil(r.nextDouble(10, 101));
			String nombre = "producto" + i;
			Producto producto = new Producto(i, nombre, precio);
		//	System.out.println(producto);
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
	
	public static boolean verficarCodigo (int codigo, List<Tienda> tienda) {
		for (Tienda tienda2 : tienda) {
			if (tienda2.getCodigo()==codigo) {
				return true;
			}
		}
			return false;
		
	}
}
