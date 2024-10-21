import java.util.Scanner;
import time;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter mode: 1, 2, or 3: ");
        int mode = sc.nextInt();
        int range = 26;
        int rand1;
        int rand2;
        int rand3;
        int modNum = 0;
        int points = 0;
        String responce;
        boolean running;

        ArrayList<Character> achar = new ArrayList<Character>();
        if(mode >= 1 && mode <= 3){
            running = true;
        }
        else{
            running = false;
        }

        while(running && points < 1000 && points > -100){
            rand1 = (int)Math.random() *modNum;
            rand2 = (int)Math.random() *range;
            rand3 = (int)Math.random() *range;

            switch(mode){
                case 1:
                    achar.add((char) (rand1 + 97));
                    for(int i = 0; i < achar.size()  ; i++){
                        System.out.print(achar.get(i));
                    }
                    TimeUnit.SECONDS.sleep(1);
                    System.out.print("\033[2J\033[H");
                    System.out.println("reapeat: ");
                    responce = sc.nextLine();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}