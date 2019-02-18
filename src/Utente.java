import java.time.LocalDate;
import java.util.ArrayList;

class Utente 
{
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	private String email;
	private int PIN;
	ArrayList <Conto> conti = new ArrayList<Conto>(2);
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public LocalDate getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPIN() {
		return PIN;
	}
	
	
	public Utente(String n,String c,LocalDate a,String s)
	{
		nome = n;
		cognome = c;
		dataNascita = a;
		email = s;
		PIN = Utilities.generaPin();
		System.out.println("Il tuo pin: " + PIN);
		
	}

	public boolean aggiungiConto(String s)
	{
		if(conti.size()>=2){
		System.out.println("Impossibile avere piu di 2 conti!");
		return true;
		}
		else{
		Conto c = new Conto(s);
		conti.add(c);
		System.out.println("Conto creato correttamente!");
		return true;
		}
	}

	public void showConti()
	{
		if(conti==null)
		return;	
		int i=1;
		for(Conto s: conti)
		{	
			System.out.println(i+" "+s.getNome());
			i++;
		}
	}

	public Conto getConto(int i)
	{
		return conti.get(i);
	}
}