package pojo;

class Pojo {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Main {

	public static void main(String[] args) {
		Pojo main = new Pojo();

		main.setId(1);
		System.out.println(main.getId());
		main.setName("sumeet");
		System.out.println(main.getName());
	}

}
