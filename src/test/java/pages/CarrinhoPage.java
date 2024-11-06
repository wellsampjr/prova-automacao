package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class CarrinhoPage {

	By resumoCompra = By.xpath("//div[@class='summary']");

	Metodos metodo = new Metodos();

	public void validarResumaCompra() {

		metodo.validarTexto(resumoCompra,
				"Subtotal (1 item)\n"
				+ "R$ 284,90\n"
				+ "Cupom de desconto\n"
				+ "Adicionar\n"
				+ "Valor total\n"
				+ "R$ 284,90\n"
				+ "Em até 4x de R$ 71,23 sem juros\n"
				+ "Finalizar\n"
				+ "Escolher mais produtos");

	}

	public void capturarResumo() {

		metodo.esperarElemento(resumoCompra);
		metodo.capturarTexto(resumoCompra);
	}

}
