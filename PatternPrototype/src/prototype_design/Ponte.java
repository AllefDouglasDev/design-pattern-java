package prototype_design;

/**
 * @author Allef Douglas
 *
 */
public class Ponte {

	private long id;
	
	private float largura;
	
	private float comprimento;

	private String[] design;
	
	
	/** Regular construct
	 * @param id
	 * @param largura
	 * @param comprimento
	 * @param design
	 */
	public Ponte(long id, float largura, float comprimento, String[] design) 
	{
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
		this.design = design;
	}
	
	/** Construct by prototype pattern
	 * @param p
	 */
	public Ponte(Ponte p) 
	{
		this(p.getId() + 1, p.getLargura(), p.getComprimento(), p.getDesign());
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
	
	public String[] getDesign() 
	{
		return design;
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
	
	public void setDesign(String[] design) 
	{
		this.design = design;
	}
}
