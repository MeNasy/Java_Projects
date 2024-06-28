/*
 ███▄ ▄███▓▓█████  ███▄    █  ▄▄▄        ██████▓██   ██▓
▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒████▄    ▒██    ▒ ▒██  ██▒
▓██    ▓██░▒███   ▓██  ▀█ ██▒▒██  ▀█▄  ░ ▓██▄    ▒██ ██░
▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒░██▄▄▄▄██   ▒   ██▒ ░ ▐██▓░
▒██▒   ░██▒░▒████▒▒██░   ▓██░ ▓█   ▓██▒▒██████▒▒ ░ ██▒▓░
░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒  ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░  ██▒▒▒
░  ░      ░ ░ ░  ░░ ░░   ░ ▒░  ▒   ▒▒ ░░ ░▒  ░ ░▓██ ░▒░
░      ░      ░      ░   ░ ░   ░   ▒   ░  ░  ░  ▒ ▒ ░░
       ░      ░  ░         ░       ░  ░      ░  ░ ░
                                                ░ ░*/

import java.util.Scanner;

public class Main
{
	static	void	mn_takeNum(int [] nums, Scanner input)
	{
		System.out.print("1.Sayi: ");
		nums[0] = input.nextInt();
		System.out.print("2.Sayi: ");
		nums[1] = input.nextInt();
	}
	static	void mn_sum(Scanner input)
	{
		int[] nums = new int[2];
		int	result;

		mn_takeNum(nums, input);
		result = nums[0] + nums[1];
		System.out.println("\nSonuc: " + nums[0] + " + " + nums[1] + " = " + result + "\n");
	}
	static	void mn_minus(Scanner input)
	{
		int[] nums = new int[2];
		int	result;

		mn_takeNum(nums, input);
		result = nums[0] - nums[1];
		System.out.println("\nSonuc: " + nums[0] + " - " + nums[1] + " = " + result + "\n");
	}

	static	void mn_multiplication(Scanner input)
	{
		int[] nums = new int[2];
		int	result;

		mn_takeNum(nums, input);
		result = nums[0] * nums[1];
		System.out.println("\nSonuc: " + nums[0] + " x " + nums[1] + " = " + result + "\n");
	}

	static	void mn_division(Scanner input)
	{
		int[] nums = new int[2];
		double	result;

		do
		{
			mn_takeNum(nums, input);
			if (nums[1] == 0)
				System.err.println("Sayilar 0 'a bolunemez !");
		} while (nums[1] == 0);
		result = (double) nums[0] / nums[1];
		System.out.println("\nSonuc: " + nums[0] + " bolu " + nums[1] + " = " + result + "\n");
	}

	static void mn_power(Scanner input)
	{
		int	base, pow, tmPow;
		boolean	checkPow = false;
		double result, tmpBase;

		result = 1;
		do
		{
			System.out.print("Taban degeri: ");
			base = input.nextInt();
			System.out.print("Us degeri: ");
			pow = input.nextInt();
			if ((base == 0 && pow == 0))
				System.err.println("Tanimsiz degerler girdiniz !");

		} while (base == 0 && pow == 0);
		if (pow < 0)
			checkPow = true;
		else if (pow == 0)
			result = 1;
		if (pow != 0)
		{
			tmpBase = base;
			if (checkPow)
				tmPow = -pow;
			else
				tmPow = pow;
			while (--tmPow > 0)
				tmpBase *= base;
			if (checkPow)
				result = ((double)1 / tmpBase);
			else
				result = tmpBase;
		}
		System.out.println("\nSonuc: " + base + " ussu " + pow + " = " + result + "\n");
	}

	static void mn_fact(Scanner input)
	{
		int	num, result = 1, tmpNum;

		do
		{
			System.out.print("Sayi: ");
			num = input.nextInt();
			if (num < 0)
				System.err.println("Negatif sayilarin faktoriyeli alinamaz !");

		} while (num < 0);
		if (num == 0)
			result = 1;
		else
		{
			tmpNum = num + 1;
			while (--tmpNum > 1)
				result *= tmpNum;
		}
		System.out.println("\nSonuc: " + num + "! = " + result + "\n");
	}

	static void mn_mod(Scanner input)
	{
		int[] nums = new int[2];
		double	result;

		do
		{
			mn_takeNum(nums, input);
			if (nums[1] == 0)
				System.err.println("Sayilar 0 'a bolunemez !");
		} while (nums[1] == 0);
		result = (double) nums[0] % nums[1];
		System.out.println("\nSonuc: " + nums[0] + " mod " + nums[1] + " = " + result + "\n");
	}

	static void mn_rectangularProc(Scanner input)
	{
		int	shrtEdge, lngeEdge, perim, area;
		do
		{
			System.out.print("Uzun kenar: ");
			lngeEdge = input.nextInt();
			System.out.print("Kisa kenar: ");
			shrtEdge= input.nextInt();
			if (lngeEdge <= 0 || shrtEdge <= 0)
				System.err.println("Geçersiz bir değer girdiniz !");

		} while (lngeEdge <= 0 || shrtEdge <= 0);
		perim = ((2 * shrtEdge) + (2 * lngeEdge));
		area = shrtEdge *lngeEdge;
		System.out.println("\nCevre = " + perim + "\n");
		System.out.println("\nAlan = " + area + "\n");
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String	menu;
		int	select;

		menu ="***************************************\n"
			+ "1- Toplama İşlemi                     *\n"
			+ "2- Çikarma İşlemi                     *\n"
			+ "3- Çarpma İşlemi                      *\n"
			+ "4- Bölme işlemi                       *\n"
			+ "5- Üslü Sayi Hesaplama                *\n"
			+ "6- Faktoriyel Hesaplama               *\n"
			+ "7- Mod Alma                           *\n"
			+ "8- Dikdörtgen Alan ve Çevre Hesabi    *\n"
			+ "0- Cikis Yap                          *\n"
			+ "***************************************";

		do
		{
			System.out.println(menu);
			System.out.print("Yapacağiniz işlemi secin lutfen: ");
			select = input.nextInt();
			switch (select)
			{
				case 1:
					mn_sum(input);
					break;
				case 2:
					mn_minus(input);
					break;
				case 3:
					mn_multiplication(input);
					break;
				case 4:
					mn_division(input);
					break;
				case 5:
					mn_power(input);
					break;
				case 6:
					mn_fact(input);
					break;
				case 7:
					mn_mod(input);
					break;
				case 8:
					mn_rectangularProc(input);
					break;
				case 0:
					System.out.println("\nProgramdan cikis yapildi !");
					break;
				default:
					System.err.println("\nYanlis bir tuslama yaptiniz !\n");
					break;
			}
		} while(select != 0);
		input.close();
	}
}
