package Lp;

public class Queue implements Enfileiravel {
private int top , bottom;
private Object [] data ;
 //Caso não seja atribuido valor a fila ela retornará o valor de 10
public Queue () {
	this (10);
}
//Construtor para iniciar as variaveis
	public Queue (int tamanho ) {
		top = -1;
		bottom = -1;
		data = new Object [tamanho];		
	}
	
	
	//metodo para adicionar elementos na fila
	public void enfileirar(Object element) {
		if(!isFull()) {
			bottom++;
			data[bottom] = element;	
		}
		else {
			System.err.println("Fila Cheia! " );
		}
	}
	
// metodo para desenfileirar a fila ou seja retirar elementos
public Object desenfileirar() {
		Object starting = null;
		if(!isEmpty()) {
			top ++;
			starting = data[top];
		}
		else {
			System.err.println("A fila está vazia");
		}
		return starting;
	}

// metodo para "espiar" o valor do topo da fila 
	public Object peek() {
		Object starting = null ;
		if(!isEmpty()) {
			starting = data[top+1];
		}
		else {
			System.err.println("A Fila está vazia");
		}
		return starting;
	}


	public boolean isFull() {
		// TODO Auto-generated method stub
		return (bottom == data.length-1);
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == bottom);
	}

	
}
