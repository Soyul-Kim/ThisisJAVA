package ch07.sec05.exam02;

public class SportsCar extends Car{
    @Override
    public void speedUp(){
        speed+=10;
    }

    //오버라이딩 불가능
    /* @Override
    public void stop(){
        System.out.println("스포츠카를 멈춤");
        speed=0;
    } */
}
