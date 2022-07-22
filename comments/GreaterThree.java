class GreaterThree

	{
		public static void main (String args[])
		{
			int n1=5,n2=7,n3=2;
			if((n1>n2) && (n1>n3))
			{
				System.out.println(n1 +" is a large number");
			}
		else if ((n2>n1) && (n2>n3))
			{
				System.out.println(n2+" is the greatest number.");
				
			}
		else
			{
				System.out.println(n3+" is a large number");
			}
		}
	}