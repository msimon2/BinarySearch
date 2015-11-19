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
		Scanner userInput = new Scanner (System.in);
		int counter = 0;
		int left = 0;
		int right = elements.length-1;
		while (left <= right)
			{
			int middle = (left + right)/2;
			if (target < elements[middle])
				{
				right = middle -1;
				}
			System.out.println("What is the right?");
			int userRight = userInput.nextInt();
			if (right == userRight)
				{
				counter++;
				}
			if (target > elements[middle])
				{
				left = middle + 1;
				}
			System.out.println("What is the left?");
			int userLeft = userInput.nextInt();
			if (left == userLeft)
				{
				counter++;
				}
			System.out.println("What is the middle?");
			int userMiddle = userInput.nextInt();
			if (middle == userMiddle)
				{
				counter++;
				}
			System.out.println("You got: " + counter + " correct.");
			if (target == elements[middle])
				{
				return middle;
				}
			}
		return -1;
		}
	}
