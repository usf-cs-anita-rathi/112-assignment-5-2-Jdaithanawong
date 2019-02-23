import java.util.Scanner;
public class StudentRecordTest {
public static void main(String[] args)
{
	StudentRecord StudentRecord1;
	StudentRecord1 = new StudentRecord();
	Scanner input = new Scanner(System.in);
	System.out.println("Testing all set methods");
	System.out.println("input score for quiz 1: ");
	double newquizScore1 = input.nextDouble();
	StudentRecord1.setQuizScore1(newquizScore1);
	System.out.println("input score for quiz 2: ");
	double newquizScore2 = input.nextDouble();
	StudentRecord1.setQuizScore2(newquizScore2);
	System.out.println("input score for quiz 3: ");
	double newquizScore3 = input.nextDouble();
	StudentRecord1.setQuizScore3(newquizScore3);
	System.out.println("input score for midterm: ");
	double newmidtermScore = input.nextDouble();
	StudentRecord1.setmidtermScore(newmidtermScore);
	System.out.println("input score for final exam: ");
	double newfinalExamScore = input.nextDouble();
	StudentRecord1.setfinalExamScore(newfinalExamScore);
	System.out.println("Setting overall numeric grade: ");
	StudentRecord1.setoverallNumeric();
	System.out.println("Currently stored value for letter grade: " + StudentRecord1.getoverallNumeric());
	System.out.println("Setting letter grade. ");
	StudentRecord1.setletterGrade();
	System.out.println("Currently stored value for letter grade: " + StudentRecord1.getletterGrade());
	System.out.println("Displaying all current instance variables using toString method: ");
	System.out.println(StudentRecord1.toString());
	
	System.out.println("Testing all get methods for each instance variable: ");
	System.out.println("Quiz score 1: " + StudentRecord1.getQuizScore1());
	System.out.println("Quiz score 2: " + StudentRecord1.getQuizScore2());
	System.out.println("Quiz score 3: " + StudentRecord1.getQuizScore3());
	System.out.println("Midterm score: " + StudentRecord1.getmidtermScore());
	System.out.println("Final exam score: " + StudentRecord1.getfinalExamScore());
	System.out.println("All accessor and mutator methods have been tested.");
	
}
}
