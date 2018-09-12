package state;

public class AguaLiquida implements AguaEstado
{
	@Override
	public AguaEstado mudarTemperatura(Agua agua, float temp) 
	{
		System.out.println("Voc� molhou a m�o.");
		
		if (temp > 0 && temp <= 99) return this;
		
		return (temp <= 0) ? new AguaSolida() : new AguaGasosa();
	}
}
