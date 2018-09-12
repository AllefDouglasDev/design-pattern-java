package composite;

public abstract class Gadget {
	
	private String nome;
	
	public Gadget(String nome) 
	{
		this.nome = nome;
	}
	
	public String getNome() 
	{
		return this.nome;
	}
	
	public abstract void ativar(Gadget g);
}
