package br.com.semana6.tratam_erros;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra",u.getLogin());
		
	}
	
	@Test(expected = LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("guerra", "senhaerradadoguerra");
		assertEquals("guerra",u.getLogin());
		
	}

	@Test
	public void informacaoDoErro()  {
	
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("guerra", "senhaerradadoguerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra",e.getLogin());
		}
		
		
	}

}
