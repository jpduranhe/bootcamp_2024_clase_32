package clase_32;

import java.util.Scanner;

public class EjercicioArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * 
	 * Declarar y recorrer un arreglo que almacene el nombre de 5 países ingresados por el usuario. 
	 * Mostrar el contenido del arreglo por pantalla.

	 * 
	 * */
		
		String paisIngresado="";
		
		String[] paises= new String[5];
		
		
		
		Scanner leer= new Scanner(System.in);
		// obtener Paises
		
		for(int i=0; i< paises.length;i++) {
			
			System.out.print("Para continuar ingrese un Nombre de Pais: ");
			paises[i]=leer.next();
		}
		
		
		
		// Imprimir Paises en consola
		
		System.out.println("Los Pais Ingresado son (For Normal): ");
		for(int i=0; i< paises.length;i++)  {
			System.out.println(paises[i]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Los Pais Ingresado son (For Each): ");
		for(String pais : paises ) {
			System.out.println(pais);
		}
		
		
		
		
		
		
	}

}
