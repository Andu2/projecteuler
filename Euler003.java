public class Euler003{
	public static void main(String[] args){
		//I'm used to languages that let you define the bounds of an array on the fly...
		long[] primes = new long[1000];
		int latestPrime = 0;
		primes[0] = 2;
		long[] factors = new long[100];
		int nextFactor = 0;
		long numToCheck = 600851475143L;
		long simplifiedNum = numToCheck;
		long i = 2;
		while(i*primes[latestPrime]<simplifiedNum){
			//System.out.println("checking " + i);
			//check if i is prime
			boolean isPrime = true;
			for(int j = 0; j <= latestPrime; j++){
				if(i!=primes[latestPrime]&&i%primes[j]==0){
					isPrime = false;
				}
			}
			if(isPrime){
				//Add to list if it's not the same prime as before
				if(i!=primes[latestPrime]){
					latestPrime++;
					primes[latestPrime]=i;
				}

				//Check if it's a factor
				if(simplifiedNum % i == 0){
					simplifiedNum /= i;
					factors[nextFactor]=i;
					nextFactor++;
					System.out.println(i + " is a factor");
				}
				else{
					//System.out.println(i + " is prime, but not a factor");
					i++;
				}
			}
			else{
				//System.out.println(i + " is not prime");
				i++;
			}
		}
		System.out.println("Remanining: " + simplifiedNum);
	}
}