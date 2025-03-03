package threads;

public class Task1RoomBooking {
	private boolean Available=true;
	public synchronized void bookAndConductMeeting(int managerID)
	{
		if(Available)
		{
			Available=false;
			System.out.println(managerID+" has booked the room for meeting");
			try {
				Thread.sleep(2000);
				System.out.println("manager "+managerID+" has finished the meeting");
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
			Available=true;
		}
		else {
			System.out.println("Conference room is currently unavalable "+managerID+" couldn't book the room for meeting");
		}
	}

}
