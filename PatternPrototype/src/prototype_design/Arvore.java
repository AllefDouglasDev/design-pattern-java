package prototype_design;

/**
 * @author Allef Douglas
 *
 */
public class Arvore {

	private long id;
	
	private String especie;
	
	private byte altura;
	
	private String[] design;

	/** Regular construct
	 * @param id
	 * @param especie
	 * @param altura
	 */
	public Arvore(long id, String especie, byte altura, String[] design) 
	{
		this.id = id;
		this.especie = especie;
		this.altura = altura;
		this.design = design;
	}
	
	/** Construct by prototype pattern
	 * @param a
	 */
	public Arvore(Arvore a) 
	{
		this(a.getId() + 1, a.getEspecie(), a.getAltura(), a.getDesign());
	}

	public long getId() 
	{
		return id;
	}

	public String getEspecie() 
	{
		return especie;
	}

	public byte getAltura() 
	{
		return altura;
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

	public void setAltura(byte altura) 
	{
		this.altura = altura;
	}
	
	public void setDesign(String[] design) 
	{
		this.design = design;
	}
}
