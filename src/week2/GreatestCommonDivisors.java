package week2;

public class GreatestCommonDivisors {
	
	static long naiveGCD(long a, long b) {
		
		if(b==0) {
			return a;
		}
		
		if(a==b) {
			return a;
		}
		
		long gcd=0;
		for(long i=1;i<=a+b;i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	static long euclideanGCD(long a, long b) //gcd(a,b) = gcd(a',b) = gcd(b,a') a' = a mod b
	{
		if(b==0) {
			return a;
		}
		long remainder = a % b;
		return euclideanGCD(b, remainder);
	}

	public static void main(String[] args) {
		System.out.println(euclideanGCD(357, 234));
		System.out.println(naiveGCD(357, 234));
		System.out.println(euclideanGCD(58244411200L, 48459594896L));
		System.out.println(naiveGCD(58244411200L, 48459594896L));
	}

}
