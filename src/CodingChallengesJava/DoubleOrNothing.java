package CodingChallengesJava;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {
    private static  int startPoint = 10;
    private Scanner input = new Scanner(System.in);
    private Random r = new Random();
    private int current = startPoint;
    private  boolean isStillPlaying = true;

    public void playGame(){
        printWelcome();
        askUserToContinue();
        while (this.isStillPlaying){
            printTryToDouble();

            if (shouldDouble()){
                doubleCurrent();
                pringCongrats();
                askUserToContinue();
            }else {
                printLost();
                return;
            }
        }
        printWalkawayMessage();
    }

    public void printWelcome(){
        System.out.println("Let's play Double or Nothing");
    }
    public void printTryToDouble(){
        System.out.println("Let's try double it!");
    }
    public void pringCongrats(){
        System.out.println("Congrats! you have " + this.current + " points");
    }
    public void printLost(){
        System.out.println("You have lost ");
    }
    public void printWalkawayMessage(){
        System.out.println("Congrats! you finish with "+ this.current + " points");
    }
    private boolean shouldDouble(){
        return this.r.nextInt(2) == 0;
    }
    private void doubleCurrent(){
        this.current = this.current * 2;
    }
    protected void askUserToContinue(){
        System.out.println("Would you like to continue ? ");
        this.isStillPlaying = this.input.nextLine().toUpperCase().equals("YES");
    }
    protected boolean getStillPlaying(){
        return this.isStillPlaying;
    }
}
