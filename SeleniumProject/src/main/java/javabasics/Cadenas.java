package javabasics;

public class Cadenas {
	
	public static void main(String[] args) {
		
		String cadena = "hola curso selenium";
		
		String subcadena = cadena.substring(0, 4); //regresa el string q este entre el rango escogido
		
		System.out.println(subcadena);
		
		if(cadena.equals("hola curso Selenium")) {	//ver si las cadenas son iguales, toma en cuenta mayusculas y minusculas
			System.out.println("las cadenas son iguales");
		}else {
			System.out.println("las cadenas son diferentes");
		}
		
		if(cadena.contains("selenium")) {	//ve si la cadena contiene la palabra en el metodo
			System.out.println("lo contiene");
		}else {
			System.out.println("no lo contiene");
		}
		
		if(cadena.equalsIgnoreCase("hola curso Selenium")) {	//ver si las cadenas son iguales, ignora mayusculas y minusculas
			System.out.println("las cadenas son iguales");
		}else {
			System.out.println("las cadenas son diferentes");
		}
		
	}

}
