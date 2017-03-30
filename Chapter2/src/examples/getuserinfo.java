package examples;
import java.util.Scanner;
public class getuserinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int age;

Scanner Input = new Scanner(System.in);
System.out.print("Please enter your name>> ");
name = Input.nextLine();
System.out.println("Enter your age >> ");
age = Input.nextInt();
System.out.print("Your name is " + name + "and you are " + "years old.");;

	}

}
