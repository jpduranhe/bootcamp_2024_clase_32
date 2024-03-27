package clase_32;

import java.util.Scanner;

public class EjercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Desarrollar un bucle while que lea números ingresados por el usuario,
		//hasta que se ingrese 0 (cero).
		
		
		Scanner leer= new Scanner(System.in);
		
		
		int numeroIngresadoUsuario=1;
		
		while(numeroIngresadoUsuario != 0) {
			
			System.out.print("Para continuar ingrese un numero != 0: ");
			//numeroIngresadoUsuario=leer.nextInt();
			//numeroIngresadoUsuario--;
			
			System.out.println("Numero Ingresado ->"+numeroIngresadoUsuario);
			if(numeroIngresadoUsuario==0) {
				System.out.print("El programa va a terminar ");
			}
			
		}
		
	}

}
