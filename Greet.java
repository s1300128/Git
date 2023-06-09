import java.util.Scanner;
class Greet{
    public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("What is your name?");
	String n=sc.next();
	System.out.println("Hello, "+ n + "!");
    } 
}
