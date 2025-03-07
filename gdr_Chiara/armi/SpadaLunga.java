package gdr_Chiara.armi;

public class SpadaLunga extends SupaArma {
    public SpadaLunga(){
        setNomeArma("spada_Lunga");
        setDannoArma(12);
        setConsumoStamina(6);
    }
   
    @Override
    public String toString() {
        return "SpadaLunga";
    }

    
}
