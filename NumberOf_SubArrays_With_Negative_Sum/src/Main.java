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
												
import java.util.*;

public class Main
{
	static void showArry(int arry[])
	{
		int	i;

		i = -1;
		System.out.print("Array =  {");
		while (++i < arry.length)
			System.out.print(arry[i] + ",");
		System.out.println("}");
	}

	static void showSubArray(int subArrays[][])
	{
		int	i, j;

		i = -1;
		while (++i < subArrays.length)
		{
			j = -1;
			System.out.print("Sub[" + (i + 1) + "] = {" );
			while (++j < subArrays[i].length)
			{
				if (subArrays[i][j] != 0)
					System.out.print(subArrays[i][j] + ",");
			}
			System.out.println("}" );
		}
	}
	static int[][] subArry(int arry[], int size)
	{
		int	subArrays[][];
		int	subSeries, j, lastElmnt, i, subCount, tmpSize;

		tmpSize = size;
		subCount = ((size * (size +1) / 2));
		subArrays = new int[subCount][size];
		subSeries = 0;
		lastElmnt = 0;
		while (subSeries < subCount)
		{
			if (lastElmnt == size)
			{
				tmpSize--;
				lastElmnt = size - tmpSize;
			}
			j = size - tmpSize;
			i = 0;
			while (j <= lastElmnt)
			{
				subArrays[subSeries][i] = arry[j];
				j++;
				i++;
			}
			subSeries++;
			lastElmnt++;
		}
		return(subArrays);
	}

	static int countNegative(int subArray[][])
	{
		int	i, j, sum, countNegative;

		countNegative = 0;
		i = 0;
		while (i < subArray.length)
		{
			j = 0;
			sum = 0;
			while (j < subArray[i].length)
			{
				sum += subArray[i][j];
				j++;
			}
			if (sum < 0)
				countNegative++;
			i++;
		}
		return (countNegative);
	}
	public static void main(String[] args)
	{
		int	size, i;
		int	arry[], subArrays[][];
		Scanner input = new Scanner(System.in);

		System.out.print("Array size: ");
		size = input.nextInt();
		arry = new int[size];
		i = -1;

		System.out.println("Array elements: ");
		while (++i < size)
		{
			System.out.print("[" + (i+1) + "] = ");
			arry[i] = input.nextInt();

		}
		System.out.println("---------------------------------------------------");
		showArry(arry);
		System.out.println("---------------------------------------------------");
		subArrays = subArry(arry, size);
		showSubArray(subArrays);
		System.out.println("---------------------------------------------------");
		System.out.println("Toplamlari negatif olan alt kume sayisi: " + countNegative(subArrays));
		System.out.println("---------------------------------------------------");
		input.close();
	}
}
