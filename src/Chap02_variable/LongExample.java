package Chap02_variable;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
        //long var3 = 10000000000; //컴파일러는 int로 간주하기 때문에 에러 발생
        long var4 = 10000000000l;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
