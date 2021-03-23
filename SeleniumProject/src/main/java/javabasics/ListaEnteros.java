package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaEnteros {

	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<>();
//		listaNumeros.add(1);
//		listaNumeros.add(2);
//		listaNumeros.add(3);
//		listaNumeros.add(4);
//		listaNumeros.add(5);
		
		for(int i=1;i<=5;i++) {
			listaNumeros.add(i);
		}
		
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros, Collections.reverseOrder());
		System.out.println(listaNumeros);
		
		
		

	}//main

}//class
