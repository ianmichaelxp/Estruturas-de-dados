package ed_pilha_encadeada;

public class Celula 
{
	private Celula proxima;
	private Object item;

	
	public Celula(Object item) 
	{
		this.proxima = null;
		this.item = item;
	}


	public Celula getProxima() {
		return proxima;
	}


	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}


	public Object getItem() {
		return item;
	}


	
}
