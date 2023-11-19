import java.util.Scanner;

class DoubleValues {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter First Value");
        if (sc.hasNextDouble()) {
            double val1 = sc.nextDouble();
            System.out.println("Enter Second Value");
            if (sc.hasNextDouble()) {
                double val2 = sc.nextDouble();
                System.out.println("Average :" + ((val1 + val2) / 2));

            }

            else {
                System.out.println("Input is not double");
            }
        } else {
            System.out.println("Input is not double");
        }

        sc.close();

    }

}
