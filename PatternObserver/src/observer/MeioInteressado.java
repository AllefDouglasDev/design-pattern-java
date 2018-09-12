package observer;

public class MeioInteressado implements Observer
{
	@Override
	public void update() 
	{
		System.out.println("\n(Meio Interessado)\nTalvez amanhã eu olhe a nota. Só espero que eu tenha tirado a média.");
	}
}
