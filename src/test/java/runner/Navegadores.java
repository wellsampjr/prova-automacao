package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {

	public static void iniciarTeste() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoestock.com.br/");

	}

	public static void depoisDoTeste() {

		driver.quit();

	}

}
