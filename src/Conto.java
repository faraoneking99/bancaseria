class Conto 
{	
    private String nome;
    private double saldo = 0.0;

    public Conto(String n) {
        setNome(n);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ritira(double quantita)
    {
        if(quantita<20)
        {
        System.out.println("Quantita' minore di 20E...");
        return;
        }
        if(saldo-quantita < 0)
            System.out.println("Non puoi ritirare! Saldo non sufficiente");
        else
            saldo -= quantita;

    }
    public double getSaldo()
    {
        return saldo;
    }
    
    public void deposita(double quantita)
    {
        if(quantita < 50){
        System.out.println("Non puoi depositare una somma minore di 50E...");return;
        }
        else
        saldo += saldo +quantita;
    }
}
