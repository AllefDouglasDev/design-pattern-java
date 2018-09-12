package prototype_design;

public class Design {
	
	private static Design INSTANCE;
	
	private String[] designArvore;
	
	private String[] designLago;
	
	private String[] designFolhagem;
	
	private String[] designPonte;
	
	public Design() 
	{
		designArvore();
		designLago();
		designFolhagem();
		designPonte();
	}
	
	public static Design getInstance() 
	{
		if(INSTANCE == null) 
		{
			synchronized (Design.class) 
			{
				if(INSTANCE == null) 
				{
					INSTANCE = new Design();
				}
			}
		}
		
		return INSTANCE;
	}
	
	public String[] getDesignArvore() 
	{
		return designArvore;
	}
	
	public String[] getDesignLago() 
	{	
		return designLago;
	}
	
	public String[] getDesignFolhagem() 
	{	
		return designFolhagem;
	}
	
	public String[] getDesignPonte() 
	{	
		return designPonte;
	}
	
	private void designArvore() 
	{
		designArvore = new String[10];
		designArvore[0] = "       A      ";
		designArvore[1] = "      AAA     ";
		designArvore[2] = "     AA AA    ";
		designArvore[3] = "    AAAAAAA   ";
		designArvore[4] = "      AAA     ";
		designArvore[5] = "      AAA     ";
		designArvore[6] = "CCCCCCAAACCCCC";
		designArvore[7] = "              ";
		designArvore[8] = "              ";
		designArvore[9] = "              ";
	}
	
	private void designLago() 
	{
		designLago = new String[10];
		designLago[0] = "              ";
		designLago[1] = "              ";
		designLago[2] = "              ";
		designLago[3] = "              ";
		designLago[4] = "              ";
		designLago[5] = "              ";
		designLago[6] = "CCCL       LLC";
		designLago[7] = "    LL    L   ";
		designLago[8] = "      LLLL    ";
		designLago[9] = "              ";
	}
	
	private void designFolhagem() 
	{
		designFolhagem = new String[10];
		designFolhagem[0] = "              ";
		designFolhagem[1] = "              ";
		designFolhagem[2] = "              ";
		designFolhagem[3] = "              ";
		designFolhagem[4] = "     F F      ";
		designFolhagem[5] = "      F       ";
		designFolhagem[6] = "CCCCCCFCCCCCCC";
		designFolhagem[7] = "              ";
		designFolhagem[8] = "              ";
		designFolhagem[9] = "              ";
	}
	
	private void designPonte() 
	{
		designPonte = new String[10];
		designPonte[0] = "                          ";
		designPonte[1] = "                          ";
		designPonte[2] = "                          ";
		designPonte[3] = "                          ";
		designPonte[4] = "  PPPPPPPPPPPPPPPPPPPPPP  ";
		designPonte[5] = " P                      P ";
		designPonte[6] = "P                        P";
		designPonte[7] = "                          ";
		designPonte[8] = "                          ";
		designPonte[9] = "                          ";
	}
}
