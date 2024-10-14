import java.util.Scanner;
import java.util.Random;
public class DieRollar {
    public static void main(String[] args) {

Random rand = new Random();
Scanner in = new Scanner(System.in);

int roll1;
int roll2;
int roll3;
int sum;
int count=0;
boolean repeat=true;
String again;
boolean reroll=false;
do {
    System.out.printf("%-5s %-5s %-5s %-5s %-5s", "Roll", "Die1", "Die2", "Die3", "Sum");
    System.out.println();
    System.out.println("-----------------------------------------");

    do {
        roll1 = rand.nextInt(1, 6);
        roll2 = rand.nextInt(1, 6);
        roll3 = rand.nextInt(1, 6);
        sum = roll1 + roll2 + roll3;
        count = count + 1;

        System.out.printf("%-5d %-5d %-5d %-5d %-5d", count, roll1, roll2, roll3, sum);
        System.out.println();
        if (roll1 == roll2 && roll1 == roll3) {
            repeat = false;
        }
    }
    while (repeat);
    System.out.println("Would you like to go again? [Y/N]");
    again = in.nextLine();
    if (again.equals("Y")) {
reroll=true;
repeat=true;
count=0;
    }
    else{
        reroll=false;
    }
}
while (reroll);



    }
}
