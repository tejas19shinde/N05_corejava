package tnsif.org.statickeyword;

public class Tiger {
	void eat()
	{
		System.out.println("eating : child");
		
	}
	static void run()
	{
		//we cannot override static method
		//super.run();
		System.out.println("running : child");
	}
}
