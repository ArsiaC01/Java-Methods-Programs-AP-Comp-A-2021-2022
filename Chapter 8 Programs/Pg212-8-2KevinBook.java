// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.
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
// Code written by Ethan K as part of the Tenzca-AP-Computer-A-Java-Methods-Program repository on GitHub.