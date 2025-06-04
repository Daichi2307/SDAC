package Pack2;

import Pack.Main;

public class D extends Pack.Main {
	public static void main(String[] args) {

		D main = new D();
		System.out.println(main.a);
		System.out.println(main.c);
	}
}

class E {
	public static void main(String[] args) {
		Main a = new Main();
		System.out.println(a.a);
	}
}