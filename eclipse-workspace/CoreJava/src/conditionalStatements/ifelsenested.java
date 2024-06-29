package conditionalStatements;

public class ifelsenested 
{
	public static void main(String[] args)
	{
		int rollNumber[]={ 1,2,3,4,5,6,7};
		int marks[]={89,35,60,25,34,70,45};
		for (int i=0;i<rollNumber.length;i++)
		{
			if(marks[i]>35)
			{
				System.out.println( rollNumber[i] + "secured 2nd class");
			}
			else if(marks[i]>60)
			{
				System.out.println( rollNumber[i] + "secured 1st class");
			}
			else if(marks[i]>85)
			{
				System.out.println( rollNumber[i] + "secured Distinction");
			}
			else if(marks[i]<=35)
			{
				System.out.println( rollNumber[i] + "Failed");
			}
		}
		
		
	}
}

