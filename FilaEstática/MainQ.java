package Lp;

public class MainQ {

	public static void main(String[] args) {
		Enfileiravel fila = new Queue();
		fila.enfileirar("Guilherme");
		System.out.println(fila.peek());
		fila.enfileirar("Calheira");
		fila.desenfileirar();
		System.out.println(fila.peek());
		fila.desenfileirar();
		fila.enfileirar("Guilherme Calheira");
		System.out.println(fila.peek());
		fila.enfileirar("Pedro Fernandes");
		fila.enfileirar("João Augusto");
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		fila.desenfileirar();
		System.out.println(fila.peek());
		fila.desenfileirar();
		System.out.println(fila.peek());
		fila.desenfileirar();
		System.out.println(fila.peek());

		
		
	}
}
