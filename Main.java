import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter mode: 1, 2, or 3: ");
        int mode = sc.nextInt();
        int range = 26;
        int rand1;
        int rand2;
        int rand3;
        int modNum;
        if(mode >= 1 && mode <= 3){
            boolean running = true;
        }
        else{
            running = false;
        }

        while(running){
            rand1 = Math.random() *modNum;
            rand2 = Math.random() *range;
            rand3 =Math .random() *range;

            switch(mode){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}