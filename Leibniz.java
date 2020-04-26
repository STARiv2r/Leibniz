
public class Leibniz {
	public static void main(String [] args) {
		
		double sum=0;
		double n=1;
		while(true) {
			if((n%2)==1) {
				sum=sum+1/(2*n-1);
			}
			else {
				sum=sum-1/(2*n-1);
				
				
			}
			n=n+1;
			if(n>10000) break;
		}
		double pi=4*sum;
		System.out.println("ans: "+pi);
	}
}
