package javabasics;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("dame el numeor de dia");
		String mes = leer.next();
		
		switch(mes) {
		case "1":
			System.out.println("lunes");
			break;
		case "2":
			System.out.println("martes");
			break;
		case "3":
			System.out.println("miercoles");
			break;
		case "4":
			System.out.println("jueves");
			break;
		case "5":
			System.out.println("viernes");
			break;
		case "6":
			System.out.println("sabado");
			break;
		case "7":
			System.out.println("domingo");
			break;
			
		default:
			System.out.println("ese dia no exixste");
		}
		
		leer.close();

	}

}
