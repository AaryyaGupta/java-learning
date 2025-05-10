import java.util.Scanner;
public class conditionals {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Whats your age?");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You are an adult.");
        }
        else if(age>=13 && age<18){
            System.out.println("You are a teenager.");
}     
else if (age>=0 && age<13){
            System.out.println("You are a child.");
        }
        else if(age>60){
            System.out.println("You are a senior citizen");
        }
        else{
            System.out.println("Invalid age entered.");
        }
        //&&= AND
        //||= OR
        //!= NOT EQUAL TO
        //%= remainder operator

        System.out.println("Enter code");
        int code= sc.nextInt();
        
        if(code!=2008){
            System.out.println("Invalid code entered.");
        }
        else{
            System.out.println("Code is valid.");
        }

        System.out.println("Enter your name and number");
        String name= sc.next();
        int number= sc.nextInt();
        if(name.equals("aarya")&& number==2008){
            System.out.println("Welcome Aaru");
        }
        else if(name.equals("aarya")&& number!=2008){
            System.out.println("Wrong code entered.");

        }
        else if(!name.equals("aarya")&& number==2008){
            System.out.println("Wrong name entered.");
        }
        else{
            System.out.println("Invalid name and code entered.");
        }


        //Switch case control instructions
        int var= sc.nextInt();
        switch (var){
            case 20:
                System.out.println("good luck for 20s.");
                break;//break statement is used to exit the switch case
            case 30:
                System.out.println("Good luck for 30s.");
                break;
                default:
                System.out.println("Chill and relax");
                //or we can use enhanced switch
                switch (var) {
                case 10-> System.out.println("Good luck for 10s.");
                case 50-> System.out.println("Good luck for 50s.");
                    //This doesnt need any break statement as it is a single line statement.
                    //If we want to add more than one line, we can use the curly braces.
                case 60-> {
                        System.out.println("Good luck for 60s.");
                        System.out.println("Enjoy your life.");
                    }
                   
                }


        }




    }
}