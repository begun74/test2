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
			//	������������	��������
			System.out.println("������ ����� ������	,id = " +id	);
		} 
		finally
		{
			super.finalize();
		}
	}
}
