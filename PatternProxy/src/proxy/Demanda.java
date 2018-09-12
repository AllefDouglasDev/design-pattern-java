package proxy;

public class Demanda implements DemandaFiltro
{	
	/**
	 * Retorna as informações da reunião
	 */
	@Override
	public String getReuniao(String dia, String horario) 
	{	
		return "A reunião é no dia " + dia + ", às " + horario;
	}
	
	/**
	 * Retorna as informações simples
	 */
	@Override
	public String getInfoSimples() 
	{	
		return "Nesse método estão as informações simples";
	}

	/**
	 * Retorna as informações sigilosas
	 */
	public String getInfoSigilosas() 
	{
		return "Nesse método estão as informações sigilosas";
	}
}
