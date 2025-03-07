package gdr_Chiara.magie;

public class SupaMagie {
    private String nomeMagia;
    private int dannoMagia;
    private int consumoPm;
    public SupaMagie(){
        this.nomeMagia ="";
        this.dannoMagia = 0;
        this.consumoPm = 0;
    }

    public String getNomeMagia() {
        return nomeMagia;
    }

    public void setNomeMagia(String nomeMagia) {
        this.nomeMagia = nomeMagia;
    }

    public int getDannoMagia() {
        return dannoMagia;
    }

    public void setDannoMagia(int dannoMagia) {
        this.dannoMagia = dannoMagia;
    }

    public int getConsumoPm() {
        return consumoPm;
    }

    public void setConsumoPm(int consumoPm) {
        this.consumoPm = consumoPm;
    }

    @Override
    public String toString() {
        return
                "nomeMagia" + nomeMagia + '\'' +
                " difesaArmatura " + dannoMagia +
                " durabilitaArmatura " + consumoPm
                
                ;
    }
}
