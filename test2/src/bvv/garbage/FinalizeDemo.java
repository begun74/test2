package bvv.garbage;

public class FinalizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager d1 = new Manager(1);
		d1 = null;
		Manager d2 = new Manager(2);
		//Object d3 = d2;		//1
		Object d3 = new Manager (3);		//2
		d2 = d1;
		//d2 =null;
		System.gc();
		// просьба выполнить "сборку мусора"
	}

}
