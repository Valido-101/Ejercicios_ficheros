package Ejercicio_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		String ruta,nom_fichero,extension;
		
		System.out.println("Introduzca la ubicación del archivo:");
		ruta=teclado.nextLine();
		System.out.println("Introduzca el nombre del archivo:");
		nom_fichero=teclado.nextLine();
		System.out.println("Elija la extensión que desee que tenga el archivo (incluyendo el .):");
		extension=teclado.nextLine();
		
		Escritura escritor=new Escritura();
		
		escritor.escribePiramide(ruta, nom_fichero, extension);
		
		System.out.println("Tarea completada.");
		teclado.close();
	}

}
