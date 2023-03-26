package ch08.sec11.exam01;

import ch08.sec10.exam01.C;

public class CarExample {
    public static void main(String[] args) {
        Car myCar=new Car();

        myCar.run();

        myCar.tire1=new KumhoTire();
        myCar.tire2=new KumhoTire();

        myCar.run();
    }
}
