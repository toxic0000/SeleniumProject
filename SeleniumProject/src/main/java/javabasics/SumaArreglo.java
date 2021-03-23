package javabasics;

public class SumaArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int[5];
		int suma = 0;
		
		for (int i=0; i<numeros.length; i++) {
			numeros[i] = i+1;
			suma+=numeros[i];	//suma = suma + numeros[i]
			
			System.out.println(suma);
			
			
		}

	}

}
