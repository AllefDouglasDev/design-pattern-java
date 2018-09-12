package command;

public class PararLapis implements ICommandTela
{
	private Tela tela;
	
	public PararLapis(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.pararLapis();
	}
}