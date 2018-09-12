package state;

public class AguaGasosa implements AguaEstado
{
	@Override
	public AguaEstado mudarTemperatura(Agua agua, float temp) 
	{
		System.out.println("N�o � poss�vel peg�-la.");
		
		if (temp > 99) return this;
		
		return (temp <= 0) ? new AguaGasosa() : new AguaLiquida();
	}
}
