package strategy;

public class Manual implements Entrega
{

	@Override
	public void iniciarProcessoDeEntrega() 
	{
		System.out.println("O cliente foi buscar o produto.");
	}

	@Override
	public void consultarProcessoDeEntrega() 
	{
		System.out.println("Produto esperando pelo cliente em loja.");
	}

	@Override
	public void cancelarEntrega() 
	{
		System.out.println("O cliente ficou com preguiça de buscar o produto e cancelou a compra.");
	}
}
