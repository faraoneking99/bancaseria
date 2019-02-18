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
	public boolean aggiungiUtente (Utente u) {
		int i=0;
		boolean trovato = false;
		while ( trovato == false && i < listaUtenti.size()){
			if(u.getEmail().equals(listaUtenti.get(i++).getEmail()))
				trovato = true;
		}
		if( !trovato ) {
			this.listaUtenti.add(u);
			return true;
		}
		else 
			System.out.println("Utente non aggiunto");
		return false;
	}
	
	public Utente login (String email, String pin){
		int i=0;
		boolean trovato = false;
		while ( trovato == false && i < listaUtenti.size() ){
			if ( email.equals(listaUtenti.get(i).getEmail()) && ( pin.equals(listaUtenti.get(i).getPIN() ) ) )
				trovato = true;
			else 
				i++;
		}
		if( trovato ){
			System.out.println("Benvenuto " + listaUtenti.get(i).getNome());
			return listaUtenti.get(i);
		}
		System.out.println("Login fallito");
		return null;
	}
}
