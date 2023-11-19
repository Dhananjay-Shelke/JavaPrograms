import java.util.Scanner;

class Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        do{
            System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 to Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
                break;
            case 4:
                System.out.println("Division of "+a+" and "+b+" is "+(a/b));
                break;
            case 5:
                bool = false;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        }
        while(bool);
    sc.close();
    }
}