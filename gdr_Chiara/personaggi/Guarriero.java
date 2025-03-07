package gdr_Chiara.personaggi;

import gdr_Chiara.armature.ArmaturaPesante;
import gdr_Chiara.armature.SupaArmature;
import gdr_Chiara.armi.SpadaLunga;
import gdr_Chiara.armi.SupaArma;

public class Guarriero extends Personaggio {
    SupaArmature armatura = new ArmaturaPesante();
    SupaArma arma = new SpadaLunga();
    int dado = (int) (Math.random() * 10);

    public Guarriero() {
        super();
        this.setPf((10 * dado > 100) ? (10 * dado) : 100);
        this.setPforza((10 * dado > 60) ? (10 * dado) : 60);
        this.setDestrezza((10 * dado > 40) ? (10 * dado) : 40);
        this.setStamina((10 * dado > 100) ? (10 * dado) : 100);
    }
    @Override
    public int calcoloDifesaPersonaggio() {
        int difesaPersonaggio = getPf() + armatura.getDifesaArmatura();
        if (armatura.getDurabilitaArmatura() == 0) {
            return getPf();
            }else
            return difesaPersonaggio;
        }

    @Override
    public void calcoloDannoPersonaggio() {
       int danno = getPforza()+arma.getDannoArma();
        while (this.getStamina() > 0) {
            System.out.println(getNome()+" attacca facendo " + danno+" di danno!");
            setStamina(getStamina() - 1);
            if (getStamina() == 0) {
                System.out.println(getNome()+" ha finito la stamina!");
                break;
                }
            }
    }

//bisogna fare un conter che aumenti ogni volta che il nemico assegna un colpo!  
    @Override
    public void calcoloDurabilitàArmatura() {
        int duralibitaRimanente = armatura.getDurabilitaArmatura();
        int dannoArmatura =0;
        while(armatura.getDurabilitaArmatura() >0){
            duralibitaRimanente-= dannoArmatura;
            if (duralibitaRimanente ==0){
                System.out.println("L'armatura si è rotta!");
                break;
            }
        }
       
    }

    @Override
    public void calcoloSchivata() {
        if(getDestrezza() >5 && getStamina()>0){
            System.out.println(getNome()+" schiva!");
            setStamina(getStamina() - 1);
            setDestrezza(getDestrezza() - 1);
        }else{
            System.out.println(getNome()+" non può schivare!");
        }
       
    }
    @Override
    public void calcoloVita(){
    
    while(getPf() >0){
        int dannoNemico =0;
    if(getPf()>0){
        System.out.println(getNome()+" prende "+ dannoNemico +" di danno!");
        int vitaRimanente =getPf() - dannoNemico;
        System.out.println(vitaRimanente + " punti vita rimanenti!");
    }
        System.out.println(getNome() +" e stato sconfitto!");
        break;
        }
    } 
    @Override
    public boolean isAlive() {
        return getPf() > 0;
    }

    @Override
    public String toString() {
        return "Il nome del tuo guerriero è: " + getNome() + "\n" +
                "pf: " + getPf() + "\n" +
                "pforza: " + getPforza() + "\n" +
                "destrezza: " + getDestrezza() + "\n" +
                "stamina: " + getStamina() + "\n" +
                armatura + " equipaggiata!\n" +
                arma + " equipaggiata!";
    }
}