import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();
        boolean isprime = true;
        if (num == 1) {
            System.out.println(false);
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            System.out.println(isprime);

        }
    }
}
