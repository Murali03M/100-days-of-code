package com.sorting;

public class Bubblesort {
	
	public static void bubble_sort(int[] array)
	{
		int n=array.length;
		int i,k;
		for(int m=n;m>0;m--)
		{
		for( i=0;i<n-1;i++)
		{
			 k=i+1;
			if(array[k]<array[i])
			{
				swapnumber(i,k,array);
			}
		}
		}
		printnumber(array);
	}
	
	public static void swapnumber(int i,int j,int[] array)
	{
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
 
	public static void printnumber(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"  ");
		}
	}
	public static void main(String[] args)
	{
		int array[]= {34,23,54,634,34,6,65,2,34,65};
		bubble_sort(array);
	}
}
