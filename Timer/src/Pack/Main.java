package Pack;

public class Main {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;

	public static void main(String[] args) {
		Main a = new Main();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}

}

class B extends Main {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		System.out.println(b.c);
		System.out.println(b.d);
	}

}

class C {

	public static void main(String[] args) {
		Main a = new Main();
		System.out.println(a.a);
		System.out.println(a.d);
		System.out.println(a.c);
	}

}
