package state;

public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("\n*** In�cio da execu��o ***\n");
		
		Agua agua = new Agua(new AguaLiquida());
		agua.mudarTemperatura(10);
		agua.mudarTemperatura(0);
		agua.mudarTemperatura(100);
		agua.mudarTemperatura(50);
		agua.mudarTemperatura(-20);
		
		System.out.println("\n*** Fim da execu��o ***");
	}
}
