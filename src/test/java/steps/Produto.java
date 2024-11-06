package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import pages.ProdutoPage;
import pages.ResutadoPesquisaPage;
import runner.Navegadores;

public class Produto {
	
	HomePage hp = new HomePage();
	ResutadoPesquisaPage pesqPage = new ResutadoPesquisaPage(); 
	ProdutoPage produtoPg = new ProdutoPage();
	

	@BeforeEach
	public void setup() {

		Navegadores.iniciarTeste();
		hp.pesquisar();
		pesqPage.selecionarProduto();
		
	}

	@AfterEach
	public void tearDown() {

		 Navegadores.depoisDoTeste();
	}

	@Test
	public void comprar () {
		
		produtoPg.comprar();
		
		
	}
}
