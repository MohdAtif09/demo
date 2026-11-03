// import java.util.Scanner;
// public class calculator {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter your first number: ");
//         int a = input.nextInt();
//         System.out.println("choose your operation: +, -, *, /");
//         char op = input.next().charAt(0);
   
//         int result;
        

//         if(op=='+' || op=='-' || op=='*' || op=='/' || op=='X' || op=='x')
//         {
//             System.out.println("enter your second number: ");
//                 int b = input.nextInt();
            
//          if (op=='X' || op=='x')
//         {
//             System.out.println("thank you");
//         }

//        else if (op == '+') {
//             result = a + b;
//             System.out.println("the sum is: " + result);
//         } else if (op == '-') {
//             result = a - b;
//             System.out.println("the difference is: " + result);
//         } else if (op == '*') {
//             result = a * b;
//             System.out.println("the product is: " + result);
//         } else if (op == '/') {
//             if (b != 0) {
//                 double divResult = (double) a/b;
//                 System.out.println("the quotient is: " + divResult);
//                 } else {
//                     System.out.println("division by zero is not allowed.");

//             }
//         }           
                
//   }

//         else {
//             System.out.println("invalid operation");
//         }
//     }
// }

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your first number: ");
        int a = input.nextInt();
        System.out.println("choose your operation: +, -, *, /");
        char op = input.next().trim().charAt(0);
        System.out.println("enter your second number: ");
        int b = input.nextInt();
        int result;

        switch (op) {
            case '+':
                // System.out.println("enter your second number: ");
                // int b = input.nextInt();
                result = a + b;
                System.out.println("the sum is: " + result);
                break;
            case '-':
                // System.out.println("enter your second number: ");
                // b = input.nextInt();
                result = a - b;
                System.out.println("the difference is: " + result);
                break;
            case '*':
                // System.out.println("enter your second number: ");
                // b = input.nextInt();
                result = a * b;
                System.out.println("the product is: " + result);
                break;
            case '/':
                // System.out.println("enter your second number: ");
                // b = input.nextInt();
                if (b != 0) {
                    double divResult = (double) a / b;
                    System.out.println("the quotient is: " + divResult);
                } else {
                    System.out.println("division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("invalid operation");

        }
    }
}