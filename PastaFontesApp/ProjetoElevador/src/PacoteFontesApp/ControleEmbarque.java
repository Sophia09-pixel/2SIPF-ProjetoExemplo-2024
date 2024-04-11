package PacoteFontesApp;

public class ControleEmbarque {

	Elevador elevador = new Elevador();
	
	//Embarcar pessoa no elevador
	public boolean embarcar(Pessoa pessoa) {
		
		boolean liberarAcesso =elevador.avaliarpeso(pessoa.getPeso());
		if (liberarAcesso == false) {
			//liberada a entrada
			elevador.entrarNoelevador(pessoa.getPeso());
			return true;
		}
		else {
			//bloqueada a entrada
			return false;
		}

	}
}
