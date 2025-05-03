import java.util.Scanner;
import java.util.Random;
public class RPS {

    public static void main(String[] args) {
        System.out.println("Hey wanna play rock paper and scissors?");
        Scanner ab= new Scanner(System.in);
        Random abc= new Random();
        String a= ab.nextLine();
        if(a.equalsIgnoreCase("yes")|| a.equalsIgnoreCase("sure")){
        System.out.println("Great let's play!");}
        else{
            System.out.println("okay no problem");
            return;
        }
        System.out.println("Enter 1 for rock, 2 for paper and 3 for scissors");
        int user= ab.nextInt();
        int computer= abc.nextInt(1,3);

        if(user==1){
            System.out.println("You chose rock");
        }
        else if(user==2){
            System.out.println("You chose paper");
        }
        else if(user==3){
            System.out.println("You chose scissors");
        }
        else{
            System.out.println("Invalid input, please enter 1, 2 or 3");
            return;
        }
        if(computer==1){
            System.out.println("Computer chose rock");
        }
        else if(computer==2){
            System.out.println("Computer chose paper");
        }
        else if(computer==3){
            System.out.println("Computer chose scissors");
        }
        if(user==computer){
            System.out.println("Draw!");
        }
        else if(user==1 && computer==2|| user==2 && computer==3 || user==3 && computer==1){
            System.out.println("Aw, you lost!\n Computer wins!");
        }
        else if(user==1 && computer==3|| user==2 && computer==1 || user==3 && computer==2){
            System.out.println("Yay you won! \n You are the winner!");
        }
        else{
            System.out.println("Invalid input, please enter 1, 2 or 3");
        }
        System.out.println("Do you want to play again? (yes/no)");
        String playAgain = ab.next();
        if(playAgain.equalsIgnoreCase("yes")){
            main(args); // Restart the game
        } else {
            System.out.println("Thanks for playing! Goodbye!");
        }
    }
}