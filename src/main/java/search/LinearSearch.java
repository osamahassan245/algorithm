package search;

public class LinearSearch {

	public static void main(String[] args) {
		
	}
	private boolean linear_search(int arr[], int n, int item)
	   {
	      for(int i=0; i<n-1; i++)  
	       {
	         if(arr[i]==item) return true;
	       }

	    return false;
	   }
}
