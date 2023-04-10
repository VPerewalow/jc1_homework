package lesson8;

import static java.lang.Integer.sum;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "s1";
        String s2 = new String(new char[]{'s', '2'});
        String s3 = "s2";

        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        char [] ch2 = s2.toCharArray();
        s1 = s1.concat(s2);
        System.out.println(s1);

        Long l1 = 120L; //autoboxed
        long l2 = l1; //unboxing

        int i1 = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        System.out.println(sum(i1,i2));

        System.out.println(l1);
        System.out.println(l2);
    }
}
