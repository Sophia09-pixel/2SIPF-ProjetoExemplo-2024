package PacoteFontesAppTeste;
import PacoteFontesApp.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ControleEmbarqueTeste {

	ControleEmbarque controleEmbarque = new ControleEmbarque();
	Elevador elevadorX = new Elevador();
	Pessoa pessoa = new Pessoa();


@Test
	public void testeEmbarcarPessoa100Kg() {
		pessoa.setNome("Pedro");
		pessoa.setPeso(100);
		boolean resultado = controleEmbarque.embarcar(pessoa);
		assertEquals(resultado, true);
	}

@Test
	public void testeEmbarcarPessoa500Kg() {
		pessoa.setNome("Mario");
		pessoa.setPeso(210);
		boolean resultado = controleEmbarque.embarcar(pessoa);
		assertEquals(resultado, false);
	}


}
