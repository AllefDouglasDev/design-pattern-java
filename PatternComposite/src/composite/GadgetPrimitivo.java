package composite;

import java.awt.TextArea;

public class GadgetPrimitivo extends Gadget{
	
	public GadgetPrimitivo(String nome)
	{
		super(nome);
	}

	@Override
	public void ativar(Gadget g)
	{
		System.out.println("O gadget *" + g.getNome() + "* foi ativado");
	}
}
