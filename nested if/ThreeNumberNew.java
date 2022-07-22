class ThreeNumberNew

	{
		public static void main (String args [])
		{	
			int n1=4,n2=5,n3=-9,sum;
			sum=n1+n2+n3;
			if(sum>0)
			{
				if (sum%2==0)
				{
					System.out.println("sum is a positive number and even number");
				}
				else
				{
					System.out.println(" sum is a positive number and odd number");
				}
				else
				{
					System.out.println(" sum is a negative number or sum is zero");
				}

			}
		}
	}