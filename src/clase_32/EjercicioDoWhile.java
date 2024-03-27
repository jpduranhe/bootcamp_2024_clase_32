package clase_32;

import java.util.Scanner;

public class EjercicioDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
	 * Desarrollar un bucle do-while en el cual se ingrese un valor límite positivo, 
	 * y a continuación solicite números al usuario hasta que la suma de los números 
	 * introducidos supere el límite inicial.
	 * */
		Scanner leer= new Scanner(System.in);
		int limite=10;
		int numeroIngresadoUsuario;
		
		do {
			
			System.out.print("Para continuar ingrese un numero: ");
			numeroIngresadoUsuario= leer.nextInt();
			System.out.println("Numero Ingresado ->"+numeroIngresadoUsuario);
			numeroIngresadoUsuario++;
			System.out.println("Valor Incrementado ->"+numeroIngresadoUsuario);			
			if(numeroIngresadoUsuario >= limite) {
				System.out.println("Llegaste al limite, fin del programa ");
			}
			
		}while( numeroIngresadoUsuario< limite );
	}

}
