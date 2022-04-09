package a03squentialstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Reduce {
	// Ket hop cac phan tu thanh 1 gia tri don cung kieu ban dau
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("args", "", "code", "learn", "...");
		String resultStr = strings.stream().reduce("-", String::concat);
//	    String resultStr = strings.stream().reduce("Hi-", (str1, str2) -> str1.concat(str2));
	    System.out.println(resultStr); // Hi-argscodelearn...
	    
	    int resultNum = IntStream.of(1, 2, 3, 4).reduce(0, (a, b) -> a + b);
        System.out.println(resultNum); // 10
	}
}
