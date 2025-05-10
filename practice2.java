import java.util.Scanner;
public class practice2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.println("Enter physics marks: ");
        float physics = sc.nextFloat();
        System.out.println("Enter chemistry marks: ");
        float chemistry = sc.nextFloat();
        System.out.println("Enter maths marks: ");
        float maths = sc.nextFloat();
        if(physics<33 || chemistry<33 || maths<33){
            System.out.println("You are fail");
        }
        else{
            System.out.println("You are pass");
        }
        float percentage = (physics + chemistry + maths) / 3;
        System.out.println("Your percentage is: " + percentage);
        if(percentage<40){
            System.out.println("You are fail");}
            else{
                System.out.println("You are pass");
            } */
        /*   System.out.println("Enter your salary");
            float salary = sc.nextFloat();
            if(salary>=250000 && salary<500000){
                System.out.println("You have to pay 5% tax");
                float tax = (salary * 5) / 100;
                System.out.println(tax+" is your tax");
                else if(salary>=500000 && salary<1000000){
                    System.out.println("You have to pay 20% tax");
                    float tax = (salary * 20) / 100;
                    System.out.println(tax+" is your tax");
                }
                else if(salary>=1000000){
                    System.out.println("You have to pay 30% tax");
                    float tax = (salary * 30) / 100;
                    System.out.println(tax+" is your tax");
                }
                else{
                    System.out.println("You are not eligible for tax");
                }
            }*/

           /* System.out.println("Enter year to check if that is a leap year: ");
            int year = sc.nextInt();
            if(year%4==0 && year% 100!=0 || year%400==0){
                System.out.println( year+ " is a leap year");
            }
            else{
                System.out.println(year+ " is not a leap year");
            } */

            System.out.println("Enter website:");
            String website = sc.nextLine();
            if(website.endsWith(".com")){
                System.out.println("This is a commercial website");
            }
            else if(website.endsWith(".org")){
                System.out.println("This is a organization website");
            }
            else if(website.endsWith(".in")){
                System.out.println("This is a Indian website");
            }
            else{
                System.out.println("This is not a valid website");
            }

        }
    }

