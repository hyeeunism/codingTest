package level1;

import java.util.Arrays;

public class DivisibleArray {

// 나누어 떨어지는 숫자 배열	
		public static void main(String[] args) {
		
			System.out.println(Arrays.toString(new int [] {5,9,7,10}) );
			System.out.println(Arrays.toString(new int [] {2,36,1,3}) );
			System.out.println(Arrays.toString(new int [] {3,2,6}) );
		}
		
		
		//
		public static int[] solution(int[] nums, int divisor) {
	       
	        int count = 0;  // 나누어 떨어지는 숫자의 개수를 세기 위한 변수
	        
	        for (int num : nums) { // nums 배열 돌면서 count 갯수 셈
	            if (num % divisor == 0) {
	                count++;
	            }
	        }
	        
	        if (count == 0) {
	            return null; // 나누어 떨어지는 숫자가 없으면 null 반환
	        }
	       	        
	        int[] answer = new int[count]; // 새 배열 
	        
	        int index = 0;
	        for (int num : nums) { // nums 배열 다시 돌면서 나누어떨어지는 수를 answer 배열 [0]부터 하나하나 넣어줌
	            if (num % divisor == 0) {
	            	answer[index] = num;
	                index++;
	            }
	        }
	        
	        return answer;
	    }

	}

