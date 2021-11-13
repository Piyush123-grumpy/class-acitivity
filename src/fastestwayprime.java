
public class fastestwayprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime[]=primes(20);
		for(int i=1;i<=20;i++) {
			System.out.println(i+" "+isPrime[i]);
		}
	}
	static boolean[] primes(int n) {
		boolean isPrime[]=new boolean[n+1];
		for (int i=0; i<=n;i++) {
			isPrime[i]=true;
		}
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i<=n;i++) {
			if(isPrime[i]==true) {
				for(int j=2;i*j<=n;j++)
					isPrime[i*j]=false;
			}
		}
		return isPrime;
		
	}

}
