package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone=new SmartPhone("갤럭시", "silver");

        System.out.println(myPhone.model);
        System.out.println(myPhone.color);

        System.out.println(myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요. 저는 아무개인데요.");
        myPhone.sendVoice("네. 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
        System.out.println(myPhone.wifi);
    }
}
