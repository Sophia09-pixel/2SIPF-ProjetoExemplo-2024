package PacoteFontesAppTeste;

import PacoteFontesApp.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTeste {

	Pessoa pessoa = new Pessoa();
	
	@Test
	public void testeAtribuirNomeRenato() {
		pessoa.setNome("Renato");
		assertEquals(pessoa.getNome(), "Renato");
	}
	
	@Test
	public void testeAtribuirPesoRenato() {
		pessoa.setPeso(80.5);
		assertEquals(pessoa.getPeso(), 80,0.5);
	}

}
