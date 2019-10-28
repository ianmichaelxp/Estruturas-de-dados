package ed_pilha_encadeada;

public class Pilha 
{

	private Celula topo;
	private int totalDeElementos;
		
	public void push(Object item) 
	{
		if(topo == null) 
		{
			this.topo = new Celula(item);
		}
		else
		{
			Celula atual = new Celula(item);
			atual.setProxima(topo);
			this.topo = atual;
			totalDeElementos++;
		}
	}

}
