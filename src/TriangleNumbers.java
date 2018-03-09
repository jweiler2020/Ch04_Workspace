import java.util.Scanner;

public class TriangleNumbers
{
	public static int triangleNum(int n)
	{
		if(n == 1)
			return 1;
		return n + triangleNum(n-1);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a number to find the nth triangle number of: ");
		int n = kb.nextInt();
		kb.nextLine();

		System.out.format("Triangle number %d is %d", n, triangleNum(n));
	}
}
