package level1;

public class DeleteNoexists {

// 없는 숫자 더하기	
		public static void main(String[] args) {
		
			System.out.println(solution(new int [] {1,2,3,4,5,6,7,8,0}));
			System.out.println(solution(new int [] {5,8,4,0,6,7,9}));
		}
		
		
		public static int solution(int[] numbers) {
			 int answer = 0;
		        int[] count = new int[10]; // 몇번 등장했는지 카운트 셈

		        for(int i=0; i<numbers.length; i++){
		            count[numbers[i]]++;
		        }

		        for(int i=0; i<count.length; i++){

		            if(count[i] == 0){
		                answer += i;
		                System.out.print(i);
		            }
		        }

		        return answer;
		    }

	}

