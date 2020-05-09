public class John {
	public static void main(String args[]) {
		double mult=1;
		for(int i=1;i<10000; i++) {
			mult= mult*(1-(double)1/(4*i*i));
		}
		double pi=2/mult;
		System.out.println("pi:"+pi);
	}
}

