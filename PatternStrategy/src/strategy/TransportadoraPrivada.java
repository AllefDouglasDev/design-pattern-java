package strategy;

public class TransportadoraPrivada implements Entrega
{
	@Override
	public void iniciarProcessoDeEntrega() 
	{
		System.out.println("O produto iniciou seu transporte ap�s greve dos caminhoneiros.");
	}

	@Override
	public void consultarProcessoDeEntrega() 
	{
		System.out.println("Produto quase entregue, pois � privado e em geral � mais r�pido.");
	}

	@Override
	public void cancelarEntrega() 
	{
		System.out.println("O cliente desistiu da compra, e o caminhoneiro teve que devolver o produto � empresa.");
	}
}
