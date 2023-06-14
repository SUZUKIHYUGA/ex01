import java.util.Random;
import java.util.Scanner;
class Dice_Game{

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        Random rand = new Random();
        int rand1 = rand.nextInt(6) + 1;
        int rand2 = rand.nextInt(6) + 1;
        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + rand1);
        System.out.println("Die 2: " + rand2);
        System.out.println("Total value: " + (rand1 + rand2));
        if((rand1 + rand2) > 7) System.out.println(name + " won!");
        else System.out.println(name + " lost");
    }
}