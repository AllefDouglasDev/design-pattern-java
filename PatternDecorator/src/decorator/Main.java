package decorator;

public class Main 
{
	public static void main(String[] args) 
	{
		Entregar e = new Entregar();
		e.entregar(new Agua(new Leite(new Cafe(null, 15, "Café"), 20, "Leite"), 100, "Água"));
		e.entregar(new Agua(new Leite(null, 20, "Leite"), 100, "Água"));
		e.entregar(new Agua(null, 100, "Água"));
	}
}

