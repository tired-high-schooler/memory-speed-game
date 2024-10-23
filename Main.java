import java.util.Scanner;
import time;
import java.util.ArrayList;
class Main{
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter mode: 1, 2, or 3: ");
        int mode = sc.nextInt();
        String garbString = sc.nextLine();
        int range = 26;
        int rand1;
        int rand2;
        int rand3;
        int modNum = 0;
        int points = 0;
        String responceC;
        int responceI;
        boolean running;
        boolean correct;
        boolean mod = false;
        String guessingUnits;
        int roundPoints = 0;
        int sum = 0;


        ArrayList<Character> achar = new ArrayList<Character>();
        if(mode >= 1 && mode <= 3){
            running = true;
        }
        else{
            running = false;
        }
        switch(mode){
            case 1:
                range = 26;
                guessingUnits = "character";
                break;
            case 2:
                range = 10;
                guessingUnits = "digit";
                break;
            case 3:
                range = 100;
                guessingUnits = "digit";
                System.out.print(0);
                break;
            default:
                guessingUnits = "error";
                System.exit(0);
                break;
        }
    

        while(running && points < 100 && points > -100){

            roundPoints = 0;
            correct = false;
            if(points >= 50){
                rand1 = (int)Math.random() *modNum;
            }
            else{
                rand1 = 0;
            }
            rand2 = (int)(Math.random() *range);
            rand3 = (int)Math.random() *range;

            switch(mode){
                case 1:
                    correct = true;
                    achar.add((char) (rand2 + 97));
                    for(int i = 0; i < achar.size()  ; i++){
                        System.out.print(achar.get(i));
                    }
                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");
                    System.out.println("repeat: ");
                    responceC = sc.nextLine();
                   
                    if (responceC.length() != achar.size()){
                        correct = false;
                    }
                    else{
                        for(int i = 0; i + 1 <= achar.size(); i++){
                            if(achar.get(i) != responceC.charAt(i)){
                                correct = false;
                            }
                        }
                    }
                    if(correct){
                        roundPoints += 10;
                    }
                    else{
                        roundPoints -= 5;
                    }

                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");


                    break;
                case 2:
                    correct = true;
                    achar.add((char) (rand2 + 48));
                    for(int i = 0; i < achar.size()  ; i++){
                        System.out.print(achar.get(i));
                    }
                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");
                    System.out.println("repeat: ");
                    responceC = sc.nextLine();
                
                    if (responceC.length() != achar.size()){
                        correct = false;
                    }
                    else{
                        for(int i = 0; i + 1 <= achar.size(); i++){
                            if(achar.get(i) != responceC.charAt(i)){
                                correct = false;
                            }
                        }
                    }
                    if(correct){
                        roundPoints += 5;
                    }
                    else{
                        roundPoints -= 5;
                    }

                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");
                    break;
                case 3:
                    System.out.println(" + " + rand2);
                    sum += rand2;
                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");
                    System.out.println("answer: ");
                    responceI = sc.nextInt();
                    if(responceI == sum){
                        correct = true;
                    }
                    if(correct){
                        roundPoints += 15;
                    }
                    else{
                        roundPoints -= 5;
                    }
                    System.out.print("\033[2J\033[H");

                    

                    break;
                
            }
            points += roundPoints;
            if(correct){
                System.out.println("Correct!");
            }
            else{
                System.out.println("failed");
            }
            System.out.println("you got: " + roundPoints);
            System.out.println("total points: " + points);
            Thread.sleep(1000);
            System.out.print("\033[2J\033[H");

            Thread.sleep(1000);
        }
        if(points >= 100){
            System.out.print("\033[2J\033[H");
            System.out.println("Victory");
            if(mode != 3){
                System.out.println("you just remembered a " + achar.size() + " " + guessingUnits + " sequnce!");
            }
            
        }
        else{
            System.out.println("Game Over.");
        }
    }
}
