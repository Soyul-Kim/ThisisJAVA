package Chap03_operator;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("1조각에서 남은 조각: " + (float) result / 10);
    }
}



