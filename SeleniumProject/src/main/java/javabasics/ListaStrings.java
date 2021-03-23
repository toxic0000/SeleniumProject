package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("persona 1");
		listaNombres.add("persona 2");
		listaNombres.add("persona 3");
		listaNombres.add("persona 5");
		listaNombres.add("persona 5");
		
		System.out.println(listaNombres);
		Collections.sort(listaNombres, Collections.reverseOrder());
		System.out.println(listaNombres);
		
		List<String> nombresSinRepetir = listaNombres.stream().distinct().collect(Collectors.toList());
		System.out.println(nombresSinRepetir);
		
		
		
		

	}//main

}//class
