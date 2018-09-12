package prototype_design;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @author Allef Douglas
 *
 */
public class TestPrototype {
	
	static String[] cenario = new String[100];
	
	public static void main(String[] args) 
	{	
		Arvore arvore = new Arvore(1l, "Pinheiro", (byte) 25, Design.getInstance().getDesignArvore());
		
		Lago lago = new Lago(1l, 10f, 30f, 10f, Design.getInstance().getDesignLago());

		Folhagem folhagem = new Folhagem(1l, "Musgo", "Verde-Musgo", Design.getInstance().getDesignFolhagem());

		Ponte ponte = new Ponte(1l, 4f, 70f, Design.getInstance().getDesignPonte());
		
		resetarCenario();
		gerarCenarioAleatorio(arvore, lago, folhagem, ponte);
		imprimirCenario();
	}
	
	/** Adiciona a todas as posições do array cenario[] valor vazio
	 * 
	 */
	public static void resetarCenario() 
	{
		for (int i = 0; i < cenario.length; i++) {
			cenario[i] = "";
		}
	}
	
	/** Imprime o cenário na tela
	 * 
	 */
	public static void imprimirCenario() 
	{
		for (int i = 0; i < cenario.length; i++) 
		{
			System.out.print(cenario[i] + " \r\n");
			if(cenario[i].isEmpty()) {
				break;
			}
		}
	}
	
	/** Gera um cenário aleatório, posicionando cada elemento dentro do array "cenario"
	 * 
	 * @param arvore
	 * @param lago
	 * @param folhagem
	 * @param ponte
	 */
	public static void gerarCenarioAleatorio(Arvore arvore, Lago lago, Folhagem folhagem, Ponte ponte) 
	{
		for (int i = 0; i < 10; i++) {
			float random = (float) Math.random() * 21f;
			
			if(random > 5 && random <= 10) {
				spawnArvore(arvore, (short) 1);
			} else if (random > 10 && random <= 12) {
				spawnLago(lago, (short) 1); 
			} else if (random > 15 && random <= 17) {
				spawnPonte(ponte, (short) 1); 
			} else {
				spawnFolhagem(folhagem, (short) 1);
			}
		}
	}
	
	/** Cria um novo lago
	 * 
	 * @param l objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnLago(Lago l, short qtd) 
	{
		List<Lago> listLago = new ArrayList<Lago>();
		long id = l.getId();
		
		for (int i = 0; i < qtd; i++) 
		{
			Lago lago = new Lago(l); 
			lago.setId(++id);
			listLago.add(lago);
		}
		
		for (int i = 0; i < listLago.get(0).getDesign().length; i++) 
		{
			for (int j = 0; j < listLago.size(); j++) {
				cenario[i] = cenario[i] + listLago.get(j).getDesign()[i];
			}
		}
	}
	
	/** Cria uma nova árvore
	 * 
	 * @param a objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados 
	 */
	public static void spawnArvore(Arvore a, short qtd) 
	{
		List<Arvore> listArvores = new ArrayList<Arvore>();
		long id = a.getId();
		
		for (int i = 0; i < qtd; i++) 
		{
			Arvore arvore = new Arvore(a);
			arvore.setId(++id);
			listArvores.add(arvore);
		}
		
		for (int i = 0; i < listArvores.get(0).getDesign().length; i++) 
		{
			for (int j = 0; j < listArvores.size(); j++) {
				cenario[i] = cenario[i] + listArvores.get(j).getDesign()[i];
			}
		}
	}
	
	/** Cria uma nova folhagem 
	 * 
	 * @param f objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnFolhagem(Folhagem f, short qtd) 
	{
		List<Folhagem> listFolhagem = new ArrayList<Folhagem>();
		long id = f.getId();
		
		for (int i = 0; i < qtd; i++) 
		{
			Folhagem folhagem = new Folhagem(f);
			folhagem.setId(++id);
			listFolhagem.add(folhagem);
		}
		
		for (int i = 0; i < listFolhagem.get(0).getDesign().length; i++) 
		{
			for (int j = 0; j < listFolhagem.size(); j++) {
				cenario[i] = cenario[i] + listFolhagem.get(j).getDesign()[i];
			}
		}
	}
	
	/** Cria uma nova ponte 
	 * 
	 * @param p objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnPonte(Ponte p, short qtd) 
	{
		List<Ponte> listPonte = new ArrayList<Ponte>();
		long id = p.getId();
		
		for (int i = 0; i < qtd; i++) 
		{
			Ponte ponte = new Ponte(p);
			ponte.setId(++id);
			listPonte.add(ponte);
		}
		
		for (int i = 0; i < listPonte.get(0).getDesign().length; i++) 
		{
			for (int j = 0; j < listPonte.size(); j++) {
				cenario[i] = cenario[i] + listPonte.get(j).getDesign()[i];
			}
		}
	}

}
