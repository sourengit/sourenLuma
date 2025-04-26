package datatypes;
//class of 11th feb 25 - forEach using multi dimensional array by for loop
// for each only supports single dimensional array here we are splitting the multi dimensional array to single dimesnuinal array
public class ForEachUsingMultiDimArray {
	
	public static void main(String[] args) {
	
		ForEachUsingMultiDimArray MulAry=new ForEachUsingMultiDimArray();
		
		MulAry.LitArray_MultiDimentional();
		
	}
	
	public void LitArray_MultiDimentional()
	{
		int[][] multi_Lit= {{11,12},{13,14}};
		
		for(int[] singleArray:multi_Lit)
		
		{
			for(int eachValue:singleArray)
			{
				System.out.print(eachValue+" ");
			}
			System.out.println();
		}
	}
}
