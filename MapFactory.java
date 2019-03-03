// UVG Algoritmos y estructuras de datos
// MapFactory.java
// Autores: Luis Quezada 18028 & Andrea Paniagua 18733
// Fecha: 8 de marzo 2019

/**
* <h1>Map Factory</h1>
* Implements the Factory design pattern.
* <p>
* @author  Luis Quezada 18028 & Andrea Paniagua 18733
* @version 1.0
* @since   2019-03-08
*/

import java.util.*;

class MapFactory<K,V> {
	
	//selecciona la implementacion a utilizar para un map
	// Pueden ser: HashMap, TreeMap y LinkedHashMap
	
	/**
	*
	* pre: receives a number to indicate the type of map to use
	* post: returns the selected map
	* @param type Type of map to use
	* @return Map<E> Selected map
	*/
	
	static int HASHMAP = 1;
	static int TREEMAP = 2;
	static int LINKED = 3;
	
	public MapFactory() {}
   
	public Map<K,V> getMap(int type) {
    // seleccion de la implementacion a utilizar:
    
		if (type == HASHMAP) {
			return new HashMap<K,V>(); //regresa HashMap
		
		} if (type == TREEMAP) {
			return new TreeMap<K,V>(); //regresa TreeMap
		
		} else {
		
			return new LinkedHashMap<K,V>(); // regresa LinkedHashMap
		}
	}
}
