// import java.util.Scanner;
// public class loops {
//     public static void main(String[] args){
          
//   System.out.println("enter your number: ");
//   Scanner input = new Scanner(System.in);
//   int n = input.nextInt();
//   for (int i=1; i<=n; i++) {

//     System.out.print("hello" + " ");     
//     }
//     }   
//     }




import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter which fibonacci number you want: ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int count=2;

        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
            
    }System.out.println(n+"th fibonacci number is: " + b);
}
}           