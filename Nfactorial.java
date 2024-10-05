// calculating factorial
package recursion;
public class Nfactorial{
	public static int fact(int n){
	//base case 
	if(n==0){
	return 1 ;
	}

	int recAns = fact(n-1);
	int myAns = n*recAns;
	return myAns;
	//recursive call
	// my work /my ans

	}
	public static void main(String [] args){
	int n = 4;
	 int ans =fact(n);
	 System.out.println(ans);
	}
}