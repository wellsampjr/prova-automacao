package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import runner.Navegadores;

public class PesquisarTeste {
	
	HomePage hp = new HomePage();
	
	@BeforeEach
	public void setup () {
		
		Navegadores.iniciarTeste();
	}
	@AfterEach
	public void tearDown() {
		
		Navegadores.depoisDoTeste();
	}
	
	@Test
	public void pesquisar () {
		
		hp.pesquisar();
	}

	
}
