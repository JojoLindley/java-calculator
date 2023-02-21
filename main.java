import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int results = 0;
        
        int menuSelection = 0;
        
        while (menuSelection != 7) {
            selectOperation();
            menuSelection = in.nextInt();

            if (menuSelection < 1 || menuSelection > 7) {
                System.out.println("Invaild menu selection");
                selectOperation();
            }

            if (menuSelection == 1) {
                results = add();
            }

            if (menuSelection == 2) {
                results = subtract();
            }

            if (menuSelection == 3) {
                results = multiply();
            }

            if (menuSelection == 4) {
                results = divide();
                
            }
            
            if (menuSelection == 5) {
                results = modulo();
            }

            if (menuSelection == 6) {
                results = square();
            }

            System.out.println("Results: " + results);
            

        }
        
    }

    private static int add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        return x + y;
    }

    private static int subtract() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        return x - y;
    }

    private static int multiply() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        return x * y;
    }

    private static int divide() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        return x / y;
    }

    private static int modulo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        System.out.println("Enter second integer: ");
        int y = in.nextInt();
        return x % y;
    }

    private static int square() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int x = in.nextInt();
        return x * x;
    }

    /**
     * This method is used to present the user with the choice of
     * operations or ending the program.
     */
    private static void selectOperation() {
        System.out.println("");
        System.out.println("Please select an operation from the list below:");
        System.out.println("");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division without decimal");
        System.out.println("5. Modulo Operations");
        System.out.println("6. Square");
        System.out.println("7. Quit Program");
    }
}
    
