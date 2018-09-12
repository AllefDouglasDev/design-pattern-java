package prototype;

/**
 * @author Allef Douglas
 *
 */
public class Lago {
	
	private long id;
	
	private float largura;
	
	private float comprimento;
	
	private float profundidade;
	
	/** Regular construct
	 * @param id
	 * @param largura
	 * @param comprimento
	 * @param profundidade
	 */
	public Lago(long id, float largura, float comprimento, float profundidade) 
	{
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
		this.profundidade = profundidade;
	}
	/** Construct by prototype pattern
	 * @param l
	 */
	public Lago(Lago l) 
	{
		this(l.getId() + 1, l.getLargura(), l.getComprimento(), l.getProfundidade());
	}

	public long getId() 
	{
		return id;
	}
	
	public float getLargura() 
	{
		return largura;
	}

	public float getComprimento() 
	{
		return comprimento;
	}

	public float getProfundidade() 
	{
		return profundidade;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public void setLargura(float largura) 
	{
		this.largura = largura;
	}

	public void setComprimento(float comprimento) 
	{
		this.comprimento = comprimento;
	}

	public void setProfundidade(float profundidade) 
	{
		this.profundidade = profundidade;
	}
}
