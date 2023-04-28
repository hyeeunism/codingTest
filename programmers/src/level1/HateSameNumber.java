package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class HateSameNumber {

// 같은 숫자는 싫어
		public static void main(String[] args) {
		
			System.out.println(Arrays.toString(solution(new int [] {1,1,3,3,0,1,1})));
			System.out.println(Arrays.toString(solution(new int [] {4,4,4,3,3})));

		}
		
		
		// 1
		public static int [] solution(int [] arr) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				if ( arr[i] != arr[i-1] ) {
					list.add(arr[i]);
				}
			}
			
			int [] answer = new int[list.size()];
			int size=0;
			for(int temp:list) {
				answer[size++] = temp;
			}
			return answer;
			
		}

	}

