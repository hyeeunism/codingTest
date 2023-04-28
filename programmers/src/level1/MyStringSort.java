package level1;

import java.util.Arrays;

public class MyStringSort {

// 문자열 내 마음대로 정렬하기
		public static void main(String[] args) {
			System.out.println(Arrays.toString(solution(new String[] { "sun", "bed", "car" }, 1)));
			System.out.println(Arrays.toString(solution(new String[] { "abce", "abcd", "cdx" }, 2)));
		}
		
		// 해당 인덱스에 있는 char를 맨앞에 붙이고 정렬한다음 잘라서 배열에 넣기
		public static String[] solution(String[] strings, int n) {
	        String[] answer = new String [strings.length]; // 정답배열
	        String[] arr = new String [strings.length]; // n번째 알파벳 저장할 배열
	        for (int i = 0; i < strings.length; i++) {
	        	arr[i] = strings[i].charAt(n) + strings[i];
	        	// System.out.println("arr[i] = " + arr[i]);
	        }
	        	Arrays.sort(arr);
	        	
	       for (int i = 0; i < strings.length; i++) {
			answer[i] = arr[i].substring(1,arr[i].length());
			// System.out.println("answer[i] = " + answer[i]);
		}
	        return answer;
	    }

	}

