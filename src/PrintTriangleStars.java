import java.util.Scanner;

public class PrintTriangleStars
{
	public static void printStars(int n)
	{
		if (n <= 0)
			return;
		System.out.print("*");
		printStars(n-1);
	}

	// Part B
	public static void printTriangle(int n)
	{
		printTriangleRecursive(n, n-1);
	}

	private static void printTriangleRecursive(int n, int sub)
	{
		if(sub < 0)
			return;
		printStars(n - sub);
		System.out.println();
		printTriangleRecursive(n, sub-1);
	}

	// Part C
	public static void printTriangleInverse(int n)
	{
		if(n < 0)
			return;
		printStars(n);
		System.out.println();
		printTriangleInverse(n-1);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the amount of rows in the triangle: ");
		int rows = kb.nextInt();
		kb.nextLine();

		System.out.println("Would you like it to be inverted?(y/n) ");
		boolean invert = kb.next().charAt(0) == 'y';

		System.out.println("Here you go:");
		if(invert)
			printTriangleInverse(rows);
		else
			printTriangle(rows);
	}
}
