public class Ramanujan {
	public static void main(String[] args) {
		double target=0;
		for(int i=0;i<10;i++) {
			target=target+fact(4*i)*(1103+26390*i)/(fact(i)*Math.pow(396.0, (double)4*i));
		}
		double target2=Math.pow(2.0, 1.5)/9801 * target;
		double pi=1/target2;
	
		System.out.println("pi:"+pi);
	
		
	}
	public static int fact(int i) {
		if(i==0) return 1;
		if(i>1) {
			i=i*fact(i-1);
		}
		return i;
	}

}