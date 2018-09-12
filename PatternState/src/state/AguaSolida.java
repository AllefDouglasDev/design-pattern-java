package state;

public class AguaSolida implements AguaEstado
{
	@Override
	public AguaEstado mudarTemperatura(Agua agua, float temp) 
	{
		System.out.println("Sua mão ficou resfriada.");
		
		if (temp <= 0 ) return this;
		
		return (temp > 99)  ? new AguaGasosa() : new AguaLiquida();		
	}
}
