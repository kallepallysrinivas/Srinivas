public class Addition
{
public int add(int a,int b)
{
int c=a+b;
return c;
}
public int square(int x)
{
	int z=x*x;
	return z;
}
public static void main(String args[])
{
Addition cal = new Addition();
System.out.println(cal.add(2,3));
System.out.println(cal.square(41));
}
}
