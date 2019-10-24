package ed_pilha;

public class Pilha 
{
	private static final int ALOCACAO_INICIAL = 3;
	private Object[] pilha = new Object[ALOCACAO_INICIAL];
	private int inseridos;

	public void dobrarArray() 
	{	
		Object[] novoArray = new Object[pilha.length * 2];
		for(int i = 0; i < pilha.length; i++) 
		{
			novoArray[i] = pilha[i];
		}	
		pilha = novoArray;
	}
	
	
}
