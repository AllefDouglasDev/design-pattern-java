package strategy;

public class TransportadoraPrivada implements Entrega
{
	@Override
	public void iniciarProcessoDeEntrega() 
	{
		System.out.println("O produto iniciou seu transporte após greve dos caminhoneiros.");
	}

	@Override
	public void consultarProcessoDeEntrega() 
	{
		System.out.println("Produto quase entregue, pois é privado e em geral é mais rápido.");
	}

	@Override
	public void cancelarEntrega() 
	{
		System.out.println("O cliente desistiu da compra, e o caminhoneiro teve que devolver o produto à empresa.");
	}
}
