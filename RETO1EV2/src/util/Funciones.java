package util;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import clases.Empleado;
import clases.Producto;
import clases.Tienda;

public class Funciones {
	//indica si el String que recibe como parametro es entero
	public static boolean esInt(String s)
	{
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//indica si el String que recibe como parametro es decimal
	public static boolean esDouble(String s)
	{
		try {
			Double.parseDouble(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	//pide algo por consola hasta que sea un numero entero, el mensaje que pide ese algo se pasa
	//por parametro para poder personalizarlo
	public static int dimeEntero(String orden, Scanner sc)
	{
		do
		{
		try {
			System.out.println(orden);
			String s = sc.nextLine();
			int n= Integer.parseInt(s);
			return n;

		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		}while(true);
	}
	
	//pide algo por consola hasta que sea un numero decimal, el mensaje que pide ese algo se pasa
	//por parametro para poder personalizarlo
	public static double dimeDouble(String orden, Scanner sc)
	{
		do
		{
		try {
			System.out.println(orden);
			String s = sc.nextLine();
			double d= Double.parseDouble(s);
			return d;

		} catch (Exception e) {
			System.out.println("Formato incorrecto");
		}
		}while(true);
	}
	
	//pide algo por consola hasta que sea una fecha, y devuelve
	//un objeto de tipo LocalDate
	public static LocalDate dimeFecha(String texto, Scanner sc) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		do {
			try {
				System.out.println(texto);
				String textoFecha = sc.nextLine();
				LocalDate fecha = LocalDate.parse(textoFecha,formato);
				return fecha;
				
			} catch (Exception e) {
				System.out.println("Fecha no valida");
			}
			
		} while (true);
	}
	
	public static void muestraArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}
	public static void muestraArrayS(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(i == 0 ? array[i] : ", " + array[i]);
		}
		System.out.println();
	}
	
	public static void muestraListaInt(List<Integer> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}

	public static void muestraListaString(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(i == 0 ? lista.get(i) : ", " + lista.get(i));
		}
		System.out.println();
	}
	public static void muestraListaTienda(List<Empleado> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i == 0 ? list.get(i) : ", " + list.get(i));
		}
		System.out.println();
	}
	
	public static double redondear2deci(double num) {
		return Math.round(num*100)/100;
	}

	public static void muestraListaTienda1(List<Tienda> listaTiendas) {
		for (int i = 0; i < listaTiendas.size(); i++) {
			System.out.print(i == 0 ? listaTiendas.get(i) : ", " + listaTiendas.get(i));
		}
		System.out.println();
		
	}
	public static void muestraListaProducto(List<Producto> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i == 0 ? list.get(i) : ", " + list.get(i));
		}
		System.out.println();
	}

	public static void muestraListaEmpleado(List<Empleado> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(i == 0 ? list.get(i) : ", " + list.get(i));
		}
		System.out.println();
	}
		
	}