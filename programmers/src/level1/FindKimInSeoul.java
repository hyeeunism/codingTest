package level1;

public class FindKimInSeoul {

// 서울에서 김서방 찾기
		public static void main(String[] args) {
		
			System.out.println(solution(new String[] {"Jane", "Kim"}));
			System.out.println(solution(new String[] {"Hailye", "Park", "Jane", "Kim"}));
		}
		
		
		// 
		public static String solution(String[] seoul) {
	        String answer = "";
	        int index = 0;

	        while ( index < seoul.length) {
	        	if (seoul[index] == "Kim")
	        		break;
	        	else index++;
	        }
	        return "김서방은 " + index + "에 있다";
	    }

	}

