package level1;

public class CountPY {

// ﻿문자열 내 p와 y의 개수		
		public static void main(String[] args) {
		
			System.out.println(solutionOne("pPoooyY"));
			System.out.println(solutionTwo("Pyy"));
		}
		
		
		// 1.
		static boolean solutionOne(String s) {
	        boolean answer = true;
	        int countY = 0;
	        int countP = 0;
	        char [] charArr = s.toCharArray();
	        
	        for(int i=0; i<s.length(); i++) {
	            if (charArr[i]== 'p' || charArr[i]== 'P') { countP++; }
	            else if (charArr[i]== 'y' || charArr[i]== 'Y') { countY++; }
	        }
	        answer = ( countP == countY) ? true : false;

	        return answer;
	    }
		
		// 2 정규 표현식 사용(다른사람 풀이)
		static boolean solutionTwo(String s) {
			
			return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
		}

	}

