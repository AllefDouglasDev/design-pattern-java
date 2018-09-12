package observer;

public interface Observable 
{
	public void adicionar(Observer observer);
	public void remover(Observer observer);
	public void notificar();
}
