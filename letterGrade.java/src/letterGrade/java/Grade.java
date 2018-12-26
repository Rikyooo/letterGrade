package letterGrade.java;
import java.util.Scanner;

public class Grade {

	public Grade() {
	}
	
	public static char letterGrade(int score) 
	{
		char grade;
		if (score < 0 || score > 100)
			grade = 'X';
		else if (score >= 90 && score <= 100)
			grade = 'A';
		else if (score >= 80 && score < 90)
			grade = 'B';
		else if (score >= 70 && score < 80)
			grade = 'C';
		else if (score >= 60 && score < 70)
			grade = 'D';
		else
			grade = 'F';
		return grade;
	}
	
	 public static void main(String args[])
	 {
		 Scanner reader = new Scanner(System.in);  // Reading from System.in
		 int grade;
		 char letter;
		 do{
			 System.out.print("Enter a score: ");
			 grade = reader.nextInt(); // Scans the next token of the input as an int.
			 letter = letterGrade(grade);
			 System.out.println(letter);
		 }while(grade != 10000);
		 
		 reader.close();
	 }

}
