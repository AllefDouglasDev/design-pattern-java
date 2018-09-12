package prototype;

/**
 * @author Allef Douglas
 *
 */
public class TestPrototype {
	
	public static void main(String[] args) 
	{
		Lago lago = new Lago(1l, 10f, 30f, 10f);

		Arvore arvore = new Arvore(1l, "Pinheiro", (byte) 25);

		Folhagem folhagem = new Folhagem(1l, "Musgo", "Verde-Musgo");

		Ponte ponte = new Ponte(1l, 4f, 70f);

		spawnLago(lago, (short) 3);
		spawnArvore(arvore, (short) 15);
		spawnFolhagem(folhagem, (short) 15);
		spawnPonte(ponte, (short) 2);
	}
	
	/** Cria um novo lago
	 * 
	 * @param l objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnLago(Lago l, short qtd) 
	{
		long id = l.getId();
		for (int i = 0; i < qtd; i++) 
		{
			Lago lago = new Lago(l); 
			lago.setId(++id);
			System.out.println("Lago " + (i + 1) + ": ID = " + lago.getId() 
			+ ": Largura = " + lago.getLargura() 
			+ ": Comprimento = " + lago.getComprimento() 
			+ ": Profundidade = " + lago.getProfundidade());
		}
	}
	/** Cria uma nova árvore
	 * 
	 * @param a objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados 
	 */
	public static void spawnArvore(Arvore a, short qtd) 
	{
		long id = a.getId();
		for (int i = 0; i < qtd; i++) 
		{
			Arvore arvore = new Arvore(a);
			arvore.setId(++id);
			/**Definindo altura randomica enter 13 e 30*/
			float altura = (float) Math.random() * 30f;
			while(altura < 13) {
				altura = (float) Math.random() * 31f;
			}

			arvore.setAltura((byte) altura);
			System.out.println("Arvore " + (i + 1) + ": ID = " + arvore.getId() 
			+ ": Altura = " + arvore.getAltura() 
			+ ": Espécie = " + arvore.getEspecie());
		}
	}
	/** Cria uma nova folhagem 
	 * 
	 * @param f objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnFolhagem(Folhagem f, short qtd) 
	{
		long id = f.getId();
		for (int i = 0; i < qtd; i++) 
		{
			Folhagem folhagem = new Folhagem(f);
			folhagem.setId(++id);
			System.out.println("Folhagem " + (i + 1) + ": ID = " + folhagem.getId() 
			+ ": Espécie = " + folhagem.getEspecie() 
			+ ": Cor = " + folhagem.getCor());
		}
	}
	/** Cria uma nova ponte 
	 * 
	 * @param p objeto a ser replicado
	 * @param qtd quantidade de objetos a serem criados
	 */
	public static void spawnPonte(Ponte p, short qtd) 
	{
		long id = p.getId();
		for (int i = 0; i < qtd; i++) 
		{
			Ponte ponte = new Ponte(p);
			ponte.setId(++id);
			System.out.println("Ponte " + (i + 1) + ": ID = " + ponte.getId() 
			+ ": Largura = " + ponte.getLargura() 
			+ ": Comprimento = " + ponte.getComprimento());
		}
	}

}
