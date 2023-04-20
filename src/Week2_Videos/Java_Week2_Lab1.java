package Week2_Videos;

public class Java_Week2_Lab1 {

	public static void main(String[] args) {
int age = 14;
//created a variable named age and its value of 14

System.out.println(age >= 16); // this prints false because variable is less than rather than greater.


age =18;
System.out.println(age >= 16);

// a conditional example
//boolean is always true now there for you dont need the boolean to be true in the loop
boolean hasLincese = true;

if (age >= 16 && hasLincese) {
	System.out.println("You can drive");
	
} else {
	System.out.println("You can not drive");
}



// Create two new variables - cosrOfMIlk and thirstLevel 
// create a new conditional that prints "Milk please" if costOfMilk is less than 2.50


//or if thirstLevel is greater than 6 and prints "No thanks" otherwise change the value and note the diffrent results.




double costOfMilk = 3.15;
int thirstLevel = 5;


if (costOfMilk < 2.5 || thirstLevel > 6) {
	System.out.println("Milk please");
	
	} else {
		System.out.println("No please");
	}


// create two variables called numberOfCookies and numberOfChildren
// you will eventually distribute all of the cookies to the children as the adult
//use a conditional to print the following based if the following conditions:
//if there are 0 cookies remaining print "sad face" 
//if there are less than 2 cookies print "Yes"
// if there are less than 5 cookies print"whoohoo"
//if there are 5 or more cookies print "jackpot"


int numberOfCookies = 10;
int numberOfChildren = 5;
int remainingCookies = numberOfCookies %  numberOfChildren; 
//if(numberOfcookies % numberOfChildren == 0 ) {
	//System.out.println("sad face");
//}

if(numberOfCookies % numberOfChildren > 5) {	
	System.out.println("Jackpot!");
}else if (numberOfCookies % numberOfChildren >= 2) {
	System.out.println("Whoohooo!");
	
} else if (numberOfCookies % numberOfChildren > 0) {
} else {
	System.out.println(":(");
}








	}

}
