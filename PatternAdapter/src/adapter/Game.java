package adapter;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Game {
	
	private BufferedImage dogImage;
	
	public static void main(String[] args) {
		GameController game = new GameController();
		
		Cachorro dog = new Cachorro(game);
		dog.mover();
		
		game.onLive();
		
		/*int array[] = {7, 5, 3, 1, 4, 2, 6};
			
		
		for(int i = 0, len = array.length; i < len; i++) {
			switch(array[i]) {
			 	case 1:
		            System.out.println("Domingo");
		            break;
		        case 2:
		        	System.out.println("Segunda");
		            break;
		        case 3:
		        	System.out.println("Terça");
		            break;
		        case 4:
		        	System.out.println("Quarta");
		            break;
		        case 5:
		        	System.out.println("Quinta");
		            break;
		        case 6:
		        	System.out.println("Sexta");
		            break;
		        case 7:
		            System.out.println("Sábado");
		            break;
			}
		}*/
	}
}
