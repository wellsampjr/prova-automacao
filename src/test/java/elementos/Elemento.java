package elementos;

import org.openqa.selenium.By;

public class Elemento {
	
	public By cmpPequisa = By.id("search");
	
	public By btnPesquisar = By.xpath("//button[@class='search__button']");
	public By resultadoPesquisa = By.xpath("//h1[@class]");

}
