package level1;

public class SumOfDivisors {

// 약수의 합		
	public static void main(String[] args) {
		
		System.out.println(solution(123));
		System.out.println(solution(987));
	}
	
	
	// 1
	public static int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        int [] intArr = new int[str.length()];
        for ( int i=0; i<str.length(); i++) {
            intArr[i] = str.charAt(i) - '0';
            answer += intArr[i];
        }
        return answer;
    }

}

