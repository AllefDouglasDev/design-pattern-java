package proxy;

public class Demanda implements DemandaFiltro
{	
	/**
	 * Retorna as informa��es da reuni�o
	 */
	@Override
	public String getReuniao(String dia, String horario) 
	{	
		return "A reuni�o � no dia " + dia + ", �s " + horario;
	}
	
	/**
	 * Retorna as informa��es simples
	 */
	@Override
	public String getInfoSimples() 
	{	
		return "Nesse m�todo est�o as informa��es simples";
	}

	/**
	 * Retorna as informa��es sigilosas
	 */
	public String getInfoSigilosas() 
	{
		return "Nesse m�todo est�o as informa��es sigilosas";
	}
}
