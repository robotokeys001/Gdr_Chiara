package gdr_Chiara;

import gdr_Chiara.armature.ArmaturaLeggera;
import gdr_Chiara.armature.ArmaturaPesante;
import gdr_Chiara.armi.SpadaLunga;
import gdr_Chiara.magie.FrecciaAnima;
import gdr_Chiara.personaggi.Guarriero;
import gdr_Chiara.personaggi.Mago;


public class SistemaCombattimento {
   

    public void battle(Guarriero guarriero, Mago mago, SpadaLunga spadaLunga,ArmaturaPesante armaturaPesante, ArmaturaLeggera armaturaLeggera, FrecciaAnima frecciaAnima) {
      while(guarriero.isAlive()&& mago.isAlive()){
        
        //turno del guarriero
        
         //il guarriero attacca
//          int danno = guarriero.getPforza()+spadaLunga.getDannoArma();
//          while (guarriero.getStamina() > 0) {
//             System.out.println(guarriero.getNome()+" attacca "+mago.getNome());
//              System.out.println(guarriero.getNome()+" attacca facendo " + danno+" di danno!");
//              System.out.println("rimangono " +mago.setCalcoloVita(mago.getCalcoloVita()) + "a "+ mago.getNome());
//              guarriero.setStamina(guarriero.getStamina() - 1);
//              if (guarriero.getStamina() == 0) {
//                  System.out.println(guarriero.getNome()+" ha finito la stamina!");
//                  break;
//                  }
//              }
//          //schivata del mago
//          if(mago.getDestrezza() >5 && mago.getStamina()>0){
//             System.out.println(mago.getNome()+" schiva!");
//             mago.setStamina(mago.getStamina() - 1);
//             mago.setDestrezza(mago.getDestrezza() - 1);
//         }else{
//             System.out.println(mago.getNome()+" non può schivare!");
//         }
//              //difesa mago
//             if (armaturaLeggera.getDurabilitaArmatura() == 0) {
//            mago.getPf();
//             }else
//              mago.getCalcoloDifesaPersonaggio();
//          //danno all'armatura
//          int duralibitaRimanente = armaturaLeggera.getDurabilitaArmatura();
//          int dannoArmatura =1;
//             while(armaturaLeggera.getDurabilitaArmatura() >0){
//                 duralibitaRimanente-= dannoArmatura;
//                 if (duralibitaRimanente ==0){
//                     System.out.println("L'armatura si è rotta!");
//                     break;
//                 }
//             }

                System.out.println(guarriero.getNome() + " attacca " + mago.getNome());
                int dannoGuarriero = guarriero.getPforza() + spadaLunga.getDannoArma();
                int difesaMago = armaturaLeggera.getDurabilitaArmatura() > 0 ? armaturaLeggera.getDifesaArmatura() : 0;
                int dannoEffettivo = Math.max(0, dannoGuarriero - difesaMago);

                if (mago.getDestrezza() > 5 && mago.getStamina() > 0) {
                    System.out.println(mago.getNome() + " schiva!");
                    mago.setStamina(mago.getStamina() - 1);
                    dannoEffettivo = 0; // Nessun danno se schiva
                } else {
                    System.out.println(mago.getNome() + " non può schivare!");
                }

                mago.setPf(mago.getPf() - dannoEffettivo);
                System.out.println(mago.getNome() + " prende " + dannoEffettivo + " di danno! Vita rimanente: " + mago.getPf());

                if (armaturaLeggera.getDurabilitaArmatura() > 0) {
                    armaturaLeggera.setDurabilitaArmatura(armaturaLeggera.getDurabilitaArmatura() - 1);
                    if (armaturaLeggera.getDurabilitaArmatura() == 0) {
                        System.out.println("L'armatura del mago si è rotta!");
                    }
                }
// //turno mago
System.out.println(mago.getNome() + " attacca " + guarriero.getNome());
int dannoMago = mago.getIntelligenza() + frecciaAnima.getDannoMagia();
int difesaGuarriero = armaturaPesante.getDurabilitaArmatura() > 0 ? armaturaPesante.getDifesaArmatura() : 0;
int dannoEffettivo = Math.max(0, dannoMago - difesaGuarriero);

if (mago.getDestrezza() > 5 && mago.getStamina() > 0) {
    System.out.println(mago.getNome() + " schiva!");
    mago.setStamina(mago.getStamina() - 1);
    dannoEffettivo = 0; // Nessun danno se schiva
} else {
    System.out.println(mago.getNome() + " non può schivare!");
}

mago.setPf(mago.getPf() - dannoEffettivo);
System.out.println(mago.getNome() + " prende " + dannoEffettivo + " di danno! Vita rimanente: " + mago.getPf());

if (armaturaLeggera.getDurabilitaArmatura() > 0) {
    armaturaLeggera.setDurabilitaArmatura(armaturaLeggera.getDurabilitaArmatura() - 1);
    if (armaturaLeggera.getDurabilitaArmatura() == 0) {
        System.out.println("L'armatura del mago si è rotta!");
    }
}

            if (!mago.isAlive()) {
                System.out.println(mago.getNome() + " è stato sconfitto!");
                break;
            }
            if (guarriero.isAlive()) {
                System.out.println(guarriero.getNome() + " vince la battaglia!");
            } else {
                System.out.println(mago.getNome() + " vince la battaglia!");
            }
      }
      
    }
}
