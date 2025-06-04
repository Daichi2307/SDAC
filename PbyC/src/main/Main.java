package main;

import operation_implementor.Dev1;
import operation_implementor.Dev2;
import operation_implementor.Dev3;
import operation_implementor.Dev4;

public class Main {
	public static void main(String[] args) {
		
		Dev1 dev1 = new Dev1();
		dev1.insert();
		Dev2 dev2 = new Dev2();
		dev2.update();
		Dev3 dev3 = new Dev3();
		dev3.delete();
		Dev4 dev4 = new Dev4();
		dev4.show();
	}

}
