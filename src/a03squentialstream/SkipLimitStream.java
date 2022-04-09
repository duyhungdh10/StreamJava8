package a03squentialstream;

import java.util.Arrays;
import java.util.List;

public class SkipLimitStream {
	
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Java", "C#", "C++", "PHP", "Javascript", "Angular", "C");
 
        data.stream() //
	            .skip(2) // bo qua 2 phan tu dau tien: "Java", "C#"
	            .limit(3) // lay 3 thang tiep theo: "C++", "PHP", "Javascript"
	            .forEach(e -> System.out.print(e + ", ")); // C++, PHP, Javascript, 
    }
}
