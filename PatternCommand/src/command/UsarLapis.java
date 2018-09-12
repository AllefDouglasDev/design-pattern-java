package command;

public class UsarLapis implements ICommandTela
{
	private Tela tela;
	
	public UsarLapis(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.usarLapis();
	}
}
