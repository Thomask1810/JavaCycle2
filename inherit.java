class A
{
	void displayA()
  {
		System.out.println("This is Parent class");
	}
}

class B extends A
{
	void displayB()
  {
			System.out.println("This is Child class");
	}
}
	public class inherit
   {
	public static void main(String[] args)
   {
		A ob1 = new A();
    B ob2 = new B();
		//calling method of parent class by object of parent class
     ob1.displayA();
		//calling method of child class by object of child class
		ob2.displayB();
		//calling method of parent class by object of child class
		ob2.displayA();
		}
}
