import java.util.Scanner;
import time;
import java.util.ArrayList;
class main{
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
        String responce;
        boolean running;
        boolean correct;


        ArrayList<Character> achar = new ArrayList<Character>();
        if(mode >= 1 && mode <= 3){
            running = true;
        }
        else{
            running = false;
        }

        while(running && points < 1000 && points > -100){
            correct = false;
            rand1 = (int)Math.random() *modNum;
            rand2 = (int)Math.random() *range;
            rand3 = (int)Math.random() *range;

            switch(mode){
                case 1:
                    correct = true;
                    achar.add((char) (rand1 + 97));
                    for(int i = 0; i < achar.size()  ; i++){
                        System.out.print(achar.get(i));
                    }
                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");
                    System.out.println("reapeat: ");
                    responce = sc.nextLine();
                   
                    for(int i = 0; i < achar.size() && responce.length() < i  ; i++){
                        System.out.print(achar.get(i));
                        if(achar.get(i) != responce.charAt(i)){
                            correct = false;
                        }
                    }
                    System.out.print("\033[2J\033[H");
                    if(correct){
                        System.out.print("correct");
                    }
                    else{
                        System.out.print("you are an idiot");
                    }
                    Thread.sleep(1000);
                    System.out.print("\033[2J\033[H");


                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}