import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
	//Create ArryList object
	ArrayList<Integer> ans = new ArrayList<Integer>();
	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);
 
	// Create a Scanner
	Scanner input = new Scanner(System.in);

	System.out.print(
	"What is " + number1 + " + " + number2 + "? ");
	int answer = input.nextInt();
	//add answer into ArrayList
	ans.add(answer);

	//while loop
	while (number1 + number2 != answer) {
		System.out.print("Wrong answer. Try again. What is "
		+ number1 + " + " + number2 + "? ");
		answer = input.nextInt();
		//for loop
		for(int i = 0;i < ans.size(); i++){
			//if answers are same, print out
			if(ans.get(i)==answer){
				System.out.println("You've already entered:" + ans.get(i));
				break;
			}
		}
		//add answer into ArrayList
		ans.add(answer);
	}

	System.out.println("You got it!");
	}
}