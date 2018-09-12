package observer;

public class Desinteressado implements Observer
{
	@Override
	public void update() 
	{
		System.out.println("\n(Desinteressado)\nGrande coisa! Isso não vai dar em nada mesmo.");
	}
}
