//quick example of a bubble sort
//uses an array of ints to show the example
/*
 * Note!!
 * Bubble sort is NOT an efficient sort
 * This is only for me to get practice with sorts
 */
public class bubbleSort {
	
	public static void main(String[] args){
		
		int[] sortMe = {3, 5, 4, 2, 1, 6, 7, 9, 8};

		
		for(int j = 0; j < sortMe.length; j++){
			System.out.print(sortMe[j] + " ");
		}
		
		System.out.println();
		
		bubble(sortMe);
		
		for(int k = 0; k < sortMe.length; k++){
			System.out.print(sortMe[k] + " ");
		}
		
	}
	
	public static void bubble(int [] array){
		 int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while (flag){
	            flag= false; //set flag to false awaiting a possible swap
	            for(j=0; j<array.length - 1; j++){
	                   if (array[j] > array[j+1]){
	                           temp = array[j];              
	                           array[j] = array[j+1];
	                           array[j+1] = temp;
	                          flag = true;             
	                  } 
	            } 
	      }
	}
	
}
