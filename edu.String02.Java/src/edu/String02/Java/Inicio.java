package edu.String02.Java;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una cadera de Texto:");
		String texto = sc.next();
		
		StringBuilder stringBuilder = new StringBuilder(texto);
		String invertida = stringBuilder.reverse().toString();
		
		System.out.println(invertida);
		
		System.out.println("El Texto es un Palindromo: " + texto.equals(invertida));
		

	}

}
