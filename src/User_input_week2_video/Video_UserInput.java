package User_input_week2_video;

import java.util.Scanner;

public class Video_UserInput {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your name");
			String name = sc.nextLine();
			
			System.out.println("Welcome " + name ) ;

System.out.println("Welcome " + name);

int selection = 0;
double total = 0;

while(selection != 4) {
System.out.println("1) add candybar to shopping cart: 1.99");
System.out.println("2) add Soda to shopping cart: .99");
System.out.println("3) add Chocalte bar to shopping cart: 3.99");
System.out.println("4) Check out");

selection = sc.nextInt();

switch (selection) { 
case 1:
	total += 1.99;
	break;
case 2: 
	total += .99;
	break;
case 3:
	total += 3.99;
	break;
case 4:
	break;
default: System.out.println("Please pick a valid option");
}

System.out.println("Your current total is: " + total);

}
	}
}