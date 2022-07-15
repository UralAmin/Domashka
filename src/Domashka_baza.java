import java.util.Locale;

public class Domashka_baza {
    public static void main(String[] args) {
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        world = world.toLowerCase();
        String hiWorld = hi + world;
        hiWorld = hiWorld.trim();
        System.out.println(hiWorld+'\n'+hiWorld+'\n'+hiWorld);



        float rost = 1.69f;
        int ves = 64;
        float imt = ves / (rost*rost);
        System.out.println(imt);
    }



}
