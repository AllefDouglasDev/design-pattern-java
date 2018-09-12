package prototype_design;

/**
 * @author Allef Douglas
 *
 */
public class Folhagem {
	
	private long id;
	
	private String especie;
	
	private String cor;
	
	private String[] design;

	/** Regular construct
	 * @param id
	 * @param especie
	 * @param cor
	 */
	public Folhagem(long id, String especie, String cor, String[] design) 
	{
		this.id = id;
		this.especie = especie;
		this.cor = cor;
		this.design = design;
	}
	
	/** Construct by prototype pattern
	 * @param f
	 */
	public Folhagem(Folhagem f) 
	{
		this(f.getId() + 1, f.getEspecie(), f.getCor(), f.getDesign());
	}

	public long getId() 
	{
		return id;
	}

	public String getEspecie() 
	{
		return especie;
	}

	public String getCor() 
	{
		return cor;
	}
	
	public String[] getDesign() 
	{
		return design;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public void setEspecie(String especie) 
	{
		this.especie = especie;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	
	public void setDesign(String[] design) 
	{
		this.design = design;
	}
}
