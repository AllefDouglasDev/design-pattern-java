package observer;

public class App 
{
	public static void main(String[] args) 
	{
		Portal p = new Portal();
		Desinteressado d = new Desinteressado();
		MeioInteressado meioInt = new MeioInteressado();
		MuitoInteressado muitoInt = new MuitoInteressado();
		p.adicionar(d);
		p.adicionar(meioInt);
		p.adicionar(muitoInt);
		
		p.postarNota();
	}
}
