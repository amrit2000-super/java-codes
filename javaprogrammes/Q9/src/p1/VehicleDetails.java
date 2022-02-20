package p1;

public class VehicleDetails {

	public static void main(String[] args) {
		
		MyTwoWheeler obj1=new MyTwoWheeler(0,null,null);
		FourWheeler obj2=new FourWheeler(0);
		//call TwoWheeler
		obj1.getData();
		obj1.putData();
		
		System.out.println();
		//call FourWheeler
		obj2.getData();
		obj2.putData();
	}
}
