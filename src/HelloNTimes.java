import java.util.Scanner;

public class HelloNTimes
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = kb.nextInt();
		kb.nextLine();

		System.out.print("Enter a line of text: ");
		String text = kb.nextLine();

		for(int i = 0; i < n; i++)
		{
			System.out.println(text);
		}
	}
}
