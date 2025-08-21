package StaticKeyword;

public class ThisMethod  
{
	int addition() 
	{
	int a = 82;
	int b = 66;
	int sum = a+b;
	return sum;
	}
	void average()
	{
		int avg = this.addition()/2;
		System.out.println("Average of 2 nos is:"+avg);
	}

	public static void main(String[] args) 
	{
		ThisMethod obj = new ThisMethod();
		obj.average();
	}

}
