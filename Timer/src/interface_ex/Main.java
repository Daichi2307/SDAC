package interface_ex;

interface Policy{
	
	public static final int a = 10;
	
	public abstract void inTime(int intime);
	
	public abstract void outTime(int outtime);
	
	public abstract void getLeaves(int leaves);
	
}

class Accountact implements Policy{

	@Override
	public void inTime(int intime) {
		System.out.println("In Time for Accountact" + intime);
		
	}

	@Override
	public void outTime(int outtime) {
		System.out.println("Out Time for Accountact" + outtime);
		
	}

	@Override
	public void getLeaves(int leaves) {
		System.out.println("Leaves for Accountact" + leaves);
		
	}
	
}

class Emp implements Policy{

	@Override
	public void inTime(int intime) {
		System.out.println("In Time for Employee" + intime);
		
	}

	@Override
	public void outTime(int outtime) {
		System.out.println("Out Time for Employee" + outtime);
		
	}

	@Override
	public void getLeaves(int leaves) {
		System.out.println("Leaves for Employee" + leaves);
		
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.inTime(9);
		emp.outTime(9);
		emp.getLeaves(2);
		System.out.println(Emp.a);
	}

}
