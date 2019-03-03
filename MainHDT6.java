// UVG Algoritmos y estructuras de datos
// MainHDT6.java
// Autores: Luis Quezada 18028 & Andrea Paniagua 18733
// Fecha: 8 de marzo 2019

import java.util.*;
import java.io.*;

/**
* <h1>Main Program HDT6</h1>
* Operaciones con mapas
* Permite elegir con diferentes mapas
* <p>
* @author  Luis Quezada 18028 & Andrea Paniagua 18733
* @version 1.0
* @since   2019-03-08
*/

public class MainHDT6 {

	public static void main(String args[]) {
		
		// Variables
		MapFactory<K,V> mapFactory = new MapFactory<>(); // falta ver que es K y que es V
		
		// Name of the file to be opened
		String FILENAME = "cards_desc.txt";
		
		// Readers
		BufferedReader br = null;
		FileReader fr = null;
		String stringOutput ="";
		
		// Para elegir el tipo de map a usar
		Scanner scan = new Scanner(System.in);
		int typeOfMap = 0;
	
		String menu = "\n\n\tMenu Mapas: \n 1. MashMap \n 2. TreeMap \n 3. LinkedHashMap";
		
		System.out.println(menu);
	
		System.out.println("\n>>> Ingrese el numero de opcion del tipo de MAP que desea usar: ");
	
		try { // defense type of stack
			typeOfMap = scan.nextInt();
			scan.nextLine();

		} catch (InputMismatchException e) {

			scan.nextLine();
			System.out.println("<!> No ingreso un numero...");	
		}

		// defense for number of option
		while (typeOfMap < 1 || typeOfMap > 3) {

			System.out.println("<!> No ingreso una opcion valida...");
			System.out.println(">>> Ingrese el numero de opcion del tipo de MAP que desea usar: ");

			try {
				typeOfMap = scan.nextInt();
				scan.nextLine();

			} catch (InputMismatchException e) {

				scan.nextLine();
				System.out.println("<!> No ingreso un numero...");	
			}
		}
		
		// Map creation
		Map<K,V> map;
		
		map = mapFactory.getMap(typeOfMap);

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
		
			System.out.println("\n\n>>> Abriendo el archivo: "+ FILENAME +"\n________________________________________________________________\n");

			while ((stringOutput = br.readLine()) != null) {
		
				// System.out.println(stringOutput); // too see the first string output without splitting
				
// aqui va el proceso de hasing
// preguntar como guardarlo fuera del try !
			}
		

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
		
		
// aqui va el menu con las 7 opciones del usuario, hacer un while para el menu
	}
}
