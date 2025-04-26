package abstraction;

public class Child implements Parent,Parent2 {
	
	public static void main(String[] args) {
		Child ch=new Child();
		ch.mark1();
		ch.mark2();
		ch.mark3();
		ch.mark4();
		ch.mark5();
		ch.total();
		
	}
	int m1=79;
	int m2=70;
	int m3=84;
	int m4=83;
	int m5=88;

	@Override
	public void mark1() {
		
		System.out.println(m1);
	}

	@Override
	public void mark2() {
		System.out.println(m2);		
	}

	@Override
	public void mark3() {
		System.out.println(m3);		
	}

	@Override
	public void mark4() {
		System.out.println(m4);		
	}

	@Override
	public void mark5() {
		System.out.println(m5);		
	}

	@Override
	public void total() {
		int total=m1+m2+m3+m4+m5;
		System.out.println("Total Marks: "+total); 
	}

}
