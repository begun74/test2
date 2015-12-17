package bvv.abstr;

public abstract class AbstractManager {
	private int	id;
	
	public	AbstractManager(int	id) {
	// 	конструктор
	this.id = id;
	}
	// 	абстрактный	метод
	public abstract void	assignGroupToCourse(int	groupId, String nameCourse);
}
