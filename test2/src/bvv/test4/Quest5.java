package bvv.test4;

public class Quest5 extends Q {
	public void	mQ(int i)
	{
		System.out.print("mQuest" + i);
	}
	public void	mP(int i)
	{
		System.out.println("mP" + i);
	}
	
	public static void	main(String[] args){
		Q ob = new Quest5(); //1
		ob.mQ(1); //2
				//ob.mP(1); //3
	}
}
