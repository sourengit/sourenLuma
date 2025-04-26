package datatypes;

public class Multi_Array {
	
	public static void main(String[] args) {
		Multi_Array md=new Multi_Array();
		md.litMulti();
	
	}
	
	//exec
	//i=0,
	
	
	
	
	public void litMulti()
	{					//0,0 0,1 0,2-- 1,0 1,1 1,2--- 2,0 2,1 2,2
		
		
		
		int[][] mulLit= {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println("length or array: "+mulLit.length);
						//1st exec i=0 --->  0<3--->i=1
						//2n exec i=1---- 1<3-->i=2
						
		for(int i=0; i<mulLit.length;i++)			//1st for loop
		{
			//1st exec i=0 j=0-----> 0<3---->j=1
			//2nd exec i=0 j=1---> 1<3----->j=2
			//3rd exec i=0 j=2 --->2<3--->j=3
			//fail
			//************************
			// 1se exec i=1 j=0 --->0<3---->j=1
			// 2nd exec i=1 j=1 --->1<3---->j=2
			//3rd exec i=1 j=2 ---->2<3----->j=3
			// fail
			
			
			for(int j=0; j<mulLit.length;j++)		//2nd for loop
			{
							//1st exec milit[0][0]
							//2nd exec milit[0][1]
							//3rd exec miltilit[0][2]
							//******************
							//1st exec mmiltilit[1][0]
							//2nd exec miltilit[1][1]
							//2nd exec miltilit[1][2]

								
				
					System.out.print(mulLit[i][j]+"  ");
			}
			System.out.println();
		}
	}
}


