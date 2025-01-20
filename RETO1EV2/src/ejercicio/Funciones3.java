package ejercicio;

import java.util.Random;
import java.util.Scanner;

import clases.Empleado;

public class Funciones3 {

	public static void main(String[] args) {
		generarEmpleados();

	}
	public static void generarEmpleados() {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		for (int i = 1; i <= 20; i++) {
			Empleado E=new Empleado("nombre "+i, r.nextInt(1,21));
			System.out.println(E);
		}
		
	}

}
