package level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingString {

// 문자열 내림차순으로 배치하기
		public static void main(String[] args) {
		
			System.out.println(solution("Zbcdefg"));
		}
		
		
		//
		public static String solution(String s) {
			String answer = "";
			char [] charArr = s.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				Arrays.sort(charArr);
				StringBuilder sb = new StringBuilder(new String(charArr));
				answer = sb.reverse().toString();
			}
	        return answer;
	    }

	}

