package level1;

import java.util.Arrays;

// x만큼 간격이 있는 n개의 숫자
public class XIntervalNumbers {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solutionOne(2, 5)));
		System.out.println(Arrays.toString(solutionTwo(-4, 2)));
		
	}
	
	// 1
	public static long[] solutionOne(int x, int n) {
		long[] answer = new long[n];
        answer[0] = x;
        
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
	}
	
	// 2
	public static long[] solutionTwo(int x, int n) {
	   long[] answer = new long[n];
	        
	    for(int i=0; i<n; i++){
	         answer[i] = Long.valueOf(x) * (i+1); 
	    }
	    return answer;
	    }
	
}

