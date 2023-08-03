package Intro;

public class Corejava1 {
	
	public static void main(String[] args) {
	
	int num=5; //primitive data type
	String website ="https://rahulshettyacademy.com/"; // non-premitive datatype
	char letter='a';
	double dec=5.6;
	boolean a=true;
	
	
	System.out.println("website-");
	System.out.println(website);
	
	//array
	int [] arr=new int[4];
	arr[0]=1;
	arr[1]=12;
	arr[2]=13;
	arr[3]=14;
	
	int[] arr2= {1,12,13,14,5,8,6,2,32,7,53,99};
	System.out.println(arr2[3]);
	
	//for loop
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	for(int i=0;i<arr2.length;i++)
	{
		System.out.println(arr2[i]);
	}
	
	String[] name= {"ram","sham","vijay"};
	for(int i=0;i<name.length;i++)
	{
		System.out.println(name[i]);
	}
	
	for(String s:name) //enhanced for loop
	{
		System.out.println(s);
	}
	// print even no from array using if else
	for(int i=0;i<arr2.length;i++)
	{
		if(arr2[i]%2==0)
		{
			System.out.println("Even number for array-"+arr2[i]);
			//break; //used to short the code, used when goal is achieved at first then it will exit loop
		}
		else
		{
			System.out.println("is not even number from aray"+arr2[i]);
		}
		
	}
}
}