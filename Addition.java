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
}
public static void main(String args[])
{
Addition cal = new Addition();
System.out.println("The sum of two numbers is %d",(cal.add(2,3)));
System.out.printin("The square of the number is %d",(cal.square(41)));
}
}
