package Ejercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Teclado para introducir el nombre del fichero
		Scanner teclado=new Scanner(System.in);
		
		Escritura escritura=new Escritura();
		
		//Variable que guarda el nombre del fichero introducido por el usuario
		String nom_fichero;
		
		//Variable que irá escribiendo en un fichero siempre que sea par
		int x;
		
		//Pregunta al usuario el nombre que le quiere dar al archivo
		System.out.println("Introduzca el nombre del fichero donde desee guardar los números: ");
		nom_fichero=teclado.nextLine();
		
		for(x=141;x<=730;x++) {
		
			if(x%2==0) {
				
				escritura.escribe(x, nom_fichero);
				
			}
		
		}
		
		teclado.close();
	}

}
