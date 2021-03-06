package cn.hanxu51.code;

public class HasStatic {
    private static int x = 100;

    public static void main(String[] args) {

        int i = 127;

        byte b = (byte) i;

        System.out.println(b);

    }
}