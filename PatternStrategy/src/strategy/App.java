package strategy;

public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("Iniciando com transportadora privada\n\n");
		Loja loja = new Loja(new TransportadoraPrivada());
		loja.iniciarProcessoDeEntrega();
		loja.consultarProcessoDeEntrega();
		loja.cancelarEntrega();
		
		System.out.println("\n\nMudando para os correios\n\n");
		
		loja.setEntrega(new Correios());
		loja.iniciarProcessoDeEntrega();
		loja.consultarProcessoDeEntrega();
		loja.cancelarEntrega();
		
		System.out.println("\n\nMudando para busca em mãos\n\n");
		
		loja.setEntrega(new Manual());
		loja.iniciarProcessoDeEntrega();
		loja.consultarProcessoDeEntrega();
		loja.cancelarEntrega();
	}

}
