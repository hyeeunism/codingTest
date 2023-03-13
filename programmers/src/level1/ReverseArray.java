package level1;

import java.util.Arrays;

public class ReverseArray {

// 자연수 뒤집어 배열로 만들기
		public static void main(String[] args) {
			
		System.out.println(Arrays.toString(solutionOne(12345)));
		System.out.println(Arrays.toString(solutionTwo(12345)));
		}
			
			
		// 1
		// 문자열로 바꾼 후, 문자열의 길이만큼 반복문을 돌려 10으로 나눠주면 거꾸로 들어감
		public static int[] solutionOne(long n) {
			String str = String.valueOf(n);
			// System.out.println(str);
			
			int [] answer = new int[str.length()];
			
			for ( int i=0; i<str.length(); i++) {
					answer[i]= (int) (n%10);
					// System.out.println(answer[i]);
					n/= 10;
					// System.out.println(n);
			}
			
	        
	        return answer;
	    }
		
		// 2
		 public static int[] solutionTwo(long n) {
		   
		        String str = String.valueOf(n); // 자연수 n을 String으로 저장
		       char[] s = str.toCharArray(); // String을 한 단어씩 char 배열에 저장
		       
		       int[] answer = new int[str.length()]; // str 길이 만큼 배열 선언
		        
		       for(int i=str.length()-1;i>=0;i--) { // 뒤집어서 입력
		           answer[str.length()-1-i] = str.charAt(i)-'0';
		       }
		       
		       return answer;
		    }
}

