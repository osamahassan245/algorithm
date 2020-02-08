package mathmetical;
//https://www.geeksforgeeks.org/primality-test-set-1-introduction-and-school-method/
public class Prime {
	public static void main(String[] args) {
		Prime p = new Prime();
		if(p.prime(1000000));
	}
	
	
// akbr rqm gzr 2 
	//https://en.wikipedia.org/wiki/Primality_test
	public boolean prime(int n) {
		int count =0;
        for (int i = 5; i * i <= n; i = i + 6) {
        	System.out.println(count++);

        if (n % i == 0 || n % (i + 2) == 0) {
            	int x;
            	//System.out.println(++count);
              //  return false; 
            }
		}
        return true; 
	}
}
