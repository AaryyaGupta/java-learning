import java.util.Scanner;
public class practicemethods {
   static String helloFunction(){
    System.out.println("Hello"); // prints a message
    return "Hello";
   }
   static int sum(int a, int b) {
        return a+b; // returns the sum of two integers
    }


    static int fibonacci(int n){
        if(n<=1){
            return n; //base
        }
        return fibonacci(n-1) + fibonacci(n-2); //recursive call
    }
    static int table(int n) {
       
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i)); // prints the multiplication table
        }
        return n; // returns the multiplication table
    }
    static int star(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // prints stars in each row
            }
            System.out.println(); // moves to the next line after printing stars in a row
        }
        for(int i=n; i>=0;i--) {
            for(int j=1; j<=i; j++){
                System.out.print("* "); // prints stars in each row
            }
            System.out.println(); // moves to the next line after printing stars in a row
        }
        return 0;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      helloFunction();
       // calling the helloFunxtion method
       int a=sc.nextInt();
         int b=sc.nextInt();
         System.out.print(sum(a,b)); // calling the sum method
        // System.out.println("Enter the number of terms in the Fibonacci series:");
        // int n=  sc.nextInt();
        // System.out.println("Fibonacci series up to " + n + " terms:");
        // for(int i=0; i<n; i++){
        //     System.out.print( fibonacci(i) + " ");
        // }
        // System.out.println("Enter the number to generate its multiplication table:");
        // int n = sc.nextInt();
        // System.out.println("Multiplication table for " + n + ":");
        // System.out.println(table(n)); // This will print the multiplication table for the number n
         // calling the table method
         
         System.out.println("Enter the number of rows for the star pattern:");
        int n = sc.nextInt();
        System.out.println("Star pattern for " + n + " rows:");
        System.out.println(star(n)); // This will print the star pattern for the given number of rows







    }}

    

