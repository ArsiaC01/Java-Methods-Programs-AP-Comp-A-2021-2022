package chapter08.kevinbook;

// Code written as part of the Java-Methods-Program-AP-Comp-A-2021-2022 repository on GitHub.
public class KevinBook {

	public static void main(String[] args)
	{
		int numMonths = CalcTimeToRead();
		System.out.println("It took Kevin " + (numMonths / 12) + " years and " + (numMonths % 12) + " months to get ready for the exam.");
	}
	
	public static int CalcTimeToRead()
	{
		double materialUnknown = 100, newContentLearned = 0;
		int months = 0;
		while(materialUnknown > 5)
		{
			newContentLearned = materialUnknown * 0.1;
			materialUnknown = materialUnknown - (newContentLearned);
			months++;
		}
		return months;
	}

}