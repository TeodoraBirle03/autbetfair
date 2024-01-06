package homeworks;

public class PrimeNumbers {
    public static void main(String[] args) {
        int countPrimeNumbers = 0;
        int count;

        for (int i = 1; i < 13; i++) {
           count = 0;

           for (int j = 2; j <= i/2; j++) {
               if (i % j == 0) {
                   count++;
                   break;
               }
           }

           if (count == 0) {
               countPrimeNumbers++;
               System.out.println(i);
           }
        }

        System.out.println("Totalul numerelor prime = " + countPrimeNumbers);
    }
}
