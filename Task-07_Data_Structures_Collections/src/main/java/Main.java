package main.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer x = Integer.MAX_VALUE + 1;
        char[] chXArr = Integer.toBinaryString(x).toCharArray();
        System.out.println("Value: " + x + ",  " + chXArr.length + " bits " + Arrays.toString(chXArr));

        Integer y = Integer.MAX_VALUE + 2;
        char[] chYArr = Integer.toBinaryString(y).toCharArray();
        System.out.println("Value: " + y + ",  " + chYArr.length + " bits " + Arrays.toString(chYArr));

        y = -1;
        chYArr = Integer.toBinaryString(y).toCharArray();
        System.out.println("Value: " + y + ",  " + chYArr.length + " bits " + Arrays.toString(chYArr));

        y = -2;
        chYArr = Integer.toBinaryString(y).toCharArray();
        System.out.println("Value: " + y + ",  " + chYArr.length + " bits " + Arrays.toString(chYArr));
        y = -3;
        chYArr = Integer.toBinaryString(y).toCharArray();
        System.out.println("Value: " + y + ",  " + chYArr.length + " bits " + Arrays.toString(chYArr));

        Integer z = 1 << 30;
        char[] chZArr = Integer.toBinaryString(z).toCharArray();
        System.out.println(chZArr.length + " " + Arrays.toString(chZArr) + " " + z);
    }
}
