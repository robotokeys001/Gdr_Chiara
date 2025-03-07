package gdr_Chiara.personaggi;

import gdr_Chiara.armature.ArmaturaLeggera;
import gdr_Chiara.armature.SupaArmature;
import gdr_Chiara.magie.FrecciaAnima;
import gdr_Chiara.magie.SupaMagie;

public class Mago extends Personaggio {
    SupaMagie magia = new FrecciaAnima();
    SupaArmature armatura = new ArmaturaLeggera();
    int dado = (int) (Math.random() * 10);
    public Mago() {
        super();
        this.setPf((10 * dado > 100) ? (10 * dado) : 100);
        this.setPm((10 * dado > 60) ? (10 * dado) : 60);
        this.setIntelligenza((10 * dado > 60) ? (10 * dado) : 60);
        this.setDestrezza((10 * dado > 40) ? (10 * dado) : 40);  
        this.setStamina((10 * dado > 40) ? (10 * dado) : 40);
    }
    @Override
    public int calcoloDifesaPersonaggio() {
        int difesaPersonaggio = this.getPf() + armatura.getDifesaArmatura();
        if (armatura.getDurabilitaArmatura() == 0) {
            return this.getPf();
            }else
            return difesaPersonaggio;
        }

    @Override
    public void calcoloDannoPersonaggio() {
       int danno = this.getIntelligenza()+magia.getDannoMagia();
        while (this.getPm() > 0) {
            System.out.println(getNome()+" attacca con una magia facendo " + danno+" di danno!");
            setPm(this.getPm() - 1);
            if (this.getPm() == 0) {
                System.out.println(getNome()+" ha finito i punti magia!");
                break;
                }
            }
    }

//bisogna fare un conter che aumenti ogni volta che il nemico assegna un colpo!  
    @Override
    public void calcoloDurabilitàArmatura() {
        int duralibitaRimanente = armatura.getDurabilitaArmatura();
        while(armatura.getDurabilitaArmatura() >0){
            duralibitaRimanente--;
            if (duralibitaRimanente ==0){
                System.out.println("L'armatura si è rotta!");
                break;
            }
        }
       
    }

    @Override
    public void calcoloSchivata() {
        if(this.getDestrezza() >5 && this.getStamina()>0){
            System.out.println(getNome()+" schiva!");
            this.setStamina(getStamina() - 1);
            this.setDestrezza(getDestrezza() - 1);
        }else{
            System.out.println(getNome()+" non può schivare!");
        }
       
    }
    @Override
    public void calcoloVita(){
    
    while(this.getPf() >0){
        int dannoNemico =0;
    if(this.getPf()>0){
        System.out.println(getNome()+" prende "+ dannoNemico +" di danno!");
        int vitaRimanente =this.getPf() - dannoNemico;
        System.out.println(vitaRimanente + " punti vita rimanenti!");
    }
        System.out.println(getNome() +" e stato sconfitto!");
        break;
        }
    } 
    @Override
    public String toString() {
        return "Il nome del tuo mago è: " + getNome() + "\n" +
                "pf: " + getPf() + "\n" +
                "pm: " + getPm() + "\n" +
                "intelligenza: "+ getIntelligenza() + "\n"+
                "destrezza: " + getDestrezza() + "\n" +
                "stamina: " + getStamina() + "\n" +
                armatura + " equipaggiata!\n" +
                magia + " equipaggiata!";
    }
}
