
public class Overloadingdemo {
	
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Overloadingdemo ov=new Overloadingdemo();
		System.out.println(ov.add(6,5));
		System.out.println(ov.add(8.98, 10));
		System.out.println(ov.add(8,8,10));

	}

}
