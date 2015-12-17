package bvv.abstr;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractManager mng =	new	CourseManager(10);
		mng.assignGroupToCourse(10, "Алгебра");
		
	}

}
