package ed_pilha;

public class Pilha 
{
	private static final int ALOCACAO_INICIAL = 3;
	private Object[] pilha = new Object[ALOCACAO_INICIAL];
	private int topo;

	public void dobrarArray() 
	{	
		Object[] novoArray = new Object[pilha.length * 2];
		for(int i = 0; i < pilha.length; i++) 
		{
			novoArray[i] = pilha[i];
		}	
		pilha = novoArray;
	}
	
	public void push(Object item)
	{
		
		if(topo == pilha.length)
			{
				dobrarArray();
			}	
			pilha[topo] = item;
			topo++;

	}
	
	public Object pop() 
	{
		Object objAux;
		objAux = this.pilha[this.topo-1];
		this.pilha[this.topo-1] = null;
		this.topo--;
		return objAux;
	}
	
	public Object top() 
	{
		return pilha[topo-1];
	}
	
	public int size() 
	{
		return topo;
	}
	
	public void clear() 
	{
		Object[] clear = new Object[ALOCACAO_INICIAL];
		this.pilha = clear;
	}
	
	public String toString() 
	{
		String valores = "";
		for (int i = 0; i < topo; i++)
		{
			if (this.pilha[i] != null) 
			{
				if (i == (this.topo - 1)) 
				{
					valores += this.pilha[i];
				} else 
				{
					valores += this.pilha[i] + ", ";
				}
			}
		}
		return valores;
	}
	
}
