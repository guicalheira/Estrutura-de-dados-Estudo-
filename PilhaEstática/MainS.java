package Lp;

public class MainS {
   public static void main (String[]args) 
   {
	   Stack stack = new Stack(3);
	   stack.push(1);//Inserindo 1 na pilha 
	   stack.push(2);//Inserindo 2 na pilha 
	   
	   stack.pop();//Removendo o ultimo elemento(2)
	   stack.pop();//Removendo o ultimo elemento(1)
	   
	   stack.push(3);//Inserindo 3 na pilha 
	   
	   stack.pop();
	   stack.push(8);
	   stack.push(4);
	   
	   System.out.println("O elemento do topo é " + stack.peek());
	   System.out.println("O tamanho da pilha é  " + stack.size());
	   
	   stack.pop();
	   stack.pop();
	   
	   
	   //Checando se a pilha está vazia
	   if(stack.isEmpty()) {
		   System.out.println("A pilha está vazia ");
	   }
	   else {
		   System.out.println("A pilha não está vazia");
   }
}
}
