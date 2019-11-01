package ed_fila_sequencial;

public class Fila {

	private static final int ALOCACAO_INICIAL = 3;
	private int tamanho;
	private int front; 
	private int last; 
	private Object[] arrayInterno = new Object[ALOCACAO_INICIAL];
	


	public void enqueue(Object item) {
		if(tamanho == arrayInterno.length) {
			dobrarArray();
		arrayInterno[last] = item;
		last = ++last % arrayInterno.length;
		tamanho++;
		}
	}

	public void dobrarArray() 
	{	
		Object[] novoArray = new Object[arrayInterno.length * 2];
		for(int i = 0; i < arrayInterno.length; i++) 
		{
			novoArray[i] = arrayInterno[i];
		}	
		arrayInterno = novoArray;
		
	}
	

	public Object dequeue() {
		Object resultado = arrayInterno[front];
		tamanho--;
		front = ++front % arrayInterno.length;
		return resultado;
	}
	
	public Object getFront() {
		return arrayInterno[front];
	}

	public int size() {
		return tamanho;
	}

}