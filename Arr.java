
public class Arr {
//	System.out.println("Systax: Datatype ref[]=new Datatype[size]");
public static void main(String[] args) {
	
	int num[]=new int [4];
	num[0]=1;
	num[1]=2;
	num[2]=3;
	num[3]=4;
	System.out.println(num[1]);
	int lengt=num.length;
	System.out.println(lengt);
	int lengend=num.length-1;
	System.out.println(lengend);
	System.out.println("iration based index Value");
	for(int i = 0; i<num.length; i++)
	{
		System.out.println(num[i]);
	}
	System.out.println("enchaned' based on the index");
	for(int x:num)
	{
		System.out.println(x);
	}
	
}}

	
	
	

