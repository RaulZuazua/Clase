package Actividad19_1;

import java.util.Arrays;

public class Alumno{ 
	
private final static int CURSOS = 5; // nº de cursos de la carrera 
private String nombre; // nombre del alumno 
private int id; // identificador del alumno 
private int anio_nacimiento; // año de nacimiento del alumno 
private double notas[]; // notas medias de cada uno de los 5 años 
private static int total_alumnos = 0; // número total de alumno




public Alumno(String nombre, int anio_nacimiento){
	
	this.nombre=nombre;
	this.anio_nacimiento=anio_nacimiento;
		
}


public void mostrar (){
	
	System.out.println("El nombre del alumno es " + this.nombre);
	System.out.println("Su ID es " + this.id );
	
	for(int i=0;i<CURSOS;i++){
		
		System.out.println("La nota del curso " + (i+1) + "es " + notas[i]);
		
	}
	
}
public void PonerNota (double n , int curso){
	
	
	if(curso<0 || curso>4){
		
		System.out.println("Curso no valido");
		
	}
	
	else
		notas [curso]=n;
	
	
}

 
public double devolverNota (int curso){
	
	if(curso<0 || curso>4){
		
		System.out.println("Curso no valido");
		return -1;
		}
	
		else
		
		return notas [curso];

	
}

public boolean equals (Object o){
	
	boolean igual=false;
	Alumno a=(Alumno) o;
	if(nombre.equalsIgnoreCase(a.nombre));
	if (id==a.id)
		igual=true;
	return igual;
	
	
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public int getAnio_nacimiento() {
	return anio_nacimiento;
}


public void setAnio_nacimiento(int anio_nacimiento) {
	this.anio_nacimiento = anio_nacimiento;
}


public double[] getNotas() {
	return notas;
}


public void setNotas(double[] notas) {
	this.notas = notas;
}


public static int getTotal_alumnos() {
	return total_alumnos;
}


public static void setTotal_alumnos(int total_alumnos) {
	Alumno.total_alumnos = total_alumnos;
}


public static int getCursos() {
	return CURSOS;
}



public String toString() {
	return "El Alumno con nombre " + nombre + " , tiene un ID " + id + " , SU FECHA DE NACIMINETO ES " + anio_nacimiento + " , Y SU NOTA ES DE "
			+ Arrays.toString(notas);
}



	
	
}
















