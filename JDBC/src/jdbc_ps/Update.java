package jdbc_ps;

public class Update {
	
public static void main(String[] args) throws Exception {
		
		Main.GetConnection().createStatement().executeUpdate("update user set name='jerry' where id=4");
		
		System.out.println("updated sucessfully...");
		
		Main.GetConnection().close();

}
}
