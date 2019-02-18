

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
		PIN = generaPin();
		System.out.println("Il tuo pin: "+PIN);
		
	}

}