package threads;

public class Task1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1RoomBooking b=new Task1RoomBooking();
		Task1Manager m1=new Task1Manager(1,b);
		Task1Manager m2=new Task1Manager(2,b);
		m1.start();
		m2.start();
	}

}
