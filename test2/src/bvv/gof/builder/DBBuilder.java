package bvv.gof.builder;

public class DBBuilder extends BaseBuilder {

	@Override
	public void buildLogin() {
		// TODO Auto-generated method stub
		user.setLogin("DBUser");
	}

	@Override
	public void buildPassword() {
		// TODO Auto-generated method stub
		user.setPassword("DBPass");
	}

}
