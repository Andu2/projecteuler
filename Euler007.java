public class Euler007{
	public static void main(String[] args){
		//Taking code from Euler003
		int primeToFind = 6;
		int[] primes = new int[primeToFind + 1];
		primes[0] = 2;
		int latestPrime = 0;//The index of the most recently found prime
		int numToCheck = 3;
		while(latestPrime+1<primeToFind){
			boolean isPrime = true;
			for(int i = 0; i <= latestPrime; i++){
				if(numToCheck%primes[i]==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				latestPrime++;
				primes[latestPrime]=numToCheck;
				System.out.println(numToCheck);
			}
			numToCheck++;
		}
	}
}