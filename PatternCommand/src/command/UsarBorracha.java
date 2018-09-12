package command;

public class UsarBorracha implements ICommandTela
{
	private Tela tela;
	
	public UsarBorracha(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.usarBorracha();
	}
}
