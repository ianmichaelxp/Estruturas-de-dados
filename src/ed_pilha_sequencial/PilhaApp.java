package ed_pilha_sequencial;

public class PilhaApp {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		Object o = pilha.pop();

		System.out.println(pilha.toString() + "\n" + "pop: " + o);
		System.out.println(pilha.top());
		
	}

}
