import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        long money = sc.nextLong();
        System.out.println("Enter investment time in month: ");
        int month = sc.nextInt();
        System.out.println("Enter interest rate percent: ");
        double rate = sc.nextDouble();
        long interest = 0;
        for (int i = 0; i < month; i++) {
            interest += money * (rate / 12);
            money += money * (rate / 12);
        }
        System.out.println("Total of interset: " + interest);
    }
}
