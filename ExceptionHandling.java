package expetionHandling;

public class ExceptionHandling {
	
	public static void call(int age) throws Exception
	{
		Thread.sleep(1000);
		int [] a=new int[3];
		 a[0]=10;
		a[1]=0;
		a[2]=20;
		try
		{
		
		//Thread.sleep(3000);
		//a[3]=30; //Out of Range
		int c=a[0]/a[1];//Something by Zero is not possible
		}
		catch(ArithmeticException h)
		{
			System.out.println("Something by Zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Range");
		}
		catch (Exception e)
		{
			System.out.println("exception handled");
		}
		
		if (age>18)
		{
			System.out.println("Congrats");
		}
		System.out.println("hi");
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
				
		int age=18;
		call(age);
		

	}

}
