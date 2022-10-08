package Lp;

public class Stack {
	private int array[];
	private int top;
	private int capacity;
	
	
	//Construtor feito para iniciar a pilha
	Stack(int size)
	{
	array= new int [size];
	capacity = size;
	top = -1;
	}
//Função ultilitaria para  adicionar o lemento "x" a pilha 
	public void push (int x)
	{
		if(isFull()) {
			System.out.println("Sobrecarga\nPrograma Finalizado");
			System.exit(-1);
		}
	System.out.println("Inserindo"+x);
	array[++top] = x;
	}
	//Função ultilitária para retirar um elemento do topo da pilha 
	public int pop()
	{  //Cheque se a pilha está vazia 
		if (isEmpty()) {
			System.out.println("Vazio\nPrograma Finalizado");
			System.exit(-1);
		}
		System.out.println("Removendo");
		//diminuindo o tamanho da pilha em 1 e (opcionalmente) retornando o valor retirado
		return array[top--];
	}
	//Função ultilitária para retornar  o elemento do topo da pilha
	public int peek() {
		if(!isEmpty()) {
			return array[top];
		}
		else {
			System.exit(-1);
		}
		return -1;
	}
	
	
	//Função ultilitária para retornar o tamanho da pilha
	public int size() {
		return top + 1;
	}
	//Função ultilitária para checar se a pilha está vazia ou não
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	//Função ultilitária para checar se a pilha está cheia ou não
	public  boolean isFull() {
	// TODO Auto-generated method stub
	return top == capacity -1;
}
}