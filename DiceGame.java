import java.util.Random;
import java.util.Scanner;
class DiceGame{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
	String n=sc.next();
	System.out.println("Hello, "+ n + "!");
	int a,b;
	Random rand =new Random();
	System.out.println("Rolling dice...");
	System.out.print("Die 1: ");
	a=rand.nextInt(6)+1;
	System.out.println(a);
	System.out.print("Die 2: ");
	b=rand.nextInt(6)+1;
	System.out.println(b);
	System.out.println("Total value: "+ (a+b));
	if(a+b>=7) System.out.println(n+" won!");
	else System.out.println(n+" lost!");
    }
}
