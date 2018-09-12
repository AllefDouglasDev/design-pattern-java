package command;

public class Ferramenta 
{
	private ICommandTela[] comandosFazer;
	
	private ICommandTela[] comandosDesfazer;
	
	private ICommandTela nada;
	
	public Ferramenta(int size) 
	{
		comandosFazer = new ICommandTela[size];
		comandosDesfazer = new ICommandTela[size];
		nada = new Nada();
		
		for( int i = 0; i < size; i++ ) {
			comandosFazer[i] = nada;
			comandosDesfazer[i] = nada;
		}
	}
	
	public void setComando(int key, ICommandTela fazer, ICommandTela desfazer) 
	{
		comandosFazer[key] = fazer;
		comandosDesfazer[key] = desfazer;
	}
	
	public void apertarTecla(int key) 
	{
		comandosFazer[key].execute();
	}
	
	public void soltarTecla(int key) 
	{
		comandosDesfazer[key].execute();
	}
}
