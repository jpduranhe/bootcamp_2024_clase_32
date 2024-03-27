package clase_32;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un bucle for en el cual se muestre por pantalla la tabla del 5. 
		 * Se debe mostrar hasta 5x20.

		 * 
		 * */
		Scanner leer= new Scanner(System.in);
		System.out.print("Para continuar ingrese un numero: ");
		int numero=leer.nextInt();
		for( int i=0; i<=20;i++ ) {
			int resultado=numero*i;
			System.out.println(numero+"X"+i+"="+resultado);
			
		}
	}

}
