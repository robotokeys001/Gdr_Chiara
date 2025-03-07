package gdr_Chiara.armature;

public class SupaArmature {
    private String nomeArmatura;
    private int difesaArmatura;
    private int durabilitaArmatura;
    private int consumoStaminaArmatura;
    public SupaArmature(){
        this.nomeArmatura="";
        this.difesaArmatura=0;
        this.durabilitaArmatura=0;
        this.consumoStaminaArmatura =0;
    }
    public int getDifesaArmatura() {
        return difesaArmatura;
    }

    public void setDifesaArmatura(int difesaArmatura) {
        this.difesaArmatura = difesaArmatura;
    }

    public int getDurabilitaArmatura() {
        return durabilitaArmatura;
    }

    public void setDurabilitaArmatura(int durabilitaArmatura) {
        this.durabilitaArmatura = durabilitaArmatura;
    }

    public int getConsumoStaminaArmatura() {
        return consumoStaminaArmatura;
    }

    public void setConsumoStaminaArmatura(int consumoStaminaArmatura) {
        this.consumoStaminaArmatura = consumoStaminaArmatura;
    }

    public String getNomeArmatura() {
        return nomeArmatura;
    }

    public void setNomeArmatura(String nomeArmatura) {
        this.nomeArmatura = nomeArmatura;
    }

    @Override
    public String toString() {
        return "SupaArmature{" +
                "nomeArmatura: '" + nomeArmatura + '\'' +
                ", difesaArmatura=" + difesaArmatura +
                ", durabilitaArmatura=" + durabilitaArmatura +
                ", consumoStaminaArmatura=" + consumoStaminaArmatura +
                '}';
    }

}
