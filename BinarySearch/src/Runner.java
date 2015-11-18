import java.util.*;

public class Runner
	{
	public static void main(String[] args)
		{
		int array[] = new int[12];
		for (int i = 0 ; i < 12; i++)
			{
			array[i] = (int)(Math.random()*13);
			}
		Arrays.sort(array);
		for (int i = 0 ; i < 12; i++)
			{
			System.out.print(array[i] + " ");
			}
		System.out.println();
		int arrayTarg = array[(int)(Math.random()*13)];
		System.out.println(arrayTarg + " is target ");
		binarySearch(array, arrayTarg);
		}
	public static int binarySearch(int[] elements, int target)
		{
		int left = 0;
		int right = elements.length-1;
		while (left <= right)
			{
			int middle = (left + right)/2;
			if (target < elements[middle])
				{
				right = middle -1;
				//System.out.println(right);
				}
			else if (target > elements[middle])
				{
				left = middle + 1;
				//System.out.println(left);
				}
			else
				{
				return middle;
				}
			}
		return -1;
		}
	}
