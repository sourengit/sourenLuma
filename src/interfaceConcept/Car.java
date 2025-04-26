package interfaceConcept;

public class Car implements Vehicle{
	
	public static void main(String[] args) {
		Vehicle byd= new Car();
		byd.start();
		byd.stop();
		byd.type();	
		
	}
	
	

	public void start() {
		System.out.println("starting...");		
	}

	
	public void stop() {
		System.out.println("stopping..");		
		
	}

	public void type() {
		System.out.println("byd");		
		
	}
	

}
