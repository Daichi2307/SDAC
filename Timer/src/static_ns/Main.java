package static_ns;

class A {

	int a = 10;
	double b = 20;

	static float c = 30;
	static String d = "Sumeet";

	static void meth() {
		System.out.println("static");

	}

	void meth2() {
		System.out.println("Non static");
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(A.c);
		System.out.println(A.d);
		A.meth();
		a.meth2();

	}

}
