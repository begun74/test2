package bvv.grasp.creator;

import java.util.Vector;

public class LineRequestQuest {
	private	int	questID	;
	
	public	void answerQuest() {
		Vector<Quest> q = new	Vector<Quest>();
		q.add(makeRequest());
	}
	
	public	Quest makeRequest() {
		// 	реализация
		return	new	Quest();
	}
}
