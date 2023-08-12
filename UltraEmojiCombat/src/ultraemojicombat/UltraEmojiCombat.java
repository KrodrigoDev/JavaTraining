package ultraemojicombat;
/**
 *
 * @author Kauã Rodrigo
 */
public class UltraEmojiCombat {

    public static void main(String[] args) {
        
        Lutador lutador[] = new Lutador[3];
        
        lutador[0] = new Lutador("Kauã","Brasileiro",20,
                1.72f,60.1f,10,5,2);
        
        lutador[1] = new Lutador("Duda","EUA",20,
                1.72f,99.1f,10,5,2);
        
        lutador[0].status();
        lutador[1].status();
        
        Luta luta = new Luta();
        
        luta.marcarLuta(lutador[0], lutador[1]);
        
        luta.lutar();
        
        lutador[0].status();
        lutador[1].status();
    }
    
}
