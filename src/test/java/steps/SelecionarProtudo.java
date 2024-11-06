package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import pages.ResutadoPesquisaPage;
import runner.Navegadores;

public class SelecionarProtudo {

	HomePage hp = new HomePage();
	ResutadoPesquisaPage pesqPage = new ResutadoPesquisaPage();

	@BeforeEach
	public void setup() {

		Navegadores.iniciarTeste();
		hp.pesquisar();
		
	}

	@AfterEach
	public void tearDown() {

		// Navegadores.depoisDoTeste();
	}
	@Test
	public void selecionarProduto () {
		
		pesqPage.selecionarProduto();
		
		
	}

}
