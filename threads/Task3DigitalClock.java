package threads;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Task3DigitalClock {

	public static void main(String[] args) {
		
		Thread clockThread= new Thread()
	{
			@Override
			public void run()
			{
				while(true)
				{
					SimpleDateFormat sdf= new SimpleDateFormat("HH:mm:ss");
					String currtime=sdf.format(new Date());
					System.out.println(currtime+"\r");
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
				
	};
	
	clockThread.start();

}
}
