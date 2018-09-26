package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        System.out.println("What do you want to play? (You guess/I guess)");
        Scanner choice = new Scanner(System.in);
        String userchoice = choice.nextLine();
        if(userchoice == "I guess"){
            int randomnum = (int)(10*Math.random());
            System.out.println("Guess My Number");
            Scanner guess = new Scanner(System.in);
            int userguess = guess.nextInt();
            if(userguess != randomnum){
                while(userguess != randomnum) if (userguess < randomnum) {
                    System.out.println("Too Low");
                    userguess = guess.nextInt();
                } else if (userguess > randomnum) {
                    System.out.println("Too High");
                    userguess = guess.nextInt();
                }if(userguess == randomnum){
                    System.out.println("Correct!");
                }
            }
        }
    }
}
