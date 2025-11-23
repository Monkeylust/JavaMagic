package hogwarts;

public class Temp {
    public static void main(String[] args) {

        String s1 = "Dragon";
        String s2 = "Dragon";
        String s3 = new String("Dragon");

        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));

    }
}