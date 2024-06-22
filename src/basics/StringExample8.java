package basics;

//find duplicate characters from the given String
public class StringExample8 
{
	int m1(String str, char ch) 
	{
		int count = 0;
		for (int num = 0; num < str.length(); num++) 
		{
			char cha = str.charAt(num);
			if (cha == ch)
			{
				count++;
			}
		}
		return count;
	}

	void displayCount() 
	{
		String input = "aakanksha";
		for (int n = 0; n < input.length(); n++) 
		{
			char character = input.charAt(n);
			int count1 = m1(input, character);
			if (count1 > 1 && n==input.indexOf(character)) 
			{
				System.out.println(character);
			}
		}
	}

	public static void main(String[] args) {
		StringExample8 stringExample8 = new StringExample8();
		stringExample8.displayCount();
	}
}
