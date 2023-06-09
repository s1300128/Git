import java.util.Random;
class DiceGame{
    public static void main(String args[]){
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
    }
}
