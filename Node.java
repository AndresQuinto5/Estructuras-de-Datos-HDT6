// UVG Algoritmos y estructuras de datos
// Node.java
// Autores: Luis Quezada 18028 & Andrea Paniagua 18733
// Fecha: 8 de marzo 2019

/**
* <h1>Node </h1>
* Node for the SingleList and CircularList
* <p>
* @author  Luis Quezada
* @version 1.0
* @since   2019-02-15
*/

public class Node<E> {

	protected E data; // value stored in this element
	protected Node<E> nextElement; // ref to next
	
	/**
	*
	* pre: v is a value, next is a reference to remainder of list
	* post: an element is constructed as the new head of list
	* @param v Next reference to remainder of list
	* @param next The next node
	*/
	public Node(E v, Node<E> next) {
	
		data = v;
		nextElement = next;
	}
	
	/**
	* Constructor
	* @param v Element initial
	*/
	public Node(E v) {
		// post: constructs a new tail of a list with value v
		
		this(v,null);
	}
	
	/**
	* post: returns reference to next value in list
	* @return Node The next node
	*/
	public Node<E> next() {
		
		return nextElement;
	}
	
	/**
	* post: sets reference to new next value
	* @param next The next node to be set to next element
	*/
	public void setNext(Node<E> next) {
		
		nextElement = next;
	}
	
	/**
	* post: returns value associated with this element
	* @return E Data
	*/
	public E value() {
		return data;
	}
	
	/**
	* post: sets value associated with this element
	* @param value Data
	*/
	public void setValue(E value) {
	
		data = value;
	} 
}
