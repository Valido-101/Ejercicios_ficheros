package Ejercicio_1;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {

	//Creamos la clase que nos permite escribir
	public void escribe(int x,String nom_fichero) {
			try {
				FileWriter escritura= new FileWriter("C:/Users/Jesus/Desktop/Eclipse/Ejercicios_ficheros/src/Ejercicio_1/"+nom_fichero+".txt",true);
				
					escritura.write(""+x+" ");
					
					escritura.close();
					
				
			} catch (IOException e) {
				System.out.println("Error en la ruta o archivo introducido.");
			}
}
}