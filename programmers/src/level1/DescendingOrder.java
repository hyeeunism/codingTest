package level1;

import java.util.Arrays;

public class DescendingOrder {

// 정수 내림차순으로 배치하기
		public static void main(String[] args) {
		
			System.out.println(solution(118372));
			System.out.println(solution(373194544));
		}
		
		
		// 프로그래머스에서는 Arrays.sort에 cannot find symbol 오류가 뜨는데 왜 그런지 모르겠음
		public static long solution(long n) {
	       char [] charArr = String.valueOf(n).toCharArray();
	       
	       Arrays.sort(charArr);
	       String answer = new StringBuffer(String.valueOf(charArr)).reverse().toString();
    
	       return Long.parseLong(answer);
	    }
	}

