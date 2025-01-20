package clases;

public class Empleado {
private String nombre;
private int antiguedad;
private double sueldo;



@Override
public String toString() {
	return  nombre + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo;
}
public Empleado() {
	super();
}
public Empleado(String nombre, int antiguedad) {
	super();
	this.nombre = nombre;
	this.antiguedad = antiguedad;
	calcularSueldo();

	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAntiguedad() {
	return antiguedad;
}
public void setAntiguedad(int antiguedad) {
	this.antiguedad = antiguedad;
	calcularSueldo();
}
public double getSueldo() {
	return sueldo;
}
public void setSueldo(double sueldo) {
	this.sueldo = sueldo;
}
public void calcularSueldo() {
	
	if(antiguedad<5) {
		sueldo=1000;
	}
	if(antiguedad>6&&antiguedad<10) {
		sueldo=1200;
	}
	if(antiguedad>=10) {
		sueldo=1500;
	}
}

}
