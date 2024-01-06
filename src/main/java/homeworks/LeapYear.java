package homeworks;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int yearChecked;

        do {
            System.out.print("Type the year: ");
            yearChecked = scan.nextInt();
            if ((yearChecked < 1900) || (yearChecked > 2016)) {
                System.out.println("The year must be between 1900 and 2016!");
            }
        } while ((yearChecked < 1900) || (yearChecked > 2016));

        if ((yearChecked % 4 == 0 && yearChecked % 100 != 0) || (yearChecked % 400 == 0)) {
            System.out.println("February of " + yearChecked + " has 29 days");
        } else {
            System.out.println("February of " + yearChecked + " has 28 days");
        }
    }
}
