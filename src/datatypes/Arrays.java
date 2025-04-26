package datatypes;

public class Arrays {

	public static void main(String[]args)
	{
		
		Arrays ary=new Arrays();
		//ary.lit_Array();
		Arrays nlary=new Arrays();
		nlary.nl_Array();
		
		
	}
	
	
	public void lit_Array() {
		
		
		int[] lit= {10,20,30,40}; //literal array
		
		int aryLen=lit.length;
		System.out.println("literal array:");
		for(int i=0;i<aryLen;i++)
		{
			System.out.println(lit[i]);
		}
	}
	
	public void nl_Array() {
		int[] nl_ary= new int[5];
		nl_ary[0]=85;
		nl_ary[1]=200;
		nl_ary[2]=45;
		nl_ary[3]=400;
		nl_ary[4]=500;
		System.out.println("non literal array length: "+nl_ary.length);
		for(int i=0;i<nl_ary.length;i++)
		{
			System.out.println(nl_ary[i]);
		}
		System.out.println("getting output via enhanced for loop:");
		for(int eachValue:nl_ary){
			System.out.println(eachValue);
			
		}
	}
	
}
