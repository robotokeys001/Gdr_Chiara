package gdr_Chiara.armature;

public class ArmaturaPesante extends SupaArmature {
    
        public ArmaturaPesante() {
            setNomeArmatura("Armatura_Pesante");
            setDifesaArmatura(12);
            setDurabilitaArmatura(30);
            setConsumoStaminaArmatura(6);
        }

    
    @Override
    public String toString() {
        return "ArmaturaPesante";
    }

    
}
