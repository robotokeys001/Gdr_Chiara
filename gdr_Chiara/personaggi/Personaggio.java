package gdr_Chiara.personaggi;
import gdr_Chiara.armature.SupaArmature;
import gdr_Chiara.armi.SupaArma;
import java.util.Random;

public class Personaggio {
    private String nome;
    private int pf;
    private int pm;
    private int pforza;
    private int destrezza;
    private int intelligenza;
    private int stamina;
    SupaArmature armatura;
    SupaArma arma;

    public Personaggio() {
        this.nome = nomePersonaggio();
        this.pf = calcoloPf();
        this.pm = calcoloPm();
        this.pforza = calcoloPforza();
        this.destrezza = calcoloDestrezza();

    }

    public static String nomePersonaggio() {
        String[] nome = {"Gorgo N'Zola", "Parm Migiano", "Jasperino Lombardo"};
        int i = new Random().nextInt(nome.length);
        return nome[i];
    }

    public int calcoloPf() {
        int dado = (int) (Math.random() * 10);
        return (10 * dado > 30) ? (10 * dado) : 30;
    }

    public int calcoloPm() {
        int dado = (int) (Math.random() * 10);
        return (10 * dado > 30) ? (10 * dado) : 30;
    }

    public int calcoloPforza() {
        int dado = (int) (Math.random() * 10);
        return (10 * dado > 30) ? (10 * dado) : 30;
    }

    public int calcoloDestrezza() {
        int dado = (int) (Math.random() * 10);
        return (10 * dado > 30) ? (10 * dado) : 30;
    }
    public int calcoloDifesaPersonaggio() {
        int difesaPersonaggio = getPf() + armatura.getDifesaArmatura();
        if (armatura.getDurabilitaArmatura() == 0) {
            return pf;
            }else
            return difesaPersonaggio;
        }

    
    public void calcoloDannoPersonaggio() {
       int danno = pforza+arma.getDannoArma();
        while (stamina > 0) {
            System.out.println(nome+" attacca facendo " + danno+" di danno!");
            stamina--;
            if (stamina == 0) {
                System.out.println(nome+" ha finito la stamina!");
                break;
                }
            }
    }

//bisogna fare un conter che aumenti ogni volta che il nemico assegna un colpo!     
    public void calcoloDurabilitàArmatura() {
        int duralibitaRimanente = armatura.getDurabilitaArmatura();
        int dannoArmatura =1;
        while(armatura.getDurabilitaArmatura() >0){
            duralibitaRimanente-= dannoArmatura;
            if (duralibitaRimanente ==0){
                System.out.println("L'armatura si è rotta!");
                break;
            }
        }
       
    }

    
    public void calcoloSchivata() {
        if(destrezza >5 && stamina>0){
            System.out.println(nome+" schiva!");
            stamina--;
            destrezza--;
        }else{
            System.out.println(nome+" non può schivare!");
        }
       
    }
    public void calcoloVita(){
    
    while(pf >0){
        int dannoNemico =0;
    if(pf>0){
        System.out.println(nome+" prende "+ dannoNemico +" di danno!");
        int vitaRimanente =pf - dannoNemico;
        System.out.println(vitaRimanente + " punti vita rimanenti!");
    }
        System.out.println(nome +" e stato sconfitto!");
        break;
        }
    } 

    
    public boolean isAlive() {
        return getPf() > 0;
    }
      
    @Override
    public String toString() {
        return 
                "Il nome del tuo personaggio è: " + nome  +"\n"+
                "pf: " + pf + "\n"+
                "pm: " + pm +"\n"+
                "pforza: " + pforza +"\n"+
                "destrezza: " + destrezza +"\n"+
                "intelligenza: " + intelligenza + "\n"+
                "arma equipaggiata!: " + arma + "\n"+
                "armatura equipaggiata!: " + armatura;
                
    }

    public String getNome() {
        return nome;
    }

    public int getPf() {
        return pf;
    }

    public int getPm() {
        return pm;
    }

    public int getPforza() {
        return pforza;
    }

    public int getDestrezza() {
        return destrezza;
    }

    public int getIntelligenza() {
        return intelligenza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public void setPm(int pm) {
        this.pm = pm;
    }

    public void setPforza(int pforza) {
        this.pforza = pforza;
    }

    public void setDestrezza(int destrezza) {
        this.destrezza = destrezza;
    }

    public void setIntelligenza(int intelligenza) {
        this.intelligenza = intelligenza;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    
    
}

