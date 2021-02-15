import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) {

        String s1 = "string";
        String s2 = new String();
        String s3 = new String("qwerty");
        String s4 = new String(new char[]{'s', 't', 'r', 'i', 'n', 'g'});
        String s5 = new String(new byte[]{-48, -80, -48, -79, -47, -122});

        //    System.out.println(s5);

//        s4 = s5;
//        s5 = s5.replace('ц','f');
//        System.out.println(s5);
//        System.out.println(s4);
//        doSMth(s4);


        System.out.println(s4);
        System.out.println(s4.length());
        System.out.println("абц".length());

        s4 = "";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());

        s4 = " ";
        System.out.println(s4.isEmpty());
        System.out.println(s4.isBlank());


        //   System.out.println(Arrays.toString("фбц".getBytes(StandardCharsets.UTF_8)));
        String result = s1.concat(s3).concat("another");
        System.out.println(result);

        System.out.println(1 + 2 + "3" + 4);
        System.out.println(1 + "2" + 3 + 4);

        System.out.println( String.join(";",s1,s2,s3,"costom"));
        String[] strings = {s1, s2, s3, s4, " ' ", null};


        doSmth(s1,                s2, s3,s4, " ' ", null);
        doSmth(strings);

        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo("aaaaaaaaaaa"));
        System.out.println(s1.compareTo("strings"));

        System.out.println(s1.equals("StRing"));

        System.out.println("sd".regionMatches(1, "123453Sd",6,2));
        System.out.println("sd".regionMatches(true,0, "123453Sd",6,2));
        //qwerty
        s3                 = "abcabcab";
        System.out.println(s3.indexOf(s3.indexOf("er")));

        System.out.println(s3.lastIndexOf("ab"));
        System.out.println(s3.indexOf("ab"));
        System.out.println(s3.startsWith("abc"));



    }


    static void doSmth(String... s ){
        System.out.println(s.length);
        System.out.println(s[0]);
    }
}