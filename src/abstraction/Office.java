package abstraction;

public class Office extends Customer{
	
	public static void main(String[] args)
	{
		Office of=new Office();
		of.name();
		of.Age();
		of.Gender();
		of.BookingServer();
		of.BookingAgent();
	}

	@Override
	public void BookingServer() {
		System.out.println("Morzilla Server");
	}

	@Override
	public void BookingAgent() {
		System.out.println("DAN");		
	}

}
