package ch08.sec13;

public class ImplClass implements InterfaceC {
    public void methodA(){
        System.out.println("A 실행");
    }

    public void methodB(){
        System.out.println("B 실행");
    }

    @Override
    public void methodC(){
        System.out.println("C 실행");
    }
}
