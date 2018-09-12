package prototype;

/**
 * @author Allef Douglas
 *
 */
public class Arvore {

	private long id;
	
	private String especie;
	
	private byte altura;

	/** Regular construct
	 * @param id
	 * @param especie
	 * @param altura
	 */
	public Arvore(long id, String especie, byte altura) 
	{
		this.id = id;
		this.especie = especie;
		this.altura = altura;
	}
	
	/** Construct by prototype pattern
	 * @param a
	 */
	public Arvore(Arvore a) 
	{
		this(a.getId() + 1, a.getEspecie(), a.getAltura());
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
}
