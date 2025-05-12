import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         //int n=0;
            // while loop
        // while(n<=10){
          //  System.out.println(n);
        //    n++; }// increment n by 1 so when n reaches 10, it will next convert to 11 and exit the loop
         //this could go infinitely if we don't increment n by 1 in the loop

         //do while loop
        /*  int a=2;
         do{
            System.out.println(a);
            a++;
         }while(a>10); // do while loop will execute at least once even if the condition is false

        // n natural numbers
        int n= sc.nextInt();
        int b=1;
        do{
            System.out.println(b);
            b++;
        }while(b<=n); 
        // this will print n natural numbers from 1 to n */

        // for loop
        System.out.println("value of n: ");
        int n= sc.nextInt();
        //for(int i=1; i<=n ; i++){
          //  System.out.println(2*i+1);}
         // this will print odd numbers from 1 to n

         // n natural numbers in reverse order
         //for(int i=n; i>=1; i--){
        //    System.out.println(i);} // this will print n natural numbers in reverse order

      // 
      for(int x=n; x>=20; x--){
            
      if(x%2!=0){
                continue;
        }
        System.out.println(x);
        System.out.println("even numbers");
        if(x==1){
          break;
        }
      
        }
  }
      }
    
    

