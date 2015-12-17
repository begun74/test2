package bvv.gof.singlton;

public final class Singleton {

	private	static	Singleton instance = null;
	private static long time = System.currentTimeMillis(); 
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
			System.out.println("Create Singleton. "+time);
		}
		
		return instance;
	}
}
