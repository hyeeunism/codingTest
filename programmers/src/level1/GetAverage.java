package level1;


// 평균 구하기
public class GetAverage {
	
	public static void main(String[] args) {
	
		System.out.println(solution(new int[] { 1, 2, 3, 4 }));

	}
	
	// 1
	 public static double solution(int[] arr) {
	        double answer = 0;
	        double sum = 0;
	        for (int i=0; i<arr.length; i++) {
	            sum += arr[i];    
	        }
	        answer = sum / arr.length;
	       return answer;
	    }

}

