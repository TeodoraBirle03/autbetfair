package homeworks;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sumOfNumbers = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }
        System.out.println("Suma primelor 100 de numere = " + sumOfNumbers);
    }
}