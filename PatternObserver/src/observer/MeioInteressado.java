package observer;

public class MeioInteressado implements Observer
{
	@Override
	public void update() 
	{
		System.out.println("\n(Meio Interessado)\nTalvez amanh� eu olhe a nota. S� espero que eu tenha tirado a m�dia.");
	}
}
