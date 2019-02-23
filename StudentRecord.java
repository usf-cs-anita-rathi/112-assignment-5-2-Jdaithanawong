
public class StudentRecord {
	public double quizScore1;
	public double quizScore2;
	public double quizScore3;
	public double midtermScore;
	public double finalExamScore;
	public double overallNumeric;
	public String letterGrade;

	public StudentRecord() {
		quizScore1 = 0;
		quizScore2 = 0;
		quizScore3 = 0;
		midtermScore = 0;
		finalExamScore = 0;
	}
	public StudentRecord(double newquizScore1, double newquizScore2, double newquizScore3, double newmidtermScore, double newfinalExamScore)
	{
		quizScore1 = newquizScore1;
		quizScore2 = newquizScore2;
		quizScore3 = newquizScore3;
		midtermScore = newmidtermScore;
		finalExamScore = newfinalExamScore;
	}
	public void setQuizScore1(double newquizScore1)
	{
		quizScore1 = newquizScore1;
	}
	public void setQuizScore2(double newquizScore2)
	{
		quizScore2 = newquizScore2;
	}
	public void setQuizScore3(double newquizScore3)
	{
		quizScore3 = newquizScore3;
	}
	public void setmidtermScore(double newmidtermScore)
	{
		midtermScore = newmidtermScore;
	}
	public void setfinalExamScore(double newfinalExamScore)
	{
		finalExamScore = newfinalExamScore;
	}
	public double getQuizScore1()
	{
		return quizScore1;
	}
	public double getQuizScore2()
	{
		return quizScore2;
	}
	public double getQuizScore3()
	{
		return quizScore3;
	}
	public double getmidtermScore()
	{
		return midtermScore;
	}
	public double getfinalExamScore()
	{
		return finalExamScore;
	}
	public void setoverallNumeric()
	{
		overallNumeric = (((quizScore1+quizScore2+quizScore3)/3)*0.25) + (0.35*midtermScore) + (0.4*finalExamScore);
	}
	public double getoverallNumeric()
	{
		return overallNumeric;
	}
	public void setletterGrade()
	{
		overallNumeric = (((quizScore1+quizScore2+quizScore3)/3)*0.25) + (0.35*midtermScore) + (0.4*finalExamScore);
		if (overallNumeric >= 90)
		{
			letterGrade = "A";
		}
		else if ((overallNumeric >= 80) && (overallNumeric < 90))
		{
			letterGrade = "B";
		}
		else if ((overallNumeric >= 70) && (overallNumeric < 80))
		{
			letterGrade = "C";
		}
		else if ((overallNumeric >= 60) && (overallNumeric < 70))
		{
			letterGrade = "D";
		} 
		else if (overallNumeric < 60)
		{
			letterGrade = "F";
		}
	}
	public String getletterGrade()
	{
		return letterGrade;
	}
	public String toString()
	{
		String s = "Quiz score 1: " + quizScore1 + "\n" + 
				"Quiz score 2: " + quizScore2 + "\n" + 
				"Quiz score 3: " + quizScore3 + "\n" + 
				"Midterm score: " + midtermScore + "\n" + 
				"Final exam score: " + finalExamScore + "\n" + 
				"Overall numeric grade: " + overallNumeric + "\n" + 
				"Letter grade: " + letterGrade;
		return s;
	}
}
