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


	public LocalDate getDatanascita() {
		return datanascita;
	}


	public void setDatanascita(LocalDate datanascita) {
		this.datanascita = datanascita;
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
		datanascita = a;
		email = s;
		PIN = Utilities.generaPin();
		System.out.println("Il tuo pin: "+PIN);
		
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
		for(Conto s: conti)
		{	
			System.out.println(s.getNome());
		}
	}
}