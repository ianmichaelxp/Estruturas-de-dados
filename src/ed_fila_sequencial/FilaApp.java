package ed_fila_sequencial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilaApp {


	@Test
	public void teste01() {
		Fila fila = new Fila();
		fila.enqueue("1");
		fila.enqueue("2");
		fila.enqueue("3");
		
		assertEquals("1", fila.dequeue());
		assertEquals("2", fila.dequeue());
		assertEquals("3", fila.dequeue());
	}

	@Test
	public void teste02() {
		Fila fila = new Fila();
		fila.enqueue("1");
		fila.enqueue("2");
		
		assertEquals("1", fila.dequeue());

		fila.enqueue("3");
		
		assertEquals("2", fila.dequeue());
		assertEquals("3", fila.dequeue());
	}
	
	@Test
	public void testeTamanho() {
		Fila fila = new Fila();
		assertEquals(0, fila.size());
		
		fila.enqueue("1");
		assertEquals(1, fila.size());
		fila.enqueue("2");
		fila.enqueue("3");
		assertEquals(3, fila.size());
		
		assertEquals("1", fila.dequeue());
		assertEquals(2, fila.size());
		assertEquals("2", fila.dequeue());
		assertEquals("3", fila.dequeue());
		assertEquals(0, fila.size());
	}
	
//	@Test
//	public void capacidade() {
//		Fila fila = new Fila();
//		assertEquals(5, fila.capacidade());
//		
//		fila.enqueue("1");
//		assertEquals(5, fila.capacidade());
//		fila.enqueue("2");
//		fila.enqueue("3");
//		assertEquals(5, fila.capacidade());
//		
//		assertEquals("a", fila.dequeue());
//		assertEquals(5, fila.capacidade());
//		assertEquals("b", fila.dequeue());
//		assertEquals("c", fila.dequeue());
//		assertEquals(5, fila.capacidade());
//	}
//	
//	@Test
//	public void circular() {
//		Fila fila = new Fila();
//		fila.enqueue("a");
//		fila.enqueue("b");
//		
//		assertEquals("a", fila.dequeue());
//
//		fila.enqueue("c");
//		fila.enqueue("d");
//		fila.enqueue("e");
//		fila.enqueue("f");
//		
//		assertEquals("b", fila.dequeue());
//		assertEquals("c", fila.dequeue());
//		
//		assertEquals(3, fila.tamanho());
//		assertEquals(5, fila.capacidade());
//	}
//	
//	@Test
//	public void estouro() {
//		Fila fila = new Fila();
//		fila.enqueue("a");
//		fila.enqueue("b");
//		
//		assertEquals("a", fila.dequeue());
//
//		fila.enqueue("c");
//		fila.enqueue("d");
//		fila.enqueue("e");
//		fila.enqueue("f");
//		fila.enqueue("g");
//		fila.enqueue("h");
//		
//		assertEquals("b", fila.dequeue());
//		assertEquals("c", fila.dequeue());
//		
//		assertEquals(5, fila.tamanho());
//		assertEquals(10, fila.capacidade());
//	}
}