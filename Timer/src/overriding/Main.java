package overriding;

class Accountant {

	void inTime(int intime) {
		System.out.println(intime);

	}

	void outTime(int outtime) {
		System.out.println(outtime);
	}
}

class Emp extends Accountant {
	@Override
	void inTime(int intime) {
		System.out.println(intime);

	}

	@Override
	void outTime(int outtime) {
		System.out.println(outtime);
	}

}

public class Main {
	public static void main(String[] args) {

		Emp emp = new Emp();
		emp.inTime(9);
		emp.outTime(10);

	}

}
