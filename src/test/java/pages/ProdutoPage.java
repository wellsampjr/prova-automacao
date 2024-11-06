package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ProdutoPage {
	
	By tamanho39 = By.xpath("//ul[@class='size-list radio-options']//li[3]");
	By btnComprar = By.xpath("//div[@class=\"action-buttons-main__cart\"]");
	
	Metodos metodo = new Metodos();
	
	public  void comprar () {
		
	metodo.clicar(tamanho39);
	metodo.clicar(btnComprar);
	metodo.validarUrl("https://www.shoestock.com.br/p/sapato-social-couro-democrata-aspen-masculino-cafe-D83-1058-003-39");
		
		
	}

}
