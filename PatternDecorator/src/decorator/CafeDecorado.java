package decorator;

public abstract class CafeDecorado implements Ingrediente 
{
	private Ingrediente ingrediente;
	
	private int volume;
	
	private String nome;
	
	public CafeDecorado(Ingrediente ingrediente, int volume, String nome) 
	{
		this.volume = volume;
		this.ingrediente = ingrediente;
		this.nome = nome;
	}
	
	@Override
	public void entregar(Ingrediente ingrediente) 
	{
		if (this.ingrediente != null) 
		{
			this.ingrediente.entregar(ingrediente);
		}
		
		System.out.println("Adicionando " + this.volume + " de " + this.nome);
	}
}
