package state;

public class Agua 
{
	private AguaEstado estadoAtual;
	
	public Agua(AguaEstado estadoAtual) 
	{
		this.estadoAtual = estadoAtual;
	}
	
	public void mudarTemperatura(float temp) 
	{
		this.estadoAtual = estadoAtual.mudarTemperatura(this, temp);
	}
}
