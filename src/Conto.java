package BANCA;

import java.time.LocalDate;

public class Conto {
    double saldo = 0.0;
    LocalDate  ultimaModifica;
    double vers = 0.0;
    double ritiro = 0.0;

    public void versamento(double vers){
        if(ultimaModifica == null)
            ultimaModifica = LocalDate.now();
        else if (ultimaModifica != LocalDate.now()) {
            vers = 0.0;
            ultimaModifica = LocalDate.now();
        }
        else
        if(vers+this.vers <= 500) {
            if(vers >= 50)
                this.vers += vers;
            else
                System.out.println("Devi versare minimo 50$");
        }
        else
            System.out.println("Puoi versare 500$ al giorno (versamento massimo rimanente  " + (500-this.vers) + "$" );
    }

    public void ritiro(double ritiro){
        if(ultimaModifica == null)
            ultimaModifica = LocalDate.now();
        else if (ultimaModifica != LocalDate.now()) {
            ritiro = 0.0;
            ultimaModifica = LocalDate.now();
        }
        else
        if(ritiro+this.ritiro <= 500) {
            if(ritiro >= 20)
                this.ritiro += ritiro;
            else
                System.out.println("Devi ritirare minimo 20$");
        }
        else
            System.out.println("Puoi ritirare 500$ al giorno (ritiro massimo rimanente  " + (500-this.vers) + "$" );
    }

}

