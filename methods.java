public class methods {
    static void ab()
    {
        System.out.println("Hello, this is method overloading");
    }
    static void ab(int a)//parameters
    {
        System.out.println("Hello, this is method overloading with an integer: " + a);
    }
    static void change (int a){
     a=76;
    }
    static void change1(int[] arr) {
        arr[0] = 76; // changing the first element of the array
    }

    static void telljoke(){
        System.out.println("I invented a new word! \n" +
        " Plagiarism!");
    }
    static int logic(int a, int b) {// methods to follow DRY- Don't Repeat Yourself
        int x;
        if(a>b){
            x=a+b;
    
     }
         else{
            x=b-a;
        }
        return x;
    }
    //variable arguements
    static int summ(int ...arr){ 
        int[] a = arr;
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum;
    }
    //you can use summ(int x, int ...arr) to pass a fixed number of arguments and variable number of arguments together.
    //Recursion= khudse baat karna
    static int factorial(int n) {
        //factorial= n*(n-1)* (n-2) * ... * 1
       if(n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call(khudko call karna)
        }
    }

    static int factorial_iterative(int n) {
        int product = 1;
        for(int i = 1; i <= n; i++) { //1 to n
            product *= i; // iterative approach
        }
        return product;
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c;
        c= logic(a, b);
        //object creation
        // calling the method without static
        // methods obj = new methods();
        // c = obj.logic(a, b);
        // System.out.println(c);
        int a1=30;
        int b1=20;
        int c1;
        c1= logic(a1, b1);
        System.out.println(c1);
       // telljoke();
        // calling the method
        
        int x=9;
        change(x);// changing the integer
        System.out.println("The value of x is: " + x); // x remains unchanged because primitives are passed by value
         
         int[] arr = {1, 2, 3, 4, 5};
         System.out.println("The first element of the array before changing is: " + arr[0]); // the first element is 1
        change1(arr); // changing the first element of the array
        System.out.println("The first element of the array after changing is: " + arr[0]); // the first element is changed to 76
       
        ab(); // calling the method without parameters
        ab(5); // calling the method with an integer parameter
        //(5) this is arguements-they are actual.
        // (int a) this is parameter- they are formal.

        //variable args
        int sum = summ(1, 2, 3, 4, 5); // passing variable number of arguments
        System.out.println("The sum of the variable arguments is: " + sum); // prints the sum of the variable arguments

       // Recursion
        int n = 4;
        int fact = factorial(n); // calculating factorial of n
        System.out.println("The factorial of " + n + " is: " + fact); // prints the factorial of n

       System.out.println("The factorial of " + n + " using iterative method is: " + factorial_iterative(n)); // prints the factorial of n using iterative method









    }}
