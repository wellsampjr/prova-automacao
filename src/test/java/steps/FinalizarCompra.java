package steps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.CarrinhoPage;
import pages.HomePage;
import pages.ProdutoPage;
import pages.ResutadoPesquisaPage;
import runner.Navegadores;

public class FinalizarCompra {
	
	HomePage hp = new HomePage();
	ResutadoPesquisaPage pesqPage = new ResutadoPesquisaPage(); 
	ProdutoPage produtoPg = new ProdutoPage();
	CarrinhoPage carrinhoPg = new CarrinhoPage();
	
	
	

	@BeforeEach
	public void setup() {

		Navegadores.iniciarTeste();
		hp.pesquisar();
		pesqPage.selecionarProduto();
		produtoPg.comprar();
		
	}

	@AfterEach
	public void tearDown() {

		 Navegadores.depoisDoTeste();
	}
	
	@Test
	public void ValidaCompra() {
		
		carrinhoPg.capturarResumo();
		
		carrinhoPg.validarResumaCompra();
		
		
	}


}
