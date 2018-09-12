package proxy;

public class DemandaProxy implements DemandaFiltro
{
	/** Representa o objeto a ser filtrado */
	private DemandaFiltro demandaFiltro;
	
	public DemandaProxy (DemandaFiltro demanda) 
	{
		this.demandaFiltro = demanda;
	}
	
	/**
	 * Retorna as informa��es filtradas da reuni�o
	 */
	@Override
	public String getReuniao(String dia, String horario) 
	{
		return "*Reuni�o filtrada*\n" + demandaFiltro.getReuniao(dia, horario);
	}

	/**
	 * Retorna as informa��es simples filtradas
	 */
	@Override
	public String getInfoSimples() 
	{	
		return "*Informa��o simples filtrada*\n" + demandaFiltro.getInfoSimples();
	}
}
