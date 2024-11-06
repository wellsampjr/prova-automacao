package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {
	
	public void escrever (By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void clicar (By elemento) {
		
		driver.findElement(elemento).click();
	}
	
	public void validarTexto (By elemento, String textoEsperado) {
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, textoEsperado);
		
	}
	
	public void validarUrl(String urlEsperado) {
		
		String urlAtual =  driver.getCurrentUrl();
		assertEquals(urlAtual, urlEsperado);
	}
	public void capturarTexto (By elemento) {
		
		String TextoCapturado = driver.findElement(elemento).getText();
		
		System.out.println(TextoCapturado);
		
		
	}
	
	public void esperarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(elemento));
	}

}
