package observer;

import java.util.ArrayList;
import java.util.List;

public class Portal implements Observable 
{
	List<Observer> listObservers;
	
	@Override
	public void adicionar(Observer observer) 
	{
		if (null == listObservers) 
			listObservers = new ArrayList<>();
		
		listObservers.add(observer);
	}

	@Override
	public void remover(Observer observer) 
	{
		if (null == listObservers) 
			listObservers = new ArrayList<>();
		
		listObservers.remove(observer);
	}

	@Override
	public void notificar() 
	{
		for(Observer obj: listObservers) {
			obj.update();
		}
	}
	
	public void postarNota() 
	{
		System.out.println("Postando notas no portal...");
		notificar();
	}
}
