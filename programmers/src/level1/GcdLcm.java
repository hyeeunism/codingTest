package level1;

import java.math.BigInteger;
import java.util.Arrays;

public class GcdLcm {

// 최대공약수와 최소공배수
		public static void main(String[] args) {
		
			System.out.println(Arrays.toString(solution(3,12)));
			System.out.println(Arrays.toString(solution(2,5)));
		}
		
		
		// 최대공약수 : 공통으로 나누어지는 수 중 가장 큰 수
		// 최소공배수 : 두 개이상의 공통된 배수 중 가장 작은 수
		
		public static int[] solution(int n, int m) {
		        BigInteger n1= BigInteger.valueOf(n); 
		        BigInteger m1 = BigInteger.valueOf(m); 
		        BigInteger gcd = n1.gcd(m1);
		        
		        int g = gcd.intValue();
		        int lcm = n*m / g;      
		        
		        int[] answer = {g, lcm};
		        
		        return answer;
		    }

	}

