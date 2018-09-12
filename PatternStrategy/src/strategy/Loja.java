package strategy;

public class Loja 
{
	private Entrega entrega;
	
	public Loja(Entrega entrega) 
	{
		setEntrega(entrega);
	}
	
	public void iniciarProcessoDeEntrega() 
	{
		this.entrega.iniciarProcessoDeEntrega();
	}
	
	public void consultarProcessoDeEntrega() 
	{
		this.entrega.consultarProcessoDeEntrega();
	}
	
	public void cancelarEntrega() 
	{
		this.entrega.cancelarEntrega();
	}

	public void setEntrega(Entrega entrega) 
	{
		this.entrega = entrega;
	}
}
