package threads;

public class Task1Manager extends Thread{

	private int managerID;
	private Task1RoomBooking book;
	public Task1Manager(int managerID, Task1RoomBooking book) {
		this.managerID = managerID;
		this.book = book;
	}
	
	@Override
	public void run()
	{
		book.bookAndConductMeeting(managerID);
	}
	
	
}
