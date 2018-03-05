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

	public static void printTriangle(int n)
	{

	}

	public static void main(String[] args)
	{
		printTriangle(5);
	}
}
