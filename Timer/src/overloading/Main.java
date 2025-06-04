package overloading;

class Emp {

	void calsal(double sal) {
		System.out.println(sal);
	}

	void calsal(double sal, double bonus) {
		System.out.println(sal + bonus);
	}

	void calsal(double sal, double bonus, double tax) {
		System.out.println(sal + bonus - tax);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.calsal(50000);
		emp.calsal(50000, 2000);
		emp.calsal(3000000, 3000, 10000);

	}

}
