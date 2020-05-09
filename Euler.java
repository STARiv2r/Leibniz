public class Euler {
	public static void main(String args[]) {
		double sum=0;
		for(int i=1;i<10000; i++) {
			sum= sum+(double)1/(i*i);
		}
		double pi2=6*sum;
		double pi=Math.sqrt(pi2);
		System.out.println("pi:"+pi);
	}
}
