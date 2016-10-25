package sorting;

public class Sorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[]={10,43,32,23,13,4,34,45,22,3};
		Sorting obj=new Sorting();
		obj.insertionSort(a);
		obj.printArray(a);
	}

	private void insertionSort(int[] a) 
	{
		// TODO Auto-generated method stub
		int n=a.length,valueToBeInserted,j;
		for(int i=1;i<n;i++)
		{
			valueToBeInserted=a[i];
			j=i;
			while(j>0 && (a[j-1]>valueToBeInserted))
			{
				a[j]=a[j-1];
				j--;
			}
			a[j]=valueToBeInserted;
		}
	}
	
	private  void printArray(int[] a) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+", ");
		}
	}

}
