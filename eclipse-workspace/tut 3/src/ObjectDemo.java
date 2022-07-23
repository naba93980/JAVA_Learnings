class Cal
{
	 int x=5;
	 int y;  //by default if value not set then compiler assign 0 to integer unlike in c++ where garbage value is set;
	 void print()
	 {
	 System.out.println(y);
	 }
}
public class ObjectDemo
{
	public static void main(String args[])
	{
		Cal obj; //obj is not object of class Cal but reference to an object 
		obj=new Cal(); //new cal() allocates memory to create new object.....
						//obj then gets reference to that 'new'ly created object.
		obj.x=10;
		System.out.println(obj.x);
		obj.print();
		
	}
}