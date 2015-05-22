public class APStringExercises
	{

	public static void main(String[] args)
		{
		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

		for (int i = 0; i <=alphabet.length(); i = i + 2)
			{
				System.out.print(alphabet.charAt(i));

			}
		for(int x = 0; x<=alphabet.length(); x=x+4)
			{
				System.out.print(alphabet.charAt(x));
				System.out.print(" ");
			}
		
		for(int y = 2; y<=alphabet.length(); y=y+4)
			{
				 System.out.print(alphabet.charAt(y));
			}
		
		for(int m = 0; m<=alphabet.length(); m=m+2)
			{
				System.out.println(alphabet.charAt(m));
			}
		
		System.out.println("The number of characters is "+alphabet.length());
		
		int total = 0;
		for(int d = 1; d<=alphabet.length(); d=d+2)
			{
				total=total+1;
				
			}
		System.out.println("The number of spaces is "+total);

		}

	}
