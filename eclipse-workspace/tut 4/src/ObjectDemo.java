

class Calc   //
{
	int num1,num2,res;
    Calc(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public int calculate()
	{
		return num1+num2;
	}
}


public class ObjectDemo 
{
	public static void main(String args[]) {
		Calc obj;
		obj=new Calc(5, 10);		//constructor
		System.out.println(obj.calculate());
		
	}
}