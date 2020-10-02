import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> output = new HashSet<>();
        String pass = "";
        List<String> input = numbers.chars().mapToObj(c->(char)c).map(Object::toString).collect(Collectors.toList());
        
        for (int r = input.size(); r > 0; r--) {
            permutation(input, pass, output, input.size(), r);
		}
        
        return output.size();
    }
    
    public void permutation(List<String> input, String pass, Set<Integer> output, int n, int r) {
        if(r==0) {
            Integer number = Integer.parseInt(pass);
            System.out.println(number);
            if(isPrimeNumber(number)) output.add(number);
            return;
        }
        
        for (int i=0; i<n ; i++) {
            String c = input.remove(i);
            permutation(input, (pass + c), output, n-1, r-1);
            input.add(i,c);
        }
    }
    
    public boolean isPrimeNumber(Integer n) {
        // 2 이하는 소수가 아님
        if(n<2) {
            return false;
        }

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수는 소수가 아님
		if (n % 2 == 0)
			return false;
        
		// 제곱근까지만 홀수로 나눠보면 됨
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
    }
}
