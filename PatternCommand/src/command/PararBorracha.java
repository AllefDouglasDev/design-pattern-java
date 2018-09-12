package command;

public class PararBorracha implements ICommandTela
{
	private Tela tela;
	
	public PararBorracha(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.pararBorracha();
	}
}
