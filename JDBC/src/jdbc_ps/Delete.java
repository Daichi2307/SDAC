package jdbc_ps;


public class Delete {
	
    public static void main(String[] args) throws Exception {
        
        Main.GetConnection().createStatement().executeUpdate("DELETE FROM user WHERE id=4");
        
        System.out.println("Deleted successfully...");
        
        Main.GetConnection().close();
    }
}
