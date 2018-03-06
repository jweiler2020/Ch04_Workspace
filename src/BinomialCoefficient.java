import java.util.Scanner;

public class BinomialCoefficient
{
	public static int binomialCoeff(int n, int k)
	{
		if(k == 0 || k == n)
			return 1;
		return binomialCoeff(n-1, k-1) + binomialCoeff(n-1, k);
	}

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter a value for n: ");
		int n = kb.nextInt();
		kb.nextLine();

		System.out.print("Enter a value for k: ");
		int k = kb.nextInt();
		kb.nextLine();

		System.out.format("The value of C(n, k) is: %d", binomialCoeff(n, k));
	}
}
