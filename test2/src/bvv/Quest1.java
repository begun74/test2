package bvv;

public class Quest1 {
	enum Faculty {
		MMF("1"), FPMI("2") , GEO("3"); 
		String obj;
		Faculty(String o)
		{
			obj=o;
		}
		
		String getName() 
		{
			return	obj;
		}
	}

	static  float ccc = Quest3.coeff;

	{
		System.out.println("{}");
	}
		
	static {
		System.out.println("static {}");
	}

	public Quest1(int i)
	{
		System.out.println("Quest1("+i+")");
		getXXX();
	}
	
	public static final void getXXX()
	{
		System.out.println("getXXX()");
	}

	public void getYYY()
	{
		System.out.println("getYYY()");
	}
	
	public static void main(String[] args)
	{
		Quest1 q1 = new Quest1(2); 
		//Optional<Integer> ob1 = new Optional();
		//ob1.setValue(2);
		Integer arr[] = {1,2,3};
		//ob1.getArgsCount(1,2,3,4,5,6);
		//ob1.printArgCount();
/*		Faculty current = Faculty.MMF;
		switch(current)
		{
			case GEO:
				System.out.println(current);
			break;
			case MMF:
				Faculty fac = Faculty.valueOf("MMF");
				System.out.println(fac+"  "+fac.getName()+"");
			break;
		}
		//System.out.println(current);
		 * 
		 */
	}
}
