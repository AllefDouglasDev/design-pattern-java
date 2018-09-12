package prototype;

/**
 * @author Allef Douglas
 *
 */
public class Ponte {

	private long id;
	
	private float largura;
	
	private float comprimento;

	/** Regular construct
	 * @param id
	 * @param largura
	 * @param comprimento
	 */
	public Ponte(long id, float largura, float comprimento) 
	{
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
	}
	
	/** Construct by prototype pattern
	 * @param p
	 */
	public Ponte(Ponte p) 
	{
		this(p.getId() + 1, p.getLargura(), p.getComprimento());
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
}
