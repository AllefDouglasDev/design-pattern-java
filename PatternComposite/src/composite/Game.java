package composite;

public class Game {

	public static void main(String[] args) {
		GadgetComposto gc = new GadgetComposto("Breach");
		
		GadgetPrimitivo gp = new GadgetPrimitivo("Fumaça bomba");
		
		gc.addGadget("bomba");
		gc.addGadget("faca");
		gc.addGadget("fumaça");
		gc.addGadget("marreta");
		
		gc.ativar(gc);
		
		gp.ativar(gp);
	}

}
