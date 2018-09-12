package prototype_design;

/**
 * @author Allef Douglas
 *
 */
public class Lago {
	
	private long id;
	
	private float largura;
	
	private float comprimento;
	
	private float profundidade;
	
	private String[] design;
	
	/** Regular construct
	 * @param id
	 * @param largura
	 * @param comprimento
	 * @param profundidade
	 * @param design
	 */
	public Lago(long id, float largura, float comprimento, float profundidade, String[] design) 
	{
		this.id = id;
		this.largura = largura;
		this.comprimento = comprimento;
		this.profundidade = profundidade;
		this.design = design;
	}
	/** Construct by prototype pattern
	 * @param l
	 */
	public Lago(Lago l) 
	{
		this(l.getId() + 1, l.getLargura(), l.getComprimento(), l.getProfundidade(), l.getDesign());
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

	public void setProfundidade(float profundidade) 
	{
		this.profundidade = profundidade;
	}
	
	public void setDesign(String[] design) 
	{
		this.design = design;
	}
}
