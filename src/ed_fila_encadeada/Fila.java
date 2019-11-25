package ed_fila_encadeada;

public class Fila 
{

	private NoFila front;
	
	
	public Fila()
	{
		this.front = null;
	}

	public void enqueue(Object item) 
	{
		if (this.front == null) 
		{ 
			this.front = new NoFila(item);
		}
		else		
		{
			NoFila atual = this.front;
			while (atual.getProxima() != null)
				atual = atual.getProxima();
				atual.setProxima(new NoFila(item));
		}
	}
	
	public Object dequeue() throws Exception 
	{
		if (this.front != null) 
		{ 
			NoFila atual = this.front;
			this.front = atual.getProxima();
			return atual;
		}else
		{
			throw new Exception("Fila vazia");
		}
		
	}
	
	public Object getFront() 
	{
		return this.front;
	}
}
