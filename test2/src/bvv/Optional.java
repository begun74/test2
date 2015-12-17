package bvv;

import java.lang.reflect.Method;

public class Optional <T extends Number> {
	
	private T value;
	

	public  Optional() 
	{
		
	}

	public Optional(T val) 
	{
		setValue(val);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public int getArgsCount(Integer... arg)
	{
			return arg.length;
	}
	
	@RequestForCustomer(date="11",description="22", level=01)
	public	void	printArgCount() 
	{//1
		try {
		Class c = this.getClass();
		Method m = c.getMethod("printArgCount");
		RequestForCustomer ann = m.getAnnotation(RequestForCustomer.class);

		System.out.println(ann);
		//System.out.println("RequestForCustomer ann : " + ann.level());

		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}	

	public	static	void	printArgCount(Integer... args) 
	{//2
		System.out.println("Integer args: " + args.length);
	}	
	
	public String toString()
	{
		return getValue()+"";
	}
	
}
