package javabasics;

import javax.swing.JOptionPane;

public class Arreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero[] = new int[5];
		
		rellenarLista(numero);
		mostrarArreglo(numero);
		
	}
	
	public static void rellenarLista(int arreglo[]) {
		
		for(int i=0; i<arreglo.length; i++) {
			String texto = JOptionPane.showInputDialog("ingresa un numero");
			arreglo[i] = Integer.parseInt(texto);
		}
		
	}
	
	public static void mostrarArreglo(int arreglo[]) {
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("el indice [ "+i+" ] esta el valor de [ " + arreglo[i]+" ]");
		}
	}

}
