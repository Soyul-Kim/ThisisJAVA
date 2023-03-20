package ch08.sec07;

public interface Service {
    default void defaultMethod1(){
        System.out.println("m1");
        defaultCommon();
    }

    default void defaultMethod2(){
        System.out.println("m2");
        defaultCommon();
    }
    private void defaultCommon(){
        System.out.println("중복a");
        System.out.println("중복b");
    }

    static void staticMethod1(){
        System.out.println("s1");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("s2");
        staticCommon();
    }

    private static void staticCommon(){
        System.out.println("중복c");
        System.out.println("중복d");
    }
}
