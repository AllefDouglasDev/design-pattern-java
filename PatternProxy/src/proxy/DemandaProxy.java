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
	 * Retorna as informações filtradas da reunião
	 */
	@Override
	public String getReuniao(String dia, String horario) 
	{
		return "*Reunião filtrada*\n" + demandaFiltro.getReuniao(dia, horario);
	}

	/**
	 * Retorna as informações simples filtradas
	 */
	@Override
	public String getInfoSimples() 
	{	
		return "*Informação simples filtrada*\n" + demandaFiltro.getInfoSimples();
	}
}
