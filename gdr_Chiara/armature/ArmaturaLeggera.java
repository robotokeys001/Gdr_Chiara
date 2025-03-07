package gdr_Chiara.armature;

public class ArmaturaLeggera extends SupaArmature{
    public ArmaturaLeggera() {
        setNomeArmatura("Armatura_Leggera");
        setDifesaArmatura(6);
        setDurabilitaArmatura(15);
        setConsumoStaminaArmatura(3);
    }


@Override
public String toString() {
    return "ArmaturaLeggera";
}

}
