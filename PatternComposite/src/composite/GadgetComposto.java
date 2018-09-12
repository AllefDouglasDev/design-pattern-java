package composite;

import java.util.ArrayList;
import java.util.List;

public class GadgetComposto extends Gadget {
	
	private List<Gadget> listGadgets;
	
	public GadgetComposto(String nome) 
	{
		super(nome);
		this.listGadgets = new ArrayList<>(5);
	}
	
	@Override
	public void ativar(Gadget g) 
	{
		System.out.println("O gadget *" + g.getNome() + "* foi ativado");
		for (Gadget gadget: listGadgets)
		{
			gadget.ativar(gadget);
		}
	}
	
	public void addGadget(String nome) 
	{
		Gadget g = new GadgetComposto(nome);
		
		listGadgets.add(g);
	}
}
