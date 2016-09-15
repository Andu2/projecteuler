public class Euler005{
	public static void main(String[] args){
		//The answer will be the product of the individual prime factors each to the maximum power they occur
		//(For instance, 16 is 2^4, so multiply by 2^4 instead of just 2)
		//Instead of brute-forcing, I'm gonna try a more mathematical approach this time
		int maxNum = 20;
		int finalProduct = 1;
		int[] primeFactors = new int[20];//I need to learn how to use ArrayLists...
		int latestPrime = 0;
		primeFactors[0] = 2;

		//First, find the primes
		for(int i = 3;i<=maxNum;i++){
			boolean isPrime = true;
			for(int j = 0; j <= latestPrime; j++){
				if(i!=primeFactors[latestPrime]&&i%primeFactors[j]==0){
					isPrime = false;
				}
			}
			if(isPrime){
				latestPrime++;
				primeFactors[latestPrime]=i;
			}
		}

		//Then, multiply by the primes to the max power that fits in the range
		for(int i = 0; i <= latestPrime; i++){
			int power = 0;
			int primePowerCheck = primeFactors[i];
			while(maxNum/primePowerCheck>=1){
				power++;
				primePowerCheck*=primeFactors[i];
			}
			finalProduct *= Math.pow(primeFactors[i],power);
			System.out.println("Multiplying by prime factor " + primeFactors[i] + " to the power of " + power);
		}

		System.out.println(finalProduct);
	}
}