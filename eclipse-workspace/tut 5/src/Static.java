
class Emp
{
	int eid;
	String name;
	static String ceo; //static variable belong to class.
	static {   //this block gets executed only once, that too before constructor is executed.
		ceo="navin";
		System.out.println("loaded in classs loader\n");
	}
}
class Static
{
	int i;
	public Static() {
		i=55; 
	}
	public void printii() 
	{
		System.out.println(i);
	}
	public static void main(String args[]) {
		Static var=new Static();
		var.printii(); 
		Emp naba = new Emp();
		naba.eid=5000;
		naba.name="NABAJYOTI MODAK";
		System.out.println("Name of employee= "+naba.name+"\nid of employee = "+naba.eid+"\nceo = "+Emp.ceo);
}
}