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
		objAux = this.pilha[this.topo];
		this.topo--;
		return objAux;
	}
	
	public Object top() 
	{
		return pilha[topo];
	}
	
}
