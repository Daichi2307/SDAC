package jdbc_ps;


public class Insert {
	

	public static void main(String[] args) throws Exception {
		
		Main.GetConnection().createStatement().executeUpdate("insert into user values(4,'tom')");
		
		System.out.println("inserted sucessfully...");
		System.out.println("inserted .");
		
		Main.GetConnection().close();
	}

}
