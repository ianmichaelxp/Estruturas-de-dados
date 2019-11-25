package ed_fila_encadeada;


public class NoFila {
	
	private NoFila proxima;
	private Object item;
	
	public NoFila(Object item) {
		this.proxima = null;
		this.item = item;
	}

	public NoFila getProxima() {
		return proxima;
	}

	public void setProxima(NoFila proxima) {
		this.proxima = proxima;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}
