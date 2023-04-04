package level1;

public class HidePhoneNumber {

// 핸드폰 번호 가리기		
		public static void main(String[] args) {
		
			System.out.println(solution("01033334444"));
			System.out.println(solution("027778888"));
		}
		
		
		// 1. 문자열을 두 부분으로 나눈다. 앞자리 + 뒷자리4
		// 2. 앞자리를 for문으로 * 로 변환
		// 3. 다시 붙이기
		public static String solution(String phone_number) {
	        String back = phone_number.substring(phone_number.length()-4, phone_number.length());
	        String front = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]", "*");
	        String answer = front + back;
	        return answer;
	    }

	}

