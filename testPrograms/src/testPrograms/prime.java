package testPrograms;


import org.junit.Test;

public class prime {

	@Test
	public void VerifyPrimeNumber()
	{
		int n = 223;
		int Count = 0;
		for(int i=1; i<=n;i++)
		{
			if(n%i == 0)
			{
				Count++;
			}
		}
		if(Count == 2)
		{
			System.out.printf("\n Given number is prime: "+n);
		}
		else
		{
			System.out.printf("\n Given number is not a prime number. " +n);
		}
	}
	@Test
	public void PrimeNumbersInGivenRange()
	{
		int StartNum = 1;
		int EndNum = 10;
		System.out.printf("\nPrime Numbers in the given range are: ");
		for(;StartNum <= EndNum;StartNum++)
		{
			int Count = 0;
			for(int i=1; i<=StartNum;i++)
			{
				if(StartNum % i == 0)
				{
					Count++;
				}
			}
			if(Count == 2)
			{
				System.out.printf("\n%d\t",StartNum);
			}
		}
	}
	@Test
	public void PerfectNumbersInGivenRange()
	{
		int StartNum = 1;
		int EndNum = 100;
		System.out.printf("\nPerfect Numbers in the given range are: ");
		for(;StartNum <= EndNum;StartNum++)
		{
			int SumOfFact = 0;
			for(int i=1; i<StartNum;i++)
			{
				if(StartNum % i == 0)
				{
					SumOfFact = SumOfFact + i;
				}
			}
			if(SumOfFact == StartNum)
			{
				System.out.printf("\n%d\t",StartNum);
			}
		}
	}
	@Test
	public void VerifyArmStrongNumber()
	{
		int n=153;
		int temp = n;
		int SumOfCubes = 0;
		int Rem = 0;
		while(n>0)
		{
			Rem = n%10;
			SumOfCubes = SumOfCubes + Rem*Rem*Rem;
			n = n/10;
		}
		if(temp == SumOfCubes)
		{
			System.out.printf("\n %d is a ArmStrongNumber.",temp);
		}
		else
		{
			System.out.printf("\n %d is not a ArmStrongNumber.",temp);
		}
	}
}
