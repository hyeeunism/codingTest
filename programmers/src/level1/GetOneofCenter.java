package level1;

public class GetOneofCenter {

// 가운데 글자 가져오기
		public static void main(String[] args) {
		
			System.out.println(solution("abcde"));
			System.out.println(solution("qwer"));
		}
		
		
		// 길이가 홀수면 나눈값+1, 5/2 = 2 인덱스2
		// 길이가 짝수면 나눈값이랑 나눈값 앞에꺼, 4/2 = 2 2-1, 2
	    public static String solution(String s) {
	        String answer = "";
	        String [] strArr = s.split("");
	        if ( s.length()%2 == 1) {
	        	answer = strArr[s.length()/2];
	        }
	        else {
	        	answer = strArr[s.length()/2-1] + strArr[s.length()/2];
	        }
	        return answer;
	    }

	}

