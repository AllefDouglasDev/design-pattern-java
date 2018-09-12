package proxy;

public class App 
{
	public static void main(String[] args) 
	{
		System.out.println("\n==========================================\n\n"
							+ "Buscando demanda comum...\n");
		Demanda demanda = new Demanda();
		System.out.println(demanda.getReuniao("13/02/2045", "00:00"));
		System.out.println(demanda.getInfoSimples());
		System.out.println(demanda.getInfoSigilosas());
		System.out.println("\n==========================================\n\n"
							+ "Buscando demanda filtrada...\n");
		DemandaFiltro demandaProxy = new DemandaProxy(demanda);
		
		System.out.println(demandaProxy.getReuniao("13/02/2045", "00:00"));
		System.out.println(demandaProxy.getInfoSimples());
	}
}
