package pages;

import elementos.Elemento;
import metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	Elemento el = new Elemento();
	
	
	public void pesquisar () {
		
		metodo.escrever(el.cmpPequisa, "sapato");
		metodo.clicar(el.btnPesquisar);
		metodo.validarTexto(el.resultadoPesquisa, "Resultados de busca para \"Sapato\"");
		
	}

}
