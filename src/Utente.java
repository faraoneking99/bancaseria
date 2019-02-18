import java.time.LocalDate;
import java.util.ArrayList;

class Utente 
{
	
	private String nome;
	private String cognome;
	private LocalDate datanascita;
	private String email;
	private int PIN;
	ArrayList <Conto> conti = new ArrayList<Conto>();
	
	
	public Utente(String n,String c,LocalDate a,String s)
	{
		nome = n;
		cognome = c;
		datanascita = a;
		email = s;
		PIN = generaPin();
		System.out.println("Il tuo pin: "+PIN);
		
	}

}

	
	