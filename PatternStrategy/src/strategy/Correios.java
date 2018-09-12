package strategy;

public class Correios implements Entrega
{
	@Override
	public void iniciarProcessoDeEntrega() 
	{
		System.out.println("O produto saiu dos correios.");
	}

	@Override
	public void consultarProcessoDeEntrega() 
	{
		System.out.println("Produto a caminho pelos correios.");
	}

	@Override
	public void cancelarEntrega() 
	{
		System.out.println("Entrega cancelada com os correios.");
	}
}
