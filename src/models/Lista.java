package models;

public class Lista<T> {

	//ATRIBUTOS
	private T[] elementos;
	private int index;
	
	public Lista(){
		this.index = 0;
		this.elementos = (T[]) new Object[0];
	}
	
	/**
	 * Añade un elemento a la cola
	 * @param elem Es el elemento que se quiere añadir
	 */
	public void add(T elem){
		this.elementos = (T[]) new Object[elementos.length + 1];
		
		this.elementos[elementos.length - 1] = elem;
		
	}
	
	
	/***
	 * Borra un elemento de la cola
	 * @param elem Es el elemento que se quiere borrar
	 */
	public void remove(T elem){
		int i = 0;
		
		for(i = 0; i < elementos.length; i++){
			if(elementos[i] == elem){
				break;
			}
		}
		
		for(int j = i ; j < elementos.length - 1; j++){
			elementos[j] = elementos[j + 1]; 
		}
		
		elementos[elementos.length] = null;
		
		this.elementos = (T[]) new Object[elementos.length - 1];
		
	}
	
	
	
}
