package Ejercicio_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escritura {
	//Creamos la clase que nos permite escribir
		public void escribePiramide(String ruta,String nom_fichero,String extension) {
			
			Scanner teclado=new Scanner(System.in);
			
			int num_filas;
			
			System.out.print("¿Cuántas filas va a tener la pirámide? > ");
			num_filas=teclado.nextInt();
			
				try {
					FileWriter escritura= new FileWriter(ruta+"/"+nom_fichero+extension);
					
					for(int altura=1;altura<=num_filas;altura++) {
						
						for(int blancos=1;blancos<=num_filas-altura;blancos++) {
							
							escritura.write(" ");
							
						}
						
						for(int asteriscos=1;asteriscos<=(altura*2)-1;asteriscos++) {
							
							escritura.write("*");
							
						}
						escritura.write("\n");
					}
						
					escritura.close();
					
				} catch (IOException e) {
					System.out.println("Error en la ruta o archivo introducido.");
				}
	}
}
