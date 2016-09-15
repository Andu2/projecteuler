public class Euler002{
	public static void main(String[] args){
		int sum = 2;
		int twoBack = 1;
		int oneBack = 2;
		int curNum;
		do{
			curNum = twoBack + oneBack;
			twoBack = oneBack;
			oneBack = curNum;
			if(curNum%2==0){
				sum += curNum;
				System.out.println(curNum);
			}
		} while(curNum<4000000);
		System.out.println("Answer: " + sum);
	}
}