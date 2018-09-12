package decorator;

public class Entregar implements Ingrediente 
{	
	@Override
	public void entregar(Ingrediente ingrediente) 
	{
		ingrediente.entregar(ingrediente);
		System.out.println("\nO café está pronto");
	}
}
