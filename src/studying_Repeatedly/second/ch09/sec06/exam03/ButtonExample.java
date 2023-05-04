package studying_Repeatedly.second.ch09.sec06.exam03;

import ch08.sec10.exam01.B;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk=new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Ok 버튼 클릭했음");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel=new Button();

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼 클릭했음");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
