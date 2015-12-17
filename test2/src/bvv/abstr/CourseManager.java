package bvv.abstr;

public class CourseManager extends AbstractManager {
	
	public CourseManager(int id) {
		super(id);
	}

	@Override
	public void assignGroupToCourse(int groupId, String nameCourse) {
		// TODO Auto-generated method stub
		System.out.println("группа	" +		groupId		+ 
				"назначена	на	курс"+ 
				nameCourse);
	}

}
