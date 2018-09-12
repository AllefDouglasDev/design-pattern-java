package command;

public class PararSpray implements ICommandTela
{
	private Tela tela;
	
	public PararSpray(Tela tela) 
	{
		this.tela = tela;
	}
	
	@Override
	public void execute() 
	{
		tela.pararSpray();
	}
}
