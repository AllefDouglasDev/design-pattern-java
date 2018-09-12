package command;

public class UsarSpray implements ICommandTela
{
	private Tela tela;
	
	public UsarSpray(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.usarSpray();
	}
}
