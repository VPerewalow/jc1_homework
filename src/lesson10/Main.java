package lesson10;

public class Main {
    public static void main(String[] args) {
        boolean isObject;
        int[] numbers = {1,2,3};
        isObject = numbers instanceof Object;
        System.out.println("Array is object: " + isObject);
        String[] string = {"s1", "s2", "s3"};
        isObject = string instanceof String[];
        System.out.println("String Array is object: " + isObject);
    }
}
