import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Heyy enter your name: ");
        String name= ab.nextLine();
        System.out.print("Nice to meet you  ");
        System.out.println(name);
        System.out.println("What is your age: ");
        int a= ab.nextInt();
System.out.println("Okay you are "+a+" years old.");
System.out.println("Where are you from?");
        String b= ab.nextLine();
System.out.println("Ohh you are from "+b+" that's great.");
        System.out.println("Enter 1st number: ");
        int c= ab.nextInt();
System.out.println("Enter 2nd 1: ");
        int d= ab.nextInt();
        int sum= c+d;
System.out.println("The sum of "+c+" and "+d+" is "+sum+".");
    }
}

