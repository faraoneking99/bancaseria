package ProgettoBanca;
import java.util.ArrayList;
public class Banca {
	public String nome;
	ArrayList<Utente> listaUtenti = new ArrayList<>();
	private Banca(String nome)
	  {
		this.nome = nome;
	  }
	 private static Banca istanza;
	  public static Banca getInstance()
	  {
	    if (istanza == null)
	    {
	      istanza = new Banca("BLM");
	    }

	    return istanza; 
	  }
	}
}
