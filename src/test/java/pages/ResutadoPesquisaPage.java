package pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import metodos.Metodos;

public class ResutadoPesquisaPage {

	By sapatoCouro = By.xpath("//div[@class='card__images']//img[@alt='Sapato Social Couro Democrata Aspen Masculino']");

	Metodos metodo = new Metodos();

	@Test
	public void selecionarProduto() {

		metodo.clicar(sapatoCouro);
		metodo.validarUrl(
				"https://www.shoestock.com.br/p/sapato-social-couro-democrata-aspen-masculino-cafe-D83-1058-003");

	}
}
