package br.com.comercio;

import static org.junit.Assert.*;

import org.junit.Test;

class TesteCompra {

	@Test
	void CompraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.valorTotal);
		assertEquals(500, c.getvalorParcela());
		
	}
	
	@Test
	void CompraParcelado() {
		Compra c = new Compra(4, 250 );
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(1000, c.valorTotal);
		assertEquals(250, c.getvalorParcela());
		
	}	

}
