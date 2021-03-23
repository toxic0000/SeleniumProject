package javabasics;

import java.util.Scanner;

public class CompararCadenas {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("dame la palabra");
		String palabra1 = leer.next();
		
		System.out.println("dame la otra palabra");
		String palabra2 = leer.next();
		
		if(palabra1.equals(palabra2)) {
			System.out.println("son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
		leer.close();
		
		String texto = "esto es una  cadena de texto 456543";
		String textoSinEspacio = texto.replace(" ", "");
		System.out.println(textoSinEspacio);
		System.out.println("el texto tiene "+texto.length()+" caracteres");
		
	}

}
