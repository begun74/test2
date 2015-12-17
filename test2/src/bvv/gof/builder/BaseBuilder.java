package bvv.gof.builder;

public abstract class BaseBuilder {
	protected User user = new User();

	public User getUser() {
		//System.out.println("BaseBuilder.getUser()");
		return user;
	}

	public abstract void buildLogin();
	public abstract void buildPassword();
	

}
