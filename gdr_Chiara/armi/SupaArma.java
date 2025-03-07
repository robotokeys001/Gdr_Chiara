package gdr_Chiara.armi;

public class SupaArma {
    private String nomeArma;
    private int dannoArma;
    private int consumoStamina;
    public SupaArma(){
        this.nomeArma ="";
        this.dannoArma = 0;
        this.consumoStamina = 0;
    }

    public int getConsumoStamina() {
        return consumoStamina;
    }

    public void setConsumoStamina(int consumoStamina) {
        this.consumoStamina = consumoStamina;
    }

    public int getDannoArma() {
        return dannoArma;
    }

    public void setDannoArma(int dannoArma) {
        this.dannoArma = dannoArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    @Override
    public String toString() {
        return "SupaArmature{" +
                "nomeArmatura" + nomeArma + '\'' +
                " difesaArmatura " + dannoArma +
                " durabilitaArmatura " + consumoStamina
                
                ;
    }
}
