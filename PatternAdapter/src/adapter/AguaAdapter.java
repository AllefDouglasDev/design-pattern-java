package adapter;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class AguaAdapter extends Chao{
	
	private String dogImage;
	
	private Agua agua;
	
	public AguaAdapter(GameController game) {
		super(game);
		agua = new Agua(game);
	}
	
	public void animar() 
	{
		setDogImage("img/dog_swimming.gif");
		agua.nadar(dogImage);
		super.animar();
	}
	
	public void setDogImage(String dogImage) 
	{
		this.dogImage = dogImage;
	}
}
