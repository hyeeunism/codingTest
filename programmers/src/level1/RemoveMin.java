package level1;

import java.util.Arrays;

public class RemoveMin {

// 제일 작은 수 제거하기		
		public static void main(String[] args) {
		
			System.out.println(Arrays.toString(solution(new int[] {4,3,2,1})));
			System.out.println(Arrays.toString(solution(new int[] {10})));
		}
		
		
		// 배열 길이가 1 이하면 -1 채워서 반환
		// 이상이면 for문 돌려서 최소값과 그 인덱스 찾고 인덱스에 해당하는 값 제거해서 더한 배열 생성
		public static int[] solution(int[] arr) {
			
			if (arr.length <= 1) {
				return new int[] {-1};
			}
			
				
				int min = arr[0];
				int minIdx = 0;
				
				
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] < min) {
						min = arr[i];
						minIdx = i;
					}
				}
				
				int[] answer = new int[arr.length - 1];
				int index = 0;
				for ( int i = 0; i < arr.length; i++) {
					if (i != minIdx) {
					answer[index++] = arr[i];
					}
				}
		        return answer;
				
			}

	}

