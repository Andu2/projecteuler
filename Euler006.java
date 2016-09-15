public class Euler006{
	public static void main(String[] args){
		int sumOfSquares = 0;
		int sum = 0;
		for(int i = 1; i <= 100;i++){
			sum += i;
			sumOfSquares += Math.pow(i,2);
		}
		int squareOfSum = (int)Math.pow(sum,2);
		System.out.println(squareOfSum-sumOfSquares);
	}
}