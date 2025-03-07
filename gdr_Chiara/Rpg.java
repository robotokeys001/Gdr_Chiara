package gdr_Chiara;

import gdr_Chiara.personaggi.Guarriero;
import gdr_Chiara.personaggi.Mago;
import gdr_Chiara.personaggi.Personaggio;

public class Rpg {
   
    public static void main(String[] args) {
        Personaggio guarriero = new Guarriero();
        Personaggio mago = new Mago();
        System.out.println(guarriero);
        System.out.println(mago);
        
        SistemaCombattimento battaglia = new SistemaCombattimento();
        
        battaglia.battle();
       
    }
}
