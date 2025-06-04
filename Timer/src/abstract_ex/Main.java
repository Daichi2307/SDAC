package abstract_ex;

abstract class Policy {

	abstract void inTime(int intime);

	abstract void outTime(int outtime);

	abstract void getLeaves(int leaves);
}

class Accountant extends Policy {

	@Override
	void inTime(int intime) {
		System.out.println(intime);

	}

	@Override
	void outTime(int outtime) {
		System.out.println(outtime);

	}

	@Override
	void getLeaves(int leaves) {
		System.out.println(leaves);

	}

}


class Emp extends Policy {

	@Override
	void inTime(int intime) {
		System.out.println(intime);

	}

	@Override
	void outTime(int outtime) {
		System.out.println(outtime);

	}

	@Override
	void getLeaves(int leaves) {
		System.out.println(leaves);

	}

}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.inTime(10);
		emp.outTime(9);
		emp.getLeaves(5);

	}

}
