package testPrograms;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class reverse {

	@Test
	public void BNumberParllendrome() 
	{
		int n = 212;
		int temp = n;
		int Sum = 0;
		int Rem;
		while( n>0 )
		{
			Rem = n%10;
			Sum = (Sum + Rem)*10;
			n = n/10;
		}
		if(Sum/10 == temp)
		{
			System.out.println("Given number is Parallendrome");
		}
		else
		{
			System.out.println("Given number is not Parallendrome");
		}
		
	}
	@Test
	public void AStringParllendrome()
	{
		String strValue = "temper";
		String reverse = "";
		for(int i=strValue.length()-1;i>=0;i--)
		{
			reverse = reverse + strValue.charAt(i);
		}
		if(strValue.equals(reverse))
		{
			System.out.println("Given string is parallendrome");
		}
		else
		{
			System.out.println("Given string is not parallendrome");
		}
		String [] arrstr = strValue.split("");
		String strRev="";
		for(int i = arrstr.length-1;i>=0;i--)
		{
			strRev = strRev + arrstr[i];
		}
		System.out.println("Reverse string is: "+strRev);
	}

}
