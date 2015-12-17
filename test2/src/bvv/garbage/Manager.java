package bvv.garbage;

public class Manager {
	
	private	int	id;
	public	Manager(int	value	) {
		id = 	value	;
	}
	
	protected	void	finalize()
	throws	Throwable 
	{
		try	{
			//	освобождение	ресурсов
			System.out.println("объект будет удален	,id = " +id	);
		} 
		finally
		{
			super.finalize();
		}
	}
}
