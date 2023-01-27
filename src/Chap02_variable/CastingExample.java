package Chap02_variable;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2); //casting 후에 10이 그대로 유지

        int num1 = 200;
        byte num2 = (byte) num1;
        System.out.println(num2); //casting 후 원래값 보존X
        //(byte) -128~127인 int 값만 원래 값 보존 가능

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var3); //casting 후에 300 그대로 유지

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6); //'A'가 출력

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8); //3이 출력
    }
}
