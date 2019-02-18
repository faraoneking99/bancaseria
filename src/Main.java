

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BANCA-SERIA v1.0");
        Scanner s = new Scanner(System.in);
        int sel;
        banca = Banca.getInstance(); //creazione della banca
        String email;
        boolean valida;
        Utente loggedUser = null;
        int pin;


        do{
            menuPrincipale();
            sel=s.nextInt();
            switch(sel){
                case 1:{
                    System.out.println("NOME:\t");
                    System.out.println("COGNOME:\t");
                    do{
                        System.out.println("EMAIL:\t");
                        email=s.next();
                        valida=Utilities.validateEmail(email);
                    }while(!valida);

                    break;
                }
                case 2:{
                    //LOGIN mail pin
                    System.out.println("EMAIL:\t");
                    email=s.next();
                    System.out.println("PIN:\t");
                    pin = s.nextInt();
                    loggedUser = banca.login(email, pin);
                    if(loggedUser!=null){
                        int logSel;
                        do{
                            menuLoggato();
                            logSel=s.nextInt();

                        }while(logSel!=99);
                    }
                    break;
                }
                default:{
                    System.out.println("OPZIONE NON SUPPORTATA");
                    break;
                }

            }
        }while(sel!=99);
    }
    static void menuPrincipale(){
        System.out.println("1.  REGISTRA NUOVA UTENZA");
        System.out.println("2.  LOGIN");
        System.out.println("99. ESCI");
    }
    static void menuLoggato(){
        System.out.println("1.  CREA CONTO");
        System.out.println("2.  SELEZIONA CONTO");  //println della lista dei conti attiva per questo utente
        System.out.println("3.  LOGOUT");
        System.out.println("4.  CHIUDI UTENZA");
    }
    static void menuConto(){
        System.out.println("1. DEPOSITA");
        System.out.println("2. PRELEVA");
        System.out.println("3. CHIUDI QUESTO CONTO");
    }


}
