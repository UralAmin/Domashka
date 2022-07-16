import java.util.Arrays;

public class Domashka_prodv {
    public static void main(String[] args) {

        String text = "234";
        int a = Integer.valueOf(text);
        System.out.println(a);



        a = 3;
        int b = 5;
        int x = (a+b)*(a+b);
        System.out.println(x);


        int[] array = new int[]{1,2,5,7,10};

        int[] array2 = new int[]{2,3,2,17,15};


        //четверая задача

        String str ="Hello world";
        String str1 = str.replace('l', 'r');
        System.out.println(str1);


        //Верхний регистр
        str = str.toUpperCase();
        System.out.println(str);

        //обрезка до 8 символов
        str = str.substring(0,8);
        System.out.println(str);


    }


}
