package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk=new Button();

        class OkListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Ok 버튼 클릭함");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();

        Button btnCancel=new Button();

        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("cancel 버튼 클릭함");
            }
        }

        btnCancel.setClickListener(new CancelListener());

        btnCancel.click();
    }
}
