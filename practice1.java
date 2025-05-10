import java.util.Scanner;
public class practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)   ;
        String a="HI MY Name is AaRyA";
        String b = a.toLowerCase();
        System.out.println(b);
        System.out.println(a.replace( " ","_"));
        String letter="Dear <|name|>, Thanks a lot";
System.out.println("Enter your name");
String name=sc.nextLine();
System.out.println(letter.replace("<|name|>", name));
System.out.println("Dear aarya \n This java is so good \n Thanks");



         
    }

    
}
