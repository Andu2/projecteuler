public class Euler004{
	public static void main(String[] args){
		//Product of two 3-digit numbers will always be <million
		//Let's just brute force it for all 50,000 combinations of products both starting with 9
		int max = 0;
		for(int num1 = 900; num1 < 1000;num1++){
			for(int num2 = num1; num2 < 1000; num2++){
				int product = num1 * num2;
				if(isPalindrome(product)){
					System.out.println(num1 + " * " + num2 + " = " + product);
					if(product>max){
						max=product;
					}
				}
			}
		}
		System.out.println("Maximum: "+max);
	}

	public static boolean isPalindrome(int number){
		//Could look at digits by doing a bunch of mod operations...let's string it instead!
		String numberString = "" + number;
		boolean isPalindrome = true;
		for(int i = 0; i < numberString.length()/2;i++){
			if(numberString.charAt(i)!=numberString.charAt(numberString.length()-i-1)){
				isPalindrome = false;
			}
		}
		return isPalindrome;
	}
}