package PacoteFontesAppTeste;

import PacoteFontesApp.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevadorTeste {

	Elevador elevadorX = new Elevador();

	@Before
	public void setUp() throws Exception {
		elevadorX.setCargaAtual(0);
	}

	@Test
	public void testeIncrementarPessoaCom100Kg() {
		elevadorX.entrarNoelevador(100);
		assertEquals(elevadorX.getCargaAtual(), 100, 0);
	}

	@Test
	public void testeIncrementarPessoaCom50KgMaisOutraDe100Kg() {
		elevadorX.entrarNoelevador(50);
		elevadorX.entrarNoelevador(100);
		assertEquals(elevadorX.getCargaAtual(), 150, 0);
	}
	
	@Test
	public void testeAlertaPessoaCom50KgMaisOutraDe100Kg() {
		elevadorX.entrarNoelevador(50);
		elevadorX.entrarNoelevador(100);
		boolean alerta = elevadorX.avaliarpeso(elevadorX.getCargaAtual());
		assertFalse(alerta);
	}
	
	@Test
	public void testeAlertaPessoaCom120KgMaisOutraDe100Kg() {
		elevadorX.entrarNoelevador(120);
		elevadorX.entrarNoelevador(100);
		boolean alerta = elevadorX.avaliarpeso(elevadorX.getCargaAtual());
		assertTrue(alerta);
	}
	
}
