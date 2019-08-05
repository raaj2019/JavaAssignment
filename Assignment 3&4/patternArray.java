
public class patternArray {

	public static void main(String[] args) {
		int arr[][] = 	 {{1,2,3},
						 {4,5,6},
						 {7,8,9},
						 {10,11,12}};

	     int i = 0;
		  for (i=0; i<arr.length;) {
			 for (int j = 0; j < arr[i].length;j++) {
				  System.out.print(arr[i][j]+" ");
			  }

			  if (i<arr.length-1) {
				 i++;
			  }else {
				  break;
			  }

			  for (int j = arr[i].length-1 ; j>=0; j--) {
				  System.out.print(arr[i][j]+ " ");
			  }
			  i++;

		  }
		}

	}


