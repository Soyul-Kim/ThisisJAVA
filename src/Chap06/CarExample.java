package Chap06;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar=new Car();

        //Car 객체의 필드값 읽기
        System.out.println(myCar.model);
        System.out.println(myCar.start);
        System.out.println(myCar.speed);
    }
}
