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


        char[] array = new char[]{'a','b','c','d','e'};
        System.out.println(String.valueOf(array));
        array[3] =  'h';
        System.out.println(String.valueOf(array));





    }




}
